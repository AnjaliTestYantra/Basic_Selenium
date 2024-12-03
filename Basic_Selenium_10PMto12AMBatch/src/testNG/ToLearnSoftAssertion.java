package testNG;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssertion {
	@Test
	public void homePage(Method meth) {
		String nameOfMethod = meth.getName();
		Reporter.log("Test "+nameOfMethod+" Started", true);
		Reporter.log("Step 1", true);
		Reporter.log("Step 2", true);
		Reporter.log("Step 3", true);
		//Soft Assert
		SoftAssert soft= new SoftAssert();
//		soft.assertEquals("Home", "Home", "HomePage Failed");
		soft.assertEquals("Home", "Login", "HomePage Failed");
		soft.assertAll();
		Reporter.log("Success", true);
		Reporter.log("Step 4", true);
		Reporter.log("Step 5", true);
		Reporter.log("Test "+nameOfMethod+" Ended", true);
		
	}

}
