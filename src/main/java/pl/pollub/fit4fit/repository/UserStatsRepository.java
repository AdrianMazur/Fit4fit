package pl.pollub.fit4fit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pollub.fit4fit.entity.UserStatsEntity;

public interface UserStatsRepository extends JpaRepository<UserStatsEntity,Long> {
}
