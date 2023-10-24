/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.ProductoServicioData;
import entidades.ProductoServicio;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pc
 */
public class ProductoServicio_vista extends javax.swing.JInternalFrame {
public ProductoServicioData proServ = new ProductoServicioData();
private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    /**
     * Creates new form ProductoServicio
     */
    public ProductoServicio_vista() {
        initComponents();
         armarCabecera();
        listaRegistros();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductoServicio = new javax.swing.JTable();
        jTnroRegistro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jTextbuscar.setBackground(new java.awt.Color(255, 204, 153));
        jTextbuscar.setText("Busca por nombre");
        jTextbuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextbuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextbuscarFocusLost(evt);
            }
        });
        jTextbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextbuscarKeyReleased(evt);
            }
        });

        jTProductoServicio.setBackground(new java.awt.Color(255, 204, 153));
        jTProductoServicio.setModel(new javax.swing.table.DefaultTableModel(
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
        jTProductoServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProductoServicioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProductoServicio);

        jTnroRegistro.setBackground(new java.awt.Color(255, 204, 153));
        jTnroRegistro.setText("Total de registros:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jTextbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTnroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jTnroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setText("Listado de Producto o Servicio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextbuscarKeyReleased
       borrarFilas();
        for (ProductoServicio ps : proServ.listarProductoServicio()) {
            if ((ps.getCategoria().startsWith(jTextbuscar.getText())) || (ps.getNombre().startsWith(jTextbuscar.getText()))) {

                modeloTabla.addRow(new Object[]{
                    ps.getIdProductoServicio(),
                    ps.getCategoria(),
                    ps.getNombre(),
                    ps.getDescripcion(),
                    ps.getPrecioVenta(),
                    ps.getStock()
                });
            }
        }
    }//GEN-LAST:event_jTextbuscarKeyReleased

    private void jTProductoServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProductoServicioMouseClicked
        if (evt.getClickCount() == 2){
            
         int fila = jTProductoServicio.getSelectedRow();

        if (fila != -1) {   

            Consumos.idServicios = Integer.parseInt(jTProductoServicio.getValueAt(fila, 0).toString());
            Consumos.jTextProYServ.setText(jTProductoServicio.getValueAt(fila, 2).toString());
        }
        Consumos.jTextUnidades.setEditable(true);
        dispose();
        }
    }//GEN-LAST:event_jTProductoServicioMouseClicked

    private void jTextbuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextbuscarFocusGained
         jTextbuscar.setText("");
    }//GEN-LAST:event_jTextbuscarFocusGained

    private void jTextbuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextbuscarFocusLost
         jTextbuscar.setText("Busca por nombre");
    }//GEN-LAST:event_jTextbuscarFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProductoServicio;
    private javax.swing.JTextField jTextbuscar;
    private javax.swing.JTextField jTnroRegistro;
    // End of variables declaration//GEN-END:variables
   private void armarCabecera() {
        modeloTabla.addColumn("Id");//0
        modeloTabla.addColumn("Categoría ");//1
        modeloTabla.addColumn("Nombre ");//2
        modeloTabla.addColumn("Descripción ");//3
        modeloTabla.addColumn("Precio Venta ");//4
        modeloTabla.addColumn("Stock");//5
        jTProductoServicio.setModel(modeloTabla);
    }

    private void cargarTabla(entidades.ProductoServicio ps) {
        modeloTabla.addRow(new Object[]{
            ps.getIdProductoServicio(),
            ps.getCategoria(),
            ps.getNombre(),
            ps.getDescripcion(),
            ps.getPrecioVenta(),
            ps.getStock()
        });
    }

    public void listaRegistros() {
        int registro = 0;
        for (entidades.ProductoServicio x : proServ.listarProductoServicio()) {
            cargarTabla(x);
            registro++;
        }
        jTnroRegistro.setText("Total de registros: " + registro);

    }

    private void borrarFilas() {

        int filas = jTProductoServicio.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modeloTabla.removeRow(filas);
        }
    }


}
