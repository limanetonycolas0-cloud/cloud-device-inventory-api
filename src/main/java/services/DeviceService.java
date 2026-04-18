package services;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException.NotFound;

import dto.DeviceDto;
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
	
	public Device createNewDevice(DeviceDto deviceDto) {
		Device newDevice = new Device();
		newDevice.setName(deviceDto.getName());
		newDevice.setDeviceType(deviceDto.getDeviceType());
		newDevice.setOs(deviceDto.getOs());
		
		return deviceRepo.save(newDevice);
		
	}
	
	
	
	public void ensureDeviceIsUnique(DeviceRepository deviceRepo, Device device){
		try{
			deviceRepo.save(device);
		}
		catch(RuntimeException e){
			throw new RuntimeException("You cannot register the same device twice");
		}
	}
	


	public void deleteById(Long id){
		if(!deviceRepo.existsById(id)){
			throw new RuntimeException("Id not found!");	
		}
	}
	

}
