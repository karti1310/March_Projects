package com.Adactin.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.Adactin.BaseClass.BaseClass;
import com.Adactin.PageObjectManager.PageObjectManager;
import com.Configuration.helper.FileReaderManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	public static WebDriver driver=BaseClass.browser("Edge");
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^user Launches The Application$")
	public void user_Launches_The_Application() throws Throwable {
		geturl(FileReaderManager.getInstancefrm().getInstancecr().getUrl());
	}

	@When("^user Enters The Username In Username Field$")
	public void user_Enters_The_Username_In_Username_Field() throws Throwable {
	   inputElement(pom.getLp().getUsername(), FileReaderManager.getInstancefrm().getInstancecr().getUsername());
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		inputElement(pom.getLp().getPassword(), FileReaderManager.getInstancefrm().getInstancecr().getPassword());
	}

	@Then("^user Clicks The Login Button And It Navigates To Homepage$")
	public void user_Clicks_The_Login_Button_And_It_Navigates_To_Homepage() throws Throwable {
	    clickOnElement(pom.getLp().getLogin());
	}

	@When("^user Select The Location From Location Field$")
	public void user_Select_The_Location_From_Location_Field() throws Throwable {
		drop_down(pom.getsh().getLocation(), "value", FileReaderManager.getInstancefrm().getInstancecr().getLocation());
	}

	@When("^user Select The Hotel In The Hotels Field$")
	public void user_Select_The_Hotel_In_The_Hotels_Field() throws Throwable {
		drop_down(pom.getsh().getHotel(), "index", FileReaderManager.getInstancefrm().getInstancecr().getHotels());
	}

	@When("^user Selects The Room Type$")
	public void user_Selects_The_Room_Type() throws Throwable {
		drop_down(pom.getsh().getRoom(), "index", FileReaderManager.getInstancefrm().getInstancecr().getRoomtype());
	}

	@When("^user Selects The Number Of Rooms$")
	public void user_Selects_The_Number_Of_Rooms() throws Throwable {
		 drop_down(pom.getsh().getTotalroom(), "index", FileReaderManager.getInstancefrm().getInstancecr().getTotalroom());
	}

	@When("^user Enters The Checkin Date$")
	public void user_Enters_The_Checkin_Date() throws Throwable {
		inputElement(pom.getsh().getCheckin(), FileReaderManager.getInstancefrm().getInstancecr().getCheckin());
	}

	@When("^user Enters The Checkout Date$")
	public void user_Enters_The_Checkout_Date() throws Throwable {
		inputElement(pom.getsh().getCheckout(), FileReaderManager.getInstancefrm().getInstancecr().getCheckout());
	}

	@When("^user Selects Number Of Adults Per Room$")
	public void user_Selects_Number_Of_Adults_Per_Room() throws Throwable {
		drop_down(pom.getsh().getTotalperson(), "index", FileReaderManager.getInstancefrm().getInstancecr().getAdults());
	}

	@When("^user Selects Number Of Childrens Per Room$")
	public void user_Selects_Number_Of_Childrens_Per_Room() throws Throwable {
		
	}

	@Then("^user Clicks The Search Button And It Navigates to SelectHotel Page$")
	public void user_Clicks_The_Search_Button_And_It_Navigates_to_SelectHotel_Page() throws Throwable {
		 clickOnElement(pom.getsh().getSubmit_btn());
	}

	@When("^user Selects The Hotel$")
	public void user_Selects_The_Hotel() throws Throwable {
	   
	}

	@Then("^user Clicks The Continue Button And It Navigates To BookHotel Page$")
	public void user_Clicks_The_Continue_Button_And_It_Navigates_To_BookHotel_Page() throws Throwable {
	  
	}

	@When("^user Enter The FirstName$")
	public void user_Enter_The_FirstName() throws Throwable {
	   
	}

	@When("^user Enters The LastName$")
	public void user_Enters_The_LastName() throws Throwable {
	   
	}

	@When("^user Enters The BillingAddress$")
	public void user_Enters_The_BillingAddress() throws Throwable {
	    
	}

	@When("^user Enters The CreditCard Number$")
	public void user_Enters_The_CreditCard_Number() throws Throwable {
	    
	}

	@When("^user Selects The CardType$")
	public void user_Selects_The_CardType() throws Throwable {
	    
	}

	@When("^user Selects The Expiry Month$")
	public void user_Selects_The_Expiry_Month() throws Throwable {
	 
	}

	@When("^user Selects The Expiry Year$")
	public void user_Selects_The_Expiry_Year() throws Throwable {
	    
	}

	@When("^user Enters The CVV NUmber$")
	public void user_Enters_The_CVV_NUmber() throws Throwable {
	   
	}

	@Then("^user Clicks The Book Now Button And It Navigates To BookingConfirmation Page$")
	public void user_Clicks_The_Book_Now_Button_And_It_Navigates_To_BookingConfirmation_Page() throws Throwable {
	    
	}


}
