package ke.co.statum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(scanBasePackages = "ke.co.statum")
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class SortAlgorithApplication {

	public static void main(String[] args) {
		SpringApplication.run(SortAlgorithApplication.class, args);
	}
}
