package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RegisterPOM;
import com.training.pom.checkoutPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class WithPrelogin {
	
	private WebDriver driver;
	private String baseUrl;
	private checkoutPOM checkout1;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//loginPOM = new LoginPOM(driver); 
		new RegisterPOM(driver); 
		checkout1 = new checkoutPOM(driver);
		loginPOM = new LoginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	/*@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.clickUserIcon();
		loginPOM.Email("manzoorali@gmail.com");
		loginPOM.password("manzoor1");
		loginPOM.login();
		checkout1.Home();
		checkout1.product();
		checkout1.cart();
		checkout1.mouseover();
		checkout1.viewcart();
		checkout1.Checkout();
		checkout1.btnpaymentaddress();
		checkout1.btnshippingaddress();
		checkout1.comment();
		checkout1.btnshippingmethod();
		checkout1.termsandconditions();
		checkout1.btnpaymentmethod();
		checkout1.confirm();
		
		
		
		
		// loginPOM.sendPassword("admin@123");
		// loginPOM.clickLoginBtn(); 
		 screenShot.captureScreenShot("screenshots/First");
	}
	// TODO Auto-generated method stub

	
	

}
