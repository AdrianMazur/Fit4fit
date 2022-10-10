package pl.pollub.fit4fit.dto;

import lombok.Data;

@Data
public class UserStatsDto {
    private Long id;

    private float weight;

    private float heigt;

    private float fatProcentage;
}
