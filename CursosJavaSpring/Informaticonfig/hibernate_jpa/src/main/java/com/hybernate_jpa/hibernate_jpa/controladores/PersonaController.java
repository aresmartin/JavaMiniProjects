package com.hybernate_jpa.hibernate_jpa.controladores;


import com.hybernate_jpa.hibernate_jpa.entidades.Persona;
import com.hybernate_jpa.hibernate_jpa.repositorios.Repo_Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @Autowired
    private Repo_Persona repositorio;

    @GetMapping
    public List<Persona> Consulta(){
        return (List<Persona>) repositorio.findAll();
    }


}
