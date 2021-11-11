/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.services;

import com.alfomarina.models.Administrador;
import com.alfomarina.models.TeamMade;
import com.alfomarina.repositories.AdministradorRepository;
import com.alfomarina.repositories.TeamMadeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class ImplAdministradorService implements AdministradorService<Object>,BaseService<Administrador>{
    
    // Accede a los metodos por defecto de JPA para manipular tabla Administrador
    @Autowired
    
    private AdministradorRepository repositorio;
    // Accede a los metodos por defecto de JPA para manipular tabla TeamMade
    
    @Autowired
    private TeamMadeRepository teamMadeRepository;
    
    @Override
    public Administrador create(Administrador administrador) {
        return this.repositorio.save(administrador);
    }

    @Override
    public Administrador getOne(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Administrador> getAll() {
        return this.repositorio.findAll();
                
    }
    
     public List<TeamMade> getAllTeamMade() {
        return this.teamMadeRepository.findAll();
                
    }

    @Override
    public Administrador update(Long  id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarTeamMade(Long id) {
        this.teamMadeRepository.deleteById(id);
        //To change body of generated methods, choose Tools | Templates.
    }

   
    

    
}
