package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public WebDriver driver;
	
	public SearchHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement location;
	public WebElement getLocation() {
		return location;
	}
	@FindBy(id="hotels")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}
	@FindBy(id="room_type")
	private WebElement room;

	public WebElement getRoom() {
		return room;
	}
	@FindBy(xpath="//*[@id=\"room_nos\"]")
	private WebElement totalroom;

	public WebElement getTotalroom() {
		return totalroom;
	}
	@FindBy(xpath="//*[@id=\"datepick_in\"]")
	private WebElement checkin;

	public WebElement getCheckin() {
		return checkin;
	}
	@FindBy(xpath="//*[@id=\"datepick_out\"]")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}
	@FindBy(xpath="//*[@id=\"adult_room\"]")
	private WebElement totalperson;

	public WebElement getTotalperson() {
		return totalperson;
	}
	
	@FindBy(xpath="//*[@id=\"Submit\"]")
	private WebElement submit_btn;

	public WebElement getSubmit_btn() {
		return submit_btn;
	}
	
	
	
	
	
}

