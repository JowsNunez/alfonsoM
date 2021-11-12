/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.services;

import com.alfomarina.models.TeamMade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.alfomarina.repositories.TeamMadeRepository;

/**
 *
 * @author Admin
 */
@Component
public class TeamMadeService implements ITeamMadeService {

    // Accede a los metodos por defecto de JPA para manipular tabla TeamMade
    @Autowired
    private TeamMadeRepository repositorio;
    
    @Override
    public TeamMade create(TeamMade teamMade) {
        return repositorio.save(teamMade);
    }

    @Override
    public TeamMade getOne(Integer id) {
        return this.repositorio.findUsersByAge(id);
    }

    @Override
    public TeamMade update(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   

   
    
}
