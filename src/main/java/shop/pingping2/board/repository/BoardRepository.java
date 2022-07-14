package shop.pingping2.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.pingping2.board.domain.Board;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findByTitleContaining(String keyword);

    Board findByUser(User user);
}
