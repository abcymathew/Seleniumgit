package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OthersPage {
	WebDriver driver ;
	public  OthersPage (WebDriver driver)
	{
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Drag and Drop')]")
	 WebElement draganddrop;
	
	 @FindBy(xpath="//a[contains(text(),'Dynamic Data Loading')]")
	 WebElement dynmaicdata;
	 
	 public void draganddropclick()
	{
		draganddrop.click();
	}
	public void dynamicclick()
	{
		dynmaicdata.click();
	}
	

}
