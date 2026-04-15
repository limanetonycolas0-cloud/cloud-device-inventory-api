package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Device;

public interface DeviceRepository extends JpaRepository <Device, Long> {
	
	

}
