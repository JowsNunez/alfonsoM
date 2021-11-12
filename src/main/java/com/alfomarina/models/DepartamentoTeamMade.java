/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "DepartamentoTeamMade")
public class DepartamentoTeamMade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDepartamentoTeamMade")
    private Integer idDepartamentoTeamMade;
    @JoinColumn(name = "idDepartamento", referencedColumnName = "idDepartamento")
    @ManyToOne
    private Departamento idDepartamento;
    @JoinColumn(name = "idTeamMade", referencedColumnName = "idTeamMade")
    @ManyToOne
    private TeamMade idTeamMade;

    public DepartamentoTeamMade() {
    }

    public DepartamentoTeamMade(Integer idDepartamentoTeamMade) {
        this.idDepartamentoTeamMade = idDepartamentoTeamMade;
    }

    public Integer getIdDepartamentoTeamMade() {
        return idDepartamentoTeamMade;
    }

    public void setIdDepartamentoTeamMade(Integer idDepartamentoTeamMade) {
        this.idDepartamentoTeamMade = idDepartamentoTeamMade;
    }

    public Departamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public TeamMade getIdTeamMade() {
        return idTeamMade;
    }

    public void setIdTeamMade(TeamMade idTeamMade) {
        this.idTeamMade = idTeamMade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepartamentoTeamMade != null ? idDepartamentoTeamMade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartamentoTeamMade)) {
            return false;
        }
        DepartamentoTeamMade other = (DepartamentoTeamMade) object;
        if ((this.idDepartamentoTeamMade == null && other.idDepartamentoTeamMade != null) || (this.idDepartamentoTeamMade != null && !this.idDepartamentoTeamMade.equals(other.idDepartamentoTeamMade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.DepartamentoTeamMade[ idDepartamentoTeamMade=" + idDepartamentoTeamMade + " ]";
    }
    
}
