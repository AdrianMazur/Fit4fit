package pl.pollub.fit4fit.entity;

import lombok.Data;
import pl.pollub.fit4fit.commons.enums.BodyParts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "exercise")
@Table
@Data
public class ExerciseEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "exercise_name")
    private String exerciseName;

    @Column(name = "body_part")
    private BodyParts bodyParts;

    @Column(name = "number_of_series")
    private int numberOfSeries;

    @Column(name = "downtime")
    private int downtime;
}
