package com.informaticonfig.id.aplicacion2.springboot_id.services;

import com.informaticonfig.id.aplicacion2.springboot_id.models.Productos;

import java.util.List;

public interface ProductoServicios {
    List<Productos> findAll();
    Productos buscaId(Long idProducto);
}
