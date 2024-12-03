package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeClassForTestNG {
	@Test
	public void m1() {
		Reporter.log("M1 Executed", true);
	}
	@Test
	public void m20() {
		Reporter.log("M20 Executed", true);
	}
	@Test
	public void m13() {
		Reporter.log("M13 Executed", true);
	}
	@Test
	public void m33() {
		Reporter.log("M33 Executed", true);
	}
	@Test
	public void m25() {
		Reporter.log("M25 Executed", true);
	}
}
