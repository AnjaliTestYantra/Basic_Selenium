package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsOnMethodHA {
	@Test
	public void createAccount() {
		Reporter.log("Account Created Successfully", true);
	}
	@Test(dependsOnMethods = "createAccount")
	public void editAccount() {
		Reporter.log("Account Edited Successfully", true);
	}
	@Test(dependsOnMethods = {"editAccount", "createAccount"})
	public void deleteAccount() {
		Reporter.log("Account Deleted Successfully", true);
	}

}
