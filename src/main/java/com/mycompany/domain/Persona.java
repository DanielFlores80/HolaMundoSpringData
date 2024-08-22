/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author grenn
 */
@Data
@Entity
@Table(name="persona")
public class Persona implements Serializable{
    private static final long serialVersionUID=1L;
    
    //Al tener una entidad que requiere ser compatible con los campos de la Base de datos, se agrega un Id
    //para "empatar" los campos y la información sea obtenida correctamente.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_persona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    //Los metodos Setter/Getter no existen, solo son simulados gracias a lombok  @Data
}
