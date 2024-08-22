/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.web;

import com.mycompany.dao.PersonaDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author grenn
 */
@Controller
@Slf4j
public class ControladorInicio {

    //Declarar la instancia de un objeto PersonaDAO
    @Autowired//Injectar un valor a la instancia que llama un Crud Repository
    private PersonaDAO personaDao;
    
    
    //Metodo que mapea la ruta raiz "/" y ejecuta el archivo Vista index.html
    @GetMapping("/")
    public String inicio(Model model){
        //Consulta la base de datos para traer a todos los registros de la tabla persona
        var personasLista = personaDao.findAll();//El metodo findAll() devuelve un objeto "Iterable"
        //model.addAttribute("persona", persona);
        model.addAttribute("personasLista", personasLista);
        return "index";
    }
}