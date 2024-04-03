/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.Aba.ItemBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mavenproject1.Aba;
import com.mycompany.mavenproject1.Item;
import com.mycompany.mavenproject1.BuscarAbarrote;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Statement;
import javax.swing.JSpinner;
import javax.swing.SwingUtilities;

public class Abarrotes extends javax.swing.JInternalFrame {

    private final CConexion bd = new CConexion();
    private final Connection BD = bd.conectar();
    private final DefaultTableModel modelo = new DefaultTableModel();
    private final DefaultTableModel venta = new DefaultTableModel();
    private final DefaultTableModel cash = new DefaultTableModel();
    private final ArrayList<Aba> listaabarrotes = new ArrayList<>();
    private final ArrayList<Item> listaItem = new ArrayList<>();
    private final ArrayList<Item> listaProvee = new ArrayList<>();
    private final ArrayList<Item> listaAbarr = new ArrayList<>();
    private final ArrayList<Item> listaPersonal = new ArrayList<>();    
    // Crear una lista para los elementos del JComboBox
    public Abarrotes() {
        initComponents();
        this.setTitle("AREA DE ADMINISTRACION");
        modelo.addColumn("ID_PRODUCTO");
        modelo.addColumn("CATEGORIA");
        modelo.addColumn("MARCA");
        modelo.addColumn("PESO_kg");
        modelo.addColumn("LITRO");
        modelo.addColumn("NombreProveedor");
        modelo.addColumn("S_COMPRA_TOTAL");
        modelo.addColumn("S_VENTA_UNIDAD");
        modelo.addColumn("UNIDADES");
        tblDatosAbarrotes.setModel(modelo);
        venta.addColumn("ID_PRODUCTO");
        venta.addColumn("CATEGORIA");
        venta.addColumn("MARCA");
        venta.addColumn("PESO_kg");
        venta.addColumn("LITRO");
        venta.addColumn("NombreProveedor");
        venta.addColumn("S_VENTA_UNIDAD");
        venta.addColumn("UNIDADES");
        tblVentas.setModel(venta);
        cash.addColumn("ID_VENTA");
        cash.addColumn("nombre_vendedor");
        cash.addColumn("PRECIO_UNIDAD");
        cash.addColumn("ID_PRODUCTO");
        cash.addColumn("UNIDAD");
        cash.addColumn("MONTO_S");
        tblCash.setModel(cash);
        
        
        // Ejemplo con BorderLayout
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnPrecio = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbIDCategoria = new javax.swing.JComboBox<>();
        cbIdProveedor = new javax.swing.JComboBox<>();
        spnUnidad = new javax.swing.JSpinner();
        spnPeso = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spnLitro = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        spnVenta = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbProveedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosAbarrotes = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnMostrarTodo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        spnId = new javax.swing.JSpinner();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cbCategoriaVentas = new javax.swing.JComboBox<>();
        cbProveedorVentas = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        spnIdProductoVenta = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        spnCantidadVenta = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        txtPrecioUnidad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbPersonalVenta = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtTotalVenta = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnRegistrarVenta = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        btnFiltrarVenta = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCash = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        cbPersonal = new javax.swing.JComboBox<>();
        spnProducto = new javax.swing.JSpinner();
        jPanel12 = new javax.swing.JPanel();
        spnCanVenta = new javax.swing.JSpinner();
        btnOkVenta = new javax.swing.JButton();
        btnTodoVenta = new javax.swing.JButton();
        btnBuscarVenta = new javax.swing.JButton();

        setBackground(new java.awt.Color(191, 191, 246));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 142, 142));
        jLabel1.setText("MORALES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 130, 40));

        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(68, 96, 181));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 24), new java.awt.Color(5, 5, 78))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MARCA :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID_PROVEEDOR:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        spnPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnPrecio.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0E13f), Float.valueOf(0.1f)));
        jPanel4.add(spnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 190, 50));
        spnPrecio.getAccessibleContext().setAccessibleParent(this);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UNIDAD :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        txtMarca.setBackground(new java.awt.Color(51, 153, 255));
        txtMarca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel4.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 180, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID_CATEGORIA :");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        cbIDCategoria.setBackground(new java.awt.Color(51, 153, 255));
        cbIDCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbIDCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIDCategoriaActionPerformed(evt);
            }
        });
        jPanel4.add(cbIDCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 170, 40));

        cbIdProveedor.setBackground(new java.awt.Color(51, 153, 255));
        cbIdProveedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel4.add(cbIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 180, 50));

        spnUnidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnUnidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel4.add(spnUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 190, 60));

        spnPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnPeso.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.1f));
        jPanel4.add(spnPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 190, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PESO_kg :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 90, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LITRO :");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        spnLitro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnLitro.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.1f));
        jPanel4.add(spnLitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 190, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("S/_COMPRA_TOTAL :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        spnVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnVenta.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.1f));
        jPanel4.add(spnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 190, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("S/_VENTA_UNIDAD :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        btnNuevo.setBackground(new java.awt.Color(0, 51, 204));
        btnNuevo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel4.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 130, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 930, 520));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 200, 290, 160));

        jTabbedPane1.addTab("REGISTRAR", jPanel1);

        jPanel2.setBackground(new java.awt.Color(7, 95, 95));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(26, 67, 73));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTROS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18), new java.awt.Color(161, 245, 224))); // NOI18N
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CATEGORIA :");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        cbCategoria.setBackground(new java.awt.Color(51, 246, 208));
        jPanel5.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 200, 50));

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PROVEEDOR:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        cbProveedor.setBackground(new java.awt.Color(51, 246, 208));
        jPanel5.add(cbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 180, 50));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 670, 100));

        tblDatosAbarrotes.setBackground(new java.awt.Color(111, 209, 208));
        tblDatosAbarrotes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 27, 27)));
        tblDatosAbarrotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDatosAbarrotes.setForeground(new java.awt.Color(0, 0, 0));
        tblDatosAbarrotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(tblDatosAbarrotes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1320, 350));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 160, 80));

        btnMostrarTodo.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarTodo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnMostrarTodo.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrarTodo.setText("MOSTRAR TODO");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, 270, 80));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANCELAR_REGISTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setToolTipText("");
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID :");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        spnId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnId.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel7.add(spnId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 150, 50));

        btnEliminar.setBackground(new java.awt.Color(251, 41, 41));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("OK");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel7.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 190, 70));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 490, 110));

        jTabbedPane1.addTab("DETALLES_REGISTRO", jPanel2);

        jPanel3.setBackground(new java.awt.Color(221, 145, 145));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 5, -1, -1));

        jPanel8.setBackground(new java.awt.Color(172, 69, 69));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTROS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18), new java.awt.Color(20, 18, 18))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbCategoriaVentas.setBackground(new java.awt.Color(242, 111, 111));
        jPanel8.add(cbCategoriaVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 50));

        cbProveedorVentas.setBackground(new java.awt.Color(242, 111, 111));
        jPanel8.add(cbProveedorVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 190, 50));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 110));

        jPanel9.setBackground(new java.awt.Color(172, 69, 69));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "S/VENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnIdProductoVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        spnIdProductoVenta.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnIdProductoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spnIdProductoVentaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spnIdProductoVentaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spnIdProductoVentaKeyTyped(evt);
            }
        });
        jPanel9.add(spnIdProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 110, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ID :");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        spnCantidadVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        spnCantidadVenta.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel9.add(spnCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 90, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("CANTIDAD :");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        txtPrecioUnidad.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioUnidad.setEnabled(false);
        jPanel9.add(txtPrecioUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 130, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText(" X       PRECIO-UNIDAD :");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        cbPersonalVenta.setBackground(new java.awt.Color(242, 111, 111));
        cbPersonalVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPersonalVentaActionPerformed(evt);
            }
        });
        jPanel9.add(cbPersonalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("PERSONAL :");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtTotalVenta.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalVenta.setEnabled(false);
        jPanel9.add(txtTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 120, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("=      TOTAL");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));

        btnRegistrarVenta.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarVenta.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRegistrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenta.setText("REGISTRAR VENTA");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });
        jPanel9.add(btnRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 410, 60));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 840, 170));

        tblVentas.setBackground(new java.awt.Color(247, 198, 198));
        tblVentas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 27, 27)));
        tblVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVentas.setForeground(new java.awt.Color(0, 0, 0));
        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane3.setViewportView(tblVentas);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1300, 370));

        btnFiltrarVenta.setBackground(new java.awt.Color(0, 0, 0));
        btnFiltrarVenta.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnFiltrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnFiltrarVenta.setText("BUSCAR");
        btnFiltrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarVentaActionPerformed(evt);
            }
        });
        jPanel3.add(btnFiltrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 40));

        jTabbedPane1.addTab("VENTAS", jPanel3);

        jPanel10.setBackground(new java.awt.Color(189, 155, 86));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCash.setBackground(new java.awt.Color(213, 187, 135));
        tblCash.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblCash);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 1280, 280));

        jPanel11.setBackground(new java.awt.Color(108, 86, 41));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbPersonal.setBackground(new java.awt.Color(189, 155, 86));
        jPanel11.add(cbPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 160, 50));

        spnProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spnProducto.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel11.add(spnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 160, 50));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 540, 100));

        jPanel12.setBackground(new java.awt.Color(108, 86, 41));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANCELAR_VENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnCanVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spnCanVenta.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel12.add(spnCanVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 160, 50));

        btnOkVenta.setBackground(new java.awt.Color(0, 0, 0));
        btnOkVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOkVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnOkVenta.setText("OK");
        btnOkVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkVentaActionPerformed(evt);
            }
        });
        jPanel12.add(btnOkVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 140, 50));

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 500, 120));

        btnTodoVenta.setBackground(new java.awt.Color(0, 0, 0));
        btnTodoVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTodoVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnTodoVenta.setText("MOSTRAR TODO");
        btnTodoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodoVentaActionPerformed(evt);
            }
        });
        jPanel10.add(btnTodoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 220, 80));

        btnBuscarVenta.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVenta.setText("BUSCAR");
        btnBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVentaActionPerformed(evt);
            }
        });
        jPanel10.add(btnBuscarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 190, 80));

        jTabbedPane1.addTab("DETALLES_VENTAS", jPanel10);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1360, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Función genérica para obtener el valor asociado de una lista de objetos
        public int obtenerValorAsociado(List<? extends Item> lista, String categoriaSeleccionada) {
            int valorAsociado = -1; // Valor por defecto o código de error
            // Iterar sobre la lista de Items
            for (Item item : lista) {
                // Verificar si el texto de visualización del Item coincide con la categoría seleccionada
                if (item.getDisplayText().equals(categoriaSeleccionada)) {
                    // Obtener el valor asociado al ítem seleccionado
                    valorAsociado = item.getValue();
                    // Salir del bucle una vez que encuentres el elemento
                    break;
                }
            }
            // Devolver el valor asociado
            return valorAsociado;
        }
        
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        listaProvee.add(new Item("ELEGIR...", 0));
        listaProvee.add(new Item("NUTRIQORA", 1));
        listaProvee.add(new Item("BACKUS", 2));
        listaItem.add(new Item("ELEGIR...", 0));
        listaItem.add(new Item("ARROZ", 1));
        listaItem.add(new Item("AZUCAR", 2));
        listaItem.add(new Item("GASEOSA", 3));
        listaItem.add(new Item("JUGO", 4));
        listaItem.add(new Item("GALLETA", 5));
        listaItem.add(new Item("SNACK", 6));
        listaPersonal.add(new Item("Elegir...", 0));
        listaPersonal.add(new Item("Kevin", 1));
        listaPersonal.add(new Item("Juan", 2));
        
        for (Item provee : listaProvee) {
        cbIdProveedor.addItem(provee.getDisplayText());
        cbProveedor.addItem(provee.getDisplayText());
        cbProveedorVentas.addItem(provee.getDisplayText());
        }

        for (Item item : listaItem) {
            cbIDCategoria.addItem(item.getDisplayText());
            cbCategoria.addItem(item.getDisplayText());
            cbCategoriaVentas.addItem(item.getDisplayText());
        }
        for (Item item : listaPersonal) {
            cbPersonalVenta.addItem(item.getDisplayText());
            cbPersonal.addItem(item.getDisplayText());
        }
        // Obtener el valor seleccionado de cbAbarrote      
        String selectedValueAbarrote = (String) cbIDCategoria.getSelectedItem();
        // Obtener el valor seleccionado de cbAbarr
        String selectedValueAbarr = (String) cbCategoria.getSelectedItem();

        // Verificar si el valor seleccionado no es nulo antes de utilizarlo
        if (selectedValueAbarrote != null) {
            System.out.println("Valor seleccionado en cbAbarrote: " + selectedValueAbarrote);
        } else {
            System.out.println("No hay elemento seleccionado en cbAbarrote.");
        }

        if (selectedValueAbarr != null) {
            System.out.println("Valor seleccionado en cbAbarr: " + selectedValueAbarr);
        } else {
            System.out.println("No hay elemento seleccionado en cbAbarr.");
        }
        // Verificar si el valor seleccionado no es nulo antes de intentar convertirlo a int
        // Resto de tu código...
    }//GEN-LAST:event_formInternalFrameOpened

    
   private void cargaridProducto(){
           try {
            Object idProducto = spnIdProductoVenta.getValue();

            String sql = "SELECT S_VENTA_UNIDAD\n" +
                         "FROM productos\n" +
                         "WHERE ID_PRODUCTO = ? AND ESTADO = 'INGRESO';";

            try (PreparedStatement pstmt = BD.prepareStatement(sql)) {
                pstmt.setObject(1, idProducto);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        // Obtener el valor de S_VENTA_UNIDAD y asignarlo a txtPrecioUnidad
                        txtPrecioUnidad.setText(rs.getString("S_VENTA_UNIDAD"));

                        float precioU = Float.parseFloat(txtPrecioUnidad.getText());
                        int cantidades = Integer.parseInt(spnCantidadVenta.getValue().toString());

                        float totales = precioU * cantidades;
                        txtTotalVenta.setText(String.valueOf(totales));

                        JOptionPane.showMessageDialog(this, "Búsqueda exitosa.");
                    } else {
                        JOptionPane.showMessageDialog(this, "No se encontraron resultados para el ID de producto especificado.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error en la búsqueda: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error en el formato del precio de la unidad.", "Error", JOptionPane.ERROR_MESSAGE);
        }
   }
   
   private void detalleVentas(){
       try {
            String sql = "SELECT ventas.ID_VENTA, \n" +
                "       personal.nombre AS nombre_vendedor, \n" +
                "       ventas.PRECIO_UNIDAD, \n" +
                "       ventas.ID_PRODUCTO, \n" +
                "       ventas.UNIDAD, \n" +
                "       ventas.MONTO_S\n" +
                "FROM ventas\n" +
                "JOIN personal ON ventas.ID_PERSONAL = personal.id_personal\n" +
                "WHERE ventas.ESTADO = 'VENTA';";

        try (PreparedStatement pstmt = BD.prepareStatement(sql)) {
            Aba productos = new Aba();
            // Crear una instancia de DefaultTableModel
            DefaultTableModel modeloTabla = (DefaultTableModel) tblCash.getModel();
            // Limpiar las filas existentes en la tabla

            modeloTabla.setRowCount(0);

            // Execute the query and retrieve the result set
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    // Retrieve data from the result set
                    Object[] fila = new Object[6];
                    fila[0] = rs.getInt("ID_VENTA");
                    fila[1] = rs.getString("nombre_vendedor");
                    fila[2] = rs.getString("PRECIO_UNIDAD");
                    fila[3] = rs.getObject("ID_PRODUCTO");
                    fila[4] = rs.getObject("UNIDAD");
                    fila[5] = rs.getString("MONTO_S");
                    // Add the row to the table model
                    modeloTabla.addRow(fila);
                }
            }
            
            tblCash.setModel(modeloTabla);
            JOptionPane.showMessageDialog(this, "Búsqueda exitosa.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta SQL: " + e.getMessage());
    }
   }
    
    private void VendiendoAgotar() {
        try {
            Object idProducto = spnIdProductoVenta.getValue();
            String sql = "UPDATE productos p\n" +
                    "SET p.ESTADO = 'AGOTADO'\n" +
                    "WHERE p.ID_PRODUCTO = ? AND (\n" +
                    "    p.UNIDADES - COALESCE((SELECT SUM(v.UNIDAD) FROM ventas v WHERE v.ID_PRODUCTO = p.ID_PRODUCTO), 0)\n" +
                    ") <= 0;";

            try (PreparedStatement pstmt = BD.prepareStatement(sql)) {
                    pstmt.setObject(1, idProducto);
                    System.out.println("Query: " + pstmt.toString());
                    int rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Estado actualizado a 'AGOTADO'.");
                    } else {
                        JOptionPane.showMessageDialog(this, "No se actualizaron filas.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar el estado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
   
private void cargarDatosEnTabla() {
    try {
        String sql = "SELECT\n" +
                "    p.ID_PRODUCTO,\n" +
                "    c.NOMBRE AS CATEGORIA,\n" +
                "    p.MARCA,\n" +
                "    p.PESO_kg,\n" +
                "    p.LITRO,\n" +
                "    pr.NombreProveedor,\n" +
                "    p.S_COMPRA_TOTAL,\n" +
                "    p.S_VENTA_UNIDAD,\n" +
                "    p.UNIDADES\n" +
                "FROM\n" +
                "    productos p\n" +
                "JOIN\n" +
                "    proveedores pr ON p.ID_PROVEEDOR = pr.ID_PROVEEDOR\n" +
                "JOIN\n" +
                "    categorias c ON p.ID_CATEGORIA = c.ID_CATEGORIA\n" +
                "LEFT JOIN\n" +
                "    ventas v ON p.ID_PRODUCTO = v.ID_PRODUCTO\n" +
                "WHERE p.estado != 'ELIMINADO'\n" +
                "GROUP BY\n" +
                "    p.ID_PRODUCTO, c.NOMBRE, p.MARCA, p.PESO_kg, p.LITRO, pr.NombreProveedor, p.S_COMPRA_TOTAL, p.S_VENTA_UNIDAD, p.UNIDADES\n" +
                "ORDER BY\n" +
                "    p.ID_PRODUCTO;";

        // Try-with-resources para PreparedStatement y ResultSet
        try (PreparedStatement pstmt = BD.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            // Crear una instancia de DefaultTableModel
            DefaultTableModel modeloTabla = (DefaultTableModel) tblDatosAbarrotes.getModel();
            // Limpiar las filas existentes en la tabla
            modeloTabla.setRowCount(0);

            // Procesar los resultados
            while (rs.next()) {
                // Retrieve data from the result set
                Object[] fila = new Object[9];
                fila[0] = rs.getInt("ID_PRODUCTO");
                fila[1] = rs.getString("CATEGORIA");
                fila[2] = rs.getString("MARCA");
                fila[3] = rs.getObject("PESO_kg");
                fila[4] = rs.getObject("LITRO");
                fila[5] = rs.getString("NombreProveedor");
                fila[6] = rs.getFloat("S_COMPRA_TOTAL");
                fila[7] = rs.getFloat("S_VENTA_UNIDAD");
                fila[8] = rs.getInt("UNIDADES");
                // Add the row to the table model
                modeloTabla.addRow(fila);
            }

            // Actualizar la tabla en el hilo de eventos de Swing
            SwingUtilities.invokeLater(() -> tblDatosAbarrotes.setModel(modeloTabla));
            JOptionPane.showMessageDialog(this, "Búsqueda exitosa.");
        }
    } catch (SQLException e) {
        // Mostrar mensaje de error al usuario
        SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta SQL: " + e.getMessage()));
        e.printStackTrace(); // También puedes registrar el error en la consola si es necesario.
    }
}

    
    
    
    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        cargarDatosEnTabla();
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String categoriaSeleccionadaAbarr = (String) cbCategoria.getSelectedItem();

        // Llamada a la función para obtener el valor asociado de listaAbarr
        int valorAsociadoAbarr = obtenerValorAsociado(listaItem, categoriaSeleccionadaAbarr);
        String categoriaSeleccionadaProvee = (String) cbProveedor.getSelectedItem();

        // Llamada a la función para obtener el valor asociado de listaProvee
        int valorAsociadoProvee = obtenerValorAsociado(listaProvee, categoriaSeleccionadaProvee);

        try {
            String sql = "SELECT\n" +
            "    productos.ID_PRODUCTO,\n" +
            "    categorias.NOMBRE AS CATEGORIA,\n" +
            "    productos.MARCA,\n" +
            "    productos.PESO_kg,\n" +
            "    productos.LITRO,\n" +
            "    productos.S_COMPRA_TOTAL,\n" +
            "    productos.S_VENTA_UNIDAD,\n" +
            "    productos.UNIDADES,\n" +
            "    proveedores.NombreProveedor\n" +
            "FROM productos\n" +
            "JOIN proveedores ON productos.ID_PROVEEDOR = proveedores.ID_PROVEEDOR\n" +
            "JOIN categorias ON productos.ID_CATEGORIA = categorias.ID_CATEGORIA\n" +
            "WHERE (categorias.NOMBRE = ? OR proveedores.NombreProveedor = ?) AND estado != 'ELIMINADO'\n" +
            "ORDER BY productos.ID_PRODUCTO;";



            try (PreparedStatement pstmt = BD.prepareStatement(sql)) {
                Aba productos = new Aba();
                // Crear una instancia de DefaultTableModel
                DefaultTableModel modeloTabla = (DefaultTableModel) tblDatosAbarrotes.getModel();
                // Limpiar las filas existentes en la tabla

                if (valorAsociadoAbarr == 0 && valorAsociadoProvee == 0 ) {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un proveedor o categoría.");
                    return; // Salir del método si el proveedor o la categoría no están seleccionados
                } else {
                    modeloTabla.setRowCount(0);
                    try {
                        productos.setCategoria(categoriaSeleccionadaAbarr);
                        productos.setProveedor(categoriaSeleccionadaProvee);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Error al convertir valores a números.");
                        return; // Salir del método en caso de error
                    }

                    pstmt.setString(1, String.valueOf(productos.getCategoria()));
                    pstmt.setString(2, String.valueOf(productos.getProveedor()));

                    // Execute the query and retrieve the result set
                    try (ResultSet rs = pstmt.executeQuery()) {
                        while (rs.next()) {
                            // Retrieve data from the result set
                            Object[] fila = new Object[9];
                            fila[0] = rs.getInt("ID_PRODUCTO");
                            fila[1] = rs.getString("CATEGORIA");
                            fila[2] = rs.getString("MARCA");
                            fila[3] = rs.getObject("PESO_kg");
                            fila[4] = rs.getObject("LITRO");
                            fila[5] = rs.getString("NombreProveedor");
                            fila[6] = rs.getFloat("S_COMPRA_TOTAL");
                            fila[7] = rs.getFloat("S_VENTA_UNIDAD");
                            fila[8] = rs.getInt("UNIDADES");

                            // Add the row to the table model
                            modeloTabla.addRow(fila);
                        }
                    }
                }

                tblDatosAbarrotes.setModel(modeloTabla);
                JOptionPane.showMessageDialog(this, "Búsqueda exitosa.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta SQL: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String categoriaSeleccionadaItem = (String) cbIDCategoria.getSelectedItem();
        // Llamada a la función para obtener el valor asociado de listaItem
        int valorAsociadoItem = obtenerValorAsociado(listaItem, categoriaSeleccionadaItem);
        // Obtener la categoría seleccionada para listaAbarr
        String categoriaSeleccionadaAbarr = (String) cbCategoria.getSelectedItem();
        // Llamada a la función para obtener el valor asociado de listaAbarr
        int valorAsociadoAbarr = obtenerValorAsociado(listaItem, categoriaSeleccionadaAbarr);
        // Obtener la categoría seleccionada para listaProvee
        String categoriaSeleccionadaProvee = (String) cbIdProveedor.getSelectedItem();
        // Llamada a la función para obtener el valor asociado de listaProvee
        int valorAsociadoProvee = obtenerValorAsociado(listaProvee, categoriaSeleccionadaProvee);
        if (cbIDCategoria.getSelectedIndex() == 0 ) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una categoría.");
            return; // Salir del método si la categoría no está seleccionada
        }
        // Verificar que se haya seleccionado un proveedor
        if (cbIdProveedor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un proveedor.");
            return; // Salir del método si el proveedor no está seleccionado
        }
        if (txtMarca.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una marca.");
            return; // Salir del método si la marca no está ingresada
        }

        try {
            String sql = "INSERT INTO productos (id_categoria, marca, peso_kg, litro, id_proveedor, S_COMPRA_TOTAL, S_VENTA_UNIDAD, unidades, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, 'ingreso')";

            try (PreparedStatement pstmt = BD.prepareStatement(sql)) {
                Aba productos = new Aba();

                Float peso = Float.parseFloat(spnPeso.getValue().toString());
                Float litro = Float.parseFloat(spnLitro.getValue().toString());
                Float precio = Float.parseFloat(spnPrecio.getValue().toString());
                Float venta = Float.parseFloat(spnVenta.getValue().toString());

                // Verificar si peso, litro y precio son cero o si el precio es cero
                if (precio == 0.0f || venta == 0.0f) {
                    JOptionPane.showMessageDialog(this, "El precio no puede ser cero.");
                    return; // Salir del método si el precio es cero
                }

                // Si el precio no es cero, continuar verificando peso y litro
                if (peso == 0.0f && litro == 0.0f) {
                    int respuesta = JOptionPane.showConfirmDialog(this, "Peso y Litro son 0, en este caso se llenara con null. ¿Desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (respuesta != JOptionPane.YES_OPTION) {
                        return; // Salir del método si el usuario elige no continuar
                    }
                }
                // Verificar si el peso es cero y asignar null en su lugar
                // Utilizar los valores asociados directamente
                productos.setIdCategoria(valorAsociadoItem);
                productos.setMarca(txtMarca.getText());
                productos.setLitro((litro != 0.0f) ? litro : null);
                productos.setPeso((peso != 0.0f) ? peso : null);
                // Obtener el valor seleccionado del JComboBox cbIdProveedor
                productos.setIdProveedor(valorAsociadoProvee);
                productos.setPrecio(Float.parseFloat(spnPrecio.getValue().toString()));
                productos.setVenta(Float.parseFloat(spnVenta.getValue().toString()));
                productos.setUnidad(Integer.parseInt(spnUnidad.getValue().toString()));
                // Utilizar setObject para manejar null
                pstmt.setInt(1, productos.getIdCategoria());
                pstmt.setString(2, productos.getMarca());
                pstmt.setObject(3, productos.getPeso(), java.sql.Types.FLOAT); // Utiliza setObject para manejar null
                pstmt.setObject(4, productos.getLitro(),java.sql.Types.FLOAT);
                pstmt.setInt(5, productos.getIdProveedor());
                pstmt.setFloat(6, productos.getPrecio());
                pstmt.setFloat(7, productos.getVenta());
                pstmt.setInt(8, productos.getUnidad());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registro exitoso.");
            }
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace(); // Imprimir rastreo de excepción (puedes personalizar esto según tus necesidades)
            JOptionPane.showMessageDialog(this, "Error al registrar el producto: " + e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtMarca.setText("");
        cbIdProveedor.setSelectedIndex(0);
        cbIDCategoria.setSelectedIndex(0);
        spnUnidad.setValue(1);
        spnPrecio.setValue(0.0);
        spnPeso.setValue(0.0);
        spnLitro.setValue(0.0);
        spnVenta.setValue(0.0);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cbIDCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIDCategoriaActionPerformed
        int valorAsociadoItem = obtenerValorAsociado(listaItem, (String) cbIDCategoria.getSelectedItem());

        // Condición para desactivar spnPeso
        if (valorAsociadoItem == 1 || valorAsociadoItem == 2) {
            spnPeso.setEnabled(true);
            spnLitro.setValue(0.0);
        }else{
            spnPeso.setEnabled(false);
        }

        if (valorAsociadoItem == 3 || valorAsociadoItem == 4) {
            spnLitro.setEnabled(true);
            spnPeso.setValue(0.0);
        }else{
            spnLitro.setEnabled(false);
        }
        if (valorAsociadoItem == 5 || valorAsociadoItem == 6) {
            spnLitro.setEnabled(false);
            spnPeso.setEnabled(true);
        }else{
        }
    }//GEN-LAST:event_cbIDCategoriaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
 
        Object valorSeleccionado = spnId.getValue();
        String estadoEliminado = "eliminado";

        // Verificar si el valor seleccionado es del tipo esperado
        if (valorSeleccionado instanceof Integer) {
            int id = (int) valorSeleccionado;

            // Preguntar al usuario si realmente desea eliminar el producto
            int confirmacion = JOptionPane.showConfirmDialog(
                null, 
                "¿Estás seguro de que deseas eliminar el producto con ID " + id + "?", 
                "Confirmación de eliminación", 
                JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                // El usuario ha confirmado la eliminación, proceder con la actualización
                String sqlSelect = "SELECT estado FROM productos WHERE ID_PRODUCTO = ?;";
                String sqlUpdate = "UPDATE productos SET estado = ? WHERE ID_PRODUCTO = ?;";

                try (PreparedStatement pstmtSelect = BD.prepareStatement(sqlSelect);
                     PreparedStatement pstmtUpdate = BD.prepareStatement(sqlUpdate)) {

                    // Obtener el estado actual del producto con el ID especificado
                    pstmtSelect.setInt(1, id);
                    ResultSet rs = pstmtSelect.executeQuery();

                    if (rs.next()) {
                        String estadoActual = rs.getString("estado");

                        if (estadoActual == null || !estadoActual.equals(estadoEliminado)) {
                            // El producto no está ya eliminado, se puede realizar la actualización
                            pstmtUpdate.setString(1, estadoEliminado);
                            pstmtUpdate.setInt(2, id);
                            int filasAfectadas = pstmtUpdate.executeUpdate();

                            if (filasAfectadas > 0) {
                                JOptionPane.showMessageDialog(
                                    null, 
                                    "Elemento con ID " + id + " eliminado con éxito", 
                                    "Eliminación exitosa", 
                                    JOptionPane.INFORMATION_MESSAGE
                                );
                                cargarDatosEnTabla();
                            } else {
                                JOptionPane.showMessageDialog(
                                    null, 
                                    "No se pudo realizar la eliminación", 
                                    "Error en la eliminación", 
                                    JOptionPane.ERROR_MESSAGE
                                );
                            }
                        } else {
                            JOptionPane.showMessageDialog(
                                null, 
                                "El producto con ID " + id + " ya ha sido eliminado", 
                                "Error en la eliminación", 
                                JOptionPane.ERROR_MESSAGE
                            );
                        }
                    } else {
                        JOptionPane.showMessageDialog(
                            null, 
                            "No se encontró el producto con ID " + id, 
                            "Error en la eliminación", 
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                } catch (SQLException | NumberFormatException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(
                        this, 
                        "Error al cambiar el estado del producto: " + e.getMessage(), 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "Error: Tipo de valor seleccionado no esperado", 
                "Error al cambiar", 
                JOptionPane.WARNING_MESSAGE
            );
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void actualizarVenta(){
        String categoriaVentas = (String) cbCategoriaVentas.getSelectedItem();

        // Llamada a la función para obtener el valor asociado de listaAbarr
        int valorAsociadoCategoria = obtenerValorAsociado(listaItem, categoriaVentas);
        String categoriaProveedor = (String) cbProveedorVentas.getSelectedItem();

        // Llamada a la función para obtener el valor asociado de listaProvee
        int valorAsociadoProveedor = obtenerValorAsociado(listaProvee, categoriaProveedor);

        try {
            String sql = "SELECT\n" +
                "    p.ID_PRODUCTO,\n" +
                "    c.NOMBRE AS CATEGORIA,\n" +
                "    p.MARCA,\n" +
                "    p.PESO_kg,\n" +
                "    p.LITRO,\n" +
                "    pr.NombreProveedor,\n" +
                "    p.S_VENTA_UNIDAD,\n" +
                "    (p.UNIDADES - COALESCE(SUM(v.UNIDAD), 0)) AS UNIDADES\n" +
                "FROM\n" +
                "    productos p\n" +
                "JOIN\n" +
                "    proveedores pr ON p.ID_PROVEEDOR = pr.ID_PROVEEDOR\n" +
                "JOIN\n" +
                "    categorias c ON p.ID_CATEGORIA = c.ID_CATEGORIA\n" +
                "LEFT JOIN\n" +
                "    ventas v ON p.ID_PRODUCTO = v.ID_PRODUCTO\n" +
                "WHERE\n" +
                "    (c.NOMBRE = ? OR pr.NombreProveedor = ?) AND (p.ESTADO = 'ingreso')\n" +
                "GROUP BY\n" +
                "    p.ID_PRODUCTO, c.NOMBRE, p.MARCA, p.PESO_kg, p.LITRO, pr.NombreProveedor, p.S_VENTA_UNIDAD, p.UNIDADES\n" +
                "ORDER BY\n" +
                "    p.ID_PRODUCTO;";

            try (PreparedStatement pstmt = BD.prepareStatement(sql)) {
                Aba productos = new Aba();
                // Crear una instancia de DefaultTableModel
                DefaultTableModel modeloTabla = (DefaultTableModel) tblVentas.getModel();
                // Limpiar las filas existentes en la tabla

                if (valorAsociadoCategoria == 0 && valorAsociadoProveedor == 0 ) {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un proveedor o categoría.");
                    return; // Salir del método si el proveedor o la categoría no están seleccionados
                } else {
                    modeloTabla.setRowCount(0);
                    try {
                        productos.setCategoria(categoriaVentas);
                        productos.setProveedor(categoriaProveedor);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Error al convertir valores a números.");
                        return; // Salir del método en caso de error
                    }

                    pstmt.setString(1, String.valueOf(productos.getCategoria()));
                    pstmt.setString(2, String.valueOf(productos.getProveedor()));

                    // Execute the query and retrieve the result set
                    try (ResultSet rs = pstmt.executeQuery()) {
                        while (rs.next()) {
                            // Retrieve data from the result set
                            Object[] fila = new Object[8];
                            fila[0] = rs.getInt("ID_PRODUCTO");
                            fila[1] = rs.getString("CATEGORIA");
                            fila[2] = rs.getString("MARCA");
                            fila[3] = rs.getObject("PESO_kg");
                            fila[4] = rs.getObject("LITRO");
                            fila[5] = rs.getString("NombreProveedor");
                            fila[6] = rs.getFloat("S_VENTA_UNIDAD");
                            fila[7] = rs.getInt("UNIDADES");
                            // Add the row to the table model
                            modeloTabla.addRow(fila);
                        }
                    }
                }

                tblVentas.setModel(modeloTabla);
                JOptionPane.showMessageDialog(this, "Búsqueda exitosa.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta SQL: " + e.getMessage());
        }
    }
    
    
    private void btnFiltrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarVentaActionPerformed
        actualizarVenta();
    }//GEN-LAST:event_btnFiltrarVentaActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        cargaridProducto();
        String idPersonal = (String) cbPersonalVenta.getSelectedItem();
        // Llamada a la función para obtener el valor asociado de listaItem
        int personal = obtenerValorAsociado(listaPersonal, idPersonal);
        // Obtener la categoría seleccionada para listaAbarr
        if (cbPersonalVenta.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una categoría.");
            return; // Salir del método si la categoría no está seleccionada
        }

        try {
            String totalText = txtTotalVenta.getText();
            if (!totalText.isEmpty()) {
                float total = Float.parseFloat(totalText);

                String sql = "INSERT INTO ventas (ID_PERSONAL, PRECIO_UNIDAD, ID_PRODUCTO, UNIDAD, MONTO_S, ESTADO) VALUES (?, ?, ?, ?, ?, 'VENTA')";

                try (PreparedStatement pstmt = BD.prepareStatement(sql)) {
                    Aba productos = new Aba();

                    int Producto = Integer.parseInt(spnIdProductoVenta.getValue().toString());
                    int CantidadVenta = Integer.parseInt(spnCantidadVenta.getValue().toString());
                    float precioUnidad = Float.parseFloat(txtPrecioUnidad.getText());


                    // Si el precio no es cero, continuar verificando peso y litro
                    if (Producto == 0.0f || CantidadVenta == 0.0f) {
                        int respuesta = JOptionPane.showConfirmDialog(this, "Peso y Litro son 0, en este caso se llenará con null. ¿Desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);
                        if (respuesta != JOptionPane.YES_OPTION) {
                            return; // Salir del método si el usuario elige no continuar
                        }
                    }

                    // Verificar si el peso es cero y asignar null en su lugar
                    // Utilizar los valores asociados directamente
                    productos.setidPersonal(personal);
                    productos.setPrecioUnidad(precioUnidad);
                    productos.setProducto(Producto);
                    // Obtener el valor seleccionado del JComboBox cbIdProveedor
                    /**productos.setPrecio(Float.parseFloat(spnPrecio.getValue().toString()));
                    productos.setVenta(Float.parseFloat(spnVenta.getValue().toString()));**/
                    productos.setCantidad(CantidadVenta);
                    productos.setTotal(total);
                    // Utilizar setObject para manejar null
                    pstmt.setInt(1, productos.getidPersonal());
                    pstmt.setFloat(2, productos.getPrecioUnidad());
                    /**pstmt.setObject(3, productos.getPeso(), java.sql.Types.FLOAT); // Utiliza setObject para manejar null
                    pstmt.setObject(4, productos.getLitro(),java.sql.Types.FLOAT);**/
                    pstmt.setInt(3, productos.getProducto());
                    pstmt.setInt(4, productos.getCantidad());
                    pstmt.setFloat(5, productos.getTotal());
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Registro exitoso.");
                    VendiendoAgotar();
                    actualizarVenta();
                }
            } else {
                JOptionPane.showMessageDialog(this, "El campo de total está vacío.");
            }
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace(); // Imprimir rastreo de excepción (puedes personalizar esto según tus necesidades)
            JOptionPane.showMessageDialog(this, "Error al registrar el producto: " + e.getMessage());
        }

        
        
        
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    
    
    private void cbPersonalVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPersonalVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPersonalVentaActionPerformed

    private void spnIdProductoVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnIdProductoVentaKeyReleased
         
    }//GEN-LAST:event_spnIdProductoVentaKeyReleased

    private void spnIdProductoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnIdProductoVentaKeyPressed
        



    }//GEN-LAST:event_spnIdProductoVentaKeyPressed

    private void spnIdProductoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnIdProductoVentaKeyTyped
        
    }//GEN-LAST:event_spnIdProductoVentaKeyTyped

    private void btnOkVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkVentaActionPerformed
        Object CancelarVenta = spnCanVenta.getValue();
        String ventaCancelada = "CANCEL";

        // Verificar si el valor seleccionado es del tipo esperado
        if (CancelarVenta instanceof Integer) {
            int id = (int) CancelarVenta;

            // Preguntar al usuario si realmente desea eliminar el producto
            int confirmacion = JOptionPane.showConfirmDialog(
                null, 
                "¿Estás seguro de que deseas cancelar la venta con ID " + id + "?", 
                "Confirmación de cancelacion", 
                JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                // El usuario ha confirmado la eliminación, proceder con la actualización
                String sqlSelect = "SELECT estado FROM ventas WHERE ID_VENTA = ?;";
                String sqlUpdate = "UPDATE ventas SET estado = ? WHERE ID_VENTA = ?;";

                try (PreparedStatement pstmtSelect = BD.prepareStatement(sqlSelect);
                     PreparedStatement pstmtUpdate = BD.prepareStatement(sqlUpdate)) {

                    // Obtener el estado actual del producto con el ID especificado
                    pstmtSelect.setInt(1, id);
                    ResultSet rs = pstmtSelect.executeQuery();

                    if (rs.next()) {
                        String estadoActual = rs.getString("estado");

                        if (estadoActual == null || !estadoActual.equals(ventaCancelada)) {
                            // El producto no está ya eliminado, se puede realizar la actualización
                            pstmtUpdate.setString(1, ventaCancelada);
                            pstmtUpdate.setInt(2, id);
                            int filasAfectadas = pstmtUpdate.executeUpdate();

                            if (filasAfectadas > 0) {
                                JOptionPane.showMessageDialog(
                                    null, 
                                    "Elemento con ID " + id + " CANCELADO con éxito", 
                                    "CANCEL exitosa", 
                                    JOptionPane.INFORMATION_MESSAGE
                                );
                                detalleVentas();

                            } else {
                                JOptionPane.showMessageDialog(
                                    null, 
                                    "No se pudo realizar la CANCELACION", 
                                    "Error en la CANCELACION", 
                                    JOptionPane.ERROR_MESSAGE
                                );
                            }
                        } else {
                            JOptionPane.showMessageDialog(
                                null, 
                                "La venta con ID " + id + " ya ha sido CANCEL", 
                                "Error en la CANCEL", 
                                JOptionPane.ERROR_MESSAGE
                            );
                        }
                    } else {
                        JOptionPane.showMessageDialog(
                            null, 
                            "No se encontró LA VENTA con ID " + id, 
                            "Error en la CANCELACION", 
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                } catch (SQLException | NumberFormatException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(
                        this, 
                        "Error al cambiar el estado del LA VENTA: " + e.getMessage(), 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "Error: Tipo de valor seleccionado no esperado", 
                "Error al cambiar", 
                JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_btnOkVentaActionPerformed

    private void btnTodoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodoVentaActionPerformed
        detalleVentas();
    }//GEN-LAST:event_btnTodoVentaActionPerformed

    private void btnBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVentaActionPerformed

        try {
                int ventaProducto = (int) spnProducto.getValue();
                String catePersonal = (String) cbPersonal.getSelectedItem();

                // Llamada a la función para obtener el valor asociado de listaAbarr
                int valorPersonal = obtenerValorAsociado(listaPersonal, catePersonal);

                String sql = "SELECT ventas.ID_VENTA,\n" +
                        "       personal.nombre AS nombre_vendedor,\n" +
                        "       ventas.PRECIO_UNIDAD,\n" +
                        "       ventas.ID_PRODUCTO,\n" +
                        "       ventas.UNIDAD,\n" +
                        "       ventas.MONTO_S\n" +
                        "FROM ventas\n" +
                        "JOIN personal ON ventas.ID_PERSONAL = personal.id_personal\n" +
                        "WHERE (ventas.ESTADO = 'VENTA')\n" +
                        "      AND (personal.id_personal = ? OR ventas.ID_PRODUCTO = ?);";


                try (PreparedStatement pstmt = BD.prepareStatement(sql)) {
                    DefaultTableModel modeloTabla = (DefaultTableModel) tblCash.getModel();
                    modeloTabla.setRowCount(0);

                    if (valorPersonal == 0 && ventaProducto == 0) {
                        JOptionPane.showMessageDialog(this, "Por favor, seleccione un proveedor o categoría.");
                        return;
                    }

                    // Configurar los parámetros del PreparedStatement
                    pstmt.setInt(1, valorPersonal);
                    pstmt.setInt(2, ventaProducto);

                    // Ejecutar la consulta y recuperar el conjunto de resultados
                    try (ResultSet rs = pstmt.executeQuery()) {
                        while (rs.next()) {
                            // Retrieve data from the result set
                            Object[] fila = new Object[6];
                            fila[0] = rs.getInt("ID_VENTA");
                            fila[1] = rs.getString("nombre_vendedor");
                            fila[2] = rs.getFloat("PRECIO_UNIDAD");
                            fila[3] = rs.getInt("ID_PRODUCTO");
                            fila[4] = rs.getInt("UNIDAD");
                            fila[5] = rs.getFloat("MONTO_S");
                            // Add the row to the table model
                            modeloTabla.addRow(fila);
                        }
                    }

                    tblCash.setModel(modeloTabla);
                    JOptionPane.showMessageDialog(this, "Búsqueda exitosa.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta SQL: " + e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error al convertir valores a números.");
            }
   
    }//GEN-LAST:event_btnBuscarVentaActionPerformed

    // Llamadas a la función para ambos spinners
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarVenta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrarVenta;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnOkVenta;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JButton btnTodoVenta;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbCategoriaVentas;
    private javax.swing.JComboBox<String> cbIDCategoria;
    private javax.swing.JComboBox<String> cbIdProveedor;
    private javax.swing.JComboBox<String> cbPersonal;
    private javax.swing.JComboBox<String> cbPersonalVenta;
    private javax.swing.JComboBox<String> cbProveedor;
    private javax.swing.JComboBox<String> cbProveedorVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner spnCanVenta;
    private javax.swing.JSpinner spnCantidadVenta;
    private javax.swing.JSpinner spnId;
    private javax.swing.JSpinner spnIdProductoVenta;
    private javax.swing.JSpinner spnLitro;
    private javax.swing.JSpinner spnPeso;
    private javax.swing.JSpinner spnPrecio;
    private javax.swing.JSpinner spnProducto;
    private javax.swing.JSpinner spnUnidad;
    private javax.swing.JSpinner spnVenta;
    private javax.swing.JTable tblCash;
    private javax.swing.JTable tblDatosAbarrotes;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecioUnidad;
    private javax.swing.JTextField txtTotalVenta;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarVentana() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
