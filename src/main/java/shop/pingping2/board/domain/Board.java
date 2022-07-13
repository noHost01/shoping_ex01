package shop.pingping2.board.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "board")
public class Board extends Time {
    @Id
    private Long id;
    @Column(length = 10, nullable = false)
    private String writer;
    @Column(length = 100, nullable = false)
    private String title;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @Builder
    public Board(Long id, String title, String content, String writer, User user) {
        Assert.hasText(writer, "writer must not be empty");
        Assert.hasText(writer, "title must not be empty");
        Assert.hasText(content, "content must not be empty");

        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.user = user;
    }
}
