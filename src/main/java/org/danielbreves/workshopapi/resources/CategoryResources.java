package org.danielbreves.workshopapi.resources;

import org.danielbreves.workshopapi.Service.CategoryService;
import org.danielbreves.workshopapi.Service.UserServices;
import org.danielbreves.workshopapi.entities.Category;
import org.danielbreves.workshopapi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/get")
    public ResponseEntity<List<Category>> findAllUsers() {

        List<Category> list = categoryService.FindAll();

        return ResponseEntity.ok(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj =  categoryService.FindById(id);

        return ResponseEntity.ok().body(obj);
    }

}
