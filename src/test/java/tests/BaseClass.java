package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;




public class BaseClass {
	
	AppiumDriver<MobileElement>driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
	
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("udid","a88765bf");
	dc.setCapability("deviceName" ,"OnePlus 5");
	dc.setCapability("platformVersion" ,"9.0.0");
	dc.setCapability("platformName" ,"Android");
	dc.setCapability("automationName","Appium");
	dc.setCapability ("appPackage", "com.facebook.katana");
	dc.setCapability("appActivity","com.facebook.katana.LoginActivity");
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver= new AppiumDriver<MobileElement>(url,dc);
	
	}
	
	@Test
	public void sampleTest()
	{
		System.out.print("TestDone");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	

}
