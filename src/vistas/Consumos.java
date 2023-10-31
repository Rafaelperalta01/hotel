/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.CosumoData;
import accesoADatos.ProductoServicioData;
import accesoADatos.ReservaData;
import entidades.Consumo;
import entidades.ProductoServicio;
import entidades.Reserva;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vistas.VistaReserva.jTCantPersonas;

/**
 *
 * @author Pc
 */
public class Consumos extends javax.swing.JInternalFrame {
    
public CosumoData consumo = new CosumoData();
public ProductoServicioData p = new ProductoServicioData();
public ReservaData res = new ReservaData();
public Reserva a = res.buscarReservaId(idReserva);
public static int idReserva;
public static int idServicios;

private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    }; 
    
    public Consumos() {
        initComponents();
        armarCabecera();
       
        jTextUnidades.setEditable(false);
        jTextNumeroHabitacion.setText("Nª "+a.getIdHabitacion().getNumHabitacion());
        jTextReservaNombre.setText(a.getIdHuesped().getApellido()+" , "+a.getIdHuesped().getNombre());   
        listaRegistros();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextProYServ = new javax.swing.JTextField();
        jTextUnidades = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jTextReservaNombre = new javax.swing.JTextField();
        jBproductoYservicio = new javax.swing.JButton();
        jTextCostoTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBEliminar = new javax.swing.JButton();
        jTextConsumoTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsumo = new javax.swing.JTable();
        jTextRegistroTotal = new javax.swing.JTextField();
        jBsalir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jTextNumeroHabitacion = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Reserva de:");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Unidades:");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Producto o Servicio:");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Costo total:");

        jTextProYServ.setBackground(new java.awt.Color(0, 102, 255));

        jTextUnidades.setBackground(new java.awt.Color(0, 102, 255));
        jTextUnidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextUnidadesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextUnidadesKeyTyped(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(0, 102, 255));
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setBackground(new java.awt.Color(0, 102, 255));
        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jTextReservaNombre.setBackground(new java.awt.Color(0, 102, 255));

        jBproductoYservicio.setBackground(new java.awt.Color(0, 102, 255));
        jBproductoYservicio.setText("Buscar");
        jBproductoYservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBproductoYservicioActionPerformed(evt);
            }
        });

        jTextCostoTotal.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jBNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGuardar)
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jTextReservaNombre)
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextProYServ, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBproductoYservicio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextReservaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextProYServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBproductoYservicio))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBNuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel5.setText("Consumos de la habitación");

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jBEliminar.setBackground(new java.awt.Color(0, 102, 255));
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jTextConsumoTotal.setBackground(new java.awt.Color(0, 102, 255));
        jTextConsumoTotal.setText("Consumo Total:");

        jTableConsumo.setBackground(new java.awt.Color(204, 204, 255));
        jTableConsumo.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableConsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsumoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsumo);

        jTextRegistroTotal.setBackground(new java.awt.Color(0, 102, 255));
        jTextRegistroTotal.setText("Total de registros:");

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion.png"))); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBEditar.setBackground(new java.awt.Color(0, 102, 255));
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escritura.png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jBEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBsalir)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextConsumoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jTextRegistroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar)
                    .addComponent(jBEditar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextRegistroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextConsumoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBsalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextNumeroHabitacion.setEditable(false);
        jTextNumeroHabitacion.setBackground(new java.awt.Color(214, 217, 223));
        jTextNumeroHabitacion.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jTextNumeroHabitacion.setText("Nª ");
        jTextNumeroHabitacion.setAutoscrolls(false);
        jTextNumeroHabitacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
        VistaReserva.jBGuardar.setEnabled(true);
        VistaReserva.limpiaCampos();
        VistaReserva.jTablareservas.clearSelection();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBproductoYservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBproductoYservicioActionPerformed
        ListaProductoServicio ps = new ListaProductoServicio();
        Menu.escritorio.add(ps);
        ps.setVisible(true);
        ps.moveToFront();
    }//GEN-LAST:event_jBproductoYservicioActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
    
       if (verificaCamposVacios()) {
            if (verificaStock()) {
                
                ProductoServicio produ = p.buscarProductoServicioId(idServicios);
                int u = Integer.parseInt(jTextUnidades.getText().toString());
                double d = Double.parseDouble(jTextCostoTotal.getText().toString());
                
                Consumo c = new Consumo(a, produ, u, d, true);
                
                consumo.guardarConsumo(c);
                
                produ.setStock(produ.getStock() -u);
                p.modificarProductoServicio(produ);
                
                limpiaCamposConsumo();
                modeloTabla.setRowCount(0);
                listaRegistros();
            } else {
                JOptionPane.showMessageDialog(null, "Las unidades requeridas son mayores que el Stock almacenado");
                jTextUnidades.setText("");
                jTextCostoTotal.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete todos los campos Producto y Unidades para poder guardar un consumo");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiaCamposConsumo();
        jBGuardar.setEnabled(true);
        jBproductoYservicio.setEnabled(true);
        jTextUnidades.setEditable(false);
        jTableConsumo.clearSelection();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jTextUnidadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUnidadesKeyReleased
  
        if ((!jTextProYServ.getText().isEmpty()) && (!jTextUnidades.getText().isEmpty())) {
            try {
                int n = Integer.parseInt(jTextUnidades.getText().toString());
                ProductoServicio pro = p.buscarProductoServicioId(idServicios);
                double c = pro.getPrecioVenta() * n;
                jTextCostoTotal.setText(c + "");
            } catch (NumberFormatException ex) {
                jTextCostoTotal.setText("");
            } catch (NullPointerException ex) {
                jTextCostoTotal.setText("");
            }
            }else{
            jTextCostoTotal.setText("");
        }
    }//GEN-LAST:event_jTextUnidadesKeyReleased

    private void jTextUnidadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUnidadesKeyTyped
     char c = evt.getKeyChar();
       
        if (c < '1' || c > '9'){ 
            jTextUnidades.setToolTipText("Ingresar solo números ");            
            evt.consume(); 
        }else if(jTextProYServ.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Seleccione primero el producto o servicio ");
        }else if((jTextUnidades.getText().length() >= 1) && (jTextUnidades.isEditable() == true)){
            evt.consume();
            JOptionPane.showMessageDialog(null,"No se puede seleccionar mas de 9 unidades ");
        }   
    }//GEN-LAST:event_jTextUnidadesKeyTyped

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
       if (modeloTabla.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "La tabla esta vacía");

        } else {
            int fila = jTableConsumo.getSelectedRow();
            
            if ((fila != -1) &&  verificaCamposVacios()){
                if (!jBGuardar.isEnabled()){
                 int resultado = JOptionPane.showConfirmDialog(null,"Desea eliminar este consumo de la habitación?","Eliminar Consumo",JOptionPane.YES_NO_OPTION);
                   
                    if (resultado == 0){
                        
                        ProductoServicio pys = p.buscarProductoServicio(jTableConsumo.getValueAt(fila, 1).toString());
                        pys.setStock(pys.getStock() + Integer.parseInt(jTableConsumo.getValueAt(fila, 2).toString()));
                        p.modificarProductoServicio(pys);
                        
                        consumo.eliminarConsumoDeLaBase(Integer.parseInt(jTableConsumo.getValueAt(fila,0).toString()));
                        modeloTabla.setRowCount(0);
                        jBNuevo.doClick();                      
                        listaRegistros();
                    } else {
                        jBNuevo.doClick();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione con un click el consumo que desea eliminar");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un consumo con un click ");
            }
        }
        
       jTableConsumo.clearSelection(); 
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTableConsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsumoMouseClicked
           
        if (evt.getClickCount() == 1){
            
         int fila = jTableConsumo.getSelectedRow();

        if (fila != -1) {   
            jBGuardar.setEnabled(false);
            jBproductoYservicio.setEnabled(false);
            jTextProYServ.setText(jTableConsumo.getValueAt(fila,0).toString());
            jTextUnidades.setEditable(false);
            jTextUnidades.setText(jTableConsumo.getValueAt(fila,1).toString());
            jTextCostoTotal.setText(jTableConsumo.getValueAt(fila,2).toString());            
        }
        }
    }//GEN-LAST:event_jTableConsumoMouseClicked

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
     
        String cantidad = null;

        if (modeloTabla.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "La tabla esta vacía");
        } else {
            int fila = jTableConsumo.getSelectedRow();

            if (fila != -1) {
                idServicios = (p.buscarProductoServicio(jTableConsumo.getValueAt(fila, 1).toString())).getIdProductoServicio();

                if (0 == JOptionPane.showConfirmDialog(null, "Desea editar las unidades ?", "Modificar Consumo", JOptionPane.YES_NO_OPTION)) {
                    cantidad = JOptionPane.showInputDialog(null, "Ingrese la cantidad de unidades", "Modificar", JOptionPane.INFORMATION_MESSAGE);
                    if ((cantidad != null) && esNumeroValido(cantidad) && !cantidad.equals(jTextUnidades.getText())) {

                        ProductoServicio pys = p.buscarProductoServicio(jTableConsumo.getValueAt(fila, 1).toString());
                        pys.setStock(pys.getStock() + Integer.parseInt(jTableConsumo.getValueAt(fila, 2).toString()));
                        p.modificarProductoServicio(pys);
                        
                        jTextUnidades.setText(cantidad);

                        if (verificaStock()) {

                            pys.setStock(pys.getStock() - Integer.parseInt(jTextUnidades.getText().toString()));

                            p.modificarProductoServicio(pys);

                            int cant = Integer.parseInt(jTextUnidades.getText().toString());
                            double precio = pys.getPrecioVenta();
                            Consumo com = consumo.buscarConsumoPorId(Integer.parseInt(jTableConsumo.getValueAt(fila, 0).toString()));
                            com.setUnidades(cant);
                            com.setCostoTotal(cant * precio);
                            consumo.modificarUnidadesCosumidas(com);

                        } else {
                            JOptionPane.showMessageDialog(null, "No hay stock");
                            pys.setStock(pys.getStock() - Integer.parseInt(jTableConsumo.getValueAt(fila, 2).toString()));
                            p.modificarProductoServicio(pys);
                            jTextUnidades.setText(jTableConsumo.getValueAt(fila, 2).toString());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El ingreso no es valido, no hubo modificaciones");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un consumo con un click ");
            }
        }
        limpiaCamposConsumo();
        modeloTabla.setRowCount(0);
        listaRegistros();
        jTableConsumo.clearSelection();
    }//GEN-LAST:event_jBEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBproductoYservicio;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsumo;
    private javax.swing.JTextField jTextConsumoTotal;
    public static javax.swing.JTextField jTextCostoTotal;
    private javax.swing.JTextField jTextNumeroHabitacion;
    public static javax.swing.JTextField jTextProYServ;
    private javax.swing.JTextField jTextRegistroTotal;
    public static javax.swing.JTextField jTextReservaNombre;
    public static javax.swing.JTextField jTextUnidades;
    // End of variables declaration//GEN-END:variables
 
    public boolean esNumeroValido(String cadena) {
        try {
            int numero = Integer.parseInt(cadena);
            // Verifica si es un número entero mayor que cero y menor que 9
            return numero > 0 && numero < 9;
        } catch (NumberFormatException e) {
            // Si se lanza una excepción, la cadena no es un número válido
            return false;
        }catch (NullPointerException e){
            return false;
        }
}
    public boolean verificaStock(){
        boolean aux = false;
        ProductoServicio pro = p.buscarProductoServicioId(idServicios);
        if (Integer.parseInt(jTextUnidades.getText()) > pro.getStock()){
            aux = false;
        }else{
            aux = true;
        }
    return aux;
    
    }
    public boolean verificaCamposVacios() {
        boolean aux = false;

        if ((!jTextProYServ.getText().isEmpty()) && (!jTextUnidades.getText().isEmpty())) {
            aux = true;
        } else {
            aux = false;
        }
        return aux;
    }

    private void armarCabecera() {
        modeloTabla.addColumn("Id");//0
        modeloTabla.addColumn("Producto o Servicio");//1
        modeloTabla.addColumn("Cantidad");//2
        modeloTabla.addColumn("Precio");//3
        jTableConsumo.setModel(modeloTabla);
    }

    private void cargarTabla(Consumo c) {
        modeloTabla.addRow(new Object[]{
            c.getIdConsumo(),
            c.getIdProductoServicio().getNombre(),
            c.getUnidades(),
            c.getCostoTotal(), 
        });
    }
public void listaRegistros() {
        int registro = 0;
        double consumoTotal = 0;
        // se lista a partir del id de registro
        for (Consumo x : consumo.listarProductoServicioPorIdRegistro(a.getIdReserva())) {
            cargarTabla(x);
            consumoTotal += x.getCostoTotal();
            // sumar totos los consumos
            registro++;
        }
        jTextRegistroTotal.setText("Total de registros: " + registro);
        jTextConsumoTotal.setText("Consumo Total: "+consumoTotal);

    }
public void limpiaCamposConsumo() {
        jTextProYServ.setText("");
        jTextUnidades.setText("");
        jTextCostoTotal.setText("");
    }


}
