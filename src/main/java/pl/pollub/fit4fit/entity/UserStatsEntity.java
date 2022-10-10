package pl.pollub.fit4fit.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="userStats")
@Table
@Data
public class UserStatsEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "weight")
    private float weight;

    @Column(name = "height")
    private float heigt;

    @Column(name = "fat_procentage")
    private float fatProcentage;
}
