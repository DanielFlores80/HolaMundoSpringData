/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author grenn
 */
//Clase Data Access Object que permite las operaciones consultar, eliminar, actualizar, etc. en SQL
public interface PersonaDAO extends CrudRepository<Persona, Long>{
    
}
