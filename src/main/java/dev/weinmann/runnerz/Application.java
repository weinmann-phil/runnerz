package dev.weinmann.runnerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import foo.bar.WelcomeMessage;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

    var welcomeMessage = new WelcomeMessage();
    System.out.println(welcomeMessage.getWelcomeMessage());

	}

}
