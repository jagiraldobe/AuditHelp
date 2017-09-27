/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Presentacion.Normativa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.postgresql.jdbc.PgResultSet;

/**
 *
 * @author USUARIO
 */
public class BaseDatos {

    Connection conn = null;
    Statement query = null;
    ResultSet resultado = null;

    public BaseDatos() {
    }

    ;  
    
    public boolean realizaConexion(String usuario, String contraseña) {
        boolean resultado = false;

        String urlDatabase = "jdbc:postgresql://localhost:5432/AuditHelp";
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase, usuario, contraseña);
            query = conn.createStatement();
            resultado = true;
        } catch (Exception e) {
            resultado = false;
        }
        return resultado;
    }

    public boolean establecerLogin(String usuario, String contraseña) throws SQLException {
        String consulta = "";
        int cantidad = 0;
        boolean existe = false;

        realizaConexion("postgres", "ntxon48o");

        consulta = "select count(*) as existe from perfil "
                + "where upper(usuario) = upper('" + usuario + "') and clave = md5('" + contraseña + "')";

        resultado = query.executeQuery(consulta);
        if (resultado.next()) {

            cantidad = resultado.getInt("existe");
        }

        if (cantidad > 0) {
            existe = true;
        }

        return existe;

    }

    public String consultarTipoUsuario(String usuario, String contraseña) throws SQLException {
        String tipo = "";
        //ResultSet resultado;
        String consulta = "";

        realizaConexion("postgres", "ntxon48o");

        consulta = "select tipo from usuarios u "
                + "inner join perfil p on (u.id = p.fk_id)"
                + "where upper(p.usuario) = upper('" + usuario + "') and p.clave = md5('" + contraseña + "')";

        resultado = query.executeQuery(consulta);

        if (resultado.next()) {

            tipo = resultado.getString("tipo");
        }
        return tipo;

    }

    public boolean validarUsuarioExistente(String valor, String nombreCampo) throws SQLException {
        int existe = 0;
        boolean respuesta = false;
        //ResultSet resultado;
        String consulta = "";

        realizaConexion("postgres", "ntxon48o");

        if (nombreCampo.equals("nombreUsuario")) {
            consulta = "select count(*) as existe from perfil where upper(usuario) = '" + valor.trim() + "' ";
        } else if (nombreCampo.equals("cedula")) {
            consulta = "select count(*) as existe from perfil where fk_id = '" + valor.trim() + "' ";
        }

        resultado = query.executeQuery(consulta);

        if (resultado.next()) {

            existe = resultado.getInt("existe");
            if (existe > 0) {
                respuesta = true;
            }
        }
        return respuesta;

    }

    public boolean crearUsuario(String nombreUsuario, String contraseña, String cedula, String nombres, String tipo) throws SQLException {
        boolean creado = false;
        int insertado = 0;
        realizaConexion("postgres", "ntxon48o");

        //ResultSet resultado;
        String consulta = "";

        consulta = "insert into usuarios(id, nombre, tipo)values('" + cedula + "',upper('" + nombres + "'),upper('" + tipo + "'));";
        insertado = query.executeUpdate(consulta);

        consulta = "insert into perfil(usuario, clave, fk_id) values(upper('" + nombreUsuario + "'),md5('" + contraseña + "'),'" + cedula + "');";
        insertado = query.executeUpdate(consulta);

        if (insertado > 0) {
            creado = true;
        }

        return creado;
    }

    public boolean modificarDatosUsuario(String cedula, String nombreUsuario, String contraseña, String nombres) throws SQLException {
        boolean modificado = false;
        int actualizado = 0;
        realizaConexion("postgres", "ntxon48o");

        //ResultSet resultado;
        String consulta = "";

        String datos = "";

        if (!nombreUsuario.equals("")) {
            datos = " usuario = upper('" + nombreUsuario + "') ";
        }

        if (!contraseña.equals("")) {
            if (datos.equals("")) {
                datos = " clave = '" + contraseña + "' ";
            } else {
                datos = datos + ", clave = '" + contraseña + "' ";
            }

        }
        consulta = "update perfil set " + datos + "where fk_id = '" + cedula.trim() + "';";
        actualizado = query.executeUpdate(consulta);

        if (!nombres.equals("")) {
            datos = " nombre = upper('" + nombres + "') ";
        }

        consulta = "update usuarios set " + datos + " where id = '" + cedula.trim() + "' ";
        actualizado = query.executeUpdate(consulta);

        if (actualizado > 0) {
            modificado = true;
        }

        return modificado;
    }

    public boolean eliminarUsuario(String cedula) throws SQLException {
        boolean eliminado = false;
        int registroUsuario = 0;
        int registroPerfil = 0;
        String consulta = "";

        realizaConexion("postgres", "ntxon48o");

        consulta = "delete from usuarios where id = '" + cedula + "'";
        registroUsuario = query.executeUpdate(consulta);

        consulta = "delete from perfil where fk_id = '" + cedula + "'";
        registroPerfil = query.executeUpdate(consulta);

        if (registroUsuario > 0 && registroPerfil > 0) {
            eliminado = true;
        }

        return eliminado;
    }

    public ArrayList<Normativa> consultarNormativa(String tipo, String normativaAsociada, String normativaPadre) throws SQLException {
        ArrayList<Normativa> listaNormativa = new ArrayList<Normativa>();
        String consulta = "", codigoNorma = "";

        realizaConexion("postgres", "ntxon48o");

        if (tipo.equals("NORMATIVIDAD")) {
            consulta = "select codigo, nombre from norma where nombre = '" + normativaAsociada.toUpperCase() + "'";                       
        }        

        if (tipo.equals("NORMA")) {
            consulta = "select codigo, nombre from norma";

        } else if (tipo.equals("DOMINIO")) {
            consulta = "select codigo, nombre "
                    + "from dominio where fk_norma = '" + normativaAsociada + "' ";

        } else if (tipo.equals("CATEGORIA")) {
            consulta = "select codigo, nombre, descripcion  "
                    + " from categoria where fk_norma = '" + normativaAsociada + "' "
                    + " and fk_dominio = '" + normativaPadre + "' ";

        } else if (tipo.equals("CONTROL")) {
            consulta = "select codigo, nombre, descripcion "
                    + "from control where fk_norma = '" + normativaAsociada + "' "
                    + "and fk_categoria = '" + normativaPadre + "' ";
        }

        resultado = query.executeQuery(consulta);

        while (resultado.next()) {
            Normativa normativa = new Normativa();

            normativa.setCodigo(resultado.getString("codigo"));
            normativa.setNombre(resultado.getString("nombre"));

            if (!tipo.equals("NORMA") && !tipo.equals("DOMINIO")) {
                normativa.setDescripcion(resultado.getString("descripcion"));
            }

            listaNormativa.add(normativa);

        }

        return listaNormativa;

    }

}
