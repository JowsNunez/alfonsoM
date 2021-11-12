/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.controllers;

import com.alfomarina.DTO.RatingTeamMadeDTO;

import java.util.HashMap;

import com.alfomarina.services.IRatingTeamMadeService;
import com.alfomarina.services.ITeamMadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.alfomarina.models.TeamMade;
import com.alfomarina.services.TeamMadeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/api/teamMade")
public class TeamMadeController {
    
    @Autowired
    private ITeamMadeService service;


    
    @RequestMapping(path="/create", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity create(@Validated @RequestBody TeamMade usuario){
        
        TeamMade aux = service.create(usuario);
        return  ResponseEntity.ok().body( new HashMap<String, Object>(){{
            put("msg","Success");
            put("teamMate",aux);
        }});
    }
    
     @RequestMapping(path="/getOne/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity create(@PathVariable Integer id){
         System.out.println(id);
        TeamMade aux = service.getOne(id);
        
        return  ResponseEntity.ok().body( new HashMap<String, Object>(){{
            put("msg","Success");
            put("teamMate",aux);
            
        }});
    }
    





    
    
    
}
