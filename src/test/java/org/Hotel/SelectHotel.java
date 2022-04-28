package org.Hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Hotel {
	public SelectHotel(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
    private WebElement selectRadiobtn;
    @FindBy(id="continue")
    private WebElement continueNxtPage;
    public WebElement getSelectRadiobtn() {
		return continueNxtPage;
    	
    }
    public WebElement getContinueNxtPage() {
		return continueNxtPage;
    	
    }
}
