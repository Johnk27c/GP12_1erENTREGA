/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package package_Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import package_Modelo.Alumno;
import package_Persistencia.AlumnoData;

/**
 *
 * @author Usuario
 */
public class VistaAlumno extends javax.swing.JInternalFrame {

    private AlumnoData aluData = new AlumnoData();
    private Alumno alumnoActual = null;

    /**
     * Creates new form VistaAlumno
     */
    public VistaAlumno() {
        initComponents();
        jText_documento.setEnabled(true);
        jText_apellido.setEnabled(false);
        jText_nombre.setEnabled(false);
        jRb_estado.setEnabled(false);
        jDc_FechaNac.setEnabled(false);
        jBt_nuevo.setEnabled(true);
        jBt_eliminar.setEnabled(false);
        jBt_guardar.setEnabled(false);
        jBt_salir.setEnabled(true);
        jBt_buscar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBt_nuevo = new javax.swing.JButton();
        jBt_eliminar = new javax.swing.JButton();
        jBt_guardar = new javax.swing.JButton();
        jBt_salir = new javax.swing.JButton();
        jBt_buscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jText_documento = new javax.swing.JTextField();
        jText_apellido = new javax.swing.JTextField();
        jText_nombre = new javax.swing.JTextField();
        jRb_estado = new javax.swing.JRadioButton();
        jDc_FechaNac = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Estado:");

        jBt_nuevo.setText("Nuevo");
        jBt_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_nuevoActionPerformed(evt);
            }
        });

        jBt_eliminar.setText("Eliminar");
        jBt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_eliminarActionPerformed(evt);
            }
        });

        jBt_guardar.setText("Guardar");
        jBt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_guardarActionPerformed(evt);
            }
        });

        jBt_salir.setText("Salir");
        jBt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_salirActionPerformed(evt);
            }
        });

        jBt_buscar.setText("Buscar");
        jBt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_buscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha de Nacimiento:");

        jText_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_apellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBt_nuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBt_guardar)
                                .addGap(18, 18, 18)
                                .addComponent(jBt_salir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDc_FechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jText_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(jText_apellido, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jText_documento, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRb_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(30, 30, 30)
                                .addComponent(jBt_buscar)))))
                .addGap(17, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRb_estado)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDc_FechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBt_nuevo)
                            .addComponent(jBt_eliminar)
                            .addComponent(jBt_guardar)
                            .addComponent(jBt_salir))
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBt_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_nuevoActionPerformed
        jText_documento.setEnabled(true);
        jText_apellido.setEnabled(true);
        jText_nombre.setEnabled(true);
        jRb_estado.setEnabled(true);
        jDc_FechaNac.setEnabled(true);
        jBt_nuevo.setEnabled(true);
        jBt_eliminar.setEnabled(true);
        jBt_guardar.setEnabled(true);
        jBt_salir.setEnabled(true);
        jBt_buscar.setEnabled(true);
        limpiarCampos();
        alumnoActual = null;

    }//GEN-LAST:event_jBt_nuevoActionPerformed

    private void jBt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_buscarActionPerformed
        try {
            int dni = Integer.valueOf(jText_documento.getText());
            alumnoActual = aluData.buscarAlumnoporDNI(dni);
            if (alumnoActual != null) {
                jText_apellido.setText(alumnoActual.getApellido());
                jText_nombre.setText(alumnoActual.getNombre());
                jRb_estado.setSelected(alumnoActual.isEstado());
                LocalDate lc = alumnoActual.getFechaNac();
                java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jDc_FechaNac.setDate(date);
                jText_documento.setEnabled(true);
                jText_apellido.setEnabled(true);
                jText_nombre.setEnabled(true);
                jRb_estado.setEnabled(true);
                jDc_FechaNac.setEnabled(true);
                jBt_nuevo.setEnabled(true);
                jBt_eliminar.setEnabled(true);
                jBt_guardar.setEnabled(true);
                jBt_salir.setEnabled(true);
                jBt_buscar.setEnabled(true);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
        }

    }//GEN-LAST:event_jBt_buscarActionPerformed

    private void jText_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_apellidoActionPerformed

    private void jBt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_guardarActionPerformed
        try {
            int dni = Integer.valueOf(jText_documento.getText());
            String nombre = jText_nombre.getText();
            String apellido = jText_apellido.getText();
            if (nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
                return;
            }
            java.util.Date sfecha = jDc_FechaNac.getDate();
            LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Boolean estado = jRb_estado.isSelected();
            alumnoActual = aluData.buscarAlumnoporDNI(dni);
            
            if (alumnoActual == null) {
                alumnoActual = new Alumno(apellido, nombre, dni, fechaNac, estado);
                aluData.guardarAlumno(alumnoActual);

            } else {
                alumnoActual.setDni(dni);
                alumnoActual.setApellido(apellido);
                alumnoActual.setNombre(nombre);
                alumnoActual.setFechaNac(fechaNac);
                aluData.modificarAlumno(alumnoActual);
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingrresar un DNI valido");
        }
    }//GEN-LAST:event_jBt_guardarActionPerformed

    private void jBt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jBt_salirActionPerformed

    private void jBt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_eliminarActionPerformed
        if (alumnoActual != null) {
            aluData.eliminarAlumno(alumnoActual.getIdAlumno());
            alumnoActual = null;
            limpiarCampos();

        } else {
            JOptionPane.showMessageDialog(this, "No hay un alumno seleccionado");

        }
    }//GEN-LAST:event_jBt_eliminarActionPerformed
    private void limpiarCampos() {
        jText_documento.setText("");
        jText_apellido.setText("");
        jText_nombre.setText("");
        jRb_estado.setSelected(true);
        jDc_FechaNac.setDate(new Date());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBt_buscar;
    private javax.swing.JButton jBt_eliminar;
    private javax.swing.JButton jBt_guardar;
    private javax.swing.JButton jBt_nuevo;
    private javax.swing.JButton jBt_salir;
    private com.toedter.calendar.JDateChooser jDc_FechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRb_estado;
    private javax.swing.JTextField jText_apellido;
    private javax.swing.JTextField jText_documento;
    private javax.swing.JTextField jText_nombre;
    // End of variables declaration//GEN-END:variables
}
