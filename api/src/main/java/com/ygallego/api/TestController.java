package com.ygallego.api;

import com.ygallego.api.model.Producto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@RestController
public class TestController {



    @GetMapping("/producto")
    public Producto get(){
        return new Producto(1, "TV", "TV 100 iches", 48014151.00);
    }

    @GetMapping("/productos")
    public List<Producto>getProducts(){
        return getProductos();
    }

    @GetMapping("/productos/{id}")
    public Producto getProduct(@PathVariable Integer id){
        for(Producto p: getProductos()){
                if(p.getId() == id){
                    return p;
                }
        }
        return null;
    }

    @PostMapping("/productos")
    public String recievProduct(@RequestBody Producto producto){
        log.info("Id de producto: {}", producto.getId());
        return "Producto recibido";
    }



    public List<Producto> getProductos(){
        List<Producto> listProductos= new ArrayList<>();

        listProductos.add(new Producto(1, "tv", "Tv 52 inches", 3600000.00));
        listProductos.add(new Producto(2, "Monitor", "Monitor 21 inches", 1800000.00));
        listProductos.add(new Producto(3, "Computer", "Ryzen 9", 4500000.00));
        listProductos.add(new Producto(4, "Desk", "100x120", 220000.00));
        listProductos.add(new Producto(5, "Headphones", "Wireless", 50000.00));

        return listProductos;
    }

}
