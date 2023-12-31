/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.UsuariosData;
import entidades.Usuarios;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class GestionUsuarios extends javax.swing.JInternalFrame {

    private UsuariosData userD = new UsuariosData();
    private Usuarios user = null;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    /**
     * Creates new form GestionUsuarios
     */
    public GestionUsuarios() {
        initComponents();
        armarCabecera();
        llenarTabla();
        activarCampos(false);
        btnModificar.setEnabled(false);
        btnCrear.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        tfDni = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfContraseña = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCcargo = new javax.swing.JComboBox<>();
        jCsexo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaUsuario = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnDefault = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(2117483647, 2147483647));

        jPanel1.setBackground(new java.awt.Color(151, 60, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DNI");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sexo");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cargo");

        tfNombre.setBackground(new java.awt.Color(151, 60, 0));
        tfNombre.setForeground(new java.awt.Color(255, 255, 255));
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });

        tfApellido.setBackground(new java.awt.Color(151, 60, 0));
        tfApellido.setForeground(new java.awt.Color(255, 255, 255));
        tfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidoKeyTyped(evt);
            }
        });

        tfDni.setBackground(new java.awt.Color(151, 60, 0));
        tfDni.setForeground(new java.awt.Color(255, 255, 255));

        tfDireccion.setBackground(new java.awt.Color(151, 60, 0));
        tfDireccion.setForeground(new java.awt.Color(255, 255, 255));

        btnModificar.setBackground(new java.awt.Color(151, 60, 0));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escritura.png"))); // NOI18N
        btnModificar.setText("Guardar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(151, 60, 0));
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");

        tfContraseña.setBackground(new java.awt.Color(151, 60, 0));
        tfContraseña.setForeground(new java.awt.Color(255, 255, 255));

        btnNuevo.setBackground(new java.awt.Color(151, 60, 0));
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");

        tfEmail.setBackground(new java.awt.Color(151, 60, 0));
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de usuario");

        jCcargo.setBackground(new java.awt.Color(151, 60, 0));
        jCcargo.setForeground(new java.awt.Color(255, 255, 255));
        jCcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recepcionista", "Aministrador" }));

        jCsexo.setBackground(new java.awt.Color(151, 60, 0));
        jCsexo.setForeground(new java.awt.Color(255, 255, 255));
        jCsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "femenino" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnNuevo)
                .addGap(59, 59, 59)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnCrear)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmail)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNombre)
                                    .addComponent(tfDni)
                                    .addComponent(tfDireccion)
                                    .addComponent(tfContraseña)
                                    .addComponent(tfApellido)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jCsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(239, 239, 239)
                    .addComponent(jCsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(334, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(151, 60, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jTablaUsuario.setBackground(new java.awt.Color(151, 60, 0));
        jTablaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaUsuario);

        btnEliminar.setBackground(new java.awt.Color(151, 60, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnDefault.setBackground(new java.awt.Color(151, 60, 0));
        btnDefault.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/actualizar.png"))); // NOI18N
        btnDefault.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefaultActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Listado de usuarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnDefault)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDefault)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
  
        try{         
        String nombre = tfNombre.getText();
        String ape = tfApellido.getText();
        int dni = Integer.parseInt(tfDni.getText());
       tfDni.setEnabled(false);
         String sexo = (String) jCsexo.getSelectedItem();
        String dir = tfDireccion.getText();
        String cargo = (String) jCcargo.getSelectedItem();
       
        String contra = tfContraseña.getText();
        String email = tfEmail.getText();
        
        if (tfNombre.getText().isEmpty() || tfApellido.getText().isEmpty() || tfDni.getText().isEmpty()
                 || tfDireccion.getText().isEmpty() || tfContraseña.getText().isEmpty())  {

            JOptionPane.showMessageDialog(null, "Hay campos vacios");
            limpiarCampos();
            return;
        }

     
            int filaSeleccionada = jTablaUsuario.getSelectedRow();// traigo la fila seleccionada

            if (filaSeleccionada != -1) {

                Usuarios usuariomodificado = userD.obtenerUsuarioPorDni(dni);
                if (usuariomodificado != null) {
                    usuariomodificado.setNombre(nombre);
                    usuariomodificado.setApellido(ape);
                    usuariomodificado.setDni(dni);
                    usuariomodificado.setSexo(sexo);
                    usuariomodificado.setDireccion(dir);
                    usuariomodificado.setCargo(cargo);
                    usuariomodificado.setContraseña(contra);
                    usuariomodificado.setEmail(email);
                    userD.modificarUsuario(usuariomodificado);
                    limpiarCampos();
                    btnModificar.setEnabled(false);
                    btnCrear.setEnabled(true);
                    btnNuevo.setEnabled(true);
                }
            } else {
                user.setNombre(nombre);
                user.setApellido(ape);
                user.setDni(dni);
                user.setSexo(sexo);
                user.setDireccion(dir);
                user.setCargo(cargo);
                user.setContraseña(contra);
                user.setEmail(email);
                
                userD.modificarEstadoUsuario(dni);

                 //userD.modificarEstadoHuesped(dni);
                 
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros para guardar su contacto");

        }
        limpiarCampos();
        limpiarTabla();
        llenarTabla();
    
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:

        try {
        String nombre = tfNombre.getText();
        String ape = tfApellido.getText();
        int dni = Integer.parseInt(tfDni.getText());
     
         String sexo = (String) jCsexo.getSelectedItem();
        String dir = tfDireccion.getText();
      String cargo = (String) jCcargo.getSelectedItem();
        String contra = tfContraseña.getText();
        String email = tfEmail.getText();
        
        if (tfNombre.getText().isEmpty() || tfApellido.getText().isEmpty() || tfDni.getText().isEmpty()
              || tfDireccion.getText().isEmpty() || tfContraseña.getText().isEmpty() || tfEmail.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios");
            limpiarCampos();
            return;
        }
        
            user = userD.obtenerUsuarioPorDni(dni);

            if (user != null) {
                btnCrear.setEnabled(false);
                
                JOptionPane.showMessageDialog(null,
                        "El numero de documento ingresado ya se encuentra en la base de datos,"
                        + " Por favor revise la información y presione modificar para reestablecer los datos ", "Dni encontrado", JOptionPane.INFORMATION_MESSAGE);
                btnModificar.setEnabled(true);
                tfNombre.setText(user.getNombre());
                tfApellido.setText(user.getApellido());
                tfDni.setText(Integer.toString(user.getDni()));
             
                jCsexo.setSelectedItem(user.getSexo());
                tfDireccion.setText(user.getDireccion());
                jCcargo.setSelectedItem(user.getCargo());

                tfContraseña.setText(user.getContraseña());
                tfEmail.setText(user.getEmail());
            }

            if (user == null) {
                user = new Usuarios(nombre, ape, dni, sexo, dir, cargo, true, contra, email);
                userD.crearUsuario(user);
                
                limpiarTabla();
                llenarTabla();
                limpiarCampos();
                btnNuevo.setEnabled(true);

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros para guardar su contacto");
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefaultActionPerformed
        limpiarCampos();
        limpiarTabla();
        llenarTabla();
         btnNuevo.setEnabled(true);

    }//GEN-LAST:event_btnDefaultActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        UsuariosData userD = new UsuariosData();
        int respuesta = JOptionPane.showConfirmDialog(null,
                "Desea eliminar este usuario", "Eliminar Usuario", JOptionPane.OK_OPTION);
        int filaSeleccionada = jTablaUsuario.getSelectedRow();

        if (respuesta == 0 && filaSeleccionada != -1) {
            int dni = Integer.parseInt(jTablaUsuario.getValueAt(filaSeleccionada, 2).toString());
            userD.eliminarUsuarioPorDni(dni);
            limpiarCampos();
            limpiarTabla();
            llenarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar el usuario para eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaUsuarioMouseClicked

        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnCrear.setEnabled(false);
        btnNuevo.setEnabled(false);
        activarCampos(true);
        int filaSeleccionada = jTablaUsuario.getSelectedRow();// traigo la fila seleccionada

        if (filaSeleccionada != -1) {//nos aseguramos que haya una fila seleccionada
            String nombre = (String) jTablaUsuario.getValueAt(filaSeleccionada, 0);
            String apellido = (String) jTablaUsuario.getValueAt(filaSeleccionada, 1);
            int dni = (Integer) jTablaUsuario.getValueAt(filaSeleccionada, 2);
            String sexo = (String) jTablaUsuario.getValueAt(filaSeleccionada, 3);
            String domicilio = (String) jTablaUsuario.getValueAt(filaSeleccionada, 4);
            String cargo = (String) jTablaUsuario.getValueAt(filaSeleccionada, 5);
            String contra = jTablaUsuario.getValueAt(filaSeleccionada, 7).toString();
            String email = (String) jTablaUsuario.getValueAt(filaSeleccionada , 8);

            tfNombre.setText(nombre);
            tfApellido.setText(apellido);
            tfDni.setText(Integer.toString(dni));
            jCsexo.setSelectedItem(sexo);
            tfDireccion.setText(domicilio);
             jCcargo.setSelectedItem(cargo);
            tfContraseña.setText(contra);
            tfEmail.setText(email);

        }
    }//GEN-LAST:event_jTablaUsuarioMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       activarCampos(true);
       limpiarCampos();
       btnCrear.setEnabled(true);
       btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
         char c = evt.getKeyChar();
        
        if (!(Character.isLetter(c)||c==' ')){
        evt.consume();
        }
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoKeyTyped
        char c = evt.getKeyChar();
        
        if (!(Character.isLetter(c)||c==' ')){
        evt.consume();
        }
    }//GEN-LAST:event_tfApellidoKeyTyped

    private void activarCampos(boolean a){
        tfNombre.setEnabled(a);
        tfApellido.setEnabled(a);
        tfDni.setEnabled(a);
        tfDireccion.setEnabled(a);
        jCsexo.setEnabled(a);
        jCcargo.setEnabled(a);
        tfContraseña.setEnabled(a);
        tfEmail.setEnabled(a);
  }
    
    private void limpiarTabla() {
        for (int i = 0; i < jTablaUsuario.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnDefault;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> jCcargo;
    private javax.swing.JComboBox<String> jCsexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaUsuario;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfContraseña;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables


    public void limpiarCampos() {
        tfNombre.setText("");
        tfApellido.setText("");
        tfDni.setText("");
        
        tfDireccion.setText("");
    
        tfContraseña.setText("");;
        tfEmail.setText("");
    }

    private void armarCabecera() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Sexo");
        modelo.addColumn("Direccion");
        modelo.addColumn("Cargo");
        modelo.addColumn("estado");
        modelo.addColumn("contraseña");
        modelo.addColumn("email");
        jTablaUsuario.setModel(modelo);
    }

    private void cargarTabla(Usuarios users) {
        modelo.addRow(new Object[]{
            users.getNombre(),
            users.getApellido(),
            users.getDni(),
            users.getSexo(),
            users.getDireccion(),
            users.getCargo(),
            users.isEstado(),
            users.getContraseña(),
            users.getEmail()
        });
    }

    private void llenarTabla() {
        UsuariosData ud = new UsuariosData();
        for (Usuarios user : ud.listarUsuarios()) {
            cargarTabla(user);
        }
    }

}
