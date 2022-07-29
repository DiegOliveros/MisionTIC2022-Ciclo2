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
public class UsuarioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "biblioteca_idbiblioteca")
    private int bibliotecaIdbiblioteca;

    public UsuarioPK() {
    }

    public UsuarioPK(int idusuario, int bibliotecaIdbiblioteca) {
        this.idusuario = idusuario;
        this.bibliotecaIdbiblioteca = bibliotecaIdbiblioteca;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getBibliotecaIdbiblioteca() {
        return bibliotecaIdbiblioteca;
    }

    public void setBibliotecaIdbiblioteca(int bibliotecaIdbiblioteca) {
        this.bibliotecaIdbiblioteca = bibliotecaIdbiblioteca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idusuario;
        hash += (int) bibliotecaIdbiblioteca;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if (this.idusuario != other.idusuario) {
            return false;
        }
        if (this.bibliotecaIdbiblioteca != other.bibliotecaIdbiblioteca) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Semana7.UsuarioPK[ idusuario=" + idusuario + ", bibliotecaIdbiblioteca=" + bibliotecaIdbiblioteca + " ]";
    }
    
}
