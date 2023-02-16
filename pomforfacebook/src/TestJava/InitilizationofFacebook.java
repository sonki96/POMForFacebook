package TestJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import MainJava.BaseClass;
import MainJava.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InitilizationofFacebook extends BaseClass{

	@BeforeClass
	public void initilizationofwebpage() {
		WebDriverManager.chromiumdriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@BeforeClass
	public void pageobjects() {
		 loginpage =new LoginPage(driver);
		
	}
	
	
	//@AfterClass
	//public void teardownbrowser() {
	//driver.quit();
	//}
	
	
}
