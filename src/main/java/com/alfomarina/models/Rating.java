/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.models;

import com.alfomarina.helpers.Estrella;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "Rating")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rating.findAll", query = "SELECT r FROM Rating r")})
public class Rating implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRating")
    private Integer idRating;
    @Column(name = "estrellas")
    @Enumerated(value =EnumType.STRING)
    private Estrella estrellas;
    @Column(name = "comment")
    private String comment;
//    @OneToMany(mappedBy = "idRating")
//    private List<RatingTeamMade> ratingTeamMadeList;

    public Rating() {
    }

    public Rating(Integer idRating) {
        this.idRating = idRating;
    }

    public Integer getIdRating() {
        return idRating;
    }

    public void setIdRating(Integer idRating) {
        this.idRating = idRating;
    }

    public Estrella getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Estrella estrellas) {
        this.estrellas = estrellas;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
//
//    @XmlTransient
//    public List<RatingTeamMade> getRatingTeamMadeList() {
//        return ratingTeamMadeList;
//    }
//
//    public void setRatingTeamMadeList(List<RatingTeamMade> ratingTeamMadeList) {
//        this.ratingTeamMadeList = ratingTeamMadeList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRating != null ? idRating.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rating)) {
            return false;
        }
        Rating other = (Rating) object;
        if ((this.idRating == null && other.idRating != null) || (this.idRating != null && !this.idRating.equals(other.idRating))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Rating[ idRating=" + idRating + " ]";
    }
    
}


