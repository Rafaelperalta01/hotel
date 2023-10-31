/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import accesoADatos.ProductoServicioData;
import entidades.ProductoServicio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 54911
 */
public class GestionProductoServicio extends javax.swing.JInternalFrame {

     private ProductoServicioData psData= new  ProductoServicioData();
   private ProductoServicio prodserv=null;

 
     private DefaultTableModel modelo = new DefaultTableModel(){
@Override
public boolean isCellEditable(int fila,int columna){
        return false;
    }
};
    public GestionProductoServicio() {
        initComponents();
        armarCabecera();
        llenarTabla();
        camposDeshabilitados();
        jBmodificar.setEnabled(false);
        jBguardar.setEnabled(false);
        jBeliminar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCCategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTprecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTstock = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTcodigoId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTDescripcion = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jTbuscar = new javax.swing.JTextField();
        jBLimpiarBusqueda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaprodserv = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jCCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto", "Servicio" }));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Categoria");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");

        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripcion");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio de venta");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Stock");

        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        jBguardar.setText("Guardar");
        jBguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escritura.png"))); // NOI18N
        jBmodificar.setText("Modificar");
        jBmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Codigo:");

        jTDescripcion.setColumns(20);
        jTDescripcion.setRows(5);
        jTDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDescripcionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTDescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTstock)
                            .addComponent(jScrollPane2)
                            .addComponent(jTprecio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTNombre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(82, 82, 82)
                                .addComponent(jTcodigoId, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBNuevo)
                                .addGap(31, 31, 31)
                                .addComponent(jBguardar)
                                .addGap(18, 18, 18)
                                .addComponent(jBmodificar)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTcodigoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(67, 67, 67)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificar))
                .addGap(41, 41, 41))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jTbuscar.setText("Buscar por nombre");
        jTbuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTbuscarFocusGained(evt);
            }
        });
        jTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbuscarActionPerformed(evt);
            }
        });
        jTbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTbuscarKeyReleased(evt);
            }
        });

        jBLimpiarBusqueda.setBackground(new java.awt.Color(0, 102, 255));
        jBLimpiarBusqueda.setText("Limpiar Busqueda");
        jBLimpiarBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBLimpiarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarBusquedaActionPerformed(evt);
            }
        });

        Tablaprodserv.setModel(new javax.swing.table.DefaultTableModel(
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
        Tablaprodserv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaprodservMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablaprodserv);

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion.png"))); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBLimpiarBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBeliminar)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiarBusqueda)
                    .addComponent(jBeliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(24, 24, 24))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setText("Producto/Servicio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbuscarActionPerformed
       
    }//GEN-LAST:event_jTbuscarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        habilitarCampos();
       limpiarCampos();
       jTcodigoId.setEnabled(false);
       jBguardar.setEnabled(true);
       jBmodificar.setEnabled(false);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
         try{ 
               jTcodigoId.setEnabled(false);
        String categoria = (String) jCCategoria.getSelectedItem();
         String nombre = (String) jTNombre.getText();
           String descripcion = (String) jTDescripcion.getText();
       Double precio = Double.parseDouble(jTprecio.getText()) ;
      
        Integer stock =  Integer.parseInt(jTstock.getText());
      
         if (categoria.isEmpty()||nombre.isEmpty()|| descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
            return;// sale del metodo sin guardar nada
        }
        
       
        
            prodserv = new ProductoServicio(categoria,nombre,descripcion,precio,stock,true);
            psData.guardarProductoServicio(prodserv);
            
              limpiarCampos();
            camposDeshabilitados();;    
            jBguardar.setEnabled(false);
       
        
                }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros");
           
                }
           
            limpiarTabla();
             llenarTabla();
             
        
              
    }//GEN-LAST:event_jBguardarActionPerformed

    private void TablaprodservMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaprodservMouseClicked
        habilitarCampos();

        jBmodificar.setEnabled(true);
        jBguardar.setEnabled(false);
          jTcodigoId.setEnabled(false);
          jBeliminar.setEnabled(true);
        int filaSeleccionada = Tablaprodserv.getSelectedRow();// traigo la fila seleccionada

        if (filaSeleccionada != -1) {//nos aseguramos que haya una fila seleccionada
         //   Integer codigo = Integer.parseInt((String) Tablaprodserv.getValueAt(filaSeleccionada, 0));
           Integer codigo=(Integer)Tablaprodserv.getValueAt(filaSeleccionada, 0);
            String categoria=(String)Tablaprodserv.getValueAt(filaSeleccionada, 1);
              String nombre=(String)Tablaprodserv.getValueAt(filaSeleccionada, 2);
               String descripcion=(String)Tablaprodserv.getValueAt(filaSeleccionada, 3);
               double precio=(Double)Tablaprodserv.getValueAt(filaSeleccionada, 4);
              Integer stock=(Integer)Tablaprodserv.getValueAt(filaSeleccionada, 5);
            
            
           jTcodigoId.setText(codigo+"");
          
            jCCategoria.setSelectedItem(categoria);
            jTNombre.setText(nombre);
            jTDescripcion.setText(descripcion);
            jTprecio.setText(precio+"");
            jTstock.setText(stock + "");
            

        }
    }//GEN-LAST:event_TablaprodservMouseClicked

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
       try{ 
             jTcodigoId.setEnabled(false);
        String categoria = (String) jCCategoria.getSelectedItem();
          String nombre = (String) jTNombre.getText();
      
         String descripcion = (String) jTDescripcion.getText();
          Double precio = Double.parseDouble(jTprecio.getText()) ;
      
         Integer stock =  Integer.parseInt(jTstock.getText());
      
         if (categoria.isEmpty()||nombre.isEmpty()|| descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
            return;// sale del metodo sin guardar nada
        }
        
       
        
       
         
            int filaSeleccionada = Tablaprodserv.getSelectedRow();// traigo la fila seleccionada
          
            if (filaSeleccionada != -1) {
                      String nombre1=(String)Tablaprodserv.getValueAt(filaSeleccionada, 1);
                prodserv = psData.buscarProductoServicio(nombre1);
                if (prodserv != null) {
                   prodserv.setCategoria(categoria);
                    prodserv.setNombre(nombre);
                   prodserv.setDescripcion(descripcion);
                    prodserv.setPrecioVenta(precio);
                    prodserv.setStock(stock);
              
                   psData.modificarProductoServicio(prodserv);
                  
                }
            }  else {
    JOptionPane.showMessageDialog(this, "Debes seleccionar una fila antes de editar.");
}

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros ");

        }
          jBmodificar.setEnabled(false);
       limpiarCampos();
        limpiarTabla();
        llenarTabla();

        Tablaprodserv.clearSelection();
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBLimpiarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarBusquedaActionPerformed
      jTbuscar.setText("");
   limpiarTabla();
   llenarTabla();
    }//GEN-LAST:event_jBLimpiarBusquedaActionPerformed

    private void jTbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscarKeyReleased
        borrarFilas();
        String nombre = jTbuscar.getText();//IgnoreCase
        for (ProductoServicio ps : psData.listarProductoServicio()){
             jTbuscar.getText().toLowerCase();

            if(ps.getNombre().toLowerCase().startsWith(jTbuscar.getText())){
              
    //    cargarTabla(ps);
               modelo.addRow(new Object[]{
           
           ps.getIdProductoServicio(),
           ps.getCategoria(),
           ps.getNombre(),
            ps.getDescripcion(),
           ps.getPrecioVenta(),
           ps.getStock(),
           
          
          
        });
            }
              
        }
    }//GEN-LAST:event_jTbuscarKeyReleased

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
          int respuesta = JOptionPane.showConfirmDialog(null,
                "Desea eliminar este Producto/Serivio", "Eliminar Producto/Serivio", JOptionPane.OK_OPTION);
        int filaSeleccionada = Tablaprodserv.getSelectedRow();

        if (respuesta == 0 && filaSeleccionada != -1) {

            Integer codigo = (Integer) Tablaprodserv.getValueAt(filaSeleccionada, 0);

            psData.eliminarProductoServicio(codigo);
           jBmodificar.setEnabled(false);
            limpiarTabla();
            llenarTabla();
            limpiarCampos();
            camposDeshabilitados();
           // listaRegistros();
           
        } else {
            JOptionPane.showMessageDialog(null, "Debes Seleccionar el huesped para eliminar"); 
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyTyped
         char c = evt.getKeyChar();
        
        if (!(Character.isLetter(c)||c==' ')){
        evt.consume();
        }
    }//GEN-LAST:event_jTNombreKeyTyped

    private void jTDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescripcionKeyTyped
       char c = evt.getKeyChar();
        
        if (!(Character.isLetter(c)||c==' ')){
        evt.consume();
        }
    }//GEN-LAST:event_jTDescripcionKeyTyped

    private void jTbuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTbuscarFocusGained
           jTbuscar.setText("");
    }//GEN-LAST:event_jTbuscarFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablaprodserv;
    private javax.swing.JButton jBLimpiarBusqueda;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTDescripcion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTbuscar;
    private javax.swing.JTextField jTcodigoId;
    private javax.swing.JTextField jTprecio;
    private javax.swing.JTextField jTstock;
    // End of variables declaration//GEN-END:variables
 private void limpiarCampos() {
      jTNombre.setText("");
        jTDescripcion.setText("");
        jTprecio.setText("");
        jTstock.setText("");
    

}
    private void armarCabecera(){
        modelo.addColumn("codigo");
        modelo.addColumn("Categoria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
     
       Tablaprodserv.setModel(modelo);
    }
    
    private void cargarTabla(ProductoServicio prodServ){
       modelo.addRow(new Object[]{
           
           prodServ.getIdProductoServicio(),
           prodServ.getCategoria(),
           prodServ.getNombre(),
            prodServ.getDescripcion(),
           prodServ.getPrecioVenta(),
           prodServ.getStock(),
           
          
          
        });
       
       

}
    private void llenarTabla(){
        for(ProductoServicio prodServ: psData.listarProductoServicio()){
            cargarTabla(prodServ);
        }
    }
    
        private void borrarFilas(){
            int f=Tablaprodserv.getRowCount()-1;
            for(;f>=0;f--){
                modelo.removeRow(f);
            }
    
      }
  private void limpiarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) Tablaprodserv.getModel();
        modeloTabla.setRowCount(0);

  }
  private void camposDeshabilitados(){
      jTcodigoId.setEnabled(false);
       jCCategoria.setEnabled(false);
      jTNombre.setEnabled(false);
        jTDescripcion.setEnabled(false);
        jTprecio.setEnabled(false);
        jTstock.setEnabled(false);
  }
  private void habilitarCampos(){
       jTcodigoId.setEnabled(true);
      jCCategoria.setEnabled(true);
      jTNombre.setEnabled(true);
        jTDescripcion.setEnabled(true);
        jTprecio.setEnabled(true);
        jTstock.setEnabled(true);
        
  }

}
