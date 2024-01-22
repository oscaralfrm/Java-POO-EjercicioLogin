package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import logica.Controlador;
import logica.Usuario;

public class CargarDatos extends javax.swing.JFrame {

    Controlador controlador = null;
    
    public CargarDatos() {
        controlador = new Controlador();
        initComponents();
        this.setResizable(false);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Cantora One", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Carga de Usuarios");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

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

        txtFields.setBackground(new java.awt.Color(0, 51, 0));
        txtFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Cantora One", 1, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Usuario");
        txtFields.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cantora One", 1, 32)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rol Asignado");
        txtFields.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtIdUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtIdUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtFields.add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 221, -1));

        btnLimpiar.setBackground(new java.awt.Color(255, 102, 102));
        btnLimpiar.setFont(new java.awt.Font("Cantora One", 1, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sweep-48.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setDefaultCapable(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        txtFields.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 170, -1));

        btnGuardar.setBackground(new java.awt.Color(51, 153, 0));
        btnGuardar.setFont(new java.awt.Font("Cantora One", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setDefaultCapable(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        txtFields.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 180, -1));

        jLabel13.setFont(new java.awt.Font("Cantora One", 1, 32)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID Usuario");
        txtFields.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        cmbRol.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));
        txtFields.add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Cantora One", 1, 32)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contraseña");
        txtFields.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setForeground(new java.awt.Color(0, 0, 0));
        txtFields.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 221, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtFields.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 221, -1));

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
// En guardar, obtendremos los valores con .get() lo ingresado por el usuario

        String nombreUsuario = txtUsuario.getText();
        String contrasenaUsuario = txtContrasena.getText();
        int idUsuario = Integer.parseInt(txtIdUsuario.getText());
        // Si es 0 + 1 = 1, es USUARIO, si es 1 + 1 = 2, es ADMINISTRADOR
        int rolUsuario = (cmbRol.getSelectedIndex() + 1);

        boolean validacion = false;
        
        // Pasamos los parámetros al controlador...
        // Validamos de que no se repita el nombre de usuario a cargar...
        ArrayList<Usuario> listaDeUsuarios = controlador.traerUsuarios();

        List<Usuario> listaFiltroNombre = listaDeUsuarios.stream().
                filter(usuario -> usuario.getNombreUsuario().equals(nombreUsuario))
                .collect(Collectors.toList());
        
        boolean condicionNombre = ( listaFiltroNombre.size() > 0);
        
        
        for (Usuario usuario : listaDeUsuarios) {
            
            
            // Hacemos un algoritmo de búsqueda, si encuentra a alguno que esté repetido, corta.
            
            if ( condicionNombre ) {
                
                 // Dejamos mensajito de error o de advertencia
                JOptionPane.showMessageDialog(null,
                        "No se puede crear un usuario con el mismo nombre o ID que otro",
                        "Error", JOptionPane.ERROR_MESSAGE);
                
                break;
                
            } else {
                

                // Dejamos un mensajito
                JOptionPane.showMessageDialog(null, "Se ha completado el registro de sus datos exitosamente.");
                validacion = true;
                break;
                
            }
            
            
        }

        if (validacion) {
            controlador.agregarUsuarioNuevo(nombreUsuario, contrasenaUsuario, idUsuario, rolUsuario);
            limpiarCajas();
            validacion = false;
        }
        

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void limpiarCajas() {
        txtUsuario.setText("");
        txtContrasena.setText("");
        txtIdUsuario.setText("");
        cmbRol.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JPanel txtFields;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
