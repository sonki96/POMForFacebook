package TestJava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends InitilizationofFacebook {

	@Test (priority=1)
	public void verifythetitleofpage() {
	String text =loginpage.verifyfacebookpagetext();
	Assert.assertEquals(text,"facebook");
	}
	
@Test(priority=1)
public void verifyuseridwithloginid() {
	loginpage.setUserName("ankushjorvekar6@gmail.com");
	loginpage.setpassword("Sonaliiloveyou");
	loginpage.clickonloginbutn();
}

	
}
