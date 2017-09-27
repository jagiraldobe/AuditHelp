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
public class ControladorLogin {
    BaseDatos bd = new BaseDatos();
    
    public ControladorLogin(){};
    
    public boolean establecerLogin(String usuario, String contraseña) throws SQLException{
        return bd.establecerLogin(usuario, contraseña);
    }
    
    public String consultarTipoUsuario(String usuario, String contraseña) throws SQLException{
        return bd.consultarTipoUsuario(usuario, contraseña);
    }
    
}
