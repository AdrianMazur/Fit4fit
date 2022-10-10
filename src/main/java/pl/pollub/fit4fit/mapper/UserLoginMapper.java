package pl.pollub.fit4fit.mapper;

import pl.pollub.fit4fit.dto.UserLoginDto;
import pl.pollub.fit4fit.entity.UserLoginEntity;

public class UserLoginMapper {

    public UserLoginEntity mapToEntity(UserLoginDto dto) {
        UserLoginEntity entity = new UserLoginEntity();
        entity.setId(dto.getId());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setNickName(dto.getNickName());
        return entity;
    }

    public UserLoginDto mapToDto(UserLoginEntity entity){
        return UserLoginDto.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .nickName(entity.getNickName())
                .build();
    }

}
