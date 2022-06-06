package pe.unjfsc.almacen.java11.view;

import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEEmpleadoProducto;
import pe.unjfsc.almacen.java11.logical.CLVariacionEmpleado;
import pe.unjfsc.almacen.java11.model.CICambioEmpleado;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarEmpleadoHashSet;

public class JFrameMostrarEmpleado extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameMostrarEmpleado");
    private HashSet<CEEmpleadoProducto> oHsData;
    private CICambioEmpleado oCIEmpleado;
    CEEmpleadoProducto oEmpleado;
    CMCambiarEmpleadoHashSet oCMEmpleado;
    
    boolean sw;

    public JFrameMostrarEmpleado() {
        initComponents();
        setLocationRelativeTo(this);
        oCMEmpleado = new CMCambiarEmpleadoHashSet();
        oEmpleado = new CEEmpleadoProducto();

        // title tbl
        String titulo[] = {"CODIGO", "NOMBRE", "AP PATERNO", "AP MATERNO", "DNI", "TELEFONO"};
        DefaultTableModel oModel = new DefaultTableModel(loadData(), titulo);
        tlbMostrar.setModel(oModel);
    }

    private Object[][] loadData() {
        oCIEmpleado = oCMEmpleado;
        oHsData = oCIEmpleado.consultAllEmpleadoCIC();

        CLVariacionEmpleado OlogicaEmpleado = new CLVariacionEmpleado();
        return OlogicaEmpleado.convertHashSetArray(oHsData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTexApPaterno = new javax.swing.JTextField();
        jTexApMaterno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtCodEmpleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbMostrar = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AP PATERNO:");

        jLabel2.setText("AP MATERNO:");

        jLabel3.setText("CODIGO EMPLEADO:");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("DNI:");

        jLabel6.setText("TELEFONO:");

        tlbMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "AP PATERNO", "AP MATERNO", "DNI", "TELEFONO"
            }
        ));
        tlbMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlbMostrarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tlbMostrar);

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jTxtCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(jTexApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(jTexApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addComponent(jTxtCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addComponent(jTexApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTexApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        LOG.info("[FSI] Star boton Grabar : {}");

        //Verificar
        if (!jTxtCodEmpleado.getText().isEmpty()) {

            oEmpleado.setCodiEmp(jTxtCodEmpleado.getText());
            oEmpleado.setNombEmp(jTextNombre.getText());
            oEmpleado.setApaEmp(jTexApPaterno.getText());
            oEmpleado.setAmaEmp(jTexApMaterno.getText());
            oEmpleado.setDniEmp(jTextDni.getText());
            oEmpleado.setTelfEmp(jTextTelefono.getText());

            if (sw) {
                oCMEmpleado.saveEmpleadoCIC(oEmpleado);
                LOG.info("[FSI] Dato Grabado : {}");
            } else {
                oCMEmpleado.modificarEmpleadoCIC(jTxtCodEmpleado.getText(), jTextNombre.getText(), jTexApPaterno.getText(), jTexApMaterno.getText(), jTextDni.getText(), jTextTelefono.getText());
                LOG.info("[FSI] Dato Editado : {}");
            }

            mostrarDatos();
        } else {
            LOG.info("[FSI] Error al ingreso de datos : {} ", jTxtCodEmpleado.getText(), " - ", jTextNombre.getText());
        }
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        LOG.info("[FSI] Star boton Eliminar : {}");
        try {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (!jTxtCodEmpleado.getText().isEmpty()) {
                if (op == JOptionPane.YES_OPTION) {

                    oCMEmpleado.eliminarEmpleadoCIC(jTxtCodEmpleado.getText());
                    limpiarControles();
                    JOptionPane.showMessageDialog(rootPane, "Registro borrado");
                    mostrarDatos();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un registro");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tlbMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlbMostrarMouseClicked

        jTxtCodEmpleado.setText(tlbMostrar.getValueAt(tlbMostrar.getSelectedRow(), 0).toString());
        jTextNombre.setText(tlbMostrar.getValueAt(tlbMostrar.getSelectedRow(), 1).toString());
        jTexApPaterno.setText(tlbMostrar.getValueAt(tlbMostrar.getSelectedRow(), 2).toString());
        jTexApMaterno.setText(tlbMostrar.getValueAt(tlbMostrar.getSelectedRow(), 3).toString());
        jTextDni.setText(tlbMostrar.getValueAt(tlbMostrar.getSelectedRow(), 4).toString());
        jTextTelefono.setText(tlbMostrar.getValueAt(tlbMostrar.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tlbMostrarMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        LOG.info("[FSI] Star boton Nuevo : ");
        habilitaControles(true);
        limpiarControles();
        sw = true;

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        LOG.info("[FSI] Star boton Editar : {}");
        habilitaControles(true);
        sw = false;
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LOG.info("[FSI] Star boton Cancelar : ");
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LOG.info("[FSI] Star boton salir : ");

        int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMostrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMostrarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTexApMaterno;
    private javax.swing.JTextField jTexApPaterno;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JTextField jTxtCodEmpleado;
    private javax.swing.JTable tlbMostrar;
    // End of variables declaration//GEN-END:variables

    private void habilitaControles(boolean b) {
        jTxtCodEmpleado.setEditable(b);
        jTextNombre.setEditable(b);
        jTexApPaterno.setEditable(b);
        jTexApMaterno.setEditable(b);
        jTextDni.setEditable(b);
        jTextTelefono.setEditable(b);

        btnGrabar.setEnabled(b);
        btnCancelar.setEnabled(b);

        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnBorrar.setEnabled(!b);

        btnSalir.setEnabled(!b);
        jTxtCodEmpleado.requestFocus();
    }

    private void limpiarControles() {
        jTxtCodEmpleado.setText(null);
        jTextNombre.setText(null);
        jTexApPaterno.setText(null);
        jTexApMaterno.setText(null);
        jTextDni.setText(null);
        jTextTelefono.setText(null);

    }

    private void mostrarDatos() {
        String[] aTitulo = {"CODIGO", "NOMBRE", "AP PATERNO", "AP MATERNO", "DNI", "TELEFONO"};
        DefaultTableModel oModel = new DefaultTableModel(loadData(), aTitulo);

        tlbMostrar.setModel(oModel);
    }

}
