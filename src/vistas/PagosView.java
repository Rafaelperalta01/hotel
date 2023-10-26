/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.CosumoData;
import accesoADatos.PagosData;
import accesoADatos.ProductoServicioData;
import accesoADatos.ReservaData;
import entidades.Consumo;
import entidades.Pagos;
import entidades.ProductoServicio;
import entidades.Reserva;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vistas.Consumos.idServicios;
import static vistas.Consumos.jTextUnidades;

/**
 *
 * @author 54911
 */
public class PagosView extends javax.swing.JInternalFrame {

    LocalDate fechaActual = LocalDate.now();
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
        inicio();
        armarCabeceraListaConsumo();
        armarCabeceraListaPagos();
        listaConsumo();       
        CB_MedioDePago();
        CB_Comprobantes();
     
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextNombreReserva = new javax.swing.JTextField();
        jTextNumeroHabitacion = new javax.swing.JTextField();
        jTextImporteAlojamiento = new javax.swing.JTextField();
        jTextImporteTotal = new javax.swing.JTextField();
        jCbComprobante = new javax.swing.JComboBox<>();
        jCbMedioDePago = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDCFechaEmision = new com.toedter.calendar.JDateChooser();
        jBRegistrarPago = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelConsumoTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaConsumo = new javax.swing.JTable();
        jBeditar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaPagos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(361, 308));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Reserva del Sr.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Habitacion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Importe alojamiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Comprobante");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 296, -1, 20));

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Importe total");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel1.add(jTextNombreReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 30, 160, -1));
        jPanel1.add(jTextNumeroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 160, -1));
        jPanel1.add(jTextImporteAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, -1));
        jPanel1.add(jTextImporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 160, -1));

        jCbComprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jCbComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 190, -1));

        jCbMedioDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jCbMedioDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 190, -1));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Fecha emision");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 14));

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Medio de pago");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 346, -1, 20));
        jPanel1.add(jDCFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 190, -1));

        jBRegistrarPago.setText("Registrar Pago");
        jBRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarPagoActionPerformed(evt);
            }
        });
        jPanel1.add(jBRegistrarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("PAGOS");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Registro de Pagos");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Listado de consumos");

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jLabelConsumoTotal.setText("Consumo total: ");

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

        jBeditar.setText("Editar");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 153));
        jButton2.setText("Detalle de consumos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jBeditar)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelConsumoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(164, 164, 164))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelConsumoTotal)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBeditar)
                        .addComponent(jButton2)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        jButton1.setBackground(new java.awt.Color(255, 204, 153));
        jButton1.setText("Imprimir comprobante");

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

        jButton3.setBackground(new java.awt.Color(255, 204, 153));
        jButton3.setText("Eliminar");

        jBsalir.setBackground(new java.awt.Color(255, 204, 153));
        jBsalir.setText("Salir");
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
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(197, 197, 197)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBsalir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jBsalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Listado de pagos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
     dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed

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
      
        modeloTablaConsumo.setRowCount(0);
        listaConsumo();
        jTablaConsumo.clearSelection();
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarPagoActionPerformed
        
        // si comprobante y medios de pagos tienen datos validos
        //cargar la tabla con los datos 
        //cargar a la base de datos el pago
        //eliminar del registro
        if ((!jCbComprobante.getSelectedItem().toString().equals("  -- Seleccionar Item -- "))&&
            (!jCbMedioDePago.getSelectedItem().toString().equals("  -- Seleccionar Item -- "))){

        double impTot=Double.parseDouble(jTextImporteTotal.getText().toString());
            String tcomprobante = jCbComprobante.getSelectedItem().toString();
            String mp = jCbMedioDePago.getSelectedItem().toString();

            Pagos pag = new Pagos(reserva, impTot, tcomprobante, fechaActual, mp);
            pagos.guardarpagos(pag);
            modeloTablaPagos.addRow(new Object[]{
                pag.getIdPagos(),
                pag.getIdReserva().getIdReserva(),
                pag.getImporteTotal(),
                pag.getFechaEmision(),
                pag.getTipoComprobante(),
                pag.getMedioPago()
            });

        } else {
            JOptionPane.showMessageDialog(null, "Elija Comprobante y Método de pago");
        }
    }//GEN-LAST:event_jBRegistrarPagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRegistrarPago;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCbComprobante;
    private javax.swing.JComboBox<String> jCbMedioDePago;
    private com.toedter.calendar.JDateChooser jDCFechaEmision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextImporteAlojamiento;
    private javax.swing.JTextField jTextImporteTotal;
    private javax.swing.JTextField jTextNombreReserva;
    private javax.swing.JTextField jTextNumeroHabitacion;
    // End of variables declaration//GEN-END:variables

    private void CB_MedioDePago() {

        jCbMedioDePago.removeAllItems();
        jCbMedioDePago.addItem("  -- Seleccionar Item -- ");
        jCbMedioDePago.addItem(" Efectivo");
        jCbMedioDePago.addItem(" Tarjeta de crédito");
        jCbMedioDePago.addItem(" Tarjeta de débito");
        jCbMedioDePago.addItem(" Transferencia bancaria");
        jCbMedioDePago.addItem(" Cheque");
        jCbMedioDePago.addItem(" Mercado Pago");
        jCbMedioDePago.addItem(" PayPal");
        jCbMedioDePago.addItem(" Bitcoin");
        jCbMedioDePago.addItem(" Apple Pay");
        jCbMedioDePago.addItem(" Google Wallet");
        jCbMedioDePago.addItem(" Samsung Pay");
        jCbMedioDePago.addItem(" Amazon Pay");
        jCbMedioDePago.addItem(" Pago por QR Code");

    }

    private void CB_Comprobantes() {
        jCbComprobante.removeAllItems();
        jCbComprobante.addItem("  -- Seleccionar Item -- ");
        jCbComprobante.addItem(" Factuar A");
        jCbComprobante.addItem(" Factuar B");
        jCbComprobante.addItem(" Recibo de pago ");
        jCbComprobante.addItem(" Nota de crédito");
        jCbComprobante.addItem(" Nota de débito");
        jCbComprobante.addItem(" Comprobantes de medios de pagos electrónicos");
        jCbComprobante.addItem(" Factura electrónica (eFactura)");

    }

    public void inicio() {

        jTextNombreReserva.setEditable(false);
        jTextNumeroHabitacion.setEditable(false);
        jTextImporteAlojamiento.setEditable(false);
        jTextImporteTotal.setEditable(false);
        jDCFechaEmision.setDate(Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jDCFechaEmision.setMinSelectableDate(Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jDCFechaEmision.setMaxSelectableDate(Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant()));

        jTextNombreReserva.setText(reserva.getIdHuesped().getApellido() + ", " + reserva.getIdHuesped().getNombre());
        jTextNumeroHabitacion.setText(String.valueOf(reserva.getIdHabitacion().getNumHabitacion()));
        jTextImporteAlojamiento.setText(String.valueOf(reserva.getImporteTotal()));
        double costo = 0;
        for (Consumo co : c.listarProductoServicioPorIdRegistro(idReserva)) {
            costo += co.getCostoTotal();
        }
        jTextImporteTotal.setText(String.valueOf(costo + Double.parseDouble(jTextImporteAlojamiento.getText())));


        /* private int idPagos;
    private Reserva idReserva;
    private double importeTotal;
    private String tipoComprobante;
    private Date fechaEmision;
    private String medioPago; 
         */
    }

    private void armarCabeceraListaConsumo() {
        modeloTablaConsumo.addColumn("Id");//0
        modeloTablaConsumo.addColumn("Producto o Servicio");//1
        modeloTablaConsumo.addColumn("Cantidad");//2
        modeloTablaConsumo.addColumn("Precio");//3
        jTablaConsumo.setModel(modeloTablaConsumo);
    }

    private void cargarTabla(Consumo c) {
        modeloTablaConsumo.addRow(new Object[]{
            c.getIdConsumo(),
            c.getIdProductoServicio().getNombre(),
            c.getUnidades(),
            c.getCostoTotal(),});
    }

    public void listaConsumo() {

        double consumoTotal = 0;

        for (Consumo x : c.listarProductoServicioPorIdRegistro(idReserva)) {
            cargarTabla(x);
            consumoTotal += x.getCostoTotal();

        }

        jLabelConsumoTotal.setText("Consumo Total: " + consumoTotal);
    }

    private void armarCabeceraListaPagos() {
        modeloTablaPagos.addColumn("Id");//0
        modeloTablaPagos.addColumn("IdReserva");//1
        modeloTablaPagos.addColumn("Importe Total");//2
        modeloTablaPagos.addColumn("Fecha de emision");//3
        modeloTablaPagos.addColumn("Tipo de Comprobante");//4
        modeloTablaPagos.addColumn("Medio de Pago");//5
        jTablaPagos.setModel(modeloTablaPagos);
    }

    private void cargarTablaPagos(Pagos p) {
        modeloTablaPagos.addRow(new Object[]{
            p.getIdPagos(),
            p.getIdReserva().getIdReserva(),
            p.getImporteTotal(),
            p.getFechaEmision(),
            p.getTipoComprobante(),
            p.getMedioPago()
        });
    }

    public void listaPago() {
        for (Pagos x : pagos.listarPagos()) {
            cargarTablaPagos(x);
        }
    }
 public boolean esNumeroValido(String cadena) {
        try {
            int numero = Integer.parseInt(cadena);
            // Verifica si es un número entero mayor que cero y menor que 9
            return numero > 0 && numero <= 9;
        } catch (NumberFormatException e) {
            // Si se lanza una excepción, la cadena no es un número válido
            return false;
        }catch (NullPointerException e){
            return false;
        }
}
}
