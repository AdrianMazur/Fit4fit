package pl.pollub.fit4fit.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserLoginDto {
    private Long id;
    private String email;
    private String password;
    private String nickName;
}
