package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnPriorityHATestNG {
	@Test(priority = 3)
	public void amazon() {
		Reporter.log("Amazon is executed", true);
	}
	@Test(priority = 3)
	public void cricBuzz() {
		Reporter.log("CricBuzz executed", true);
	}
	@Test(priority = 1)
	public void baskinRobbins() {
		Reporter.log("BaskinRobbins executed", true);
	}
	@Test(priority = 2)
	public void bigBasket() {
		Reporter.log("BigBasket executed", true);
	}

}
