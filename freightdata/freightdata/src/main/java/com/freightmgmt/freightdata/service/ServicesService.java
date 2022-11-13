package com.freightmgmt.freightdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.freightmgmt.freightdata.entity.ServicesEntity;
import com.freightmgmt.freightdata.repository.ServicesRepository;

@Service
public class ServicesService {

	@Autowired
	private ServicesRepository repository;
	
	public ServicesEntity saveService(ServicesEntity serv) {
		return repository.save(serv);
	}
	
	public List<ServicesEntity> getAllServices(){
		return repository.findAll();
	}
	
	public List<ServicesEntity> getBetweenLocations(String source, String destination){
		return repository.findByLocations(source, destination);
	}
}
