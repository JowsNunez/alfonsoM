/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.repositories;
import com.alfomarina.models.TeamMade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Admin
 */
        
// REPOOOOOOO
@Repository
public interface TeamMadeRepository extends JpaRepository<TeamMade, Integer> {
    
    @Query("select u from TeamMade u where u.idTeamMade = ?#{[0]}")
    TeamMade findUsersByAge(Integer idTeamMade);
    
}
