package dto;

public record DeviceDto(

    Long id,
    String name,
    String deviceType,
    String os,
    String ip,
    String status
){}