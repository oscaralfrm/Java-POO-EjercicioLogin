package interfaz;

import logica.Controlador;

public class LoginUsuario extends javax.swing.JFrame {

    Controlador controlador = null;
    
    public LoginUsuario() {
        controlador = new Controlador();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFields = new javax.swing.JPanel();
        txtMensaje = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Cantora One", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Inicio de Sesión");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leaf-icon.png"))); // NOI18N
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cantora One", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("DiFoglia");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cantora One", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Florería");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leaves-border-3-710.png"))); // NOI18N
        jLabel8.setText("jLabel7");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -200, -1, 370));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/water-drops-300.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 460, 270));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bottom-flower-border-715.png"))); // NOI18N
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        txtFields.setBackground(new java.awt.Color(51, 102, 0));

        txtMensaje.setEditable(false);
        txtMensaje.setBackground(new java.awt.Color(0, 51, 0));
        txtMensaje.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(255, 255, 255));
        txtMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cantora One", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Usuario");

        jLabel11.setFont(new java.awt.Font("Cantora One", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contraseña");

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));

        btnLimpiar.setBackground(new java.awt.Color(51, 153, 0));
        btnLimpiar.setFont(new java.awt.Font("Cantora One", 1, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(51, 153, 0));
        btnLogin.setFont(new java.awt.Font("Cantora One", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout txtFieldsLayout = new javax.swing.GroupLayout(txtFields);
        txtFields.setLayout(txtFieldsLayout);
        txtFieldsLayout.setHorizontalGroup(
            txtFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtFieldsLayout.createSequentialGroup()
                .addGroup(txtFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txtFieldsLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(txtFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(txtFieldsLayout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(txtFieldsLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(txtFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(txtFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
        );
        txtFieldsLayout.setVerticalGroup(
            txtFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtFieldsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(txtFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(txtFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(txtFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bg.add(txtFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 470, 250));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Leaf-500.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LeavesBG-750.png"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeActionPerformed

    }//GEN-LAST:event_txtMensajeActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        String mensaje = "";
        
        String nombreUsuario = txtUsuario.getText();
        String contrasenaUsuario = String.valueOf(txtContrasena.getText());
        
        mensaje = controlador.validarUsuario(nombreUsuario, contrasenaUsuario);
        
        txtMensaje.setText(mensaje);
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void limpiarCajas() {
        txtUsuario.setText("");
        txtContrasena.setText("");
        txtMensaje.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JPanel txtFields;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}