/**
 * 
 */
package at.ande.vogella.springboot.playground.tutorial.di;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author ande
 * @since (December 2021)
 */
@Service
public class BarKeeperService {
	Logger LOG = LoggerFactory.getLogger(this.getClass());

	private List<Beer> beer;

	// thas spring magic I dont get
	public BarKeeperService(List<Beer> beer) {
		this.beer = beer;
	}

	public void logBeerName() {
		beer.stream().map(Beer::getName).forEach(LOG::info);
	}
}
