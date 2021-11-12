package com.alfomarina.controllers;

import com.alfomarina.DTO.RatingTeamMadeDTO;
import com.alfomarina.services.IRatingTeamMadeService;
import com.alfomarina.services.ITeamMadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@RequestMapping("/api/rating")
public class RatingTeamMadeController {

    @Autowired
    private ITeamMadeService service;

    @Autowired
    private IRatingTeamMadeService RatingService;

    @RequestMapping(path="/createStart", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity start(@RequestParam Integer idRating, @RequestParam Integer from, @RequestParam Integer to){

        RatingTeamMadeDTO d = this.RatingService.createRating(idRating,from,to);

        if (d !=null) return ResponseEntity.ok().body( new HashMap<String, Object>(){{
            put("status","Success");
            put("teamMate",d);

        }});

        return  ResponseEntity.status(404).body( new HashMap<String, Object>(){{
            put("status","Error");
        }});



    }
}
