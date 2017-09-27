/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class Auditor extends Usuario {

    public Auditor() {
    }

    public void iniciar() throws SQLException {
        ConsultarNormativa consultarNormativa = new ConsultarNormativa();
        consultarNormativa.setVisible(true);
    }

}
