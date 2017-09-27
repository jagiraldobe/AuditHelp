/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.BaseDatos;
import Presentacion.Normativa;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ControladorNormativa {

    BaseDatos bd = new BaseDatos();

    public ControladorNormativa() {
    }
    
    public ArrayList<Normativa> consultarNormativa(String tipo, String normativaAsociada, String normativaPadre) throws SQLException{
        //Normativa normativa = new Normativa();
        ArrayList<Normativa> listaNormativa = new ArrayList<Normativa>();
        
        listaNormativa = bd.consultarNormativa(tipo, normativaAsociada, normativaPadre);
        
        return listaNormativa;
    }


}
