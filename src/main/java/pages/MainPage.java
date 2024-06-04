package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
WebDriver driver ;
	public  MainPage (WebDriver driver)
	{
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Input Form')]")
	 WebElement inputform;
	
	 @FindBy(xpath="//a[contains(text(),'Date Pickers')]")
	 WebElement datepicker;
	 
	 @FindBy(xpath="//a[contains(text(),'Table')]")
	 WebElement table;
	
	 @FindBy(xpath="//a[contains(text(),'Progress Bars')]")
	 WebElement  progressbar;
	 @FindBy(xpath="//a[contains(text(),'Alerts and Modals')]")
	 WebElement alerts;
	 
	 @FindBy(xpath="//a[contains(text(),'List Box')]")
	 WebElement listbox;
	
	 @FindBy(xpath="//a[contains(text(),'Others')]")
	 WebElement  others;
	 
	public void inputclick(){
		inputform.click();
	}
	
	public void dateclick(){
		datepicker.click();
	}
	
	public void tableclick(){
		table.click();
     }
	
	public void progressclick(){
		progressbar.click();
	}
	
	public void alertclick(){
		alerts.click();
	}
	
	public void listclick(){
		listbox.click();
	}
	
	public void otherclick(){
	others.click();
	}
      
}