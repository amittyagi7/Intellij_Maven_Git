package nsaur.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/intellij")
public class IntellijMavenGitApplication {

	public static void main(String[] args) {

		SpringApplication.run(IntellijMavenGitApplication.class, args);
		System.out.println("Working fine");
	}

	@GetMapping("/hello")
	public String getName(){
		return "AmitTyagi";
	}

}
