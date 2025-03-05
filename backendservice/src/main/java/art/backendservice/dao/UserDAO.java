package art.backendservice.dao;

import art.backendservice.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
}
