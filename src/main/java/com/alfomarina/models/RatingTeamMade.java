/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.models;

import java.io.Serializable;
import java.util.GregorianCalendar;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "RatingTeamMade")

public class RatingTeamMade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRatingTeamMade")
    private Integer idRatingTeamMade;
    @JoinColumn(name = "idRating")
    @ManyToOne
    private Rating idRating;
    @JoinColumn(name = "fromTeamMade")
    @ManyToOne
    private TeamMade fromTeamMade;
    @JoinColumn(name = "toTeamMade")
    @ManyToOne
    private TeamMade toTeamMade;
    @Column(name="create_at")
    private Timestamp create_at;

    public Timestamp getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }

    public TeamMade getFromTeamMade() {
        return fromTeamMade;
    }

    public void setFromTeamMade(TeamMade fromTeamMade) {
        this.fromTeamMade = fromTeamMade;
    }

    public RatingTeamMade() {
    }

    public RatingTeamMade(Integer idRatingTeamMade) {
        this.idRatingTeamMade = idRatingTeamMade;
    }

    public Integer getIdRatingTeamMade() {
        return idRatingTeamMade;
    }

    public void setIdRatingTeamMade(Integer idRatingTeamMade) {
        this.idRatingTeamMade = idRatingTeamMade;
    }

    public Rating getIdRating() {
        return idRating;
    }

    public void setIdRating(Rating idRating) {
        this.idRating = idRating;
    }

    public TeamMade getFrom1() {
        return fromTeamMade;
    }

    public void setFrom1(TeamMade from1) {
        this.fromTeamMade = from1;
    }

    public TeamMade getTo() {
        return toTeamMade;
    }

    public void setTo(TeamMade to) {
        this.toTeamMade = to;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRatingTeamMade != null ? idRatingTeamMade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RatingTeamMade)) {
            return false;
        }
        RatingTeamMade other = (RatingTeamMade) object;
        if ((this.idRatingTeamMade == null && other.idRatingTeamMade != null) || (this.idRatingTeamMade != null && !this.idRatingTeamMade.equals(other.idRatingTeamMade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.RatingTeamMade[ idRatingTeamMade=" + idRatingTeamMade + " ]";
    }
    
}
