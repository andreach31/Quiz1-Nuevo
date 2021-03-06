/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Persona;
import Control.Control;
import static java.awt.SystemColor.control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author andreachacon
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    Control control = new Control();

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null); //Tirar el formulario en el centro

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_Id = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel_Id = new javax.swing.JLabel();
        jLabel_Apellido = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Telefono = new javax.swing.JLabel();
        jLabel_Direccion = new javax.swing.JLabel();
        btn_Consultar = new javax.swing.JButton();
        btn_Insertar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         Mantenimiento Basico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdActionPerformed(evt);
            }
        });

        jLabel_Id.setText("Identificacion");

        jLabel_Apellido.setText("Apellido");

        jLabel_Nombre.setText("Nombre");

        jLabel_Telefono.setText("Telefono");

        jLabel_Direccion.setText("Direccion ");

        btn_Consultar.setText("Consultar");
        btn_Consultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_Telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Apellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel_Nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(txt_Id)
                    .addComponent(txt_Apellido)
                    .addComponent(txt_direccion)
                    .addComponent(txt_telefono))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Consultar)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Id)
                    .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Apellido)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Direccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Consultar)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        btn_Insertar.setText("Insertar");
        btn_Insertar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Insertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InsertarMouseClicked(evt);
            }
        });
        btn_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_Modificar.setText("Guardar Cambios (Modificar)");
        btn_Modificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Eliminar)
                    .addComponent(btn_Insertar)
                    .addComponent(jButton1)
                    .addComponent(btn_Modificar))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btn_Insertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Modificar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdActionPerformed

    private void btn_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertarActionPerformed


    }//GEN-LAST:event_btn_InsertarActionPerformed

    private void btn_InsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InsertarMouseClicked

        //System.out.print(control.agregarPersona(p));	             
        //control.imprimeLista();
        if (txt_Id.getText().equals("") | txt_Nombre.getText().equals("") | txt_Apellido.getText().equals("") | txt_telefono.getText().equals("") | txt_direccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informacion incompleta", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            Persona p = new Persona(txt_Id.getText(), txt_Nombre.getText(), txt_Apellido.getText(), txt_telefono.getText(), txt_direccion.getText());
            if (control.agregarPersona(p)) {

                JOptionPane.showMessageDialog(null, "Usuario " + txt_Nombre.getText() + "agregado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                txt_Id.setText(""); //Limpiar pantalla
                txt_Nombre.setText("");
                txt_Apellido.setText("");
                txt_telefono.setText("");
                txt_direccion.setText("");
            } else if (!control.agregarPersona(p)) {
                JOptionPane.showMessageDialog(null, "Usuario " + txt_Id.getText() + " ya existe", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }


    }//GEN-LAST:event_btn_InsertarMouseClicked

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        String consulta = JOptionPane.showInputDialog(null, "Ingrese la Identificacion de la persona que desea consultar:", "Consulta", JOptionPane.QUESTION_MESSAGE);
        Persona p = control.consultaPersona(consulta);
        if (p != null) {

            txt_Id.setText(p.getIdentificacion());
            txt_Id.setEnabled(false); // Deshabilitar campo
            txt_Nombre.setText(p.getNombre());
            txt_Apellido.setText(p.getApellido());
            txt_telefono.setText(p.getTelefono());
            txt_direccion.setText(p.getDireccion());

        } else {

            JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed

        String consulta = JOptionPane.showInputDialog(null, "Ingrese la Identificacion de la persona que desea eliminar:", "Eliminar Usuario", JOptionPane.QUESTION_MESSAGE);
        if (control.eliminarPersona(consulta)) {

            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                txt_Id.setText("");
                txt_Id.setEnabled(true);//Habilitar campo
                txt_Nombre.setText("");
                txt_Apellido.setText("");
                txt_telefono.setText("");
                txt_direccion.setText("");

        } else if (!control.eliminarPersona(consulta)) {
            JOptionPane.showMessageDialog(null, " Usuario consultado no existe", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed

        if (txt_Id.getText().equals("") | txt_Nombre.getText().equals("") | txt_Apellido.getText().equals("") | txt_telefono.getText().equals("") | txt_direccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informacion incompleta", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            Persona p = new Persona(txt_Id.getText(), txt_Nombre.getText(), txt_Apellido.getText(), txt_telefono.getText(), txt_direccion.getText());
            if (control.modificarPersona(p)) {

                JOptionPane.showMessageDialog(null, "Usuario " + txt_Nombre.getText() + "Modificado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                //Limpiar pantalla
                txt_Id.setText("");
                txt_Id.setEnabled(true);//Habilitar campo
                txt_Nombre.setText("");
                txt_Apellido.setText("");
                txt_telefono.setText("");
                txt_direccion.setText("");

            }
        }


    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                txt_Id.setText("");
                txt_Id.setEnabled(true);//Habilitar campo
                txt_Nombre.setText("");
                txt_Apellido.setText("");
                txt_telefono.setText("");
                txt_direccion.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);

            }

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Insertar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Apellido;
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_Id;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

}
