package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import models.Device;
import services.DeviceService;

@RestController
@RequestMapping("/devices")
@RequiredArgsConstructor
public class DeviceController {
	
	
	private final DeviceService deviceService;
	
	public 

}
