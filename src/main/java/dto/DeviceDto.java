package dto;

import jakarta.validation.constraints.NotBlank;



public class DeviceDto{

	
	@NotBlank
    private String name;
    
	@NotBlank
    private String deviceType;
    
    private String os;
    
    @NotBlank
    private String ip;
    
    @NotBlank
    private String status;
    
    
    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}

    