package interfaz;

import java.awt.event.WindowEvent;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        setResizable(false);
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bgRight = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bgLeft = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tree-forest.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Cantora One", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/github-mini.png"))); // NOI18N
        jLabel5.setText("@oscaralfrm");
        bgRight.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cantora One", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("las sonrisas son para la humanidad\" ");
        bgRight.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cantora One", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("\"Hoy, planta tus sueños y déjalos crecer\" ");
        bgRight.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cantora One", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("\"Lo que el Sol es para las flores,");
        bgRight.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tree-forest-796.png"))); // NOI18N
        bgRight.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -30, -1, -1));

        jPanel1.add(bgRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 570, 650));

        bgLeft.setBackground(new java.awt.Color(204, 255, 204));
        bgLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flower-ivy-border-720.png"))); // NOI18N
        bgLeft.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 0, -1, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flower-1.png"))); // NOI18N
        bgLeft.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 520, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cantora One", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("Florería");
        bgLeft.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leaf-icon.png"))); // NOI18N
        bgLeft.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 100));

        jLabel9.setFont(new java.awt.Font("Cantora One", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setText("DiFoglia");
        bgLeft.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        btnLogin.setBackground(new java.awt.Color(51, 153, 0));
        btnLogin.setFont(new java.awt.Font("Cantora One", 1, 36)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leaf.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setDefaultCapable(false);
        btnLogin.setIconTextGap(6);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        bgLeft.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 230, -1));

        btnSalir.setBackground(new java.awt.Color(51, 153, 0));
        btnSalir.setFont(new java.awt.Font("Cantora One", 1, 36)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/right-down.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setDefaultCapable(false);
        btnSalir.setIconTextGap(15);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        bgLeft.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 230, -1));

        jPanel1.add(bgLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       
        LoginUsuario ventanaLoginUsuario = new LoginUsuario();
        ventanaLoginUsuario.setVisible(true);
        ventanaLoginUsuario.setLocationRelativeTo(null);
        ventanaLoginUsuario.setResizable(false);
        ventanaLoginUsuario.setDefaultCloseOperation(HIDE_ON_CLOSE);
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgLeft;
    private javax.swing.JPanel bgRight;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}