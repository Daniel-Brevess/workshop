package org.danielbreves.workshopapi.resources;

import org.danielbreves.workshopapi.Service.ProductService;
import org.danielbreves.workshopapi.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/get")
    public ResponseEntity<List<Product>> findAllUsers() {

        List<Product> list = productService.FindAll();

        return ResponseEntity.ok(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj =  productService.FindById(id);

        return ResponseEntity.ok().body(obj);
    }

}
