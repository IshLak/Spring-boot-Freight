package com.freightmgmt.freightdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freightmgmt.freightdata.entity.OrdersEntity;
import com.freightmgmt.freightdata.service.OrdersService;

@CrossOrigin("*")
@RestController
public class OrdersController {
	
	@Autowired
	private OrdersService service;
	
	@PostMapping("/saveOrder")
	public OrdersEntity saveOrder(@RequestBody OrdersEntity order) {
		return service.addOrder(order); 
	}
	
	@GetMapping("/getAllOrders")
	public List<OrdersEntity> getAllOrders(){
		return service.getAllOrders();
	}
}
