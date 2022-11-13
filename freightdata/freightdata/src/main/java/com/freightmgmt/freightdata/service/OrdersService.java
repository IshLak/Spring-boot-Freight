package com.freightmgmt.freightdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freightmgmt.freightdata.entity.OrdersEntity;
import com.freightmgmt.freightdata.repository.OrdersRepository;

@Service
public class OrdersService {
	
	@Autowired
	private OrdersRepository repository;
	
	public OrdersEntity addOrder(OrdersEntity order) {
		return repository.save(order);
	}

	public List<OrdersEntity> getAllOrders(){
		return repository.findAll();
	}
}
