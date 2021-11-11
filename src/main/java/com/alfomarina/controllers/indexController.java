/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.controllers;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */

@RestController()
@RequestMapping("/api")
public class indexController {
    
    @RequestMapping(path="/", method = RequestMethod.GET)
    public HashMap<String,Object> holi(){
        return new HashMap<String, Object>(){{
            
            put("Holi","Crayoli");
            
        }};
    }
    
}
