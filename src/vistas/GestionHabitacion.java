
package vistas;

import accesoADatos.HabitacionData;
import accesoADatos.TipoHabitacionData;

import entidades.Habitacion;
import entidades.TipoHabitacion;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;


import javax.swing.table.DefaultTableModel;

public class GestionHabitacion extends javax.swing.JInternalFrame {
   private HabitacionData habData=new HabitacionData();
   private Habitacion habitacion=null;
     private DefaultTableModel modelo = new DefaultTableModel(){
         
@Override
public boolean isCellEditable(int fila,int columna){
        return false;
         
    }
};
private ButtonGroup buttonGroup = new ButtonGroup();
    public GestionHabitacion() {
        initComponents();
           armarCabecera();
           camposDeshabilitados();
        llenarTabla();
        cargarComboBoxCategoria();
         buttonGroup.add(jRDisponible);
         buttonGroup.add(jRNodisp);
        jBModificar.setEnabled(false);
        jBGuardar.setEnabled(false);
  
    }
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTNumHab = new javax.swing.JTextField();
        jTPiso = new javax.swing.JTextField();
        jCtipoHab = new javax.swing.JComboBox<>();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jRDisponible = new javax.swing.JRadioButton();
        jRNodisp = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTBUSCAR = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTablaHabitacion = new javax.swing.JTable();
        jBBuscar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Tipo de Habitacion:");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Piso:");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("N° de Habitacion:");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Estado:");

        jTNumHab.setBackground(new java.awt.Color(255, 204, 153));

        jTPiso.setBackground(new java.awt.Color(255, 204, 153));

        jBGuardar.setBackground(new java.awt.Color(255, 204, 153));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setBackground(new java.awt.Color(255, 204, 153));
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jRDisponible.setText("Disponible");

        jRNodisp.setText("NO Disponible");

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Cod. Habitacion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jBNuevo))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jRDisponible)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRNodisp))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jBGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBModificar)
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCtipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCtipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRDisponible)
                        .addComponent(jRNodisp)))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBNuevo)
                    .addComponent(jBModificar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jTBUSCAR.setBackground(new java.awt.Color(255, 204, 153));
        jTBUSCAR.setText("Buscar por n° de Habitación");
        jTBUSCAR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTBUSCARFocusGained(evt);
            }
        });
        jTBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBUSCARActionPerformed(evt);
            }
        });
        jTBUSCAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBUSCARKeyReleased(evt);
            }
        });

        jTTablaHabitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jTTablaHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTTablaHabitacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTTablaHabitacion);

        jBBuscar.setBackground(new java.awt.Color(255, 204, 153));
        jBBuscar.setText("Limpiar Busqueda");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(255, 204, 153));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBSalir)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscar)
                                .addGap(60, 60, 60)))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel5.setText("Habitaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
         habilitarCampos();
       limpiarCampos();
       jBGuardar.setEnabled(true);
       jBModificar.setEnabled(false);
             jTCodigo.setEnabled(false);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
           try{ 
                 
        TipoHabitacion thab = (  TipoHabitacion) jCtipoHab.getSelectedItem();
        Integer numeroHabitacion = Integer.parseInt( jTNumHab.getText());
        Integer piso =  Integer.parseInt(jTPiso.getText());
       boolean estado = false; // Inicializa como false por defecto

        if (jRDisponible.isSelected()) {
            estado = true; // Si jRDisponible está seleccionado, establece estado en true
        }
        habitacion=habData.buscarHabitacion(numeroHabitacion);
        if(habitacion!=null){
              JOptionPane.showMessageDialog(null,
                        "El numero de la habitacion ingresada ya se encuentra cargado,por favor ingrese un nuevo numero",  "Habitacion encontrada", JOptionPane.INFORMATION_MESSAGE);
        }
            if(habitacion==null){
                  
            habitacion  = new Habitacion(thab,numeroHabitacion,piso,estado);
            habData.guardarHabitacion(habitacion);
      
                // Define un valor para mostrar en la tabla
            String estadoEnTabla = estado ? "Disponible" : "No Disponible";

            // Agrega una nueva fila a la tabla con los datos de la habitación
            DefaultTableModel modelo = (DefaultTableModel) jTTablaHabitacion.getModel();
            modelo.addRow(new Object[]{thab, numeroHabitacion, piso, estadoEnTabla});
            jTTablaHabitacion.setModel(modelo);

            
            
              limpiarCampos();
            camposDeshabilitados();;    
            jBGuardar.setEnabled(false);
                
                
            }
       
       
            
        
                }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros");
           
                }
           
            limpiarTabla();
             llenarTabla();
             
        
                         
                         
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTTablaHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTablaHabitacionMouseClicked
         habilitarCampos();
     
        jBModificar.setEnabled(true);
        jBGuardar.setEnabled(false);
        
        int filaSeleccionada = jTTablaHabitacion.getSelectedRow();// traigo la fila seleccionada

        if (filaSeleccionada != -1) {//nos aseguramos que haya una fila seleccionada
 Integer codigo = (Integer) jTTablaHabitacion.getValueAt(filaSeleccionada, 0);
  String categoria = (String) jTTablaHabitacion.getValueAt(filaSeleccionada, 1);
             Integer numHab = (Integer) jTTablaHabitacion.getValueAt(filaSeleccionada, 2);
             
            Integer piso = (Integer) jTTablaHabitacion.getValueAt(filaSeleccionada, 3);
            Boolean estado = (Boolean) jTTablaHabitacion.getValueAt(filaSeleccionada, 4);

        for (int i = 0; i < jCtipoHab.getItemCount(); i++) {
            TipoHabitacion tipoHab = (TipoHabitacion) jCtipoHab.getItemAt(i);
              if (tipoHab.getCategoria().equals(categoria)) {
        // Establece el TipoHabitacion como la selección actual
        jCtipoHab.setSelectedItem(tipoHab);
        break;
    }
        }    
            
            
             jTCodigo.setText(codigo+"");
            jCtipoHab.setSelectedItem(categoria);
            jTNumHab.setText(numHab + "");
            jTPiso.setText(piso+ "");
             if (estado) {
            jRDisponible.setSelected(true);
            jRNodisp.setSelected(false);
        } else {
            jRDisponible.setSelected(false);
            jRNodisp.setSelected(true);
        }


        }
        jTCodigo.setEnabled(false);
    }//GEN-LAST:event_jTTablaHabitacionMouseClicked

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
               jTCodigo.setEnabled(false);
        try{ 
                 
        TipoHabitacion thab = (  TipoHabitacion) jCtipoHab.getSelectedItem();
        Integer numeroHabitacion = Integer.parseInt( jTNumHab.getText());
     
        Integer piso =  Integer.parseInt(jTPiso.getText());
       boolean estado = false; // Inicializa como false por defecto

        if (jRDisponible.isSelected()) {
            estado = true; // Si jRDisponible está seleccionado, establece estado en true
        }
         
            int filaSeleccionada =   jTTablaHabitacion.getSelectedRow();// traigo la fila seleccionada
          
            if (filaSeleccionada != -1) {
                      Integer cod=(Integer)  jTTablaHabitacion.getValueAt(filaSeleccionada, 0);
                Habitacion habEncontrada = habData.buscarHabitacionId(cod);
                if (habEncontrada != null) {
                   habEncontrada.setIdTipoHabitacion(thab);
                     
                  
                            
              
                       
                    habEncontrada.setNumHabitacion(numeroHabitacion);
                    habEncontrada.setPiso(piso);
                         habEncontrada.setEstado(estado);
                
              
                   
                    habData.modificarHabitacion(habEncontrada);
                  
                }
            }  else {
    JOptionPane.showMessageDialog(this, "Debes seleccionar una fila antes de editar.");
}

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros ");

        }
         jBModificar.setEnabled(false);
       limpiarCampos();
        limpiarTabla();
        llenarTabla();

        jTTablaHabitacion.clearSelection();
          
    
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jTBUSCARKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBUSCARKeyReleased
//     borrarFilas();
//        int numeroDocumento = Integer.parseInt(jTBUSCAR.getText()) ;
//        for (Habitacion hab : habData.listarHabitacion_X_nro(numeroDocumento)) {
//            if (Integer.toString(hab.getNumHabitacion()).startsWith(jTBUSCAR.getText())) {
//
//                cargarTabla(hab);
//            }
//        }
 borrarFilas();

    String textoBusqueda = jTBUSCAR.getText().trim();

    if (!textoBusqueda.isEmpty()) {
        try {
            int numeroDocumento = Integer.parseInt(textoBusqueda);
            for (Habitacion hab : habData.listarHabitacion_X_nro(numeroDocumento)) {
                if (Integer.toString(hab.getNumHabitacion()).startsWith(textoBusqueda)) {
                    cargarTabla(hab);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar Números");
        }
    } else {
            JOptionPane.showMessageDialog(this, "El campo de busqueda esta vacio");
    }

    }//GEN-LAST:event_jTBUSCARKeyReleased

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        jTBUSCAR.setText("");
   limpiarTabla();
   llenarTabla();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBUSCARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBUSCARActionPerformed

    private void jTBUSCARFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBUSCARFocusGained
         jTBUSCAR.setText("");
    }//GEN-LAST:event_jTBUSCARFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<TipoHabitacion> jCtipoHab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRDisponible;
    private javax.swing.JRadioButton jRNodisp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBUSCAR;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNumHab;
    private javax.swing.JTextField jTPiso;
    private javax.swing.JTable jTTablaHabitacion;
    // End of variables declaration//GEN-END:variables
 private void limpiarCampos() {
        jTPiso.setText("");
        jTNumHab.setText("");
  

}
    private void armarCabecera(){
        modelo.addColumn("Cod Habitación");
        modelo.addColumn("Tipo de Habitación");
        modelo.addColumn("N° de Habitación");
        modelo.addColumn("Piso");
        modelo.addColumn("Estado");
   
        jTTablaHabitacion.setModel(modelo);
    }
    
    private void cargarTabla(Habitacion hab){
        
       modelo.addRow(new Object[]{
           hab.getIdHabitacion(),
           hab.getIdTipoHabitacion().getCategoria(),
           hab.getNumHabitacion(),
           hab.getPiso(),
           hab.isEstado()
       
          
        });
       
       

}
    private void llenarTabla(){
        for(Habitacion hab: habData.listarHabitacion()){
            cargarTabla(hab);
        }
    }
    
        private void borrarFilas(){
            int f=jTTablaHabitacion.getRowCount()-1;
            for(;f>=0;f--){
                modelo.removeRow(f);
            }
    
      }
  private void limpiarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) jTTablaHabitacion.getModel();
        modeloTabla.setRowCount(0);

  }
  private void camposDeshabilitados(){
      jTCodigo.setEnabled(false);
     jCtipoHab.setEnabled(false);
        jTNumHab.setEnabled(false);
         jTPiso.setEnabled(false);
          jRDisponible.setEnabled(false);
        jRNodisp.setEnabled(false);
       
       
      
  }
  private void habilitarCampos(){
            jTCodigo.setEnabled(true);
      jCtipoHab.setEnabled(true);
        jTNumHab.setEnabled(true);
        jTPiso.setEnabled(true);
        jRDisponible.setEnabled(true);
        jRNodisp.setEnabled(true);
       
  }
    private void cargarComboBoxCategoria() {
    
        TipoHabitacionData tipoData=new TipoHabitacionData();
        for (TipoHabitacion tipohab :tipoData.listarid()) {
          jCtipoHab.addItem(tipohab);
        }

    }
   
    
    }

    

    
    

