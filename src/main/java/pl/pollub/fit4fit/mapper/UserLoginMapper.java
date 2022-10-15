package pl.pollub.fit4fit.mapper;

import pl.pollub.fit4fit.dto.UserLoginDto;
import pl.pollub.fit4fit.entity.UserLoginEntity;

import java.time.LocalDateTime;

public class UserLoginMapper {

    public UserLoginEntity mapToEntity(UserLoginDto dto) {
        UserLoginEntity entity = new UserLoginEntity();
        entity.setId(dto.getId());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setNickName(dto.getNickName());
        entity.setCreationDate(setCreationDate());
        return entity;
    }

    public UserLoginDto mapToDto(UserLoginEntity entity){
        return UserLoginDto.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .nickName(entity.getNickName())
                .creationDate(entity.getCreationDate())
                .build();
    }
    private LocalDateTime setCreationDate(){
        return LocalDateTime.now();
    }

}
