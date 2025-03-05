package art.backendservice.dao;

import art.backendservice.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatDAO extends JpaRepository<Chat, Long> {
}
