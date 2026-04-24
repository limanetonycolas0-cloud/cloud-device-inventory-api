package controllers;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dto.DeviceRequestDto;
import models.Device;
import services.DeviceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

	@PostMapping("/create/device")
	public ResponseEntity <Void> createDevice(@RequestBody DeviceRequestDto deviceRequestDto ) {
		var device = deviceService.createNewDevice(
        deviceRequestDto.getName(),
        deviceRequestDto.getDeviceType(),
        deviceRequestDto.getOs(),
        deviceRequestDto.getIp(),
        deviceRequestDto.getStatus()
    );

    return ResponseEntity
            .created(URI.create("/devices/" + device.getId()))
            .build();
	}
	
}
