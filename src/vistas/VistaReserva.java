/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author Pc
 */
public class VistaReserva extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaReserva
     */
    public VistaReserva() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelRegistroReserva = new javax.swing.JPanel();
        jTHabitacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBBuscarTipoH = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTHusped = new javax.swing.JTextField();
        jBBuscarHues = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTAdmin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTCantPersonas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTImporte = new javax.swing.JTextField();
        jBCancelar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanelListadoRegistroReserva = new javax.swing.JPanel();
        jTBuscaReservas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablareservas = new javax.swing.JTable();
        jBConsumos = new javax.swing.JButton();
        jBpago = new javax.swing.JButton();
        jTTotalRegistros = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jButton8.setBackground(new java.awt.Color(255, 204, 153));
        jButton8.setText("Nuevo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setText("Registro de reservas");

        jPanelRegistroReserva.setBackground(new java.awt.Color(255, 204, 153));

        jTHabitacion.setBackground(new java.awt.Color(255, 204, 153));
        jTHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTHabitacionActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Habitacion: ");

        jBBuscarTipoH.setBackground(new java.awt.Color(255, 204, 153));
        jBBuscarTipoH.setText("buscar tipo hab");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Huesped:");

        jTHusped.setBackground(new java.awt.Color(255, 204, 153));
        jTHusped.setText("Obligatorio");

        jBBuscarHues.setBackground(new java.awt.Color(255, 204, 153));
        jBBuscarHues.setText("buscar H");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Administrador:");

        jTAdmin.setBackground(new java.awt.Color(255, 204, 153));

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Cantidad Personas:");

        jTCantPersonas.setBackground(new java.awt.Color(255, 204, 153));
        jTCantPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCantPersonasActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Importe:");

        jTImporte.setBackground(new java.awt.Color(255, 204, 153));

        jBCancelar.setBackground(new java.awt.Color(255, 204, 153));
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBNuevo.setBackground(new java.awt.Color(255, 204, 153));
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(255, 204, 153));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha de Entrada:");

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Fecha de Salida:");

        javax.swing.GroupLayout jPanelRegistroReservaLayout = new javax.swing.GroupLayout(jPanelRegistroReserva);
        jPanelRegistroReserva.setLayout(jPanelRegistroReservaLayout);
        jPanelRegistroReservaLayout.setHorizontalGroup(
            jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCancelar)
                .addGap(39, 39, 39))
            .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                        .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(70, 70, 70)
                                .addComponent(jTImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroReservaLayout.createSequentialGroup()
                                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jBNuevo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBGuardar)
                                    .addComponent(jTAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                        .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroReservaLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                                .addComponent(jTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jBBuscarTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTHusped, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBuscarHues, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanelRegistroReservaLayout.setVerticalGroup(
            jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroReservaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBBuscarTipoH)
                    .addComponent(jTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTHusped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarHues))
                .addGap(64, 64, 64)
                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jPanelRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBGuardar)
                    .addComponent(jBNuevo))
                .addGap(15, 15, 15))
        );

        jPanelListadoRegistroReserva.setBackground(new java.awt.Color(255, 204, 153));

        jTBuscaReservas.setBackground(new java.awt.Color(255, 204, 153));
        jTBuscaReservas.setText("Busca tu reserva");
        jTBuscaReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscaReservasActionPerformed(evt);
            }
        });

        jTablareservas.setBackground(new java.awt.Color(255, 204, 153));
        jTablareservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablareservas);

        jBConsumos.setBackground(new java.awt.Color(255, 204, 153));
        jBConsumos.setText("Consumos");
        jBConsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsumosActionPerformed(evt);
            }
        });

        jBpago.setBackground(new java.awt.Color(255, 204, 153));
        jBpago.setText("Realizar Pago");

        jTTotalRegistros.setBackground(new java.awt.Color(255, 204, 153));
        jTTotalRegistros.setText("Total de registros:");
        jTTotalRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTotalRegistrosActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 153));
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 153));
        jButton1.setText("Cancelar Reserva");

        javax.swing.GroupLayout jPanelListadoRegistroReservaLayout = new javax.swing.GroupLayout(jPanelListadoRegistroReserva);
        jPanelListadoRegistroReserva.setLayout(jPanelListadoRegistroReservaLayout);
        jPanelListadoRegistroReservaLayout.setHorizontalGroup(
            jPanelListadoRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListadoRegistroReservaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jBConsumos)
                .addGap(18, 18, 18)
                .addComponent(jBpago)
                .addGap(144, 144, 144)
                .addComponent(jTTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListadoRegistroReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListadoRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelListadoRegistroReservaLayout.createSequentialGroup()
                        .addComponent(jTBuscaReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addGap(28, 28, 28))
        );
        jPanelListadoRegistroReservaLayout.setVerticalGroup(
            jPanelListadoRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListadoRegistroReservaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelListadoRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton1)
                    .addComponent(jTBuscaReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelListadoRegistroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConsumos)
                    .addComponent(jBpago)
                    .addComponent(jTTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel9.setText("Listado de Reservas...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(196, 196, 196)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegistroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelListadoRegistroReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelRegistroReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelListadoRegistroReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTHabitacionActionPerformed

    private void jTBuscaReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscaReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscaReservasActionPerformed

    private void jBConsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsumosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBConsumosActionPerformed

    private void jTTotalRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTotalRegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTotalRegistrosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTCantPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCantPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCantPersonasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarHues;
    private javax.swing.JButton jBBuscarTipoH;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBConsumos;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBpago;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelListadoRegistroReserva;
    private javax.swing.JPanel jPanelRegistroReserva;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAdmin;
    private javax.swing.JTextField jTBuscaReservas;
    private javax.swing.JTextField jTCantPersonas;
    private javax.swing.JTextField jTHabitacion;
    private javax.swing.JTextField jTHusped;
    private javax.swing.JTextField jTImporte;
    private javax.swing.JTextField jTTotalRegistros;
    private javax.swing.JTable jTablareservas;
    // End of variables declaration//GEN-END:variables
}
