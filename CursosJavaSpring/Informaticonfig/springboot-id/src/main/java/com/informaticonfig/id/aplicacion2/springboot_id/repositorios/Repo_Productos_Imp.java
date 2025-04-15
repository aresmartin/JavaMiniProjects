package com.informaticonfig.id.aplicacion2.springboot_id.repositorios;

import com.informaticonfig.id.aplicacion2.springboot_id.models.Productos;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class Repo_Productos_Imp implements ProductoRepositorio {

    List<Productos> datos;

    public Repo_Productos_Imp(){
        this.datos = Arrays.asList(
                new Productos(001L, "Disco Duro 1TB", 500),
                new Productos(002L, "Memoria USB 20GB", 150),
                new Productos(003L, "Raton Logitech", 50),
                new Productos(004L, "Monitor AOC 20plgs", 1200)
        );
    }

    @Override
    public List<Productos> findAll(){
        return datos;
    }

    @Override
    public Productos buscaId(Long idProducto){
        return datos.stream()
                .filter(p-> p.getIdProducto()
                        .equals(idProducto))
                .findFirst().orElseThrow();
    }
}
