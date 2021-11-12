/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.repositories;

import com.alfomarina.models.Rating;
import com.alfomarina.models.TeamMade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Admin
 */
@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {

     @Query(nativeQuery = true,value = "select * from Rating u where u.idRating = :identity")
     Rating findRatingBya(@Param("identity") Integer idRating);

}
