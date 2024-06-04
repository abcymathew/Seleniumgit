package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablePage {
	WebDriver driver ;
    public TablePage(WebDriver driver)
	{
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='table-pagination.php' and @class='nav-link']")
	 WebElement tablepagination ;
	
	public void  tableclick()
	{
		tablepagination.click();
	}

}
