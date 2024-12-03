package testNG;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssertion {
	@Test
	public void homePage(Method meth) {
		String nameOfMethod = meth.getName();
		Reporter.log("Test "+nameOfMethod+" Started", true);
		Reporter.log("Step 1", true);
		Reporter.log("Step 2", true);
		Reporter.log("Step 3", true);
		//Hard Assert
		//Assert.assertEquals("Home", "Home", "Failed to load Home page");
		Assert.assertEquals("Home", "Login", "Failed to load Home page");
		Reporter.log("Success", true);
		Reporter.log("Step 4", true);
		Reporter.log("Step 5", true);
		Reporter.log("Test "+nameOfMethod+" Ended", true);
	}

}
