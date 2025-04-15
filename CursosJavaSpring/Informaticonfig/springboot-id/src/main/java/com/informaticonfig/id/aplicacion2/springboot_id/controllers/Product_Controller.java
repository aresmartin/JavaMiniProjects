package com.informaticonfig.id.aplicacion2.springboot_id.controllers;

import com.informaticonfig.id.aplicacion2.springboot_id.models.Productos;
import com.informaticonfig.id.aplicacion2.springboot_id.services.ProductoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class Product_Controller {

    @Autowired
    private ProductoServicios servicio;

    @GetMapping()
    public List<Productos> listaProductos(){
        return servicio.findAll();
    }

    @GetMapping("/{idProducto}")
    public Productos mostrar(@PathVariable Long idProducto){

        return servicio.buscaId(idProducto);

    }

}
