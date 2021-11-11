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
    public T create(T t);
    public T getOne(Long id);
   
    public T update(Long id);
    
}
