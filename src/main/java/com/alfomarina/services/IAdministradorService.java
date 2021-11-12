/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.services;

import com.alfomarina.models.Administrador;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Admin
 */
@Service
public interface IAdministradorService<T> extends BaseService<Administrador>{
   void eliminarTeamMade(Integer id);
   
}
