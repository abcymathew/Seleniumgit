package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsAndModals {
	WebDriver driver; 
	
	public AlertsAndModals(WebDriver driver)
	{
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Bootstrap Alert')]")
	 WebElement bootstrapalert;
	
	 @FindBy(xpath="//a[contains(text(),'Bootstrap Modal')]")
	 WebElement bootstrapmodal;
	 
	 @FindBy(xpath="//a[contains(text(),'Window Popup')]")
	 WebElement windowpopup;
	
	 @FindBy(xpath="//a[contains(text(),'Javascript Alert')]")
	 WebElement  javascript;
	
	public void bootstrapalertclick(){
		bootstrapalert.click();
	}
	
	public void bootstrapmodalclick(){
		bootstrapmodal.click();
	}
	
	public void windowpopupclick(){
		windowpopup.click();
	}
	
	public void javascriptclick(){
		javascript.click();
	}

}
