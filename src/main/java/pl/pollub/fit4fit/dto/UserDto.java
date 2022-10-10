package pl.pollub.fit4fit.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private Long id;

    private LocalDate dateOfBirth;

    private String name;

    private String surname;

    private String email;
}
