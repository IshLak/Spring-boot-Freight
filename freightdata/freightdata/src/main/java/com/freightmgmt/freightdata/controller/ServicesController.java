package com.freightmgmt.freightdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.freightmgmt.freightdata.entity.ServicesEntity;
import com.freightmgmt.freightdata.service.ServicesService;

@CrossOrigin("*")
@RestController
public class ServicesController {

	@Autowired
	private ServicesService service;
	
	@PostMapping("/saveService")
	public ServicesEntity saveService(@RequestBody ServicesEntity serv) {
		return service.saveService(serv);
	}
	
	@GetMapping("/getAllService")
	public List<ServicesEntity> getAllServices(){
		return service.getAllServices();
	}
	
	@GetMapping("/getByLocation")
	public List<ServicesEntity> getBetweenLocations(@RequestParam String source,@RequestParam String destination){
		return service.getBetweenLocations(source, destination);
	}
	
}
