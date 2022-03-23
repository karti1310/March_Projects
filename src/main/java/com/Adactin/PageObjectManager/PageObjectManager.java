package com.Adactin.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.Adactin.pom.Book_Hotel;
import com.Adactin.pom.LoginPage;
import com.Adactin.pom.SearchHotel;
import com.Adactin.pom.Select_Hotel_page;

public class PageObjectManager {
	public static WebDriver driver;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	private LoginPage lp;
	private SearchHotel sh;
	private Select_Hotel_page shp;
	private Book_Hotel bh;

	public LoginPage getLp() {
		if(lp==null) {
			lp=new LoginPage(driver);
		}
		return lp;
	}
	
	public SearchHotel getsh() {
		if(sh==null) {
			sh=new SearchHotel(driver);
		}
		return sh;
	}
	public Select_Hotel_page getshp() {
		if(shp==null) {
			shp=new Select_Hotel_page(driver);
		}
		return shp;
	}
	public Book_Hotel getbh() {
		if(bh==null) {
			bh=new Book_Hotel(driver);
		}
		return bh;
	}
	
		
	
}
