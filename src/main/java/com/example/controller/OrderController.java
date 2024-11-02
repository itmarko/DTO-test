package com.example.controller;

import com.example.DTO.OrderDTO;
import com.example.model.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping
	public ResponseEntity<OrderDTO> createOrder( @RequestBody Order order) {
		Order savedOrder = orderService.saveOrder(order);
		OrderDTO orderDTO = orderService.convertToDTO(savedOrder);
		return new ResponseEntity<>(orderDTO, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<OrderDTO> getOrderById(@PathVariable Long id) {
		Order order = orderService.findById(id);
		if (order == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		OrderDTO orderDTO = orderService.convertToDTO(order);
		return new ResponseEntity<>(orderDTO, HttpStatus.OK);
	}
}
