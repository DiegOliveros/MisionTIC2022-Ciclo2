package Semana7;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ITOS
 */
@Entity
@Table(name = "prestamo")
@NamedQueries({
    @NamedQuery(name = "Prestamo.findAll", query = "SELECT p FROM Prestamo p"),
    @NamedQuery(name = "Prestamo.findByIdprestamo", query = "SELECT p FROM Prestamo p WHERE p.prestamoPK.idprestamo = :idprestamo"),
    @NamedQuery(name = "Prestamo.findByFecha", query = "SELECT p FROM Prestamo p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Prestamo.findByFechaentrega", query = "SELECT p FROM Prestamo p WHERE p.fechaentrega = :fechaentrega"),
    @NamedQuery(name = "Prestamo.findByUsuarioIdusuario", query = "SELECT p FROM Prestamo p WHERE p.prestamoPK.usuarioIdusuario = :usuarioIdusuario"),
    @NamedQuery(name = "Prestamo.findByUsuarioBibliotecaIdbiblioteca", query = "SELECT p FROM Prestamo p WHERE p.prestamoPK.usuarioBibliotecaIdbiblioteca = :usuarioBibliotecaIdbiblioteca"),
    @NamedQuery(name = "Prestamo.findByLibroIdlibro", query = "SELECT p FROM Prestamo p WHERE p.prestamoPK.libroIdlibro = :libroIdlibro")})
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrestamoPK prestamoPK;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "fechaentrega")
    @Temporal(TemporalType.DATE)
    private Date fechaentrega;
    @JoinColumn(name = "libro_idlibro", referencedColumnName = "idlibro", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Libro libro;
    @JoinColumns({
        @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario", insertable = false, updatable = false),
        @JoinColumn(name = "usuario_biblioteca_idbiblioteca", referencedColumnName = "biblioteca_idbiblioteca", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Prestamo() {
    }

    public Prestamo(PrestamoPK prestamoPK) {
        this.prestamoPK = prestamoPK;
    }

    public Prestamo(PrestamoPK prestamoPK, Date fecha, Date fechaentrega) {
        this.prestamoPK = prestamoPK;
        this.fecha = fecha;
        this.fechaentrega = fechaentrega;
    }

    public Prestamo(int idprestamo, int usuarioIdusuario, int usuarioBibliotecaIdbiblioteca, int libroIdlibro) {
        this.prestamoPK = new PrestamoPK(idprestamo, usuarioIdusuario, usuarioBibliotecaIdbiblioteca, libroIdlibro);
    }

    public PrestamoPK getPrestamoPK() {
        return prestamoPK;
    }

    public void setPrestamoPK(PrestamoPK prestamoPK) {
        this.prestamoPK = prestamoPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prestamoPK != null ? prestamoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamo)) {
            return false;
        }
        Prestamo other = (Prestamo) object;
        if ((this.prestamoPK == null && other.prestamoPK != null) || (this.prestamoPK != null && !this.prestamoPK.equals(other.prestamoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Semana7.Prestamo[ prestamoPK=" + prestamoPK + " ]";
    }
    
}
