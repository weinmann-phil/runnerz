package dev.weinmann.runnerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import WelcomeMessage;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
    //var welcomeMessage = new WelcomeMessage();
    //System.out.println(welcomeMessage.getWelcomeMessage());

    ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

    WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcomeMessage");
    System.out.println(welcomeMessage.getWelcomeMessage());

	}

}
