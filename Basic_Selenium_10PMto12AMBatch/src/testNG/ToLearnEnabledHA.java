package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnEnabledHA {
	@Test
	public void amazon() {
		Reporter.log("Amazon is executed", true);
	}
	@Test
	public void cricBuzz() {
		Reporter.log("CricBuzz executed", true);
	}
	@Test
	public void baskinRobbins() {
		Reporter.log("BaskinRobbins executed", true);
	}
	@Test(enabled = false)
	public void bigBasket() {
		Reporter.log("BigBasket executed", true);
	}

}
