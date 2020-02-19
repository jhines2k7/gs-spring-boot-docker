package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
  @RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
