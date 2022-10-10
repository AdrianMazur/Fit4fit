package pl.pollub.fit4fit.dto;

import lombok.Data;
import pl.pollub.fit4fit.commons.enums.BodyParts;

@Data
public class ExerciseDto {
    private Long id;

    private String exerciseName;

    private BodyParts bodyParts;

    private int numberOfSeries;

    private int downtime;
}
