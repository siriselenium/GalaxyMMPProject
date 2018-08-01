package org.iit.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class TestBaseClass {

	protected WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("Command Line parameter url value:::::" + System.getenv("applicationurl"));
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	
	}
}
