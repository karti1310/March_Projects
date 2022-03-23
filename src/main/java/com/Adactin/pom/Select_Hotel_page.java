package com.Adactin.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_page {
public WebDriver driver;
	
	public Select_Hotel_page(WebDriver driver2) {
	// TODO Auto-generated constructor stub
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
}

	
	@FindBy(xpath="//*[@id=\"radiobutton_0\"]")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	private WebElement continue_button;

	public WebElement getContinue_button() {
		return continue_button;
	}
	
}

