package com.informaticonfig.controlhorario.interceptor.control_horario.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {

    @GetMapping("/indice")
    public ResponseEntity<?> Indice(HttpServletRequest request){
        Map<String, Object> datos = new HashMap<>();
        datos.put("titulo", "Sistema de control de acceso");
        datos.put("hora", new Date());
        datos.put("Mensaje", request.getAttribute("mensaje"));
        return ResponseEntity.ok(datos);

    }

}
