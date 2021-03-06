package com.Adactin.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		public WebDriver driver;
		
		public LoginPage(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
			
		}
		 
		@FindBy(id="username")
		private WebElement username;
		
		@FindBy(xpath="//*[@id=\"password\"]")
		private WebElement password;
		
		@FindBy(id="login")
		private WebElement login;

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}
		
}
