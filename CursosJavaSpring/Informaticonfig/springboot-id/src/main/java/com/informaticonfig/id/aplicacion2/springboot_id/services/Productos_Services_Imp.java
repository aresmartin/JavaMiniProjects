package com.informaticonfig.id.aplicacion2.springboot_id.services;

import com.informaticonfig.id.aplicacion2.springboot_id.models.Productos;
import com.informaticonfig.id.aplicacion2.springboot_id.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Productos_Services_Imp implements ProductoServicios {

    @Autowired
    private ProductoRepositorio repositorio;

    @Override
    public List<Productos> findAll(){

        return repositorio.findAll().stream().map(p -> {
            Double precioTotal = p.getPrecio() * 1.50d;
            Productos newpProductos = p.clone();
            newpProductos.setPrecio(precioTotal.intValue());
            return newpProductos;
        }).collect(Collectors.toList());
    }

    @Override
    public Productos buscaId(Long idProducto){

        return repositorio.buscaId(idProducto);
    }
}
