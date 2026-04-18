package controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import models.Device;
import services.DeviceService;

@RestController
@RequestMapping("/devices")
public class DeviceController {
	
	
	private final DeviceService deviceService;
	
	public DeviceController(DeviceService deviceService) {
		this.deviceService = deviceService;
	}


	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List <Device> findAll(){
		return deviceService.findAll();
	}
	
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity <Void> delete(@PathVariable Long id){
		deviceService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
