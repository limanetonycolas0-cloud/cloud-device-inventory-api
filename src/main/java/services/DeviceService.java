package services;

import java.util.List;

import org.springframework.stereotype.Service;

import models.Device;
import repositories.DeviceRepository;

@Service
public class DeviceService {
	
	private final DeviceRepository deviceRepo;
	
	
	
	public DeviceService(DeviceRepository deviceRepo) {
		this.deviceRepo = deviceRepo;
	}
	

	public List <Device> findAll(){
		return deviceRepo.findAll();
	}
	
	public void createDevice(){
		
	}
}
