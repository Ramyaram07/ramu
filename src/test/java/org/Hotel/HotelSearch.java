package org.Hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearch extends Hotel {
	public HotelSearch() {
		PageFactory.initElements(driver, this);
		}
	
      @FindBy(id="location")
      private WebElement selectLocation;
      @FindBy(id="hotels")
      private WebElement selectHotels;
      @FindBy(id="room_type")
      private WebElement roomtype;
      @FindBy(xpath="//select[@name='room_nos']")
      private WebElement room_nos;
      @FindBy(id="datepick_in")
      private WebElement dateIn;
      @FindBy(id="datepick_out")
      private WebElement dateOut;
      @FindBy(id="adult_room")
      private WebElement adultRoom;
      @FindBy(id="child_room")
      private WebElement childRoom;
      @FindBy(id="Submit")
      private WebElement btnSubmit;
	public WebElement getSelectLocation() {
		return selectLocation;
	}
	public WebElement getSelectHotels() {
		return selectHotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getDateIn() {
		return dateIn;
	}
	public WebElement getDateOut() {
		return dateOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
      
}
