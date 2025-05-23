package global;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DBApplication {
    //FIXME: DBApplication의 위치는?
    public static void main(String[] args) {
        SpringApplication.run(DBApplication.class, args);
    }
}
