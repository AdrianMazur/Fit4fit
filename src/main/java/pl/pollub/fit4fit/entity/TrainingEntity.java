package pl.pollub.fit4fit.entity;

import javax.persistence.*;
import java.util.Set;


@Entity(name = "training")
@Table
public class TrainingEntity {
    @Id
    @Column(name = "id")
    Long id;

    @Column(name = "trainingName")
    String trainingName;

    @OneToMany(mappedBy = "exercise")
    private Set<ExerciseEntity> exercises;
}
