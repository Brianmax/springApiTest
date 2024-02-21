package org.example.springapitest.controller;

import org.example.springapitest.document.Producto;
import org.example.springapitest.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @PostMapping("/create")
    public Producto createProducto(@RequestBody Producto producto)
    {
        return productoService.createProducto(producto);
    }
}
