package pl.pollub.fit4fit.mapper;

import pl.pollub.fit4fit.dto.ExerciseDto;
import pl.pollub.fit4fit.entity.ExerciseEntity;

public class ExerciseMapper {

    public ExerciseEntity mapToEntity(ExerciseDto dto){
        ExerciseEntity entity = new ExerciseEntity();
        entity.setId(dto.getId());
        entity.setExerciseName(dto.getExerciseName());
        entity.setBodyParts(dto.getBodyParts());
        entity.setNumberOfSeries(dto.getNumberOfSeries());
        entity.setDowntime(dto.getDowntime());
        return entity;
    }

    public ExerciseDto mapToDto(ExerciseEntity entity){
        ExerciseDto dto = new ExerciseDto();
        dto.setId(entity.getId());
        dto.setExerciseName(entity.getExerciseName());
        dto.setBodyParts(entity.getBodyParts());
        dto.setNumberOfSeries(entity.getNumberOfSeries());
        dto.setDowntime(entity.getDowntime());
        return dto;
    }
}
