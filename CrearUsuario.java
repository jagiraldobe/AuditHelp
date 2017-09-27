/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ControladorUsuario;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class CrearUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuario
     */
    public CrearUsuario() {
        initComponents();
        jRadioButtonAuditor.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonAuditor = new javax.swing.JRadioButton();
        jRadioButtonAdministrador = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsuarioCrearUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordFieldCrearUsuario = new javax.swing.JPasswordField();
        jPasswordFieldConfirmarCrearUsuario = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNombresCrearUsuario = new javax.swing.JTextField();
        jTextFieldCedulaCrearUsuario = new javax.swing.JTextField();
        jButtonGuardarCrearUsuario = new javax.swing.JButton();
        jButtonCancelarCrearUsuario = new javax.swing.JButton();
        jLabelUsuarioCrearUsuario = new javax.swing.JLabel();
        jLabelContraseñaCrearUsuario = new javax.swing.JLabel();
        jLabelConfirmarContraseña = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelCamposObligatorios = new javax.swing.JLabel();
        jLabelContraseñasDiferentes = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Crear nuevo usuario");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 20, 119, -1));

        jLabel2.setText("Datos de usuario: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, 135, -1));

        jRadioButtonAuditor.setText("Auditor");
        jRadioButtonAuditor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonAuditorStateChanged(evt);
            }
        });
        getContentPane().add(jRadioButtonAuditor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jRadioButtonAdministrador.setText("Administrador");
        jRadioButtonAdministrador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonAdministradorStateChanged(evt);
            }
        });
        getContentPane().add(jRadioButtonAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel3.setText("Tipo de Usuario: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, 99, -1));

        jLabel4.setText("Nombre de usuario: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, 145, -1));

        jTextFieldUsuarioCrearUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioCrearUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioCrearUsuarioFocusLost(evt);
            }
        });
        jTextFieldUsuarioCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioCrearUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioCrearUsuarioMouseExited(evt);
            }
        });
        jTextFieldUsuarioCrearUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioCrearUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuarioCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 103, 200, -1));

        jLabel5.setText("Contraseña: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 96, -1));

        jLabel7.setText("Confirmar Contraseña: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, 155, -1));

        jPasswordFieldCrearUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldCrearUsuarioFocusGained(evt);
            }
        });
        jPasswordFieldCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPasswordFieldCrearUsuarioMouseEntered(evt);
            }
        });
        getContentPane().add(jPasswordFieldCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 130, 200, -1));

        jPasswordFieldConfirmarCrearUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldConfirmarCrearUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldConfirmarCrearUsuarioFocusLost(evt);
            }
        });
        jPasswordFieldConfirmarCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPasswordFieldConfirmarCrearUsuarioMouseEntered(evt);
            }
        });
        getContentPane().add(jPasswordFieldConfirmarCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 157, 200, -1));

        jLabel8.setText("Información Personal:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, 178, -1));

        jLabel9.setText("Nombres: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel10.setText("Cédula: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 77, -1));
        getContentPane().add(jTextFieldNombresCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 235, -1));

        jTextFieldCedulaCrearUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCedulaCrearUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCedulaCrearUsuarioFocusLost(evt);
            }
        });
        jTextFieldCedulaCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextFieldCedulaCrearUsuarioMouseEntered(evt);
            }
        });
        getContentPane().add(jTextFieldCedulaCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 235, -1));

        jButtonGuardarCrearUsuario.setText("Guardar");
        jButtonGuardarCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarCrearUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardarCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        jButtonCancelarCrearUsuario.setText("Cancelar");
        getContentPane().add(jButtonCancelarCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));
        getContentPane().add(jLabelUsuarioCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 103, -1, -1));
        getContentPane().add(jLabelContraseñaCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 129, -1, -1));
        getContentPane().add(jLabelConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 160, -1, -1));
        getContentPane().add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 267, -1, -1));
        getContentPane().add(jLabelCamposObligatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, 219, -1));
        getContentPane().add(jLabelContraseñasDiferentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioCrearUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioCrearUsuarioKeyPressed

    }//GEN-LAST:event_jTextFieldUsuarioCrearUsuarioKeyPressed

    private void jTextFieldUsuarioCrearUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioCrearUsuarioMouseExited

    }//GEN-LAST:event_jTextFieldUsuarioCrearUsuarioMouseExited

    private void jButtonGuardarCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCrearUsuarioActionPerformed
        ControladorUsuario controladorUsuario = new ControladorUsuario();
        String usuario = jTextFieldUsuarioCrearUsuario.getText().trim();
        String contraseña = jPasswordFieldCrearUsuario.getText().trim();
        String confirmarContraseña = jPasswordFieldConfirmarCrearUsuario.getText().trim();
        String cedula = jTextFieldCedulaCrearUsuario.getText().trim();
        String nombres = jTextFieldNombresCrearUsuario.getText().toUpperCase();
        String tipo = "";
        boolean creado = false;

        if (jRadioButtonAdministrador.isSelected()) {
            tipo = "ADMINISTRADOR";
        } else if (jRadioButtonAuditor.isSelected()) {
            tipo = "AUDITOR";
        }

        if (usuario.equals("") || contraseña.equals("") || confirmarContraseña.equals("")) {
            JOptionPane.showMessageDialog(this, "Los campos Usuario, Contraseña y Cédula son Obligatorios", "Crear Usuario", JOptionPane.INFORMATION_MESSAGE);
            jLabelCamposObligatorios.setText("Campos Obligatorios: *");
            jLabelCamposObligatorios.setForeground(Color.red);
            jLabelCedula.setText("*");
            jLabelCedula.setForeground(Color.red);
            jLabelConfirmarContraseña.setText("*");
            jLabelConfirmarContraseña.setForeground(Color.red);
            jLabelContraseñaCrearUsuario.setText(" *");
            jLabelContraseñaCrearUsuario.setForeground(Color.red);
            jLabelUsuarioCrearUsuario.setText("*");
            jLabelUsuarioCrearUsuario.setForeground(Color.red);
            jTextFieldUsuarioCrearUsuario.setFocusable(true);

        } else if (!contraseña.equals(confirmarContraseña)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error", WIDTH);
            jPasswordFieldCrearUsuario.requestFocus();
        } else {
            try {
                creado = controladorUsuario.crearUsuario(usuario, contraseña, cedula, nombres, tipo);
                if (creado) {
                    JOptionPane.showMessageDialog(this, "El usuario se creaó satiafactoriamnete", "Crear Usuario", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error en la creación del Usuario", "Crear Usuario", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonGuardarCrearUsuarioActionPerformed

    private void jTextFieldUsuarioCrearUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioCrearUsuarioFocusLost
        ControladorUsuario controladorUsuario = new ControladorUsuario();
        String nombreUsuario = jTextFieldUsuarioCrearUsuario.getText().toUpperCase().trim();
        boolean resultado = false;
        if (!nombreUsuario.equals("")) {
            try {
                resultado = controladorUsuario.validarUsuarioExistente(nombreUsuario, "nombreUsuario");
                if (resultado) {
                    JOptionPane.showMessageDialog(this, "El nombre de usuario ingresado ya existe", "Crear Usuarios", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jTextFieldUsuarioCrearUsuarioFocusLost

    private void jTextFieldUsuarioCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioCrearUsuarioMouseEntered
    }//GEN-LAST:event_jTextFieldUsuarioCrearUsuarioMouseEntered

    private void jPasswordFieldCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldCrearUsuarioMouseEntered
    }//GEN-LAST:event_jPasswordFieldCrearUsuarioMouseEntered

    private void jPasswordFieldConfirmarCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarCrearUsuarioMouseEntered
    }//GEN-LAST:event_jPasswordFieldConfirmarCrearUsuarioMouseEntered

    private void jTextFieldCedulaCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCedulaCrearUsuarioMouseEntered
    }//GEN-LAST:event_jTextFieldCedulaCrearUsuarioMouseEntered

    private void jTextFieldUsuarioCrearUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioCrearUsuarioFocusGained
        jLabelCamposObligatorios.setText("");
        jLabelCedula.setText("");
        jLabelConfirmarContraseña.setText("");
        jLabelContraseñaCrearUsuario.setText("");
        jLabelUsuarioCrearUsuario.setText("");
    }//GEN-LAST:event_jTextFieldUsuarioCrearUsuarioFocusGained

    private void jPasswordFieldCrearUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldCrearUsuarioFocusGained
        jLabelCamposObligatorios.setText("");
        jLabelCedula.setText("");
        jLabelConfirmarContraseña.setText("");
        jLabelContraseñaCrearUsuario.setText("");
        jLabelUsuarioCrearUsuario.setText("");
        jLabelContraseñasDiferentes.setText("");
    }//GEN-LAST:event_jPasswordFieldCrearUsuarioFocusGained

    private void jPasswordFieldConfirmarCrearUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarCrearUsuarioFocusGained
        jLabelCamposObligatorios.setText("");
        jLabelCedula.setText("");
        jLabelConfirmarContraseña.setText("");
        jLabelContraseñaCrearUsuario.setText("");
        jLabelUsuarioCrearUsuario.setText("");
        jLabelContraseñasDiferentes.setText("");
    }//GEN-LAST:event_jPasswordFieldConfirmarCrearUsuarioFocusGained

    private void jTextFieldCedulaCrearUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCedulaCrearUsuarioFocusGained
        jLabelCamposObligatorios.setText("");
        jLabelCedula.setText("");
        jLabelConfirmarContraseña.setText("");
        jLabelContraseñaCrearUsuario.setText("");
        jLabelUsuarioCrearUsuario.setText("");
    }//GEN-LAST:event_jTextFieldCedulaCrearUsuarioFocusGained

    private void jRadioButtonAuditorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonAuditorStateChanged
        if (jRadioButtonAuditor.isSelected()) {
            jRadioButtonAdministrador.setSelected(false);
        } else {
            jRadioButtonAdministrador.setSelected(true);
        }

    }//GEN-LAST:event_jRadioButtonAuditorStateChanged

    private void jRadioButtonAdministradorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonAdministradorStateChanged
        if (jRadioButtonAdministrador.isSelected()) {
            jRadioButtonAuditor.setSelected(false);
        } else {
            jRadioButtonAuditor.setSelected(true);
        }

    }//GEN-LAST:event_jRadioButtonAdministradorStateChanged

    private void jPasswordFieldConfirmarCrearUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarCrearUsuarioFocusLost
        String contraseña = jPasswordFieldCrearUsuario.getText().trim();
        String confirmarContraseña = jPasswordFieldConfirmarCrearUsuario.getText().trim();

        if (!contraseña.equals(confirmarContraseña)) {
            jLabelContraseñasDiferentes.setText("Las contraseñas no coinciden");
            jLabelContraseñasDiferentes.setForeground(Color.red);
            //jPasswordFieldCrearUsuario.requestFocus();
        }
    }//GEN-LAST:event_jPasswordFieldConfirmarCrearUsuarioFocusLost

    private void jTextFieldCedulaCrearUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCedulaCrearUsuarioFocusLost
        ControladorUsuario controladorUsuario = new ControladorUsuario();
        String cedula = jTextFieldCedulaCrearUsuario.getText().trim();
        boolean resultado = false;
        if (!cedula.equals("")) {
            try {
                resultado = controladorUsuario.validarUsuarioExistente(cedula, "cedula");
                if (resultado) {
                    JOptionPane.showMessageDialog(this, "La cedula ingresada ya existe", "Crear Usuarios", JOptionPane.INFORMATION_MESSAGE);
                    jTextFieldCedulaCrearUsuario.requestFocus();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jTextFieldCedulaCrearUsuarioFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCrearUsuario;
    private javax.swing.JButton jButtonGuardarCrearUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCamposObligatorios;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelConfirmarContraseña;
    private javax.swing.JLabel jLabelContraseñaCrearUsuario;
    private javax.swing.JLabel jLabelContraseñasDiferentes;
    private javax.swing.JLabel jLabelUsuarioCrearUsuario;
    private javax.swing.JPasswordField jPasswordFieldConfirmarCrearUsuario;
    private javax.swing.JPasswordField jPasswordFieldCrearUsuario;
    private javax.swing.JRadioButton jRadioButtonAdministrador;
    private javax.swing.JRadioButton jRadioButtonAuditor;
    private javax.swing.JTextField jTextFieldCedulaCrearUsuario;
    private javax.swing.JTextField jTextFieldNombresCrearUsuario;
    private javax.swing.JTextField jTextFieldUsuarioCrearUsuario;
    // End of variables declaration//GEN-END:variables
}