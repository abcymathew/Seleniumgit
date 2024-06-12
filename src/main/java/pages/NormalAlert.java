package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NormalAlert {
WebDriver driver;
    
	public NormalAlert(WebDriver driver){
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    
	@FindBy(id="normal-btn-success")
	WebElement normalsuccess;
	@FindBy(xpath="//div[@class='alert alert-success alert-normal-success']")
	WebElement normalmessage;
	

    public void normalbuttonclick(){
	  normalsuccess.click();
    }
    public String getnormaltext(){
	      return normalmessage.getText();
	      
	   }
	
   
   
}
