package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idRol;
    private String nombreRol;
    private String descripcion;

    @OneToMany(mappedBy="rolUsuario")
    private List<Usuario> listaUsuarios;
    
    
    public Rol() {
    }

    public Rol(int idRol, String nombreRol, String descripcion, List<Usuario> listaUsuarios) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
        this.listaUsuarios = listaUsuarios;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    

   
    
}
