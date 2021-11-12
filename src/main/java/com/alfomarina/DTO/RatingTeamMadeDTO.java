/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.DTO;

/**
 *
 * @author Admin
 */


public class RatingTeamMadeDTO {
    private Integer from;
    private Integer to;
    private Integer idRating;

    public RatingTeamMadeDTO() {
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public Integer getIdRating() {
        return idRating;
    }

    public void setIdRating(Integer idRating) {
        this.idRating = idRating;
    }

    @Override
    public String toString() {
        return "RatingTeamMadeDTO{" + "from=" + from + ", to=" + to + ", idRating=" + idRating + '}';
    }
    
}
