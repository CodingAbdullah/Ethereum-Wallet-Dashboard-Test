package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wildcard address added for example

		WebDriver driver = new ChromeDriver(); // Setting up driver
		driver.get("https://ethwdashboard.xyz/"); // Launch home page of the Ethereum Wallet Dashboard

		driver.manage().window().maximize(); // Maximize window

		// Wait for home page to load to proceed
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		 
	}
}