package org.example.springapitest.service;

import org.example.springapitest.document.Producto;
import org.example.springapitest.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto createProducto(Producto producto)
    {
        return productoRepository.save(producto);
    }
}
