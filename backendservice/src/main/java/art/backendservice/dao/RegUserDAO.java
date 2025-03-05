package art.backendservice.dao;

import art.backendservice.entity.RegUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegUserDAO extends JpaRepository<RegUser, Long> {
}
