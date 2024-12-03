package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	@DataProvider(name = "Credentials")
	public String[][] dataProviderData() {
	
		String [][] data= {{"admin", "manager"}, {"trainer", "trainee"}};
		return data;
	}
	@Test(dataProvider = "Credentials")
	public void getDataFromDataProvider(String[] cred) {
		System.out.println(cred[0]);
		System.out.println(cred[1]);
		
	}

}
