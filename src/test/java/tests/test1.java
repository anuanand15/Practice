package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test1 extends BaseClass{

@Test
public void test1() {
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("hello");
	

}
}