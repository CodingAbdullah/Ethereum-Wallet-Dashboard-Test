package selenium_test_main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_test_pages.AboutPage;
import selenium_test_pages.ENSLookupsPage;
import selenium_test_pages.AddressToENSPage;
import selenium_test_pages.ENSToAddressPage;
import selenium_test_pages.ENSTransfersByIdPage;
import selenium_test_pages.ENSTransfersByNamePage;
import selenium_test_pages.ERC20TokenHoldingsPage;
import selenium_test_pages.ERC721CollectionPage;
import selenium_test_pages.ERC20CollectionPage;
import selenium_test_pages.ERC20TokenPricesPage;
import selenium_test_pages.ERC721HoldingsPage;
import selenium_test_pages.ERC721LookupsPage;
import selenium_test_pages.EthDashboardHomePage;
import selenium_test_pages.GasStationPage;
import selenium_test_pages.PricesPage;
import selenium_test_pages.TokenAnalyticsPage;
import selenium_test_pages.WalletAnalyticsPage;



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