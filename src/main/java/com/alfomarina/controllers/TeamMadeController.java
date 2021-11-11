/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.controllers;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.alfomarina.models.TeamMade;
import com.alfomarina.services.ImplTeamMadeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/api/teamMade")
public class TeamMadeController {
    
    @Autowired
    private ImplTeamMadeService service;
    
    @RequestMapping(path="/create", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity create(@Validated @RequestBody TeamMade usuario){
        
        TeamMade aux = service.create(usuario);
        
        return  ResponseEntity.ok().body( new HashMap<String, Object>(){{
            put("msg","Success");
            put("teamMate",aux);
            
        }});
    }
    
    
    
}
