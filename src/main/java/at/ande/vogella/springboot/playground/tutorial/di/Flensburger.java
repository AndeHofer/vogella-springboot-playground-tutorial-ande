package at.ande.vogella.springboot.playground.tutorial.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 
 * @author ande
 * @since (December 2021)
 */
@Component
@Qualifier("Flensburger")
public class Flensburger implements Beer {

	/**
	 * @return
	 *
	 * @author ande
	 * @since (December 2021)
	 */
	@Override
	public String getName() {
		return "Flensburger";
	}

}
