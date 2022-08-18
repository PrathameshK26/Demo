package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotation {

	@DataProvider(name="data-provider")
	public Object[][]dataProviderMethod(){
		return new Object[][]{{"Automation Testing"},{"Manual Testing"},
	{"API Testing"},{"Database Testing"}};
	}

	@Test(dataProvider = "data-provider")
	public void display(String value) {
		System.out.println("Value is :"+value);
}
}
