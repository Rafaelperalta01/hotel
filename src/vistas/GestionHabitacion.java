
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
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTBUSCAR = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTablaHabitacion = new javax.swing.JTable();
        jBBuscar = new javax.swing.JButton();

        setClosable(true);

        jPanel2.setBackground(new java.awt.Color(151, 60, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de Habitacion:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Piso:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("N° de Habitacion:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado:");

        jTNumHab.setBackground(new java.awt.Color(151, 60, 0));

        jTPiso.setBackground(new java.awt.Color(151, 60, 0));

        jCtipoHab.setBackground(new java.awt.Color(151, 60, 0));
        jCtipoHab.setForeground(new java.awt.Color(255, 255, 255));

        jBGuardar.setBackground(new java.awt.Color(151, 60, 0));
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setBackground(new java.awt.Color(151, 60, 0));
        jBNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(151, 60, 0));
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escritura.png"))); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jRDisponible.setBackground(new java.awt.Color(151, 60, 0));
        jRDisponible.setForeground(new java.awt.Color(255, 255, 255));
        jRDisponible.setText("Disponible");

        jRNodisp.setBackground(new java.awt.Color(151, 60, 0));
        jRNodisp.setForeground(new java.awt.Color(255, 255, 255));
        jRNodisp.setText("NO Disponible");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cod. Habitacion");

        jTCodigo.setBackground(new java.awt.Color(151, 60, 0));
        jTCodigo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gestión de Habitaciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBNuevo)
                        .addGap(30, 30, 30)
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jBModificar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addComponent(jTPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCtipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(62, 62, 62)
                                .addComponent(jTNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addComponent(jRDisponible)
                                .addGap(32, 32, 32)
                                .addComponent(jRNodisp))
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCtipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRDisponible)
                        .addComponent(jRNodisp)))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModificar))
                .addGap(46, 46, 46))
        );

        jPanel1.setBackground(new java.awt.Color(151, 60, 0));

        jTBUSCAR.setBackground(new java.awt.Color(151, 60, 0));
        jTBUSCAR.setForeground(new java.awt.Color(255, 255, 255));
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

        jTTablaHabitacion.setBackground(new java.awt.Color(151, 60, 0));
        jTTablaHabitacion.setForeground(new java.awt.Color(255, 255, 255));
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

        jBBuscar.setBackground(new java.awt.Color(151, 60, 0));
        jBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar.setText("Limpiar Busqueda");
        jBBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscar)
                        .addGap(60, 60, 60)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
         habilitarCampos();
       limpiarCampos();
       jBGuardar.setEnabled(true);
       jBModificar.setEnabled(false);
             jTCodigo.setEnabled(false);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
           try {
        TipoHabitacion thab = (TipoHabitacion) jCtipoHab.getSelectedItem();
        String numHabitacionStr = jTNumHab.getText();
        String pisoStr = jTPiso.getText();

        // Verifica si los campos de texto están vacíos
        if (numHabitacionStr.isEmpty() || pisoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de guardar.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return; // Sale del método si hay campos vacíos
        }
        
        
        
        Integer numeroHabitacion = Integer.parseInt( jTNumHab.getText());
        Integer piso =  Integer.parseInt(jTPiso.getText());
       boolean estado = false; // Inicializa como false por defecto

        if (jRDisponible.isSelected()) {
            estado = true; // Si jRDisponible está seleccionado, establece estado en true
        }
        if (numeroHabitacion < 0 || piso < 0) {
       
              JOptionPane.showMessageDialog(this, "Debe ingresar numeros mayores a cero", "Ingreso incorrecto", JOptionPane.WARNING_MESSAGE);
            return; // Sale del método si hay campos vacíos
            
        }
        
        
        habitacion=habData.buscarHabitacion(numeroHabitacion);
        if(habitacion!=null){
              JOptionPane.showMessageDialog(null,
                        "El número de la habitación ingresada ya se encuentra cargado,por favor ingrese un nuevo número",  "Habitación encontrada", JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(this, "Debe ingresar números");
           
                }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "No deben haber campos vacíos");
           
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
        
         
          if (numeroHabitacion < 0 || piso < 0) {
       
              JOptionPane.showMessageDialog(this, "Debe ingresar numeros mayores a cero", "Ingreso incorrecto", JOptionPane.WARNING_MESSAGE);
            return; // Sale del método si hay campos vacíos
            
        }
          
         int filaSeleccionada = jTTablaHabitacion.getSelectedRow();
        if (filaSeleccionada != -1) {
            Integer cod = (Integer) jTTablaHabitacion.getValueAt(filaSeleccionada, 0);
            Habitacion habitacionActual = habData.buscarHabitacionId(cod);

            if (habitacionActual != null) {
                if (habitacionActual.getNumHabitacion()==(numeroHabitacion)) {
                    // El nuevo número de habitación es igual al número de habitación actual
                    habitacionActual.setIdTipoHabitacion(thab);
                    habitacionActual.setPiso(piso);
                    habitacionActual.setEstado(estado);
                    habData.modificarHabitacion(habitacionActual);
                    JOptionPane.showMessageDialog( this, "Modificación exitosa");
                } else {
                    // El nuevo número de habitación es diferente del número de habitación actual
                    Habitacion otraHabitacion = habData.buscarHabitacion(numeroHabitacion);
                    if (otraHabitacion == null) {
                        // El nuevo número de habitación no está en uso por otra habitación
                        habitacionActual.setIdTipoHabitacion(thab);
                        habitacionActual.setNumHabitacion(numeroHabitacion);
                        habitacionActual.setPiso(piso);
                        habitacionActual.setEstado(estado);
                        habData.modificarHabitacion(habitacionActual);
                        JOptionPane.showMessageDialog(this, "Modificación exitosa");
                    } else {
                        // El nuevo número de habitación ya está en uso
                        JOptionPane.showMessageDialog(this, "El número de habitación ingresado ya está en uso por otra habitación.");
                    }
                
                }
//        // Obtén el código de la habitación seleccionada en la tabla
//        int filaSeleccionada = jTTablaHabitacion.getSelectedRow();
//        if (filaSeleccionada != -1) {
//            Integer cod = (Integer) jTTablaHabitacion.getValueAt(filaSeleccionada, 0);
//           Habitacion otraHabitacion = habData.buscarHabitacion(numeroHabitacion);
//           
//            if (otraHabitacion != null) {
//                // Procede con la modificación
//                
//                Habitacion habEncontrada = habData.buscarHabitacionId(cod);
//                if (habEncontrada != null) {
//                    habEncontrada.setIdTipoHabitacion(thab);
//                    habEncontrada.setNumHabitacion(numeroHabitacion);
//                    habEncontrada.setPiso(piso);
//                    habEncontrada.setEstado(estado);
//                    habData.modificarHabitacion(habEncontrada);
//                    
//                     JOptionPane.showMessageDialog(this, "Modificación exitosa");
//                }
//            } else {
//                // El número de habitación no está en uso por otra habitación, por lo que puedes continuar
//                JOptionPane.showMessageDialog(this, "El número de habitación ingresado ya está en uso por otra habitación.");
//            }
//            
//        }
            }
        }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros ");

        }
         jBModificar.setEnabled(false);
       limpiarCampos();
        limpiarTabla();
        llenarTabla();

        jTTablaHabitacion.clearSelection();
        camposDeshabilitados();
          
    
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

    

    
    

