/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.HuespedData;
import entidades.Huesped;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 54911
 */
public class ListaHuespedesReserva extends javax.swing.JInternalFrame {
HuespedData huespedres = new HuespedData();
private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
};
    /**
     * Creates new form ListaHuespedesReserva
     */
    public ListaHuespedesReserva() {
        initComponents();
        armarCabecera();
        llenarTabla();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTHuespedRes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTBuscar = new javax.swing.JTextField();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(151, 60, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Huespedes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(741, 529));

        jTHuespedRes.setBackground(new java.awt.Color(151, 60, 0));
        jTHuespedRes.setForeground(new java.awt.Color(255, 255, 255));
        jTHuespedRes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTHuespedRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTHuespedResMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTHuespedRes);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Busqueda por Documeto");

        jTBuscar.setBackground(new java.awt.Color(151, 60, 0));
        jTBuscar.setForeground(new java.awt.Color(151, 60, 0));
        jTBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 6, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTHuespedResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTHuespedResMouseClicked
         if (evt.getClickCount() == 2){
            
          int fila = jTHuespedRes.getSelectedRow();

          if (fila != -1) {                      
//            VistaReserva.jTHusped.setText(jTHuespedRes.getValueAt(fila,0).toString());
//            VistaReserva.numDniHuesped = jTHuespedRes.getValueAt(fila,3).toString();
           String nom=(String)jTHuespedRes.getValueAt(fila,0);
           String ape=(String)jTHuespedRes.getValueAt(fila,1);
           String tipodoc=(String)jTHuespedRes.getValueAt(fila,2);
           String numdoc=(String)jTHuespedRes.getValueAt(fila,3);
           String domi=(String)jTHuespedRes.getValueAt(fila,4);
           String email=(String)jTHuespedRes.getValueAt(fila,5);
           int celu=(Integer)jTHuespedRes.getValueAt(fila,6);
           boolean estado=(Boolean)jTHuespedRes.getValueAt(fila,7);
           
           
         dispose();
        }}  
    }//GEN-LAST:event_jTHuespedResMouseClicked

    private void jTBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscarKeyReleased
        borrarFilas();
        for (Huesped hu : huespedres.listarHuesped()) {
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscar;
    public static javax.swing.JTable jTHuespedRes;
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
        jTHuespedRes.setModel(modeloTabla);
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
    private void borrarFilas() {

        int filas = jTHuespedRes.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modeloTabla.removeRow(filas);
        }
    }

    private void llenarTabla() {

        for (Huesped h : huespedres.listarHuesped()) {
            cargarTabla(h);
        }

    }




}