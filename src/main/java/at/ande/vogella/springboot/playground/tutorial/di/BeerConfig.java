/**
 * 
 */
package at.ande.vogella.springboot.playground.tutorial.di;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 
 * @author ande
 * @since (December 2021)
 */
@Configuration
@PropertySource("classpath:/beers.properties")
public class BeerConfig {

	@Bean
	@Qualifier("Becks")
	public Beer getBecks() {
		return () -> "Becks";
	}

    @Bean
    public List<Beer> getBeerNamesFromProperty(@Value("${beer.names}") List<String> beerNames) {
        return beerNames.stream().map(bN -> new Beer() {

            @Override
            public String getName() {
                return bN;
            }
        }).collect(Collectors.toList());
    }

}
