package pl.pollub.fit4fit.mapper;

import pl.pollub.fit4fit.dto.UserDto;
import pl.pollub.fit4fit.entity.UserEntity;

public class UserMapper {

    public UserEntity mapToEntity(UserDto dto){
        UserEntity entity = new UserEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setSurname(dto.getSurname());
        entity.setEmail(dto.getEmail());
        entity.setDateOfBirth(dto.getDateOfBirth());
        return entity;
    }

    public UserDto mapToDto(UserEntity entity){
        UserDto dto = new UserDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSurname(entity.getSurname());
        dto.setEmail(entity.getEmail());
        dto.setDateOfBirth(entity.getDateOfBirth());
        return dto;
    }
}
