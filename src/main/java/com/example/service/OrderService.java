package com.example.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.OrderDTO;
import com.example.model.Order;
import com.example.repository.OrderRepository;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ModelMapper modelMapper;

    // Convert Order to OrderDTO
    public OrderDTO convertToDTO(Order order) {
        return modelMapper.map(order, OrderDTO.class);
    }

    // Save an Order to the database
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    // Find an Order by ID
    public Order findById(Long id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.orElse(null); 
    }
}
