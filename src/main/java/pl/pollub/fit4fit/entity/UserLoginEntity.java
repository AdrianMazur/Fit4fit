package pl.pollub.fit4fit.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table
@Data
@Entity(name = "userLoginData")
public class UserLoginEntity {
        @Id
        @Column( name = "id", nullable = false)
        private Long id;

        @Column(name = "email")
        private String email;

        @Column(name = "password", nullable = false)
        private String password;

        @Column(name = "nickName")
        private String nickName;

        @Column(name = "creationDate")
        private LocalDateTime creationDate;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_Id", referencedColumnName = "id")
        private Long userId;
}
