package com.Suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
//import com.beust.jcommander.Parameters;

public class paralleltesting {
	WebDriver driver;
	String url = "https://www.hollandandbarrett.com/";

	@Test
	@Parameters("Browsers")
	public void BrowserLaunch(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("url");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			driver.quit();
		} else if (BrowserName.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "./FirefoxDriverJars/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("url");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			driver.quit();
		} else if (BrowserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "./EdgeDriverJars/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("url");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			driver.quit();
		}
	}

}
