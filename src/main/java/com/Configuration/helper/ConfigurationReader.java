package com.Configuration.helper;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public  Properties p;
public ConfigurationReader() throws IOException {
	File f = new File("C:\\Users\\karthi\\Desktop\\AB\\Adactin_Automation\\Configuration.properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
	fis.close();
	}

public  String getUrl() {
	String url = p.getProperty("url");
	return url;
}

public String getUsername() {
	String username = p.getProperty("username");
	return username;

}
public String getPassword() {
	String password = p.getProperty("password");
	return password;

}
public String getLocation() {
	String location = p.getProperty("location");
	return location;
}
public String getHotels() {
	String hotels = p.getProperty("hotels");
	return hotels;
}

public String getRoomtype() {
	String roomtype = p.getProperty("roomtype");
	return roomtype;
}
public String getTotalroom() {
	String totalroom = p.getProperty("totalroom");
	return totalroom;
}
public String getCheckin() {
	String checkin = p.getProperty("checkin");
	return checkin;
}

public String getCheckout() {
	String checkout = p.getProperty("checkout");
	return checkout;
}
public String getAdults() {
	String adults = p.getProperty("adults");
	return adults;
}

public String getChild() {
	String child = p.getProperty("1");
	return child;
}

public String getFirstName() {
	String firstName = p.getProperty("Karthi");
	return firstName;
}
public String getLastname() {
	String lastname = p.getProperty("VJ");
	return lastname;
}
public String getAddress() {
	String address = p.getProperty("address");
	return address;
}
public String getCard() {
	String card = p.getProperty("card");
	return card;
}
public String getCctype() {
	String cctype = p.getProperty("cctype");
	return cctype;
}

public String getExpMonth() {
	String expMonth = p.getProperty("expMonth");
	return expMonth;
}
public String getExpYear() {
	String expYear = p.getProperty("expYear");
	return expYear;
}
public String getCvv() {
	String cvv = p.getProperty("cvv");
	return cvv;
}

}



