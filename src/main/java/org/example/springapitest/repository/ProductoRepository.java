package org.example.springapitest.repository;

import org.example.springapitest.document.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.sound.sampled.Port;

public interface ProductoRepository extends MongoRepository<Producto, String> {
}
