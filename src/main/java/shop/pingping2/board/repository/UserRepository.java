package shop.pingping2.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.pingping2.board.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
