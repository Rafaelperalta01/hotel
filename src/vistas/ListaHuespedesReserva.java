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
//        llenarTabla();
        listaRegistros();
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
        jTNregistros = new javax.swing.JTextField();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(151, 60, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Huespedes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
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
        jLabel11.setText("Busqueda por Documento");

        jTBuscar.setBackground(new java.awt.Color(151, 60, 0));
        jTBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jTBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTBuscarFocusLost(evt);
            }
        });
        jTBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscarKeyReleased(evt);
            }
        });

        jTNregistros.setText("Total de registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTNregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jTNregistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTHuespedResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTHuespedResMouseClicked
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

    private void jTBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscarFocusGained
        jTBuscar.setText("");
    }//GEN-LAST:event_jTBuscarFocusGained

    private void jTBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscarFocusLost
        jTBuscar.setText("Ingresar número");
    }//GEN-LAST:event_jTBuscarFocusLost
               
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscar;
    public static javax.swing.JTable jTHuespedRes;
    private javax.swing.JTextField jTNregistros;
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

    public void listaRegistros() {
        int registro = 0;
        for (Huesped h : huespedres.listarHuesped()) {
            cargarTabla(h);
            registro++;
        }
        jTNregistros.setText("Total de registros: " + registro);

    }
    private void llenarTabla() {

        for (Huesped h : huespedres.listarHuesped()) {
            cargarTabla(h);
        }

    }




}