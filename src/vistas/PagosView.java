/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.CosumoData;
import accesoADatos.HabitacionData;
import accesoADatos.PagosData;
import accesoADatos.ProductoServicioData;
import accesoADatos.ReservaData;
import entidades.Consumo;
import entidades.Habitacion;
import entidades.Pagos;
import entidades.ProductoServicio;
import entidades.Reserva;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vistas.Consumos.jTextUnidades;
import static vistas.VistaReserva.limpiaCampos;
import static vistas.VistaReserva.listaRegistros;

/**
 *
 * @author 54911
 */
public class PagosView extends javax.swing.JInternalFrame {

    public LocalDate fechaActual = LocalDate.now();
    public HabitacionData habitacion = new HabitacionData();
    public ProductoServicioData p = new ProductoServicioData();
    public ReservaData res = new ReservaData();
    public Reserva reserva = res.buscarReservaId(idReserva);
    public CosumoData c = new CosumoData();
    public PagosData pagos = new PagosData();
    public static int idReserva;
    
    private DefaultTableModel modeloTablaConsumo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    }; 
   private DefaultTableModel modeloTablaPagos = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    }; 
   
    public PagosView() {
        initComponents();     
        armarCabeceraListaConsumo();
        armarCabeceraListaPagos();
        listaConsumo();   
        listaPago();
        CB_MedioDePago();
        CB_Comprobantes();
        CB_FormaDePago();
        inicio();
     
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBRegistrarPago = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextNombreReserva = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextNumeroHabitacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFechaemision = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextImporteAlojamiento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextAdelanto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextImporteTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jCbFormaDePago = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jCbMedioDePago = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jCbComprobante1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelConsumoTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaConsumo = new javax.swing.JTable();
        jBeditar = new javax.swing.JButton();
        jBImprimirDetalleDeConsumos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBimprimirComprobante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaPagos = new javax.swing.JTable();
        jBEliminarPago = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();

        setBackground(java.awt.Color.darkGray);
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(151, 60, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(361, 308));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBRegistrarPago.setBackground(new java.awt.Color(151, 60, 0));
        jBRegistrarPago.setForeground(new java.awt.Color(255, 255, 255));
        jBRegistrarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png"))); // NOI18N
        jBRegistrarPago.setText("Registrar Pago");
        jBRegistrarPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarPagoActionPerformed(evt);
            }
        });
        jPanel1.add(jBRegistrarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jLabel5.setBackground(new java.awt.Color(151, 60, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reserva del Sr.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextNombreReserva.setBackground(new java.awt.Color(151, 60, 0));
        jPanel1.add(jTextNombreReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 160, -1));

        jLabel6.setBackground(new java.awt.Color(151, 60, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Habitacion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jTextNumeroHabitacion.setBackground(new java.awt.Color(151, 60, 0));
        jPanel1.add(jTextNumeroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 160, -1));

        jLabel10.setBackground(new java.awt.Color(151, 60, 0));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha emision");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 14));

        jTextFechaemision.setBackground(new java.awt.Color(151, 60, 0));
        jPanel1.add(jTextFechaemision, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 160, -1));

        jLabel7.setBackground(new java.awt.Color(151, 60, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Importe alojamiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jTextImporteAlojamiento.setBackground(new java.awt.Color(151, 60, 0));
        jPanel1.add(jTextImporteAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 160, -1));

        jLabel13.setBackground(new java.awt.Color(151, 60, 0));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Adelanto");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jTextAdelanto.setBackground(new java.awt.Color(151, 60, 0));
        jTextAdelanto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAdelantoFocusGained(evt);
            }
        });
        jPanel1.add(jTextAdelanto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 160, -1));

        jLabel9.setBackground(new java.awt.Color(151, 60, 0));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Importe total");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 20));

        jTextImporteTotal.setBackground(new java.awt.Color(151, 60, 0));
        jPanel1.add(jTextImporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 160, -1));

        jLabel12.setBackground(new java.awt.Color(151, 60, 0));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Forma de Pago");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 20));

        jCbFormaDePago.setBackground(new java.awt.Color(151, 60, 0));
        jCbFormaDePago.setForeground(new java.awt.Color(255, 255, 255));
        jCbFormaDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbFormaDePagoActionPerformed(evt);
            }
        });
        jPanel1.add(jCbFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 190, -1));

        jLabel11.setBackground(new java.awt.Color(151, 60, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Medio de pago");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 20));

        jCbMedioDePago.setBackground(new java.awt.Color(151, 60, 0));
        jCbMedioDePago.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jCbMedioDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 190, -1));

        jLabel8.setBackground(new java.awt.Color(151, 60, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Comprobante");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));

        jCbComprobante1.setBackground(new java.awt.Color(151, 60, 0));
        jCbComprobante1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jCbComprobante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 190, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de Pagos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PAGOS");

        jPanel2.setBackground(new java.awt.Color(151, 60, 0));

        jLabelConsumoTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConsumoTotal.setText("Consumo total: ");

        jTablaConsumo.setBackground(new java.awt.Color(151, 60, 0));
        jTablaConsumo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTablaConsumo.setForeground(new java.awt.Color(255, 255, 255));
        jTablaConsumo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablaConsumo);

        jBeditar.setBackground(new java.awt.Color(151, 60, 0));
        jBeditar.setForeground(new java.awt.Color(255, 255, 255));
        jBeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escritura.png"))); // NOI18N
        jBeditar.setText("Editar");
        jBeditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBImprimirDetalleDeConsumos.setBackground(new java.awt.Color(151, 60, 0));
        jBImprimirDetalleDeConsumos.setForeground(new java.awt.Color(255, 255, 255));
        jBImprimirDetalleDeConsumos.setText("Detalle de consumos");
        jBImprimirDetalleDeConsumos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBImprimirDetalleDeConsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirDetalleDeConsumosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listado de consumos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jBeditar)
                        .addGap(26, 26, 26)
                        .addComponent(jBImprimirDetalleDeConsumos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelConsumoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeditar)
                    .addComponent(jBImprimirDetalleDeConsumos)
                    .addComponent(jLabelConsumoTotal))
                .addGap(29, 29, 29))
        );

        jPanel3.setBackground(new java.awt.Color(151, 60, 0));

        jBimprimirComprobante.setBackground(new java.awt.Color(151, 60, 0));
        jBimprimirComprobante.setForeground(new java.awt.Color(255, 255, 255));
        jBimprimirComprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        jBimprimirComprobante.setText("Imprimir comprobante");
        jBimprimirComprobante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBimprimirComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBimprimirComprobanteActionPerformed(evt);
            }
        });

        jTablaPagos.setBackground(new java.awt.Color(151, 60, 0));
        jTablaPagos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTablaPagos.setForeground(new java.awt.Color(255, 255, 255));
        jTablaPagos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablaPagos);

        jBEliminarPago.setBackground(new java.awt.Color(151, 60, 0));
        jBEliminarPago.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        jBEliminarPago.setText("Eliminar");
        jBEliminarPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarPagoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Listado de pagos");

        jBsalir.setBackground(new java.awt.Color(0, 102, 255));
        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion.png"))); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jBimprimirComprobante)
                                .addGap(44, 44, 44)
                                .addComponent(jBEliminarPago)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalir)
                        .addGap(82, 82, 82))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBimprimirComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEliminarPago)))
                    .addComponent(jBsalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(918, 918, 918))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
       // editar consumo
        String cantidad = null;

        if (modeloTablaConsumo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "La tabla esta vacía");
        } else {
            int fila = jTablaConsumo.getSelectedRow();

            if (fila != -1) {

                if (0 == JOptionPane.showConfirmDialog(null, "Desea editar las unidades ?", "Modificar Consumo", JOptionPane.YES_NO_OPTION)) {
                    cantidad = JOptionPane.showInputDialog(null, "Ingrese la cantidad de unidades", "Modificar", JOptionPane.INFORMATION_MESSAGE);
                    int cantUni = Integer.parseInt(jTablaConsumo.getValueAt(fila, 2).toString());

                    if ((cantidad != null) && esNumeroValido(cantidad) && !cantidad.equals(String.valueOf(cantUni))) {

                        ProductoServicio pys = p.buscarProductoServicio(jTablaConsumo.getValueAt(fila, 1).toString());
                        pys.setStock(pys.getStock() + Integer.parseInt(jTablaConsumo.getValueAt(fila, 2).toString()));
                        p.modificarProductoServicio(pys);

                        if (Integer.parseInt(cantidad) <= pys.getStock()) {

                            pys.setStock(pys.getStock() - Integer.parseInt(cantidad));
                            p.modificarProductoServicio(pys);

                            int cant = Integer.parseInt(cantidad);
                            double precio = pys.getPrecioVenta();
                            Consumo com = c.buscarConsumoPorId(Integer.parseInt(jTablaConsumo.getValueAt(fila, 0).toString()));
                            com.setUnidades(cant);
                            com.setCostoTotal(cant * precio);
                            c.modificarUnidadesCosumidas(com);
                            JOptionPane.showMessageDialog(null, "Modificación exitosa");
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay stock");
                            pys.setStock(pys.getStock() - Integer.parseInt(jTablaConsumo.getValueAt(fila, 2).toString()));
                            p.modificarProductoServicio(pys);
                            jTextUnidades.setText(jTablaConsumo.getValueAt(fila, 2).toString());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El ingreso no es valido, no hubo modificaciones");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un consumo con un click ");
            }
        }
        inicio();
        modeloTablaConsumo.setRowCount(0);
        listaConsumo();
        jTablaConsumo.clearSelection();
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarPagoActionPerformed
       
        if ((!jCbFormaDePago.getSelectedItem().toString().equals("-- Seleccionar Item --"))
                && (!jCbMedioDePago.getSelectedItem().toString().equals("-- Seleccionar Item --"))
             && (!jCbComprobante1.getSelectedItem().toString().equals("-- Seleccionar Item --"))) {

            if (jCbFormaDePago.getSelectedItem().toString().equals(" Pago Final")){
                pagoFinal();
          
            }else{
                pagoParcial();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Elija el Medio de pago ,Comprobante y Forma de pago");
        }
    }//GEN-LAST:event_jBRegistrarPagoActionPerformed

    private void jBImprimirDetalleDeConsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirDetalleDeConsumosActionPerformed

        PrinterJob job = PrinterJob.getPrinterJob();

        if (job.printDialog()) {
            try {
                job.print(); // Esta línea envía el trabajo de impresión a la impresora seleccionada.
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jBImprimirDetalleDeConsumosActionPerformed

    private void jBimprimirComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimprimirComprobanteActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();

        if (job.printDialog()) {
            try {
                job.print(); // Esta línea envía el trabajo de impresión a la impresora seleccionada.
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jBimprimirComprobanteActionPerformed

    private void jBEliminarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarPagoActionPerformed
         if (modeloTablaPagos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "La tabla esta vacía");
        } else {
            int fila = jTablaPagos.getSelectedRow();
    // si el boton de registrar pago esta desactivado, quiere decir que se realizo un pago final
    // no se puede eliminar pagos parciales hasta que no se elimine el pago final registrado
            if (fila != -1) {
                if ((!jBRegistrarPago.isEnabled()) && (jTablaPagos.getValueAt(fila, 2).toString().equals(" Pago Parcial"))) {

                    JOptionPane.showMessageDialog(null, "no se puede eliminar pagos parciales hasta que no se elimine el pago final");

                } else {
                    if (jTablaPagos.getValueAt(fila, 2).toString().equals(" Pago Final")) {

                        jTextImporteTotal.setText(String.valueOf(reserva.getImporteTotal() + sumaconsumos() - sumaAdelantos()));
                        jBRegistrarPago.setEnabled(true);
                        jBeditar.setEnabled(true);
                    } else {
    // selecciona el importe del adelanto de la tabla y lo guarda en una variable 
                        double restaAdelanto = Double.parseDouble(jTablaPagos.getValueAt(fila, 4).toString());
                        jTextImporteTotal.setText(String.valueOf(reserva.getImporteTotal() + sumaconsumos() - sumaAdelantos() + restaAdelanto));
                    }
    // elimina logico de la base de datos 
                    pagos.eliminadoLogicoPago(Integer.parseInt(jTablaPagos.getValueAt(fila, 0).toString()));
                    comboBoxAInicial_y_actualizaListaPago();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar un pago");
            }
        }
    }//GEN-LAST:event_jBEliminarPagoActionPerformed

    private void jTextAdelantoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAdelantoFocusGained
        jTextAdelanto.setText("");
        jTextAdelanto.setForeground(new Color(69,73,74));
    }//GEN-LAST:event_jTextAdelantoFocusGained

    private void jCbFormaDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbFormaDePagoActionPerformed
      String seleccion = (String)jCbFormaDePago.getSelectedItem();
        
        if (seleccion.equals(" Pago Parcial")){
            jCbComprobante1.setSelectedItem(" Recibo de pago ");
            jCbComprobante1.setEnabled(false);
            jTextAdelanto.setText(""); 
            jTextAdelanto.setForeground(new Color(187,187,187));
            jTextAdelanto.setText("Ingrese adelanto");          
            jTextAdelanto.setEditable(true);
        
        }else{
         jCbComprobante1.setEnabled(true);
         jCbComprobante1.setSelectedItem("-- Seleccionar Item --");
         jTextAdelanto.setText("");
         jTextAdelanto.setEditable(false);
        }
    }//GEN-LAST:event_jCbFormaDePagoActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

        if (!jBRegistrarPago.isEnabled()){
            if (JOptionPane.showConfirmDialog(null, "Al salir se borrará la reserva de este usuario "
                + ". Desea continuar ? ", "Salir", JOptionPane.YES_NO_OPTION)== 0) {
            // hacer el checkOut
            res.modificarCheckOutReserva(idReserva, fechaActual);

            // eliminar los pagos
            for (Pagos x : pagos.listarPagosporIdReserva(idReserva)){
                pagos.eliminadoLogicoPago(x.getIdPagos());
            }
            // eliminar los consumos
            for (Consumo x : c.listarProductoServicioPorIdRegistro(idReserva)) {
                c.eliminarConsumo(x.getIdConsumo());
            }

            // tiene que devolver el valor de la habitacion a habitacion libre

            Habitacion hab = habitacion.buscarHabitacionId(reserva.getIdHabitacion().getIdHabitacion());
            hab.setEstado(true);
            habitacion.modificarHabitacion(hab);

            res.cancelarReserva(idReserva);

            JOptionPane.showMessageDialog(null, "Finalizo su reserva");
            limpiaCampos();
            listaRegistros();
            dispose();
        }
        } else {

            VistaReserva.jBGuardar.setEnabled(true);
            limpiaCampos();
            VistaReserva.jTablareservas.clearSelection();
            dispose();
        }
    }//GEN-LAST:event_jBsalirActionPerformed
   
    public void pagoParcial() {
        String adelanto = jTextAdelanto.getText().toString();// adelanto
    // si el adelanto mas la suma de totos los adelantos

        if (esValido(adelanto, reserva.getImporteTotal())) {
    //si el adelanto es mayor que cero, es un número y si es menor o igual que el
    // el importe total de la habitacion, sin el consumo, ya que si despues quisiera restarle consumos
    // podria quedar un número negativo y generaría un error
    // también evalúa que la suma de todos los adelantos no sea mayor a el importe de la habitación    

            Pagos pag = new Pagos(reserva, Double.parseDouble(adelanto),
                    jCbComprobante1.getSelectedItem().toString(),
                    fechaActual,
                    jCbMedioDePago.getSelectedItem().toString(),
                    jCbFormaDePago.getSelectedItem().toString(),
                    true);
    // guarda un registro de pago como pago parcial adelanto
            pagos.guardarpagos(pag);

            comboBoxAInicial_y_actualizaListaPago();
            jTextImporteTotal.setText(String.valueOf(reserva.getImporteTotal() + sumaconsumos() - sumaAdelantos()));

        } else {
            JOptionPane.showMessageDialog(null, "El adelanto no es valido");
            jTextAdelanto.setText("");
            jTextAdelanto.requestFocus();
        }
    }
    
    public void pagoFinal(){
    // cuando quiera hacer el pago final tiene que fijarse que el check in sea distinto de null
    // ya que la persona puede hacer un adelanto sin estar ocupando una habitacion
    // pero no puede finalizar un pago sin estar hospedada

        if (reserva.getCheckIn() != null) {

            Pagos pag = new Pagos(reserva, Double.parseDouble(jTextImporteTotal.getText().toString()),
                    jCbComprobante1.getSelectedItem().toString(),
                    fechaActual,
                    jCbMedioDePago.getSelectedItem().toString(),
                    jCbFormaDePago.getSelectedItem().toString(),
                    true);
    // antes de guardar hay que hacer el checkout
    // eliminar la reserva

    // guarda un registro de pago como pago final
            pagos.guardarpagos(pag);
            comboBoxAInicial_y_actualizaListaPago();
            jTextImporteTotal.setText(String.valueOf(reserva.getImporteTotal()
                    + sumaconsumos() - sumaAdelantos() - Double.parseDouble(jTextImporteTotal.getText().toString())));

            jBRegistrarPago.setEnabled(false);
            jBeditar.setEnabled(false);

            jTablaPagos.clearSelection();
        } else {
            JOptionPane.showMessageDialog(null, "Esta reserva no tiene iniciada el checkIn");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminarPago;
    private javax.swing.JButton jBImprimirDetalleDeConsumos;
    private javax.swing.JButton jBRegistrarPago;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBimprimirComprobante;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCbComprobante1;
    private javax.swing.JComboBox<String> jCbFormaDePago;
    private javax.swing.JComboBox<String> jCbMedioDePago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelConsumoTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaConsumo;
    private javax.swing.JTable jTablaPagos;
    private javax.swing.JTextField jTextAdelanto;
    private javax.swing.JTextField jTextFechaemision;
    private javax.swing.JTextField jTextImporteAlojamiento;
    private javax.swing.JTextField jTextImporteTotal;
    private javax.swing.JTextField jTextNombreReserva;
    private javax.swing.JTextField jTextNumeroHabitacion;
    // End of variables declaration//GEN-END:variables
   
    public void inicio() {
    // se ponen todos los campon no editables y se le asignan los datos 
    
        jTextNombreReserva.setEditable(false);
        jTextNumeroHabitacion.setEditable(false);
        jTextFechaemision.setEditable(false);
        jTextImporteAlojamiento.setEditable(false);
        jTextImporteTotal.setEditable(false);
        jTextAdelanto.setEditable(false);       
        jTextNombreReserva.setText(reserva.getIdHuesped().getApellido() + ", " + reserva.getIdHuesped().getNombre());
        jTextNumeroHabitacion.setText(String.valueOf(reserva.getIdHabitacion().getNumHabitacion()));
        jTextFechaemision.setText(fechaActual.toString());
        jTextImporteAlojamiento.setText(String.valueOf(reserva.getImporteTotal()));
        // se suma el importe de la reserva de la habitacion mas los consumos que tenga menos los adelantos si tiene
         jTextImporteTotal.setText(String.valueOf(reserva.getImporteTotal() +sumaconsumos() - sumaAdelantos()));      
    }

    private void comboBoxAInicial_y_actualizaListaPago() {
 // poner todos los combo box a situacion inicial y actualiza lista
  
        modeloTablaPagos.setRowCount(0);
        jCbComprobante1.setEnabled(true);
        jCbComprobante1.setSelectedItem("-- Seleccionar Item --");
        jCbMedioDePago.setSelectedItem("-- Seleccionar Item --");
        jCbFormaDePago.setSelectedItem("-- Seleccionar Item --");
        jTextAdelanto.setText("");
        listaPago();

    }

    private void CB_FormaDePago() {
        jCbFormaDePago.removeAllItems();
        jCbFormaDePago.addItem("-- Seleccionar Item --");
        jCbFormaDePago.addItem(" Pago Parcial");
        jCbFormaDePago.addItem(" Pago Final");
    }

    private void CB_MedioDePago() {
        jCbMedioDePago.removeAllItems();
        jCbMedioDePago.addItem("-- Seleccionar Item --");
        jCbMedioDePago.addItem(" Efectivo");
        jCbMedioDePago.addItem(" Tarjeta de crédito");
        jCbMedioDePago.addItem(" Tarjeta de débito");
        jCbMedioDePago.addItem(" Transferencia bancaria");
        jCbMedioDePago.addItem(" Cheque");
        jCbMedioDePago.addItem(" Mercado Pago");
    }

    private void CB_Comprobantes() {
        jCbComprobante1.removeAllItems();
        jCbComprobante1.addItem("-- Seleccionar Item --");
        jCbComprobante1.addItem(" Factuar A");
        jCbComprobante1.addItem(" Factuar B");
        jCbComprobante1.addItem(" Recibo de pago ");
    }

    private void armarCabeceraListaConsumo() {
        modeloTablaConsumo.addColumn("Id");//0
        modeloTablaConsumo.addColumn("Producto o Servicio");//1
        modeloTablaConsumo.addColumn("Cantidad");//2
        modeloTablaConsumo.addColumn("Precio");//3
        jTablaConsumo.setModel(modeloTablaConsumo);
    }

    private void armarCabeceraListaPagos() {
        modeloTablaPagos.addColumn("Id");//0
        modeloTablaPagos.addColumn("Fecha de emision");//1
        modeloTablaPagos.addColumn("Forma de Pago");//2
        modeloTablaPagos.addColumn("Medio de Pago");//3    
        modeloTablaPagos.addColumn("Importe Total");//4
        modeloTablaPagos.addColumn("Tipo de Comprobante");//5
       
        jTablaPagos.setModel(modeloTablaPagos);
    }

    private void cargarTabla(Consumo c) {
        modeloTablaConsumo.addRow(new Object[]{
            c.getIdConsumo(),
            c.getIdProductoServicio().getNombre(),
            c.getUnidades(),
            c.getCostoTotal(),});
    }

    private void cargarTablaPagos(Pagos p) {
        modeloTablaPagos.addRow(new Object[]{
            p.getIdPagos(),
            p.getFechaEmision(),
            p.getFormaDePago(),
            p.getMedioPago(),
             p.getImporteTotal(),
            p.getTipoComprobante()
           
        });
    }

    public void listaConsumo() {
        double consumoTotal = 0;

        for (Consumo x : c.listarProductoServicioPorIdRegistro(idReserva)) {
            cargarTabla(x);
            consumoTotal += x.getCostoTotal();
        }
        jLabelConsumoTotal.setText("Consumo Total: " + consumoTotal);
    }
    
    public void listaPago() {
        for (Pagos x : pagos.listarPagosporIdReserva(idReserva)) {
            cargarTablaPagos(x);
        }
    }

    public double sumaconsumos() {
    // suma todos los consumos asiciados al esa reserva
        double sumaParcial = 0;
        for (Consumo x : c.listarProductoServicioPorIdRegistro(idReserva)) {
            sumaParcial += x.getCostoTotal();
        }
        return sumaParcial;
    }

    public double sumaAdelantos() {
        // suma todos los adelantos que tenga la reserva     
        double sumaParcial = 0;
        for (Pagos x : pagos.listarPagosporIdReserva(idReserva)) {
            if (x.getFormaDePago().equals(" Pago Parcial")) {
                sumaParcial += x.getImporteTotal();
            }
        }
        return sumaParcial;
    }

    public boolean esNumeroValido(String cadena) {
    // se usa en editar consumos para validar el numero de unidades que desea editar
        try {
            int numero = Integer.parseInt(cadena);
            // Verifica si es un número entero mayor que cero y menor que 9
            return numero > 0 && numero <= 9;
        } catch (NumberFormatException e) {
            // Si se lanza una excepción, la cadena no es un número válido
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean esValido(String cadena, double importe) {
    // se usa para verificar el adelanto, no sea un caracter no sea un numero negativo
    // y que no sea mayor que el importe total
        try {
            
            double numero = Double.parseDouble(cadena);
            double numero2 = numero + sumaAdelantos();// suma el adelanto que se quiere hacer mas los que pueda haber hecho
            // Verifica si es un número entero mayor que cero y menor que el importe total del alojamiento
           
            if (numero2 > importe){
                JOptionPane.showMessageDialog(null,"El adelanto supera el importe de alojamiento");
            }
             return numero > 0 && numero <= importe && numero2 <= importe;
        } catch (NumberFormatException e) {
            // Si se lanza una excepción, la cadena no es un número válido
            System.out.println("el ad");
            return false;
        } catch (NullPointerException e) {
            System.out.println("Tiene que ingresar solo numeros");
            return false;
        }
    }
}
