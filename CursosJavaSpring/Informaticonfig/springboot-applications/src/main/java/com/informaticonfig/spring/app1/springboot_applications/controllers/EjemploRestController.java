package com.informaticonfig.spring.app1.springboot_applications.controllers;

import com.informaticonfig.spring.app1.springboot_applications.models.Empleados;
import com.informaticonfig.spring.app1.springboot_applications.models.dto.ClaseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")

public class EjemploRestController {

    @GetMapping("/detalles_info2")
    public ClaseDTO detalles_info2(){
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Incormaticonfig");

        return usuario1;
    }
}
