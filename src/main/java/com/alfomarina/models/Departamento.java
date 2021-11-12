/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "Departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d")})
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDepartamento")
    private Integer idDepartamento;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "area")
    private String area;
    @OneToMany(mappedBy = "to")
    private List<RatingDepartamento> ratingDepartamentoList;
    @OneToMany(mappedBy = "idDepartamento")
    private List<DepartamentoTeamMade> departamentoTeamMadeList;

    public Departamento() {
    }

    public Departamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @XmlTransient
    public List<RatingDepartamento> getRatingDepartamentoList() {
        return ratingDepartamentoList;
    }

    public void setRatingDepartamentoList(List<RatingDepartamento> ratingDepartamentoList) {
        this.ratingDepartamentoList = ratingDepartamentoList;
    }

    @XmlTransient
    public List<DepartamentoTeamMade> getDepartamentoTeamMadeList() {
        return departamentoTeamMadeList;
    }

    public void setDepartamentoTeamMadeList(List<DepartamentoTeamMade> departamentoTeamMadeList) {
        this.departamentoTeamMadeList = departamentoTeamMadeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepartamento != null ? idDepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.idDepartamento == null && other.idDepartamento != null) || (this.idDepartamento != null && !this.idDepartamento.equals(other.idDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Departamento[ idDepartamento=" + idDepartamento + " ]";
    }
    
}
