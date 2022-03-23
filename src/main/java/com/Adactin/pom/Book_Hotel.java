package com.Adactin.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	private WebDriver driver;
	public Book_Hotel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"first_name\"]")
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	@FindBy(xpath="//*[@id=\"last_name\"]")
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement cc_num;
	public WebElement getCc_num() {
		return cc_num;
	}
	@FindBy(xpath="//*[@id=\"cc_type\"]")
	private WebElement cc_type;
	public WebElement getCc_type() {
		return cc_type;
	}
	@FindBy(xpath="//*[@id=\"cc_exp_month\"]")
	private WebElement exp_month;
	
	@FindBy(xpath="//*[@id=\"cc_exp_year\"]")
	private WebElement exp_year;
	
	@FindBy(xpath="//*[@id=\"cc_cvv\"]")
	private WebElement cvv;
	public WebElement getExp_month() {
		return exp_month;
	}

	public WebElement getExp_year() {
		return exp_year;
	}

	public WebElement getCvv() {
		return cvv;
	}
	
	@FindBy(xpath="//*[@id=\"book_now\"]")
	private WebElement book_now;
	public WebElement getBook_now() {
		return book_now;
	}
	
	

}
