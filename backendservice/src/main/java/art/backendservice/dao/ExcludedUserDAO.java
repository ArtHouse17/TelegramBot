package art.backendservice.dao;

import art.backendservice.entity.ExcludedUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcludedUserDAO extends JpaRepository<ExcludedUser, Long> {
}
