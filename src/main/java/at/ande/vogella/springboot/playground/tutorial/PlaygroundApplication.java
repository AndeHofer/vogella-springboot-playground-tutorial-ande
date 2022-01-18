package at.ande.vogella.springboot.playground.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import at.ande.vogella.springboot.playground.tutorial.di.BarKeeperService;

@SpringBootApplication
public class PlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(PlaygroundApplication.class);
		springApplication.setWebApplicationType(WebApplicationType.REACTIVE);
		springApplication.run(args);
	}

	@Autowired
	public void setBeerService(BarKeeperService beerService) {
		beerService.logBeerName();
	}

}
