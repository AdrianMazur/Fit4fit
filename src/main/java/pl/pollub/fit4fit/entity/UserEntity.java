package pl.pollub.fit4fit.entity;

import lombok.Data;
import org.hibernate.type.DateType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity(name = "user")
@Table
@Data
public class UserEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "user_name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;
}
