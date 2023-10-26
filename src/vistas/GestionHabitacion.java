/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        jPanel1 = new javax.swing.JPanel();
        jTBUSCAR = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTablaHabitacion = new javax.swing.JTable();
        jBBuscar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jBNuevo)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jTPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68)
                        .addComponent(jTNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCtipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCtipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jTBUSCAR.setBackground(new java.awt.Color(255, 204, 153));
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

        jLabel6.setText("Buscar por n° de Habitación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jBBuscar)
                        .addGap(14, 14, 14)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jLabel6))
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
      
         
            habitacion  = new Habitacion(thab,numeroHabitacion,piso,estado);
            habData.guardarHabitacion(habitacion);
            
              limpiarCampos();
            camposDeshabilitados();;    
            jBGuardar.setEnabled(false);
       
            
        
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

  String categoria = (String) jTTablaHabitacion.getValueAt(filaSeleccionada, 0);
             Integer numHab = (Integer) jTTablaHabitacion.getValueAt(filaSeleccionada, 1);
            Integer piso = (Integer) jTTablaHabitacion.getValueAt(filaSeleccionada, 2);
            Boolean estado = (Boolean) jTTablaHabitacion.getValueAt(filaSeleccionada, 3);

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
    }//GEN-LAST:event_jTTablaHabitacionMouseClicked

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
         
        try{ 
                 
        TipoHabitacion thab = (  TipoHabitacion) jCtipoHab.getSelectedItem();
        Integer numeroHabitacion = Integer.parseInt( jTNumHab.getText());
        jTNumHab.setEnabled(false);
        Integer piso =  Integer.parseInt(jTPiso.getText());
       boolean estado = false; // Inicializa como false por defecto

        if (jRDisponible.isSelected()) {
            estado = true; // Si jRDisponible está seleccionado, establece estado en true
        }
         
            int filaSeleccionada =   jTTablaHabitacion.getSelectedRow();// traigo la fila seleccionada
          
            if (filaSeleccionada != -1) {
                      Integer numh=(Integer)  jTTablaHabitacion.getValueAt(filaSeleccionada, 1);
                Habitacion habEncontrada = habData.buscarHabitacion(numh);
                if (habEncontrada != null) {
                   habEncontrada.setIdTipoHabitacion(thab);
                    habEncontrada.setNumHabitacion(numeroHabitacion);
                    habEncontrada.setPiso(piso);
                    habEncontrada.isEstado();
              
                   
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
    private javax.swing.JTextField jTNumHab;
    private javax.swing.JTextField jTPiso;
    private javax.swing.JTable jTTablaHabitacion;
    // End of variables declaration//GEN-END:variables
 private void limpiarCampos() {
        jTPiso.setText("");
        jTNumHab.setText("");
  

}
    private void armarCabecera(){
        modelo.addColumn("Tipo de Habitación");
        modelo.addColumn("N° de Habitación");
        modelo.addColumn("Piso");
        modelo.addColumn("Estado");
   
        jTTablaHabitacion.setModel(modelo);
    }
    
    private void cargarTabla(Habitacion hab){
       modelo.addRow(new Object[]{
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
     jCtipoHab.setEnabled(false);
        jTNumHab.setEnabled(false);
         jTPiso.setEnabled(false);
          jRDisponible.setEnabled(false);
        jRNodisp.setEnabled(false);
       
       
      
  }
  private void habilitarCampos(){
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

    

    
    

