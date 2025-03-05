package art.backendservice.dao;

import art.backendservice.entity.ActionLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionLogDAO extends JpaRepository<ActionLog, Long> {
}
