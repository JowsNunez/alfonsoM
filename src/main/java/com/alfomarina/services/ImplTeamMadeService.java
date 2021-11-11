/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.services;

import com.alfomarina.models.TeamMade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alfomarina.repositories.TeamMadeRepository;

/**
 *
 * @author Admin
 */
@Service
public class ImplTeamMadeService implements TeamMadeService,BaseService<TeamMade>{

    // Accede a los metodos por defecto de JPA para manipular tabla TeamMade
    @Autowired
    private TeamMadeRepository repositorio;
    
    @Override
    public TeamMade create(TeamMade teamMade) {
        return repositorio.save(teamMade);
      
    }

    @Override
    public TeamMade getOne(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TeamMade update(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   

   
    
}
