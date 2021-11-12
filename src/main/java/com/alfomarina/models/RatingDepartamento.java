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
@Table(name = "RatingDepartamento")

public class RatingDepartamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRatingDepartamento")
    private Integer idRatingDepartamento;
    @JoinColumn(name = "to", referencedColumnName = "idDepartamento")
    @ManyToOne
    private Departamento to;
    @JoinColumn(name = "idRating", referencedColumnName = "idRating")
    @ManyToOne
    private Rating idRating;
    @JoinColumn(name = "from1", referencedColumnName = "idTeamMade")
    @ManyToOne
    private TeamMade from;

    public RatingDepartamento() {
    }

    public RatingDepartamento(Integer idRatingDepartamento) {
        this.idRatingDepartamento = idRatingDepartamento;
    }

    public Integer getIdRatingDepartamento() {
        return idRatingDepartamento;
    }

    public void setIdRatingDepartamento(Integer idRatingDepartamento) {
        this.idRatingDepartamento = idRatingDepartamento;
    }

    public Departamento getTo() {
        return to;
    }

    public void setTo(Departamento to) {
        this.to = to;
    }

    public Rating getIdRating() {
        return idRating;
    }

    public void setIdRating(Rating idRating) {
        this.idRating = idRating;
    }

    public TeamMade getFrom() {
        return from;
    }

    public void setFrom1(TeamMade from1) {
        this.from = from1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRatingDepartamento != null ? idRatingDepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RatingDepartamento)) {
            return false;
        }
        RatingDepartamento other = (RatingDepartamento) object;
        if ((this.idRatingDepartamento == null && other.idRatingDepartamento != null) || (this.idRatingDepartamento != null && !this.idRatingDepartamento.equals(other.idRatingDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.RatingDepartamento[ idRatingDepartamento=" + idRatingDepartamento + " ]";
    }
    
}
