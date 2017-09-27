/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author USUARIO
 */
public class Administrador extends Usuario {

    public Administrador() {
    }

    ;
    public void iniciar() {
        JFrame frame = new JFrame("AuditHelp  Perfil: " + this.tipo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        JTabbedPane tab = new JTabbedPane();
        frame.add(tab, BorderLayout.CENTER);
        JPanel panelUsuarios = new JPanel();
        panelUsuarios.setLayout(new GridLayout());

        JPanel panelNormativa = new JPanel();
        panelNormativa.setLayout(new GridLayout());

        JButton buttonCrearUsuario = new JButton("Crear nuevo Usuario");
        JButton buttonModificarUsuario = new JButton("Modificar Usuario");
        JButton buttonEliminarUsuario = new JButton("Elimininar Usuario");

        JButton buttonAdicionarNormativa = new JButton("Adicionar Normativa");
        JButton buttonModificarNormativa = new JButton("Modificar Normativa");
        JButton buttonEliminarNormativa = new JButton("Elimininar Normativa");

        panelUsuarios.add(buttonCrearUsuario);
        panelUsuarios.add(buttonModificarUsuario);
        panelUsuarios.add(buttonEliminarUsuario);

        panelNormativa.add(buttonAdicionarNormativa);
        panelNormativa.add(buttonModificarNormativa);
        panelNormativa.add(buttonEliminarNormativa);

        tab.add("Usuarios", panelUsuarios);

        tab.add("Normatividad", panelNormativa);
        frame.setVisible(true);

        buttonCrearUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               /* JFrame frameCrearUsuario = new JFrame("AuditHelp - Registro Nuevo usuario");
                frameCrearUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameCrearUsuario.setSize(400, 400);
                JPanel panelCrearUsuario = new JPanel();
                JLabel labelTitulo = new JLabel("Crear Nuevo Usuario");               
                JLabel labelDatosUsuario = new JLabel("Datos de Usuario");
                JLabel labelTipoUsuario = new JLabel("Tipo de Usuario");*/
                
                CrearUsuario crearUsuario = new CrearUsuario();
                crearUsuario.setSize(600, 500);
                crearUsuario.setVisible(true);         
                
                
                

            }
        });
        
         buttonModificarUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               /* JFrame frameCrearUsuario = new JFrame("AuditHelp - Registro Nuevo usuario");
                frameCrearUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameCrearUsuario.setSize(400, 400);
                JPanel panelCrearUsuario = new JPanel();
                JLabel labelTitulo = new JLabel("Crear Nuevo Usuario");               
                JLabel labelDatosUsuario = new JLabel("Datos de Usuario");
                JLabel labelTipoUsuario = new JLabel("Tipo de Usuario");*/
                
                ModificarUsuario modificarUsuario = new ModificarUsuario();
                modificarUsuario.setSize(600, 500);
                modificarUsuario.setVisible(true);         
                
                
                

            }
        });

    }

}
