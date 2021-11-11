/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.repositories;

import org.springframework.stereotype.Repository;
import com.alfomarina.models.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Admin
 */

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador,Long> {
    
}
