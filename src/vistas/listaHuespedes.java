/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.HuespedData;
import javax.swing.table.DefaultTableModel;
import entidades.Huesped;
import static vistas.ListaHuespedesReserva.jTHuespedRes;


public class listaHuespedes extends javax.swing.JInternalFrame {
HuespedData huesped = new HuespedData();
private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    /**
     * Creates new form listaHuespedes
     */
    public listaHuespedes() {
        initComponents();
        armarCabecera();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTablaHuesped = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTBuscar = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(729, 487));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(151, 60, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Huespedes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

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
        jLabel11.setText("Ingresa un huesped");

        jTBuscar.setBackground(new java.awt.Color(151, 60, 0));
        jTBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jTBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscarKeyReleased(evt);
            }
        });

        jBNuevo.setBackground(new java.awt.Color(151, 60, 0));
        jBNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jBNuevo.setText("Agregar Huesped");
        jBNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(jBNuevo)
                .addGap(39, 82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevo))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 6, 740, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTTablaHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTablaHuespedMouseClicked
        if (evt.getClickCount() == 2){
            
         int fila = jTTablaHuesped.getSelectedRow();

        if (fila != -1) {                      
            VistaReserva.jTHusped.setText(jTTablaHuesped.getValueAt(fila,0).toString());
            VistaReserva.numDniHuesped = jTTablaHuesped.getValueAt(fila,3).toString();
        }
        dispose();
        }
    }//GEN-LAST:event_jTTablaHuespedMouseClicked

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        GestionHuesped h = new GestionHuesped();
        Menu.escritorio.add(h);
        h.moveToFront();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jTBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscarKeyReleased
          borrarFilas();
        for (Huesped hu : huesped.listarHuesped()) {
            if(hu.getNumeroDocumento().startsWith(jTBuscar.getText())){
                modeloTabla.addRow(new Object[]{
                hu.getNombre(),
                hu.getApellido(),
                hu.getTipoDocumento(),
                hu.getNumeroDocumento(),
                hu.getDomicilio(),
                hu.getCorreo(),
                hu.getCelular(),
                hu.isEstado(),
                });
        }
        }
    }//GEN-LAST:event_jTBuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscar;
    public static javax.swing.JTable jTTablaHuesped;
    // End of variables declaration//GEN-END:variables
 
    private void armarCabecera() {
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Tipo de Documento");
        modeloTabla.addColumn("Numero de Documento");
        modeloTabla.addColumn("Domicilio");
        modeloTabla.addColumn("Email");
        modeloTabla.addColumn("Celular");
        modeloTabla.addColumn("Estado"); 
        jTTablaHuesped.setModel(modeloTabla);
    }

    private void cargarTabla(Huesped h) {
        modeloTabla.addRow(new Object[]{
            h.getNombre(),
            h.getApellido(),
            h.getTipoDocumento(),
            h.getNumeroDocumento(),
            h.getDomicilio(),
            h.getCorreo(),
            h.getCelular(),
            h.isEstado()
       
    });            
    }

    private void llenarTabla() {

        for (Huesped h : huesped.listarHuesped()) {
            cargarTabla(h);
        }

    }
     private void borrarFilas() {

        int filas = jTTablaHuesped.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modeloTabla.removeRow(filas);
        }
    }
}
