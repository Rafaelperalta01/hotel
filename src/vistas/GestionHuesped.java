package vistas;

import accesoADatos.HuespedData;
import entidades.Huesped;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionHuesped extends javax.swing.JInternalFrame {

    private HuespedData hData = new HuespedData();
    private Huesped huesped = null;
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public GestionHuesped() {
        initComponents();
        armarCabecera();
        llenarTabla();
        camposDeshabilitados();
        jBModificar.setEnabled(false);
        jBGuardar.setEnabled(false);
        jBEliminar.setEnabled(false);

        //  listaRegistros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTNumeroDocumento = new javax.swing.JTextField();
        jTDomicilio = new javax.swing.JTextField();
        jTCorreo = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jCTipoDocumento = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTablaHuesped = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTbuscarHuesped = new javax.swing.JTextField();
        jBEliminar = new javax.swing.JButton();
        jBLimpiarBusqueda = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 60, 0));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(151, 60, 0));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Documento");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo electrónico");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Domicilio");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teléfono celular");

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

        jTNombre.setBackground(new java.awt.Color(151, 60, 0));
        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreKeyTyped(evt);
            }
        });

        jTApellido.setBackground(new java.awt.Color(151, 60, 0));
        jTApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTApellidoKeyTyped(evt);
            }
        });

        jTNumeroDocumento.setBackground(new java.awt.Color(151, 60, 0));

        jTDomicilio.setBackground(new java.awt.Color(151, 60, 0));

        jTCorreo.setBackground(new java.awt.Color(151, 60, 0));

        jTTelefono.setBackground(new java.awt.Color(151, 60, 0));

        jCTipoDocumento.setBackground(new java.awt.Color(151, 60, 0));
        jCTipoDocumento.setForeground(new java.awt.Color(255, 255, 255));
        jCTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "PASAPORTE", " " }));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Numero Doc");

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

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Huespedes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jBGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBModificar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTDomicilio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(jTCorreo, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTApellido)
                                    .addComponent(jTNumeroDocumento)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCTipoDocumento, 0, 193, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTNombre)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(245, 245, 245))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModificar))
                .addGap(38, 38, 38))
        );

        jPanel2.setBackground(new java.awt.Color(151, 60, 0));

        jTTablaHuesped.setBackground(new java.awt.Color(151, 60, 0));
        jTTablaHuesped.setForeground(new java.awt.Color(255, 255, 255));
        jTTablaHuesped.setModel(new javax.swing.table.DefaultTableModel(
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
        jTTablaHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTTablaHuespedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTTablaHuesped);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Busqueda por Documento");

        jTbuscarHuesped.setBackground(new java.awt.Color(151, 60, 0));
        jTbuscarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbuscarHuespedActionPerformed(evt);
            }
        });
        jTbuscarHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTbuscarHuespedKeyReleased(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(151, 60, 0));
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBLimpiarBusqueda.setBackground(new java.awt.Color(151, 60, 0));
        jBLimpiarBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiarBusqueda.setText("Limpiar Busqueda");
        jBLimpiarBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBLimpiarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarBusquedaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Listado de Huespedes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jTbuscarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBLimpiarBusqueda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(jBEliminar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTbuscarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar)
                    .addComponent(jBLimpiarBusqueda))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        String nombre = jTNombre.getText();
        String apellido = jTApellido.getText();
        String tipoDocumento = (String) jCTipoDocumento.getSelectedItem();
        String numeroDocumento = jTNumeroDocumento.getText();
        String domicilio = jTDomicilio.getText();
        String correo = jTCorreo.getText();
        if (nombre.isEmpty() || apellido.isEmpty() || tipoDocumento.isEmpty() || numeroDocumento.isEmpty()
                || domicilio.isEmpty() || correo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
            return;// sale del metodo sin guardar nada
        }

        try {
            Integer celular = Integer.parseInt(jTTelefono.getText());

            huesped = hData.buscarHuespedPorDni(numeroDocumento);

            if (huesped != null) {
                jBGuardar.setEnabled(false);
                JOptionPane.showMessageDialog(null,
                        "El numero de documento ingresado ya se encuentra en la base de datos,"
                        + " Por favor revise la información y presione modificar para reestablecer los datos ", "Dni encontrado", JOptionPane.INFORMATION_MESSAGE);

                jTNombre.setText(huesped.getNombre());
                jTApellido.setText(huesped.getApellido());
                jCTipoDocumento.setSelectedItem(huesped.getTipoDocumento());
                jTNumeroDocumento.setText(huesped.getNumeroDocumento());
                jTNumeroDocumento.setEnabled(false);
                jTDomicilio.setText(huesped.getDomicilio());
                jTCorreo.setText(huesped.getCorreo());
                jTTelefono.setText(String.valueOf(huesped.getCelular()));
                jBModificar.setEnabled(true);
            }

            if (huesped == null) {
                huesped = new Huesped(nombre, apellido, tipoDocumento, numeroDocumento, domicilio, correo, celular, true);
                hData.guardarHuesped(huesped);

                limpiarCampos();
                camposDeshabilitados();;

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros para guardar su contacto");

        }

        limpiarTabla();
        llenarTabla();
        jBGuardar.setEnabled(false);

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        habilitarCampos();
        limpiarCampos();
        jBGuardar.setEnabled(true);
        jBModificar.setEnabled(false);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null,
                "Desea eliminar este Huesped", "Eliminar Huesped", JOptionPane.OK_OPTION);
        int filaSeleccionada = jTTablaHuesped.getSelectedRow();

        if (respuesta == 0 && filaSeleccionada != -1) {

            String nDoc = (String) jTTablaHuesped.getValueAt(filaSeleccionada, 3);

            hData.eliminarHuesped(nDoc);
            jBModificar.setEnabled(false);
            limpiarTabla();
            llenarTabla();
            limpiarCampos();
            camposDeshabilitados();
            // listaRegistros();

        } else {
            JOptionPane.showMessageDialog(null, "Debes Seleccionar el huesped para eliminar");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTbuscarHuespedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscarHuespedKeyReleased
        borrarFilas();

        for (Huesped hue : hData.listarHuesped()) {

            if (hue.getNumeroDocumento().startsWith(jTbuscarHuesped.getText())) {
                cargarTabla(hue);
            }
        }
    }//GEN-LAST:event_jTbuscarHuespedKeyReleased

    private void jBLimpiarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarBusquedaActionPerformed
        jTbuscarHuesped.setText("");
        limpiarTabla();
        llenarTabla();
    }//GEN-LAST:event_jBLimpiarBusquedaActionPerformed

    private void jTTablaHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTablaHuespedMouseClicked

        habilitarCampos();
        jBEliminar.setEnabled(true);
        jBModificar.setEnabled(true);
        jBGuardar.setEnabled(false);

        int filaSeleccionada = jTTablaHuesped.getSelectedRow();// traigo la fila seleccionada

        if (filaSeleccionada != -1) {//nos aseguramos que haya una fila seleccionada
            String nombre = (String) jTTablaHuesped.getValueAt(filaSeleccionada, 0);
            String apellido = (String) jTTablaHuesped.getValueAt(filaSeleccionada, 1);
            String tipoDocumento = (String) jTTablaHuesped.getValueAt(filaSeleccionada, 2);
            String numeroDocumento = (String) jTTablaHuesped.getValueAt(filaSeleccionada, 3);
            String domicilio = (String) jTTablaHuesped.getValueAt(filaSeleccionada, 4);
            String correo = (String) jTTablaHuesped.getValueAt(filaSeleccionada, 5);
            int celular = (Integer) jTTablaHuesped.getValueAt(filaSeleccionada, 6);

            jTNombre.setText(nombre);
            jTApellido.setText(apellido);
            jCTipoDocumento.setSelectedItem(tipoDocumento);
            jTNumeroDocumento.setText(numeroDocumento);
            jTNumeroDocumento.setEnabled(false);
            jTDomicilio.setText(domicilio);
            jTCorreo.setText(correo);
            jTTelefono.setText(celular + "");

        }
        //   listaRegistros();
    }//GEN-LAST:event_jTTablaHuespedMouseClicked

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        String nombre = jTNombre.getText();
        String apellido = jTApellido.getText();
        String tipoDocumento = (String) jCTipoDocumento.getSelectedItem();
        String numeroDocumento = jTNumeroDocumento.getText();
        String domicilio = jTDomicilio.getText();
        String correo = jTCorreo.getText();
        if (nombre.isEmpty() || apellido.isEmpty() || tipoDocumento.isEmpty() || numeroDocumento.isEmpty()
                || domicilio.isEmpty() || correo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
            return;// sale del metodo sin guardar nada
        }

        try {
            Integer celular = Integer.parseInt(jTTelefono.getText());

            int filaSeleccionada = jTTablaHuesped.getSelectedRow();// traigo la fila seleccionada

            if (filaSeleccionada != -1) {

                Huesped huespedmodificado = hData.buscarHuespedPorDni(numeroDocumento);
                if (huespedmodificado != null) {
                    huespedmodificado.setNombre(nombre);
                    huespedmodificado.setApellido(apellido);
                    huespedmodificado.setTipoDocumento(tipoDocumento);
                    huespedmodificado.setNumeroDocumento(numeroDocumento);

                    huespedmodificado.setDomicilio(domicilio);
                    huespedmodificado.setCorreo(correo);
                    huespedmodificado.setCelular(celular);
                    hData.modificarHuesped(huespedmodificado);

                }
            } else {
                huesped.setNombre(nombre);
                huesped.setApellido(apellido);
                huesped.setTipoDocumento(tipoDocumento);
                huesped.setNumeroDocumento(numeroDocumento);
                huesped.setDomicilio(domicilio);
                huesped.setCorreo(correo);
                huesped.setCelular(celular);

                hData.modificarHuesped(huesped);

                hData.modificarEstadoHuesped(numeroDocumento);
                jBModificar.setEnabled(true);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros para guardar su contacto");

        }
        jBModificar.setEnabled(false);
        limpiarCampos();
        limpiarTabla();
        llenarTabla();


    }//GEN-LAST:event_jBModificarActionPerformed

    private void jTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isLetter(c) || c == ' ')) {
            evt.consume();

        }
    }//GEN-LAST:event_jTNombreKeyTyped

    private void jTApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTApellidoKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isLetter(c) || c == ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTApellidoKeyTyped

    private void jTbuscarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbuscarHuespedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbuscarHuespedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiarBusqueda;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JComboBox<String> jCTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTNumeroDocumento;
    private javax.swing.JTable jTTablaHuesped;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTextField jTbuscarHuesped;
    // End of variables declaration//GEN-END:variables
 private void limpiarCampos() {
        jTNombre.setText("");
        jTApellido.setText("");
        jTNumeroDocumento.setText("");
        jTDomicilio.setText("");
        jTCorreo.setText("");
        jTTelefono.setText("");

    }

    private void armarCabecera() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Tipo de Documento");
        modelo.addColumn("N° de Documento");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Correo");
        modelo.addColumn("Celular");
        // modelo.addColumn("Estado");
        jTTablaHuesped.setModel(modelo);
    }

    private void cargarTabla(Huesped hues) {
        modelo.addRow(new Object[]{
            hues.getNombre(),
            hues.getApellido(),
            hues.getTipoDocumento(),
            hues.getNumeroDocumento(),
            hues.getDomicilio(),
            hues.getCorreo(),
            hues.getCelular()

        });

    }

    private void llenarTabla() {
        for (Huesped huesped : hData.listarHuespedEstadoTrue()) {
            cargarTabla(huesped);
        }
    }

    private void borrarFilas() {
        int f = jTTablaHuesped.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }

    }

    private void limpiarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) jTTablaHuesped.getModel();
        modeloTabla.setRowCount(0);

    }

    private void camposDeshabilitados() {
        jTNombre.setEnabled(false);
        jTApellido.setEnabled(false);
        jTNumeroDocumento.setEnabled(false);
        jTDomicilio.setEnabled(false);
        jTCorreo.setEnabled(false);
        jTTelefono.setEnabled(false);

    }

    private void habilitarCampos() {
        jTNombre.setEnabled(true);
        jTApellido.setEnabled(true);
        jTNumeroDocumento.setEnabled(true);
        jTDomicilio.setEnabled(true);
        jTCorreo.setEnabled(true);
        jTTelefono.setEnabled(true);
    }
//

}
