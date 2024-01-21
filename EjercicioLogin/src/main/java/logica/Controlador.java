package logica;

import interfaz.MenuAdmins;
import interfaz.MenuUsuarios;
import java.util.ArrayList;
import javax.swing.WindowConstants;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import persistencia.ControladorPersistencia;

public class Controlador {
    
    ControladorPersistencia controlPersist;

    public Controlador() {
        controlPersist = new ControladorPersistencia();
    }

    
    
    public String validarUsuario(String nombreUsuario, String contrasenaUsuario) {

        /*                        REVISAR, NO FUNCIONA BIEN                                                      */
        
        // Instanciamos inicialmente la respuesta a devolver
        String mensaje = "";

        // Traemos todos los usuarios
        ArrayList<Usuario> listaUsuarios = controlPersist.traerTodosUsuarios();

        for (Usuario usuario : listaUsuarios) {
            
            System.out.println("USUARIO BBDD: " + usuario.getNombreUsuario());
            System.out.println("USUARIO INGRESADO: " + nombreUsuario);
            System.out.println("CONTRASEÑA BBDD: " + usuario.getContrasena());
            System.out.println("CONTRASEÑA INGRESADA: " + contrasenaUsuario);
            
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
 
                if (usuario.getContrasena().equals(contrasenaUsuario)) {
                    mensaje = "-- BIENVENIDO AL SISTEMA --";
                    
                    // Validamos que, si su usuario.getRol().getId() == 0, es Usuario, y si no, es Admin
                    
                    if (usuario.getRolUsuario().getIdRol() == 0) {
                        
                    MenuUsuarios pantallaMenuUsuarios = new MenuUsuarios();
                    pantallaMenuUsuarios.setVisible(true);
                    pantallaMenuUsuarios.setLocationRelativeTo(null);
                    pantallaMenuUsuarios.setDefaultCloseOperation(HIDE_ON_CLOSE);
                        
                    } else {
                     
                     MenuAdmins pantallaMenuAdmins = new MenuAdmins();
                    pantallaMenuAdmins.setVisible(true);
                    pantallaMenuAdmins.setLocationRelativeTo(null);
                    pantallaMenuAdmins.setDefaultCloseOperation(HIDE_ON_CLOSE);
                        
                    }

                    return mensaje;
                } else {
                    mensaje = "-- ERROR: DATOS NO COINCIDEN --";
                    return mensaje;
                }
            } else {
                mensaje = "-- ERROR: DATOS NO INGRESADOS --";

            }
        
        }
        return mensaje;
    }
    
    public void validarConexion(String nombreUsuario, String contrasenaUsuario) {
        
        ArrayList<Usuario> listaDeUsuarios = controlPersist.traerTodosUsuarios();
        
        for (Usuario usuario : listaDeUsuarios) {
            
            // Validamos que el usuario esté en el sistema
            boolean condicion = (usuario.getNombreUsuario().equals(nombreUsuario) &&
                    usuario.getContrasena().equals(contrasenaUsuario));
            if (condicion) {
                
                // Acá validamos que, dependiendo del tipo de usuario, se abrirá una ventana u otra...
                
                if (String.valueOf(usuario.getRolUsuario()).equalsIgnoreCase("usuario")) {
                    
                    // Le abrimos la ventana del menú de usuarios, que sólo permite la vista de los miembros
                    
                    MenuUsuarios menuUsuarios = new MenuUsuarios();
                    menuUsuarios.setVisible(true);
                    menuUsuarios.setLocationRelativeTo(null);
                    menuUsuarios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                    
                } else {
                    
                    // En esta rama, se abrirá la pantalla del menú de los administradores...
                    
                    MenuAdmins menuAdmins = new MenuAdmins();
                    menuAdmins.setVisible(true);
                    menuAdmins.setLocationRelativeTo(null);
                    menuAdmins.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                    
                }
                
            }
            
        }
        
    }


    public ArrayList<Usuario> traerUsuarios() {
        
        return controlPersist.traerUsuarios();
        
    }

    public Usuario traerUsuarioSeleccionado(int numeroRegistroTabla) {

        return controlPersist.traerUsuarioSeleccionado(numeroRegistroTabla);
        
    }

    public void eliminarUsuarioSeleccionado(int idUsuario) {

        controlPersist.eliminarUsuarioSeleccionado(idUsuario);
        
    }

    public void editarUsuarioSeleccionado(Usuario usuario, String usuarioNombre, String usuarioContrasena, int idUsuarioRol) {

        // Empezamos a settear lo correspondiente... 
        
        usuario.setNombreUsuario(usuarioNombre);
        usuario.setContrasena(usuarioContrasena);
        
        // Buscamos el rol asociado al ID pasado por parámetro
        
        Rol rolUsuario = controlPersist.traerRolSeleccionado(idUsuarioRol);
        
        // Setteamos lo que tenemos que settear.
        
        usuario.setRolUsuario(rolUsuario);
        
        // Llevamos a la persistencia el objeto ya actualizado...
        
        controlPersist.editarUsuarioSeleccionado(usuario);
        
        
        
    }

    public void agregarUsuarioNuevo(String nombreUsuario, String contrasenaUsuario, int rolUsuario) {

        // Creamos un usuario con lo registrado, y setteamos los datos correspondientes
        
        Usuario usuarioNuevo = new Usuario();
        
        usuarioNuevo.setNombreUsuario(nombreUsuario);
        usuarioNuevo.setContrasena(contrasenaUsuario);
        
        // Traemos el rol... según el input del usuario
        
        Rol usuarioRol = controlPersist.traerRolSeleccionado(rolUsuario);
        
        // Seteamos el rol del usuario...
        
        usuarioNuevo.setRolUsuario(usuarioRol);
        
        // Pasamos al controlador de la persistencia el objeto usuario 
        
        controlPersist.agregarUsuarioNuevo(usuarioNuevo);
        

    }

  
    
    
}
