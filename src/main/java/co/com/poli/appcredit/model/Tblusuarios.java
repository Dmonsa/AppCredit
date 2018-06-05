/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcredit.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dmons
 */
@Entity
@Table(name = "tblusuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblusuarios.findAll", query = "SELECT t FROM Tblusuarios t")
    , @NamedQuery(name = "Tblusuarios.findByCredito", query = "SELECT t FROM Tblusuarios t WHERE t.credito = :credito")
    , @NamedQuery(name = "Tblusuarios.findByDocumento", query = "SELECT t FROM Tblusuarios t WHERE t.documento = :documento")
    , @NamedQuery(name = "Tblusuarios.findByNombres", query = "SELECT t FROM Tblusuarios t WHERE t.nombres = :nombres")
    , @NamedQuery(name = "Tblusuarios.findByApellidos", query = "SELECT t FROM Tblusuarios t WHERE t.apellidos = :apellidos")
    , @NamedQuery(name = "Tblusuarios.findByMonto", query = "SELECT t FROM Tblusuarios t WHERE t.monto = :monto")
    , @NamedQuery(name = "Tblusuarios.findByTipotrabajador", query = "SELECT t FROM Tblusuarios t WHERE t.tipotrabajador = :tipotrabajador")
    , @NamedQuery(name = "Tblusuarios.findByTipocredito", query = "SELECT t FROM Tblusuarios t WHERE t.tipocredito = :tipocredito")
    , @NamedQuery(name = "Tblusuarios.findByTipocomp", query = "SELECT t FROM Tblusuarios t WHERE t.tipocomp = :tipocomp")})
public class Tblusuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "credito")
    private String credito;
    @Size(max = 2147483647)
    @Column(name = "documento")
    private String documento;
    @Size(max = 2147483647)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 2147483647)
    @Column(name = "apellidos")
    private String apellidos;
    @Size(max = 2147483647)
    @Column(name = "monto")
    private String monto;
    @Size(max = 2147483647)
    @Column(name = "tipotrabajador")
    private String tipotrabajador;
    @Size(max = 2147483647)
    @Column(name = "tipocredito")
    private String tipocredito;
    @Size(max = 2147483647)
    @Column(name = "tipocomp")
    private String tipocomp;

    public Tblusuarios() {
    }

    public Tblusuarios(String credito) {
        this.credito = credito;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getTipotrabajador() {
        return tipotrabajador;
    }

    public void setTipotrabajador(String tipotrabajador) {
        this.tipotrabajador = tipotrabajador;
    }

    public String getTipocredito() {
        return tipocredito;
    }

    public void setTipocredito(String tipocredito) {
        this.tipocredito = tipocredito;
    }

    public String getTipocomp() {
        return tipocomp;
    }

    public void setTipocomp(String tipocomp) {
        this.tipocomp = tipocomp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (credito != null ? credito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblusuarios)) {
            return false;
        }
        Tblusuarios other = (Tblusuarios) object;
        if ((this.credito == null && other.credito != null) || (this.credito != null && !this.credito.equals(other.credito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.poli.appcredit.model.Tblusuarios[ credito=" + credito + " ]";
    }
    
}
