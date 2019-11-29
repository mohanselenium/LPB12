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
import com.training.pom.RecoverpasswordPOM;
import com.training.pom.RegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RetailRecover {
	private WebDriver driver;
	private String baseUrl;
	private RecoverpasswordPOM Recover;
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
		Recover = new RecoverpasswordPOM(driver);
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
	public void validLoginTest() {
		Recover.clickUserIcon();
		Recover.Email();
		Recover.password();
		Recover.forgottenpassword();
		Recover.Email1();
		Recover.continue_btn();
		
		
		
		
		// loginPOM.sendPassword("admin@123");
		// loginPOM.clickLoginBtn(); 
		 screenShot.captureScreenShot("screenshots/First");
	}
	// TODO Auto-generated method stub


}
