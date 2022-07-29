package Semana7;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ITOS
 */
@Entity
@Table(name = "biblioteca")
@NamedQueries({
    @NamedQuery(name = "Biblioteca.findAll", query = "SELECT b FROM Biblioteca b"),
    @NamedQuery(name = "Biblioteca.findByIdbiblioteca", query = "SELECT b FROM Biblioteca b WHERE b.idbiblioteca = :idbiblioteca"),
    @NamedQuery(name = "Biblioteca.findByNombre", query = "SELECT b FROM Biblioteca b WHERE b.nombre = :nombre"),
    @NamedQuery(name = "Biblioteca.findByDireccion", query = "SELECT b FROM Biblioteca b WHERE b.direccion = :direccion"),
    @NamedQuery(name = "Biblioteca.findByCodigo", query = "SELECT b FROM Biblioteca b WHERE b.codigo = :codigo")})
public class Biblioteca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idbiblioteca")
    private Integer idbiblioteca;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "codigo")
    private Integer codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "biblioteca")
    private Collection<Usuario> usuarioCollection;

    public Biblioteca() {
    }

    public Biblioteca(Integer idbiblioteca) {
        this.idbiblioteca = idbiblioteca;
    }

    public Biblioteca(Integer idbiblioteca, String nombre, String direccion) {
        this.idbiblioteca = idbiblioteca;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Integer getIdbiblioteca() {
        return idbiblioteca;
    }

    public void setIdbiblioteca(Integer idbiblioteca) {
        this.idbiblioteca = idbiblioteca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbiblioteca != null ? idbiblioteca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Biblioteca)) {
            return false;
        }
        Biblioteca other = (Biblioteca) object;
        if ((this.idbiblioteca == null && other.idbiblioteca != null) || (this.idbiblioteca != null && !this.idbiblioteca.equals(other.idbiblioteca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Semana7.Biblioteca[ idbiblioteca=" + idbiblioteca + " ]";
    }
    
}
