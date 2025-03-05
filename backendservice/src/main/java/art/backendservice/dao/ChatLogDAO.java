package art.backendservice.dao;

import art.backendservice.entity.ChatLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatLogDAO extends JpaRepository<ChatLog, Long> {
}
