package package_Vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import package_Persistencia.MateriaData;
import package_Persistencia.AlumnoData;
import package_Modelo.Materia;
import package_Modelo.Alumno;
import package_Persistencia.InscripcionData;

/**
 *
 * @author Franco
 */
public class VistaListado extends javax.swing.JInternalFrame {

    ArrayList<Materia> materias = new ArrayList();
    ArrayList<Alumno> alumnos = new ArrayList();
    private MateriaData matData = new MateriaData();
    private AlumnoData almData = new AlumnoData();
    private InscripcionData inscData = new InscripcionData();

    private DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form VistaListado
     */
    public VistaListado() {
        initComponents();
        matData = new MateriaData();
        materias = matData.mostrarMaterias();
        alumnos = (ArrayList<Alumno>) almData.mostrarAlumnos();
        model = new DefaultTableModel();
        selectMaterias();
        armarCabeceraTabla();
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
        jC_Materias = new javax.swing.JComboBox<>();
        jB_Salir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("LIstado de Alumnos por Materia");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione una materia:");

        jC_Materias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_MateriasActionPerformed(evt);
            }
        });

        jB_Salir.setText("Salir");
        jB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jC_Materias, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Salir))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jC_Materias, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_Salir)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jB_SalirActionPerformed

    private void jC_MateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_MateriasActionPerformed
        borrarfilaTabla();
        cargaAlumnos();
    }//GEN-LAST:event_jC_MateriasActionPerformed

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        for (Object it : filaCabecera) {
            model.addColumn(it);
        }
        jTable1.setModel(model);
    }

    private void borrarfilaTabla() {
        int indice = model.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    private void cargaAlumnos() {
        Materia selec = (Materia) jC_Materias.getSelectedItem();
        alumnos = (ArrayList<Alumno>) inscData.obtenerAlumnosPorMateria(selec.getIdMateria());
        for (Alumno alumno : alumnos) {
            model.addRow(new Object[]{alumno.getIdAlumno(), alumno.getDni(), alumno.getApellido(), alumno.getNombre()});
        }
    }

    private void selectMaterias() {
        MateriaData matData = new MateriaData();
        ArrayList<Materia> listarMaterias = matData.mostrarMaterias();
        for (Materia materia : listarMaterias) {
            jC_Materias.addItem(materia);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Salir;
    private javax.swing.JComboBox<Materia> jC_Materias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
