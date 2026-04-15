package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import services.DeviceService;

@RestController
@RequestMapping("/api/create")
@RequiredArgsConstructor
public class DeviceController {
	
	
	private final DeviceService deviceService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List <Device> findAll(){
		return deviceService.fin
	}

}
