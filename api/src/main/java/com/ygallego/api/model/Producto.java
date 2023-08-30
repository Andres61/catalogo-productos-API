package com.ygallego.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producto {

    private Integer id;
    private String name;
    private String description;
    private Double price;
}
