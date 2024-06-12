package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AlertsAndModals;
import pages.JavaScriptPromptAlert;
import pages.MainPage;
import pages.NormalAlert;
import util.PropertyReaderUtil;
import util.RetryAnalyser;
import util.ScreenshotUtil;

public class NormalSuccessText  extends DriverIntializer {
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	AlertsAndModals alert;
	ScreenshotUtil screen;
	NormalAlert normal;
	 @BeforeMethod
		public void run(){
			 driver=getdriver();
			}
		
		@Test()
		public void normalVerify() throws IOException {
			main=new MainPage(driver);
			main.alertclick();
			alert=new AlertsAndModals(driver);
			alert.bootstrapalertclick();
		    normal=new NormalAlert(driver);
		    normal.normalbuttonclick();
		    String text=normal.getnormaltext();
		    String expectedtext="\r\n"
		    		+ "              I'm a normal success message. To close use  the appropriate button.\r\n"
		    		+ "            ";
		    Assert.assertEquals(text,expectedtext);
		}
	

}
