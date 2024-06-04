package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressBarPages {
	WebDriver driver ;
	public ProgressBarPages(WebDriver driver)
	{
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='JQuery UI Progress']")
	 WebElement JQuery;
	
	public void JQueryclick()
	{
		JQuery.click();
	}

}