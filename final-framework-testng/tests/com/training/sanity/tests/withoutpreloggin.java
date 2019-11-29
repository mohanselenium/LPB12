package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RecoverpasswordPOM;
import com.training.pom.RegisterPOM;
import com.training.pom.checkoutPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class withoutpreloggin {
	
	private WebDriver driver;
	private String baseUrl;
	private checkoutPOM checkout1;
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
		checkout1.Home();
		checkout1.product();
		checkout1.cart();
		checkout1.mouseover();
		checkout1.Checkout();
		checkout1.viewcart();
		
		
		
		
		
		// loginPOM.sendPassword("admin@123");
		// loginPOM.clickLoginBtn(); 
		 screenShot.captureScreenShot("screenshots/First");
	}
	// TODO Auto-generated method stub


}

