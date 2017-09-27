/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.BaseDatos;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class ControladorUsuario {

    BaseDatos bd = new BaseDatos();

    public ControladorUsuario() {
    }

    ;
    public boolean validarUsuarioExistente(String valor, String nombreCampo) throws SQLException {
        return bd.validarUsuarioExistente(valor, nombreCampo);
    }

    public boolean crearUsuario(String nombreUsuario, String contraseña, String cedula, String nombres, String tipo) throws SQLException {
        return bd.crearUsuario(nombreUsuario, contraseña, cedula, nombres, tipo);
    }

    public boolean modificarDatosUsuario(String cedula, String nombreUsuario, String contraseña, String nombres) throws SQLException {
        return bd.modificarDatosUsuario(cedula, nombreUsuario, contraseña, nombres);
    }

}
