
package vistas;

import accesoADatos.TipoHabitacionData;
import entidades.Huesped;

import entidades.TipoHabitacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestionTipoHabitacion extends javax.swing.JInternalFrame {
 private TipoHabitacionData tipoData=new TipoHabitacionData();
   private TipoHabitacion tipoHabitacion=null;
     private DefaultTableModel modelo = new DefaultTableModel(){
@Override
public boolean isCellEditable(int fila,int columna){
        return false;
    }
};
    public GestionTipoHabitacion() {
        initComponents();
         armarCabecera();
        llenarTabla();
         camposDeshabilitados();
        jBEditar.setEnabled(false);
        jBGuardar.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPtipoHab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCCategoria = new javax.swing.JComboBox<>();
        jTCantPersonas = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jTCantCamas = new javax.swing.JTextField();
        jTHabitacion4 = new javax.swing.JTextField();
        jBEditar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jCTipoCama = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTTipoHabitacion = new javax.swing.JTable();
        jBBuscarTipoH4 = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        jPtipoHab.setBackground(new java.awt.Color(255, 204, 153));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Categoria: ");

        jBNuevo.setBackground(new java.awt.Color(255, 204, 153));
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cantidad de personas:");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Precio:");

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cantidad de camas:");

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Tipo de cama:");

        jCCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estandar Individual", "Estandar Doble", "Estandar Triple", "Premium Individual", "Premium Doble", "Premium Triple", "Suite Lujo" }));

        jTCantPersonas.setBackground(new java.awt.Color(255, 204, 153));

        jTPrecio.setBackground(new java.awt.Color(255, 204, 153));

        jTCantCamas.setBackground(new java.awt.Color(255, 204, 153));

        jTHabitacion4.setBackground(new java.awt.Color(255, 204, 153));
        jTHabitacion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTHabitacion4ActionPerformed(evt);
            }
        });

        jBEditar.setBackground(new java.awt.Color(255, 204, 153));
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(255, 204, 153));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jCTipoCama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Queen", "king Size" }));

        javax.swing.GroupLayout jPtipoHabLayout = new javax.swing.GroupLayout(jPtipoHab);
        jPtipoHab.setLayout(jPtipoHabLayout);
        jPtipoHabLayout.setHorizontalGroup(
            jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPtipoHabLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPtipoHabLayout.createSequentialGroup()
                        .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCTipoCama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPtipoHabLayout.createSequentialGroup()
                        .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCantPersonas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCantCamas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
            .addGroup(jPtipoHabLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPtipoHabLayout.createSequentialGroup()
                    .addGap(154, 154, 154)
                    .addComponent(jTHabitacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(118, Short.MAX_VALUE)))
        );
        jPtipoHabLayout.setVerticalGroup(
            jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPtipoHabLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(19, 19, 19)
                .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEditar)
                    .addComponent(jBGuardar))
                .addGap(21, 21, 21))
            .addGroup(jPtipoHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPtipoHabLayout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jTHabitacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(267, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jTTipoHabitacion.setBackground(new java.awt.Color(255, 204, 153));
        jTTipoHabitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jTTipoHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTTipoHabitacionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTTipoHabitacion);

        jBBuscarTipoH4.setBackground(new java.awt.Color(255, 204, 153));
        jBBuscarTipoH4.setText("SALIR");
        jBBuscarTipoH4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarTipoH4ActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(255, 204, 153));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBBuscarTipoH4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jBEliminar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBBuscarTipoH4)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setText("Gestion tipo de Habitacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPtipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPtipoHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTHabitacion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTHabitacion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTHabitacion4ActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
          habilitarCampos();
       limpiarCampos();
       jBGuardar.setEnabled(true);
       jBEditar.setEnabled(false);
        
                                         
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        
        
         try{ 
        String categoria = (String) jCCategoria.getSelectedItem();
        Integer cantidadPersonas = Integer.parseInt( jTCantPersonas.getText());
      
        String tipoCama = (String) jCTipoCama.getSelectedItem();
        Integer cantidadCamas =  Integer.parseInt(jTCantCamas.getText());
      
         if (categoria.isEmpty()||tipoCama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
            return;// sale del metodo sin guardar nada
        }
        
        Double precio = Double.parseDouble(jTPrecio.getText());
        
       
         
            int filaSeleccionada = jTTipoHabitacion.getSelectedRow();// traigo la fila seleccionada
          
            if (filaSeleccionada != -1) {
                      Integer id=(Integer)jTTipoHabitacion.getValueAt(filaSeleccionada, 0);
                TipoHabitacion tipoHabModificado = tipoData.buscarTipoHabPorId(id);
                if (tipoHabModificado != null) {
                   tipoHabModificado.setCategoria(categoria);
                    tipoHabModificado.setCantPersonas(cantidadPersonas);
                    tipoHabModificado.setCantCamas(cantidadCamas);
                    tipoHabModificado.setTipoCama(tipoCama);
              
                   tipoHabModificado.setPrecio(precio);
                   
                    tipoData.modificarTipoDeHabitacion(tipoHabModificado);
                  
                }
            }  else {
    JOptionPane.showMessageDialog(this, "Debes seleccionar una fila antes de editar.");
}

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros ");

        }
          jBEditar.setEnabled(false);
       limpiarCampos();
        limpiarTabla();
        llenarTabla();

        jTTipoHabitacion.clearSelection();
          
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
         
        try{ 
        String categoria = (String) jCCategoria.getSelectedItem();
        Integer cantidadPersonas = Integer.parseInt( jTCantPersonas.getText());
      
        String tipoCama = (String) jCTipoCama.getSelectedItem();
        Integer cantidadCamas =  Integer.parseInt(jTCantCamas.getText());
      
         if (categoria.isEmpty()||tipoCama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
            return;// sale del metodo sin guardar nada
        }
        
        Double precio = Double.parseDouble(jTPrecio.getText());
        
            tipoHabitacion  = new TipoHabitacion(categoria,cantidadPersonas,cantidadCamas,tipoCama,precio,true);
            tipoData.guardarTipoHabitacion(tipoHabitacion);
            
              limpiarCampos();
            camposDeshabilitados();;    
            jBGuardar.setEnabled(false);
       
        
                }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros");
           
                }
           
            limpiarTabla();
             llenarTabla();
             
        
                         
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBBuscarTipoH4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarTipoH4ActionPerformed
        dispose();
    }//GEN-LAST:event_jBBuscarTipoH4ActionPerformed

    private void jTTipoHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTipoHabitacionMouseClicked
          habilitarCampos();

        jBEditar.setEnabled(true);
        jBGuardar.setEnabled(false);
        
        int filaSeleccionada = jTTipoHabitacion.getSelectedRow();// traigo la fila seleccionada

        if (filaSeleccionada != -1) {//nos aseguramos que haya una fila seleccionada
            
            
            String categoria=(String)jTTipoHabitacion.getValueAt(filaSeleccionada, 1);
              Integer cantPersonas=(Integer)jTTipoHabitacion.getValueAt(filaSeleccionada, 2);
             Integer cantCamas=(Integer)jTTipoHabitacion.getValueAt(filaSeleccionada, 3);
             String tipoCama=(String)jTTipoHabitacion.getValueAt(filaSeleccionada, 4);
             double precio=(Double)jTTipoHabitacion.getValueAt(filaSeleccionada, 5);
            
           
           
            jCCategoria.setSelectedItem(categoria);
            jTCantPersonas.setText(cantPersonas+ "");
            jTCantCamas.setText(cantCamas+ "");
            jCTipoCama.setSelectedItem(tipoCama);
            jTPrecio.setText(precio + "");
            

        }
                    
    }//GEN-LAST:event_jTTipoHabitacionMouseClicked

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null,
            "Desea eliminar el tipo de Habitación", "Eliminar tipo de Habitación", JOptionPane.OK_OPTION);
        int filaSeleccionada = jTTipoHabitacion.getSelectedRow();

        if (respuesta == 0 && filaSeleccionada != -1) {

            int id= (Integer) jTTipoHabitacion.getValueAt(filaSeleccionada, 0);

            tipoData.eliminarTipoHabitacion(id);
            jBEditar.setEnabled(false);
            limpiarTabla();
            llenarTabla();
            limpiarCampos();
            camposDeshabilitados();
            // listaRegistros();

        } else {
            JOptionPane.showMessageDialog(null, "Debes Seleccionar el huesped para eliminar");
        }

    }//GEN-LAST:event_jBEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarTipoH4;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JComboBox<String> jCCategoria;
    private javax.swing.JComboBox<String> jCTipoCama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPtipoHab;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTCantCamas;
    private javax.swing.JTextField jTCantPersonas;
    private javax.swing.JTextField jTHabitacion4;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTable jTTipoHabitacion;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 private void limpiarCampos() {
        jTCantPersonas.setText("");
        jTCantCamas.setText("");
        jTPrecio.setText("");
       


}
    private void armarCabecera(){
        modelo.addColumn("Id");
        modelo.addColumn("Categoria");
        modelo.addColumn("Cantidad de Personas");
        modelo.addColumn("Cantidad de camas");
        modelo.addColumn("Tipo de cama");
        modelo.addColumn("Precio");
        
       jTTipoHabitacion.setModel(modelo);
    }
    
    private void cargarTabla(TipoHabitacion thab){
       modelo.addRow(new Object[]{
           thab.getIdTipoHabitacion(),
           thab.getCategoria(),
           thab.getCantPersonas(),
           thab.getCantCamas(),
           thab.getTipoCama(),
           thab.getPrecio()
           
          
          
        });
       
       

}
    private void llenarTabla(){
        for(TipoHabitacion tipo: tipoData.listarTipoHabitacionEstadoTrue()){
            cargarTabla(tipo);
        }
    }
    
        private void borrarFilas(){
            int f=jTTipoHabitacion.getRowCount()-1;
            for(;f>=0;f--){
                modelo.removeRow(f);
            }
    
      }
  private void limpiarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) jTTipoHabitacion.getModel();
        modeloTabla.setRowCount(0);

  }
  private void camposDeshabilitados(){
      jCCategoria.setEnabled(false);
      jCTipoCama.setEnabled(false);
       jTCantPersonas.setEnabled(false);
       jTCantCamas.setEnabled(false);
    jTPrecio.setEnabled(false);
      
      
  }
  private void habilitarCampos(){
      jCCategoria.setEnabled(true);
      jCTipoCama.setEnabled(true);
      jTCantPersonas.setEnabled(true);
   jTCantCamas.setEnabled(true);
          jTPrecio.setEnabled(true);
        
  }



}
