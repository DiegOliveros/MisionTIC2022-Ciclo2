package Semana7;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ITOS
 */
@Embeddable
public class PrestamoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idprestamo")
    private int idprestamo;
    @Basic(optional = false)
    @Column(name = "usuario_idusuario")
    private int usuarioIdusuario;
    @Basic(optional = false)
    @Column(name = "usuario_biblioteca_idbiblioteca")
    private int usuarioBibliotecaIdbiblioteca;
    @Basic(optional = false)
    @Column(name = "libro_idlibro")
    private int libroIdlibro;

    public PrestamoPK() {
    }

    public PrestamoPK(int idprestamo, int usuarioIdusuario, int usuarioBibliotecaIdbiblioteca, int libroIdlibro) {
        this.idprestamo = idprestamo;
        this.usuarioIdusuario = usuarioIdusuario;
        this.usuarioBibliotecaIdbiblioteca = usuarioBibliotecaIdbiblioteca;
        this.libroIdlibro = libroIdlibro;
    }

    public int getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(int idprestamo) {
        this.idprestamo = idprestamo;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public int getUsuarioBibliotecaIdbiblioteca() {
        return usuarioBibliotecaIdbiblioteca;
    }

    public void setUsuarioBibliotecaIdbiblioteca(int usuarioBibliotecaIdbiblioteca) {
        this.usuarioBibliotecaIdbiblioteca = usuarioBibliotecaIdbiblioteca;
    }

    public int getLibroIdlibro() {
        return libroIdlibro;
    }

    public void setLibroIdlibro(int libroIdlibro) {
        this.libroIdlibro = libroIdlibro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idprestamo;
        hash += (int) usuarioIdusuario;
        hash += (int) usuarioBibliotecaIdbiblioteca;
        hash += (int) libroIdlibro;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrestamoPK)) {
            return false;
        }
        PrestamoPK other = (PrestamoPK) object;
        if (this.idprestamo != other.idprestamo) {
            return false;
        }
        if (this.usuarioIdusuario != other.usuarioIdusuario) {
            return false;
        }
        if (this.usuarioBibliotecaIdbiblioteca != other.usuarioBibliotecaIdbiblioteca) {
            return false;
        }
        if (this.libroIdlibro != other.libroIdlibro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Semana7.PrestamoPK[ idprestamo=" + idprestamo + ", usuarioIdusuario=" + usuarioIdusuario + ", usuarioBibliotecaIdbiblioteca=" + usuarioBibliotecaIdbiblioteca + ", libroIdlibro=" + libroIdlibro + " ]";
    }
    
}
