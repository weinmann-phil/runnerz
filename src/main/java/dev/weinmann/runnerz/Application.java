package dev.weinmann.runnerz;

import dev.weinmann.runnerz.run.Location;
import dev.weinmann.runnerz.run.Run;
import dev.weinmann.runnerz.run.JdbcClientRunRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {

  private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

    log.info("Testing further components!");

  }

  //@Bean
  //  CommandLineRunner runner(RunRepository runRepository) {
  //    // Is a container for all the beans in the system
  //    return args -> {
  //      Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 4, Location.OUTDOOR);
  //      runRepository.create(run);
  //    };
  //  }
}
