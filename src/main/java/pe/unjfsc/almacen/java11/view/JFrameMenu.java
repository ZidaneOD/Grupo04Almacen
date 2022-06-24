package pe.unjfsc.almacen.java11.view;

public class JFrameMenu extends javax.swing.JFrame {

    public JFrameMenu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        manCategoria = new javax.swing.JMenuItem();
        manEmpleado = new javax.swing.JMenuItem();
        manPuesto = new javax.swing.JMenuItem();
        manTrazabilidad = new javax.swing.JMenuItem();
        manUbicacion = new javax.swing.JMenuItem();
        manUnidad = new javax.swing.JMenuItem();
        manProducto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Mantenimiento");

        manCategoria.setMnemonic('o');
        manCategoria.setText("Categoria");
        manCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manCategoriaActionPerformed(evt);
            }
        });
        fileMenu.add(manCategoria);

        manEmpleado.setMnemonic('s');
        manEmpleado.setText("Empleado");
        manEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manEmpleadoActionPerformed(evt);
            }
        });
        fileMenu.add(manEmpleado);

        manPuesto.setMnemonic('a');
        manPuesto.setText("Puesto");
        manPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manPuestoActionPerformed(evt);
            }
        });
        fileMenu.add(manPuesto);

        manTrazabilidad.setMnemonic('x');
        manTrazabilidad.setText("Trazabilidad");
        manTrazabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manTrazabilidadActionPerformed(evt);
            }
        });
        fileMenu.add(manTrazabilidad);

        manUbicacion.setText("Ubicación");
        manUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manUbicacionActionPerformed(evt);
            }
        });
        fileMenu.add(manUbicacion);

        manUnidad.setText("Unidad");
        manUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manUnidadActionPerformed(evt);
            }
        });
        fileMenu.add(manUnidad);

        manProducto.setText("Producto");
        manProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manProductoActionPerformed(evt);
            }
        });
        fileMenu.add(manProducto);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manTrazabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manTrazabilidadActionPerformed
        JFrameMenu.desktopPane.add(new JFrameMostrarTrazabilidad2());
    }//GEN-LAST:event_manTrazabilidadActionPerformed

    private void manEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manEmpleadoActionPerformed
        JFrameMenu.desktopPane.add(new JFrameMostrarEmpleado2());
    }//GEN-LAST:event_manEmpleadoActionPerformed

    private void manCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manCategoriaActionPerformed
        JFrameMenu.desktopPane.add(new JFrameMostrarCategoria2());
    }//GEN-LAST:event_manCategoriaActionPerformed

    private void manPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manPuestoActionPerformed
        JFrameMenu.desktopPane.add(new JFrameMostrarPuesto2());
    }//GEN-LAST:event_manPuestoActionPerformed

    private void manUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manUbicacionActionPerformed
        JFrameMenu.desktopPane.add(new JFrameMostrarUbicacion2());
    }//GEN-LAST:event_manUbicacionActionPerformed

    private void manUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manUnidadActionPerformed
        JFrameMenu.desktopPane.add(new JFrameMostrarUnidad2());
    }//GEN-LAST:event_manUnidadActionPerformed

    private void manProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manProductoActionPerformed
        JFrameMenu.desktopPane.add(new JFrameMostrarDProducto2());
    }//GEN-LAST:event_manProductoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem manCategoria;
    private javax.swing.JMenuItem manEmpleado;
    private javax.swing.JMenuItem manProducto;
    private javax.swing.JMenuItem manPuesto;
    private javax.swing.JMenuItem manTrazabilidad;
    private javax.swing.JMenuItem manUbicacion;
    private javax.swing.JMenuItem manUnidad;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
