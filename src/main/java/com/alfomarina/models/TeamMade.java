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
@Table(name = "TeamMade")
public class TeamMade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTeamMade")
    private Integer idTeamMade;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "contrasena")
    private String contrasena;


    public TeamMade() {
    }

    public TeamMade(Integer idTeamMade) {
        this.idTeamMade = idTeamMade;
    }

    public Integer getIdTeamMade() {
        return idTeamMade;
    }

    public void setIdTeamMade(Integer idTeamMade) {
        this.idTeamMade = idTeamMade;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

//    @XmlTransient
//    public List<RatingTeamMade> getRatingTeamMadeList() {
//        return ratingTeamMadeList;
//    }
//
//    public void setRatingTeamMadeList(List<RatingTeamMade> ratingTeamMadeList) {
//        this.ratingTeamMadeList = ratingTeamMadeList;
//    }
//
//    @XmlTransient
//    public List<RatingTeamMade> getRatingTeamMadeList1() {
//        return ratingTeamMadeList1;
//    }
//
//    public void setRatingTeamMadeList1(List<RatingTeamMade> ratingTeamMadeList1) {
//        this.ratingTeamMadeList1 = ratingTeamMadeList1;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTeamMade != null ? idTeamMade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeamMade)) {
            return false;
        }
        TeamMade other = (TeamMade) object;
        if ((this.idTeamMade == null && other.idTeamMade != null) || (this.idTeamMade != null && !this.idTeamMade.equals(other.idTeamMade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TeamMade{" + "idTeamMade=" + idTeamMade + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", contrasena=" + contrasena ;
    }

    
}
