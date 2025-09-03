package pvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PvnappConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PvnappConfigServerApplication.class, args);
	}
}
