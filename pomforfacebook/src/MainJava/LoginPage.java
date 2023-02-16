package MainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestJava.InitilizationofFacebook;

public class LoginPage extends InitilizationofFacebook {

	@FindBy(id="facebook")
	WebElement Facebooktxt;
	
	@FindBy(id="email")
	WebElement Usernamefield;
	
	@FindBy (id="pass")
	WebElement passwordfiels;
	
	@FindBy (id="loginbutton")
	WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifyfacebookpagetext() {
		return Facebooktxt.getText();
	}
	
	public void setUserName(String username) {
		Usernamefield.sendKeys(username);
	}
	
	public void setpassword(String password) {
		passwordfiels.sendKeys(password);
	}
	
	public void clickonloginbutn() {
		loginbtn.click();
	}
	
}
