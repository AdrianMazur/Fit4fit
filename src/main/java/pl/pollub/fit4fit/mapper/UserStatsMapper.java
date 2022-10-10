package pl.pollub.fit4fit.mapper;

import pl.pollub.fit4fit.dto.UserStatsDto;
import pl.pollub.fit4fit.entity.UserStatsEntity;

public class UserStatsMapper {

    public UserStatsEntity mapToEntity(UserStatsDto dto){
        UserStatsEntity entity = new UserStatsEntity();
        entity.setId(dto.getId());
        entity.setWeight(dto.getWeight());
        entity.setHeigt(dto.getHeigt());
        entity.setFatProcentage(dto.getFatProcentage());
        return entity;
    }

    public UserStatsDto mapToDto(UserStatsEntity entity){
        UserStatsDto dto = new UserStatsDto();
        dto.setId(entity.getId());
        dto.setWeight(entity.getWeight());
        dto.setHeigt(entity.getHeigt());
        dto.setFatProcentage(entity.getFatProcentage());
        return dto;
    }
}
