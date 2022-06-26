package pe.unjfsc.almacen.java11.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JFrameEmpl extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameEmpl");

    public JFrameEmpl() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblSalir = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        btnProducto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnTrazabilidad = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnUbica = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnCate = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnUM = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(58, 78, 121));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/icons8-user-37.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Área de almacenaje");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 140, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/perfil1-modified (1).png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel3.setMinimumSize(new java.awt.Dimension(300, 300));
        jLabel3.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 170, 180));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("son los más importantes.");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 260, 30));

        jlblSalir.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jlblSalir.setForeground(new java.awt.Color(255, 255, 255));
        jlblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/icons8-exit-30.png"))); // NOI18N
        jlblSalir.setText("Cerrar Sesión");
        jlblSalir.setToolTipText("");
        jlblSalir.setFocusable(false);
        jlblSalir.setName(""); // NOI18N
        jlblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblSalirMouseClicked(evt);
            }
        });
        jPanel2.add(jlblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 260, 70));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nuestros usuarios ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 220, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 260, 20));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ing. Juan Flores Cueto");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 700));

        jSeparator2.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator2.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 610, 20));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-product-80.png"))); // NOI18N
        btnProducto.setContentAreaFilled(false);
        btnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProducto.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel8.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 100));

        jLabel9.setBackground(new java.awt.Color(58, 78, 121));
        jLabel9.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(58, 78, 121));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PRODUCTO A REGISTRAR");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 530, 30));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("productos a ingresar al área de almacén.");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 530, 30));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Creación y edición de los nuevos ");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 530, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 530, 180));

        jLabel10.setBackground(new java.awt.Color(58, 78, 121));
        jLabel10.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(58, 78, 121));
        jLabel10.setText("PRODUCTO Y MÁS SERVICIOS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 410, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTrazabilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-research-80.png"))); // NOI18N
        btnTrazabilidad.setContentAreaFilled(false);
        btnTrazabilidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrazabilidad.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnTrazabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrazabilidadActionPerformed(evt);
            }
        });
        jPanel7.add(btnTrazabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 100));

        jLabel15.setBackground(new java.awt.Color(58, 78, 121));
        jLabel15.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(58, 78, 121));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TRAZABILIDAD");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 30));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Seguimiento de los productos");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("en almacén, hasta transporte.");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 240, 180));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUbica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-location-update-80.png"))); // NOI18N
        btnUbica.setContentAreaFilled(false);
        btnUbica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUbica.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnUbica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbicaActionPerformed(evt);
            }
        });
        jPanel9.add(btnUbica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 100));

        jLabel18.setBackground(new java.awt.Color(58, 78, 121));
        jLabel18.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(58, 78, 121));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("UBICACIÓN");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 30));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("sobre su ubicación actual.");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 30));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Detalles de los almacenes");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 240, 180));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-sorting-80.png"))); // NOI18N
        btnCate.setContentAreaFilled(false);
        btnCate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCate.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCateActionPerformed(evt);
            }
        });
        jPanel10.add(btnCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 100));

        jLabel21.setBackground(new java.awt.Color(58, 78, 121));
        jLabel21.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(58, 78, 121));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("CATEGORIA");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 30));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("marcas de los proveedores.");
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 30));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Creación, edición de los nuevas ");
        jPanel10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 240, 180));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-ovality-sensor-80.png"))); // NOI18N
        btnUM.setContentAreaFilled(false);
        btnUM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUM.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUMActionPerformed(evt);
            }
        });
        jPanel11.add(btnUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 100));

        jLabel24.setBackground(new java.awt.Color(58, 78, 121));
        jLabel24.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(58, 78, 121));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("UNIDAD DE MEDIDA");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 30));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Tipos de medida usados en almacen");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("para empaquetados.");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 30));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 240, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSalirMouseClicked
        LOG.info("[FSI] Star boton Salir : ");
        try {
            dispose();
            JFrameLogin d = new JFrameLogin();
            d.setVisible(true);

        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
    }//GEN-LAST:event_jlblSalirMouseClicked

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        LOG.info("[FSI] Star boton ir a Producto : ");
        JFrameMostrarDProducto a = new JFrameMostrarDProducto();
        a.setVisible(true);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnTrazabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrazabilidadActionPerformed
        LOG.info("[FSI] Star boton ir a Trazabilidad : ");
        JFrameMostrarTrazabilidad a = new JFrameMostrarTrazabilidad();
        a.setVisible(true);
    }//GEN-LAST:event_btnTrazabilidadActionPerformed

    private void btnUbicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbicaActionPerformed
        LOG.info("[FSI] Star boton ir a Ubicación : ");
        JFrameMostrarUbicacion a = new JFrameMostrarUbicacion();
        a.setVisible(true);
    }//GEN-LAST:event_btnUbicaActionPerformed

    private void btnCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCateActionPerformed
        LOG.info("[FSI] Star boton ir a Categoria : ");
        JFrameMostrarCategoria a = new JFrameMostrarCategoria();
        a.setVisible(true);
    }//GEN-LAST:event_btnCateActionPerformed

    private void btnUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUMActionPerformed
        LOG.info("[FSI] Star boton ir a Unidad Medida : ");
        JFrameMostrarUnidad a = new JFrameMostrarUnidad();
        a.setVisible(true);
    }//GEN-LAST:event_btnUMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCate;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnTrazabilidad;
    private javax.swing.JButton btnUM;
    public javax.swing.JButton btnUbica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblSalir;
    // End of variables declaration//GEN-END:variables
}
