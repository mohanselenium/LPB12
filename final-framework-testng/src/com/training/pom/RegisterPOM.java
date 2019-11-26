package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPOM {

	
		private WebDriver driver; 
		
		public RegisterPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(className="fa-user-o")
		private WebElement user_icon; 
		
		@FindBy(partialLinkText="Register")
		private WebElement reg_btn;
		
		
		@FindBy(id="input-firstname")
		private WebElement firstname; 
		
		@FindBy(id="input-lastname")
		private WebElement lastname;
		
		@FindBy(id="input-email")
		private WebElement email; 
		
		@FindBy(id="input-telephone")
		private WebElement telephone; 
		
		@FindBy(id="input-address-1")
		private WebElement address1; 
		

		@FindBy(id="input-address-2")
		private WebElement address2; 
		
		@FindBy(id="input-city")
		private WebElement city;
		
		@FindBy(id="input-postcode")
		private WebElement postcode; 
		
		@FindBy(id="input-country")
		private WebElement country; 
		
		@FindBy(id="input-zone")
		private WebElement region; 
		
		@FindBy(id="input-password")
		private WebElement password;
		
		@FindBy(id="input-confirm")
		private WebElement confirm; 
		
		@FindBy(xpath="//input[@value='0']")
		private WebElement subscribe;
		
		@FindBy(xpath="(//input[@value='1'])[3]")
		private WebElement checkbox;
		
		
		@FindBy(xpath="(//input[@class='btn btn-primary'])")
		private WebElement continue_btn;
		
		
		public void clickUserIcon() {
			this.user_icon.click();
			
		}
		
		public void clickregbtn() {
			this.reg_btn.click();
			
		}
		
		public void firstname() {
			this.firstname.sendKeys("manzoor");
			
		}
		
		public void Email() {
			this.email.sendKeys("manzoorali@gmail.com");
			
		}
		
		public void lastname() {
			this.lastname.sendKeys("mehadi");
			
		}
		
		public void Telephone() {
			this.telephone.sendKeys("9876543210");
			
			
		}
		
		public void address1() {
			this.address1.sendKeys("yeshwanthapur");
			
			
		}
		
		
		public void address2() {
			this.address2.sendKeys("bangalore");
			
			
		}
		
		public void city() {
			this.city.sendKeys("bangalore");
			
			
		}
		
		public void postcode() {
			this.postcode.sendKeys("560022");
			
			
		}
		

		public void country() {
			Select country = new Select(this.country);
			country.selectByVisibleText("India");
			
			}

		public void state() {
			Select state = new Select(this.region);
			state.selectByVisibleText("Karnataka");
			
			}
		
		public void password()
		{
			this.password.sendKeys("manzoor1");
			
			}
		
		public void confirm()
		{
			this.confirm.sendKeys("manzoor1");
			
			}
		
		
		public void radio()
		{
			this.subscribe.click();
			
			}
		
		public void checkbox()
		{
			this.checkbox.click();
			
			}
		
		public void continue_btn()
		{
			this.continue_btn.click();
		}
		
}
		
		
		/*public void sendUserName(String userName) {
			this.userName.clear();
			this.userName.sendKeys(userName);
		}
		
		public void sendPassword(String password) {
			this.password.clear(); 
			this.password.sendKeys(password); 
		}
		
		public void clickLoginBtn() {
			this.loginBtn.click(); 
		}

	}
*/

