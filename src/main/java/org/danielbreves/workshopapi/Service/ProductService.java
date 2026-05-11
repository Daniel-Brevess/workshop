package org.danielbreves.workshopapi.Service;

import org.danielbreves.workshopapi.entities.Product;
import org.danielbreves.workshopapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> FindAll(){
        return productRepository.findAll();
    }

    public Product FindById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
