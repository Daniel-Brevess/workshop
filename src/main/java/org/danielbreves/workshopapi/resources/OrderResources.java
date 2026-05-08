package org.danielbreves.workshopapi.resources;

import org.danielbreves.workshopapi.Service.OrderService;
import org.danielbreves.workshopapi.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/get")
    public ResponseEntity<List<Order>> findAllUsers() {

        List<Order> list = orderService.FindAll();

        return ResponseEntity.ok(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj =  orderService.FindById(id);

        return ResponseEntity.ok().body(obj);
    }

}
