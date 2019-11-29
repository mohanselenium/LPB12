package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecoverpasswordPOM {
	
private WebDriver driver; 
	
	public RecoverpasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement Email; 
	
	
	@FindBy(id="input-password")
	private WebElement password; 
	
	@FindBy(xpath="(//input[@class='btn btn-primary'])")
	private WebElement login;
	
	@FindBy(linkText = ("Forgotten Password"))
	private WebElement forgottenpassword;
	

	@FindBy(xpath="(//input[@class='btn btn-primary'])")
	private WebElement continue_btn;
	
	
	
	@FindBy(className="fa-user-o")
	private WebElement user_icon; 
	
	
	public void clickUserIcon() {
		this.user_icon.click();
		
	}
	
	
	public void Email() {
		this.Email.sendKeys("manzoorali@gmail.com");
		
	}
	
	public void password() {
		this.password.sendKeys("manzoor");
			
		}
		
		
		
		public void login() {
			this.login.click();
			
		}
		
		

		public void forgottenpassword() {
			this.forgottenpassword.click();
			
		}
		
		public void Email1() {
			this.Email.sendKeys("manzoorali@gmail.com");
			
		}
		
		public void continue_btn()
		{
			this.continue_btn.click();
		}
		
		
	}
	
	

