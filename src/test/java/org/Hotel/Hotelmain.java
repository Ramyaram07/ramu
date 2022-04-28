package org.Hotel;

import org.openqa.selenium.WebElement;

public class Hotelmain extends Hotel {
	public static void main(String[] args) {
		Hotelmain h = new Hotelmain();
		h.getDriver();
		h.launchUrl("https://adactinhotelapp.com/");
		
		//Login
		HotelLogin login = new HotelLogin();
		WebElement txtUserName = login.getTxtUserName();
		h.enterText(txtUserName, "johnking");
		WebElement txtPassword = login.getTxtPassword();
	    h.enterText(txtPassword, "john@1234");
	    WebElement btnLogin = login.getTxtLogin();
	    h.btnClick(btnLogin);
		
		
		HotelSearch search = new HotelSearch();
		WebElement selectLocation = search.getSelectLocation();
		h.dropdown(selectLocation, "Paris");
		WebElement selectHotels = search.getSelectHotels();
		h.dropdown(selectHotels, "Hotel Creek");
        WebElement roomtype = search.getRoomtype();
        h.dropdown(roomtype, "Super Deluxe");
        WebElement room_nos = search.getRoom_nos();
        h.dropdown(room_nos, "2-Two");
        WebElement dateIn = search.getDateIn();
        h.dropdown(dateIn, "21/04/2022");
        WebElement dateOut = search.getDateOut();
        h.dropdown(dateOut, "22/04/2022");
        WebElement adultRoom = search.getAdultRoom();
        h.dropdown(adultRoom, "1-One");
        WebElement childRoom = search.getChildRoom();
        h.dropdown(childRoom, "1-One");
	}

}
