package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Rol;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

public class ControladorPersistencia {

    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    RolJpaController rolJPA = new RolJpaController();
    
        /* MÉTODOS USUARIO */
    // Creamos los métodos a usar - no se usarán todos, pero de todas formas se crean
    public void crearUsuario(Usuario usuario) {

        usuarioJPA.create(usuario);

    }

    public void editarUsuario(Usuario usuario) {

        try {
            usuarioJPA.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarUsuario(int idUsuario) {

        try {
            usuarioJPA.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Usuario traerUsuario(int idUsuario) {

        return usuarioJPA.findUsuario(idUsuario);

    }

    public ArrayList<Usuario> traerTodosUsuarios() {
        List<Usuario> listaUsuariosInicial = usuarioJPA.findUsuarioEntities();
        ArrayList<Usuario> listaUsuariosFinal = new ArrayList<>(listaUsuariosInicial);
        return listaUsuariosFinal;

    }
    
    
    /* MÉTODOS ROL */
    
    // Creamos los métodos a usar - no se usarán todos, pero de todas formas se crean
    public void crearRol(Rol rol) {

        rolJPA.create(rol);

    }

    public void editarRol(Rol rol) {

        try {
            rolJPA.edit(rol);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarRol(int idRol) {

        try {
            rolJPA.destroy(idRol);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Rol traerRol(int idRol) {

        return rolJPA.findRol(idRol);

    }

    public ArrayList<Rol> traerTodosRoles() {
        List<Rol> listaRolesInicial = rolJPA.findRolEntities();
        ArrayList<Rol> listaRolesFinales = new ArrayList<>(listaRolesInicial);
        return listaRolesFinales;

    }

    public ArrayList<Usuario> traerUsuarios() {

        return traerTodosUsuarios();

    }

    public Usuario traerUsuarioSeleccionado(int numeroRegistroTabla) {

        return traerUsuario(numeroRegistroTabla);
        
    }

    public void eliminarUsuarioSeleccionado(int idUsuario) {

        eliminarUsuario(idUsuario);

    }

    public Rol traerRolSeleccionado(int idUsuarioRol) {

        return traerRol(idUsuarioRol);
        
    }

    public void editarUsuarioSeleccionado(Usuario usuario) {

        editarUsuario(usuario);
        
    }

    public void agregarUsuarioNuevo(Usuario usuarioNuevo) {

        crearUsuario(usuarioNuevo);
        
    }
    

}
