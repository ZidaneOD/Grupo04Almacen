/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.unjfsc.almacen.java11.view;

import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEDetalleProducto;
import pe.unjfsc.almacen.java11.logical.CLVariacionDProducto;
import pe.unjfsc.almacen.java11.model.CICambioDProducto;
import pe.unjfsc.almacen.java11.model.imp.CMCambioDProductoHashSet;

public class JFrameMostrarDProducto extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameMostrarDProducto");

    private HashSet<CEDetalleProducto> oHsData;
    private CICambioDProducto oCIProducto;
    CEDetalleProducto oProducto;
    CMCambioDProductoHashSet oCMProducto;
    boolean sw;

    public JFrameMostrarDProducto() {
        oCMProducto = new CMCambioDProductoHashSet();
        oProducto = new CEDetalleProducto();
        initComponents();
        setLocationRelativeTo(null);
        setSize(855, 695);
        setVisible(true);

        String[] aTitulo = {"SKU", "PRODUCTO", "DESCRIPCIÓN", "CATEGORIA", "STOCK", "PRECIO", "UNIDAD", "F. CADUCIDAD", "UBICACIÓN", "ESTADO", "ENTRADA", "SALIDA", "EMPLEADO"};
        DefaultTableModel oModel = new DefaultTableModel(loadData(), aTitulo);

        tblMostrar.setModel(oModel);
    }

    private Object[][] loadData() {
        oCIProducto = oCMProducto;
        oHsData = oCIProducto.consultAllDetallePCIC();

        CLVariacionDProducto oLogicalDProducto = new CLVariacionDProducto();
        return oLogicalDProducto.convertHashSetArray(oHsData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        cmbUnidad = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCaducidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbUbic = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbTrazabilidad = new javax.swing.JComboBox<>();
        txtEntrada = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSalida = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMostrarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMostrar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setEditable(false);
        txtCodigo.setBorder(null);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 155, 28));

        txtNombre.setEditable(false);
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 155, 28));

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel1.setText("CODIGO :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRE :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 87, 100, 30));

        txtDesc.setEditable(false);
        txtDesc.setBorder(null);
        jPanel1.add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 155, 28));

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel4.setText("DESCRIPCION :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 120, 30));

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel5.setText("CATEGORIA :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 30));

        cmbCategoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INSUMO", "HELADO", "MAQUINARIA" }));
        cmbCategoria.setEnabled(false);
        jPanel1.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 155, 28));

        txtPrecio.setEditable(false);
        txtPrecio.setBorder(null);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 62, 28));

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel6.setText("STOCK :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 167, 110, 30));

        txtStock.setEditable(false);
        txtStock.setBorder(null);
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 62, 28));

        cmbUnidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LT", "KG", "CAJA" }));
        cmbUnidad.setEnabled(false);
        jPanel1.add(cmbUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 93, 28));

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel7.setText("PRECIO :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 90, 30));

        jLabel8.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel8.setText("UNIDAD :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 80, 30));

        jLabel9.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel9.setText("CADUCIDAD :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 30));

        txtCaducidad.setEditable(false);
        txtCaducidad.setBorder(null);
        jPanel1.add(txtCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 155, 28));

        jLabel11.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel11.setText("UBICACION :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 110, 30));

        cmbUbic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbUbic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HUARAL", "HUAURA", "BARRANCA" }));
        cmbUbic.setEnabled(false);
        jPanel1.add(cmbUbic, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 155, 28));

        jLabel12.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel12.setText("ESTADO :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, 30));

        cmbTrazabilidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbTrazabilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALMACEN", "PICKING", "UNITARIZACIÓN", "TRANSPORTE" }));
        cmbTrazabilidad.setEnabled(false);
        jPanel1.add(cmbTrazabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 155, 28));

        txtEntrada.setEditable(false);
        txtEntrada.setBorder(null);
        jPanel1.add(txtEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 62, 28));

        jLabel13.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel13.setText("ENTRADA :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 30));

        jLabel14.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel14.setText("SALIDA :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 70, 30));

        txtSalida.setEditable(false);
        txtSalida.setBorder(null);
        jPanel1.add(txtSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 62, 28));

        jLabel15.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel15.setText(" EMPLEADO :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 328, 120, 30));

        txtEmpleado.setEditable(false);
        txtEmpleado.setBorder(null);
        jPanel1.add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 155, 28));

        jPanel2.setBackground(new java.awt.Color(58, 78, 121));

        btnCancelar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 130, 40));

        jPanel5.setBackground(new java.awt.Color(58, 78, 121));

        btnGrabar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnGrabar.setForeground(new java.awt.Color(255, 255, 255));
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.setBorder(null);
        btnGrabar.setContentAreaFilled(false);
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGrabar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 130, 40));

        jSeparator2.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator2.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 60, 20));

        jSeparator3.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator3.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 160, 20));

        jSeparator4.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator4.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, 20));

        jSeparator5.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator5.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 160, 20));

        jSeparator6.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator6.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 60, 20));

        jSeparator7.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator7.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 160, 20));

        jSeparator8.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator8.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 60, 20));

        jSeparator9.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator9.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 60, 20));

        jSeparator10.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator10.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 160, 20));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRO DEL PRODUCTO");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 620, 30));

        jPanel6.setBackground(new java.awt.Color(231, 96, 76));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sal.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel6.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel3.setBackground(new java.awt.Color(58, 78, 121));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setBorder(null);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 60));

        btnEditar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(null);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 190, 60));

        btnBorrar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnBorrar.setText("BORRAR");
        btnBorrar.setBorder(null);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 190, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMostrarMouseClicked

        txtCodigo.setText(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 0).toString());
        txtNombre.setText(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 1).toString());
        txtDesc.setText(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 2).toString());
        cmbCategoria.setSelectedItem(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 3).toString());
        txtStock.setText(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 4).toString());
        txtPrecio.setText(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 5).toString());
        cmbUnidad.setSelectedItem(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 6).toString());
        txtCaducidad.setText(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 7).toString());
        cmbUbic.setSelectedItem(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 8).toString());
        cmbTrazabilidad.setSelectedItem(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 9).toString());
        txtEntrada.setText(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 10).toString());
        txtSalida.setText(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 11).toString());
        txtEmpleado.setText(tblMostrar.getValueAt(tblMostrar.getSelectedRow(), 12).toString());
    }//GEN-LAST:event_tblMostrarMouseClicked

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LOG.info("[FSI] Star boton Cancelar : ");
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        LOG.info("[FSI] Star boton Grabar : {}");

        //Verificar
        if (!txtCodigo.getText().isEmpty()) {

            oProducto.setSkuProd(txtCodigo.getText().trim());
            oProducto.setNombProd(txtNombre.getText().trim());
            oProducto.setDescProd(txtDesc.getText().trim());

            oProducto.setCateProd(cmbCategoria.getSelectedItem().toString());
            oProducto.setStocProd(Integer.parseInt(txtStock.getText().trim()));
            oProducto.setPrecProd(Double.parseDouble(txtPrecio.getText().trim()));

            oProducto.setUnidProd(cmbUnidad.getSelectedItem().toString());
            oProducto.setCaduProd(txtCaducidad.getText().trim());
            oProducto.setUbicProd(cmbUbic.getSelectedItem().toString());

            oProducto.setTrazProd(cmbTrazabilidad.getSelectedItem().toString());
            oProducto.setEntrPord(Integer.parseInt(txtEntrada.getText().trim()));
            oProducto.setSaliProd(Integer.parseInt(txtSalida.getText().trim()));

            oProducto.setCodiEmpl(txtEmpleado.getText().trim());

            if (sw) {
                oCMProducto.saveDetallePCIC(oProducto);
                LOG.info("[FSI] Dato Grabado : {}");
            } else {
                oCMProducto.modificarDetallePCIC(txtCodigo.getText().trim(),
                        txtNombre.getText().trim(),
                        txtDesc.getText().trim(),
                        cmbCategoria.getSelectedItem().toString(),
                        Integer.parseInt(txtStock.getText().trim()),
                        Double.parseDouble(txtPrecio.getText().trim()),
                        cmbUnidad.getSelectedItem().toString(),
                        txtCaducidad.getText().trim(),
                        cmbUbic.getSelectedItem().toString(),
                        cmbTrazabilidad.getSelectedItem().toString(),
                        Integer.parseInt(txtEntrada.getText().trim()),
                        Integer.parseInt(txtSalida.getText().trim()),
                        txtEmpleado.getText().trim());
                LOG.info("[FSI] Dato Editado : {}");
            }

            mostrarDatos();
        } else {
            LOG.info("[FSI] Error al ingreso de datos : {} ", txtCodigo.getText(), " - ", txtNombre.getText(), " - ", txtDesc.getText());
        }
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LOG.info("[FSI] Star boton salir : ");

        int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        LOG.info("[FSI] Star boton Eliminar : {}");
        try {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (!txtCodigo.getText().isEmpty()) {
                if (op == JOptionPane.YES_OPTION) {

                    oCMProducto.eliminarDetallePCIC(txtCodigo.getText());
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbTrazabilidad;
    private javax.swing.JComboBox<String> cmbUbic;
    private javax.swing.JComboBox<String> cmbUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tblMostrar;
    private javax.swing.JTextField txtCaducidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSalida;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

    private void habilitaControles(boolean b) {
        JTextField[] arrayFields = {
            txtCodigo, txtNombre,
            txtStock, txtSalida, txtPrecio, txtEntrada, txtEmpleado, txtDesc, txtCaducidad};

        for (JTextField objJTextField : arrayFields) {
            objJTextField.setEditable(b);
        }

        btnGrabar.setEnabled(b);
        btnCancelar.setEnabled(b);

        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnBorrar.setEnabled(!b);

        btnSalir.setEnabled(!b);

        cmbCategoria.setEnabled(b);
        cmbTrazabilidad.setEnabled(b);
        cmbUbic.setEnabled(b);
        cmbUnidad.setEnabled(b);

        txtCodigo.requestFocus();
    }

    private void limpiarControles() {
        JTextField[] arrayFields = {
            txtCodigo, txtNombre,
            txtStock, txtSalida, txtPrecio, txtEntrada, txtEmpleado, txtDesc, txtCaducidad};

        for (JTextField objJTextField : arrayFields) {
            objJTextField.setText(null);
        }
        cmbCategoria.setSelectedIndex(0);
        cmbTrazabilidad.setSelectedIndex(0);
        cmbUbic.setSelectedIndex(0);
        cmbUnidad.setSelectedIndex(0);

    }

    private void mostrarDatos() {
        String[] aTitulo = {"SKU", "PRODUCTO", "DESCRIPCIÓN", "CATEGORIA", "STOCK", "PRECIO", "UNIDAD", "F. CADUCIDAD", "UBICACIÓN", "ESTADO", "ENTRADA", "SALIDA", "EMPLEADO"};
        DefaultTableModel oModel = new DefaultTableModel(loadData(), aTitulo);

        tblMostrar.setModel(oModel);
    }
}
