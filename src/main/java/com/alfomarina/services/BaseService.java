/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfomarina.services;

/**
 *
 * @author Admin
 * @param <T>
 */
public interface BaseService<T> {

     T create(T t);
     T getOne(Integer id);
     T update(Integer id);
    
}
