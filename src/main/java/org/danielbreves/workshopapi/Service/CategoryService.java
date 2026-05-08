package org.danielbreves.workshopapi.Service;

import org.danielbreves.workshopapi.entities.Category;
import org.danielbreves.workshopapi.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> FindAll(){
        return categoryRepository.findAll();
    }

    public Category FindById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }

}
