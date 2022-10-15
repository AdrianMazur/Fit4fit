package pl.pollub.fit4fit.entity;

import lombok.Data;

import javax.persistence.*;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_Id", referencedColumnName = "id")
    private Long userId;
}
