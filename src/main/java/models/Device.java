package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "tb_devices")
@Entity
@Getter
@Setter
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	
	@Column(name = "name", nullable = false, unique = true)
	private String name;
	
	@Column(name = "category", nullable = false)
	private DeviceCategory deviceType;
	
	
	@Column(name = "os")
	private String os;

	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "ip_address", nullable = false, length = 39, unique = true)
	private String ip;
}