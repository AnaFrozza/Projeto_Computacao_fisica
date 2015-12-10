/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Ana
 */
@Entity
@Table(name = "notas")
@NamedQueries({
    @NamedQuery(name = "Notas.findAll", query = "SELECT n FROM Notas n")})
public class Notas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnotas")
    private Integer idnotas;
    @Column(name = "notascol")
    private String notascol;

    public Notas() {
    }

    public Notas(Integer idnotas) {
        this.idnotas = idnotas;
    }

    public Integer getIdnotas() {
        return idnotas;
    }

    public void setIdnotas(Integer idnotas) {
        this.idnotas = idnotas;
    }

    public String getNotascol() {
        return notascol;
    }

    public void setNotascol(String notascol) {
        this.notascol = notascol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnotas != null ? idnotas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notas)) {
            return false;
        }
        Notas other = (Notas) object;
        if ((this.idnotas == null && other.idnotas != null) || (this.idnotas != null && !this.idnotas.equals(other.idnotas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Main.Notas[ idnotas=" + idnotas + " ]";
    }
    
}
