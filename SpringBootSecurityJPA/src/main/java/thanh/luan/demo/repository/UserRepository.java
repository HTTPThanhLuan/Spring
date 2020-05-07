package thanh.luan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thanh.luan.demo.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}