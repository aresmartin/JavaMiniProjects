package com.interceptores.interceptores_id.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Saludo {

    @GetMapping("/saludo")
    public String Saludar() throws InterruptedException{
        Thread.sleep(4000);
        return "Saludos a todos";
    }

}
