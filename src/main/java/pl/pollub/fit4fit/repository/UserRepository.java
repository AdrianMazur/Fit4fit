package pl.pollub.fit4fit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pollub.fit4fit.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
