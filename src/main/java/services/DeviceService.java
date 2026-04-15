package services;

import java.util.List;

import org.springframework.stereotype.Service;

import repositories.DeviceRepository;

@Service
public class DeviceService {
	
	private final DeviceRepository deviceRepo;
	
	
	
	public DeviceService(DeviceRepository deviceRepo) {
		
		this.deviceRepo = deviceRepo;
	}
	
	
	public List <DeviceRepository> listDevices{
		return deviceRepo.findAll();
	}
	

}
