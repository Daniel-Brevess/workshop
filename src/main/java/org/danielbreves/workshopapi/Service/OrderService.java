package org.danielbreves.workshopapi.Service;

import org.danielbreves.workshopapi.entities.Order;
import org.danielbreves.workshopapi.entities.User;
import org.danielbreves.workshopapi.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {



    @Autowired
    private OrderRepository orderRepository;

    public List<Order> FindAll(){
        return orderRepository.findAll();
    }

    public Order FindById(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }

}
