package shop.pingping2.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BoardApplication {
	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}
}
//class Salary {
//	private int id;
//	private String name;
//	private String email;
//
//	public void setId(int id) {
//		this.id = id;
//	}
//	public int getId() {
//		return this.id;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getName() {
//		return this.name;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public int getEmail() {
//		return this.email;
//	}
//	@Data
//	@NoArgsConstructor
//	public class Member {
//		private int id;
//		private String username;
//		private String password;
//		private String email;
//
//		@Builder
//		public Member(int id, String username, String password, String email) {
//			this.id = id;
//			this.username = username;
//			this.password = password;
//			this.email = email;
//		}
//	}
//}