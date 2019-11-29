package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("unused")
public class checkoutPOM {

private WebDriver driver; 


	
    public checkoutPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}
    
    @FindBy(className= ("tb_text"))
   	private WebElement Home;
    
    @FindBy(linkText = ("lacinia congue"))
	private WebElement product;
    
	@FindBy(id="button-cart")
	private WebElement cart; 
	
	
	@FindBy(xpath="//i[@class ='tb_icon ico-linea-ecommerce-bag']")
	private WebElement seecart; 
	

    @FindBy(linkText = ("View Cart"))
	private WebElement viewcart;
    
    @FindBy(linkText = ("Checkout"))
	private WebElement Checkout;
    
	
    @FindBy(id = ("button-payment-address"))
   	private WebElement Continue;


   
	
	@FindBy(xpath="(//input[@class='btn btn-primary'])")
	private WebElement login;
	
	@FindBy(name="comment")
	private WebElement comment;
	
	 @FindBy(id = ("button-payment-address"))
	 private WebElement btnpaymentaddress;
	    
	 @FindBy(id = ("button-shipping-address"))
	 private WebElement btnshippingaddress;
	 
	 @FindBy(id = ("button-shipping-method"))
	 private WebElement btnshippingmethod;
	 
	 
	 
	 @FindBy(id = ("button-payment-method"))
	 private WebElement btnpaymentmethod;
	 
	 @FindBy(name = ("agree"))
	 private WebElement termsandconditions;
	 
	 @FindBy(id="input-password")
	 private WebElement password; 
	 
	 @FindBy(id="button-confirm")
	 private WebElement confirm; 
	 
	 
	
	public void Home() {
		this.Home.click();
		
	}
	
	
	public void product() {
		this.product.click();
		
	}
	
	public void cart() throws InterruptedException {
		this.cart.click();
		Thread.sleep(15000);
//		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	}
	
	public void mouseover() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(seecart).build().perform();
		
		
	}
	
	public void viewcart() {
		this.viewcart.click();
		
	}
	
	public void Checkout() {
		
		
		this.Checkout.click();
		
	}
	
	public void btnpaymentaddress() throws InterruptedException {
		this.btnpaymentaddress.click();
		
	}
	
	public void btnshippingaddress() throws InterruptedException {
		this.btnshippingaddress.click();
		
	}
	
	public void btnshippingmethod() throws InterruptedException {
		this.btnshippingmethod.click();
		
	}
	
	public void btnpaymentmethod() throws InterruptedException {
		this.btnpaymentmethod.click();
		
	}
	
	public void termsandconditions() throws InterruptedException {
		this.termsandconditions.click();
		
	}
	
	public void confirm() throws InterruptedException {
		this.confirm.click();
		
	}
	
		
	
	
	
	
	
	public void comment() {
		
		this.comment.sendKeys(" This product is nice ");
		
	}
	
	//public void Email(String email) {
		//this.Email.sendKeys(email);
		
	//}
	
	public void password(String password) {
		this.password.sendKeys(password);
		
	}
}
