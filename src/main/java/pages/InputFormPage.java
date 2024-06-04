package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormPage {
WebDriver driver;
    
	public InputFormPage(WebDriver driver){
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//a[@href='simple-form-demo.php' and @class='nav-link']")
	WebElement simpleform;
	@FindBy(xpath="//a[@href='check-box-demo.php']")
	WebElement checkbox;
	@FindBy(xpath="//a[@href='radio-button-demo.php']")
	WebElement radiobutton;
	@FindBy(xpath="//a[@href='select-input.php']")
	WebElement selectinput;
	@FindBy(xpath="//a[@href='form-submit.php']")
	WebElement formsubmitlink;
   @FindBy(xpath="//a[@href='ajax-form-submit.php']")
	WebElement ajaxformsubmit;
	
	public void simpleformdemoclick(){
		simpleform.click();
	}
	
	public void checkboxclick(){
		checkbox.click();
	}
	
	public void radioclick(){
		radiobutton.click();
	}
	
	public void selectinputclick(){
		selectinput.click();
	}
	public void ajaxformsubmitclick(){
		ajaxformsubmit.click();
	}
	public void formsubmitclick(){
		formsubmitlink.click();
	}
}