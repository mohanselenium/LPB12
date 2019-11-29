package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(className="fa-user-o")
	private WebElement user_icon; 
	
	
	@FindBy(id="input-email")
	private WebElement Email; 
	
	
	@FindBy(id="input-password")
	private WebElement password; 
	
	@FindBy(xpath="(//input[@class='btn btn-primary'])")
	private WebElement login;
	
	public void clickUserIcon() {
		this.user_icon.click();
		
	}
	
	public void Email(String email) {
		this.Email.sendKeys(email);
		
	}
	
	public void password(String password) {
		this.password.sendKeys(password);
		
	}
	
	public void login() {
		this.login.click();
		
	}
	
	
}