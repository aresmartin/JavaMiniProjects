package com.informaticonfig.id.aplicacion2.springboot_id.repositorios;

import com.informaticonfig.id.aplicacion2.springboot_id.models.Productos;

import java.util.List;

public interface ProductoRepositorio {

    List<Productos> findAll();
    Productos buscaId(Long idProducto);
}
