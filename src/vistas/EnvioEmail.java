/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.UsuariosData;
import entidades.Usuarios;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EnvioEmail extends javax.swing.JFrame {

    /**
     * Creates new form a
     */
    private String emailFrom = "Hotelroyalepalace@gmail.com";
    private String password = "MVPXJIODWBJZLVIX";
    private String destinatario;
    private String asunto;
    private String msj;
    private Properties mProperties;
    private Session mSesion;
    private MimeMessage mCorreo;
    
    public EnvioEmail() {
        initComponents();
        setLocationRelativeTo(null);
        mProperties = new Properties();
    }

    public void createEmail() {
        UsuariosData user = new UsuariosData();
        String email = tfRecibe.getText();
        Usuarios a = user.obtenerContra(email);
        if (a != null && email != "") {
            String contra = a.getContraseña();
            String nombre = a.getNombre();
            destinatario = tfRecibe.getText();
            asunto = "RECUPERACION DE CONTRASEÑA";
            msj = "Hola! "+nombre+"   Tu contrasena es : "+ contra;

            mProperties.put("mail.smtp.host", "smtp.gmail.com");
            mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            mProperties.setProperty("mail.smtp.starttls.enable", "true");
            mProperties.setProperty("mail.smtp.port", "587");
            mProperties.setProperty("mail.smtp.host", "smtp.gmail.com");
            mProperties.setProperty("mail.smtp.user", emailFrom);
            mProperties.put("mail.smtp.ssl.protocols", "TLSv1.2");
            mProperties.setProperty("mail.smtp.auth", "true");

            mSesion = Session.getDefaultInstance(mProperties);

            mCorreo = new MimeMessage(mSesion);
            try {
                mCorreo.setFrom(new InternetAddress(emailFrom));
                mCorreo.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                mCorreo.setSubject(asunto);
                mCorreo.setText(msj, "ISO-8859-1", "html");
            } catch (AddressException ex) {
                Logger.getLogger(EnvioEmail.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MessagingException ex) {
                Logger.getLogger(EnvioEmail.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            tfRecibe.setText("");
            return;
        }
    }

    private void sendEmail() {
        try {
            JOptionPane.showMessageDialog(null, "Estamos enviando el email..." );
            Transport mTransport = mSesion.getTransport("smtp");
            mTransport.connect(emailFrom, password);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            JOptionPane.showMessageDialog(null, "Se envio un correo con tu contraseña" );
            tfRecibe.setText("");
            this.dispose();
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(EnvioEmail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(EnvioEmail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException a ){
            JOptionPane.showMessageDialog(null, "No se encontró un usuario con ese email");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfRecibe = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese su email");

        jButton1.setText("Enviar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("IMPORTANTE: Ingresa el email con el que te registraste en el sistema");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Recuperación de Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jButton1)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        createEmail();
        sendEmail();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnvioEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnvioEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnvioEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnvioEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnvioEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfRecibe;
    // End of variables declaration//GEN-END:variables
}
