package stepDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PricesPage;

public class PricesPageStepDefinition {
	
	private WebDriver driver;
	private PricesPage PricesPageInstance;
	
	@Given("User lands on a particular page")
	public void user_lands_on_a_particular_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/prices"); // Launch prices page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		PricesPageInstance = new PricesPage(this.driver);
		String PricesTitle = PricesPageInstance.getNavbarButtonElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/prices", this.driver.getCurrentUrl());
		Assert.assertEquals("Show Coin Prices", PricesTitle);
	}
	
	@Given("User lands on Coin Prices page")
	public void User_lands_on_Coin_Prices_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/prices"); // Launch prices page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		PricesPageInstance = new PricesPage(this.driver);
		String PricesTitle = PricesPageInstance.getNavbarButtonElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/prices", this.driver.getCurrentUrl());
		Assert.assertEquals("Show Coin Prices", PricesTitle);
	}

	@When("User selects a certain link")
	public void user_selects_a_certain_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*PricesPageInstance.getSidebarSelectionElements().size() - 1);
		PricesPageInstance.getSidebarSelectionElements().get(randomNumber).click();
	}

	@When("User selects Navbar to enter an incorrect wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_an_incorrect_wallet_address(String address) {
		PricesPageInstance.setNavbarInputElement(address);
		PricesPageInstance.getNavbarButtonElement().click();
	}

	@When("User selects Navbar to enter a correct wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_a_correct_wallet_address(String address) {
		PricesPageInstance.setNavbarInputElement(address);
		PricesPageInstance.getNavbarButtonElement().click();
	}

	@When("User selects a footer link")
	public void user_selects_a_footer_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*PricesPageInstance.getFooterLinkElements().size() - 1); 
		PricesPageInstance.getFooterLinkElements().get(randomNumber).click();
	}
	
	@When("User selects show coin prices button")
	public void User_selects_show_coin_prices_button() {
		PricesPageInstance.clickCoinPricesButtonElement();
	}
	
	@And("User selects a random coin to select")
	public void User_selects_a_random_coin_to_select() {
		int randomNumber = (int) ((Math.random())*PricesPageInstance.getCoinPricesCardsElement().size() - 1);
		PricesPageInstance.getCoinPricesCardsElement().get(randomNumber).click();
	}
	
	@When("User selects hide coin prices button")
	public void User_selects_hide_coin_prices_button() {
		PricesPageInstance.clickHideCoinPricesButtonElement();
	}

	@Then("Redirect User to that page")
	public void redirect_user_to_that_page() {
		boolean checkFlag = false;
		String [] sideBarLinks = new String [] {
					"https://www.ethwdashboard.xyz/about", "https://www.ethwdashboard.xyz/prices", 
					"https://www.ethwdashboard.xyz/", "https://www.ethwdashboard.xyz/ens-erc721-selection", 
					"https://www.ethwdashboard.xyz/erc20-holdings", "https://www.ethwdashboard.xyz/erc20-token-prices", 
					"https://www.ethwdashboard.xyz/erc721-holdings", "https://www.ethwdashboard.xyz/gas-tracker", 
					"https://www.ethwdashboard.xyz/analytics-selection"
		};
		
		// Run through all the links in the side bar and check to see if all the URLs match, dispatch if discrepancy found	
		for (int i = 0; i < sideBarLinks.length; i++){
			String URL = this.driver.getCurrentUrl();
			
			if (URL == sideBarLinks[i]) {
				checkFlag = true;
				break;
			}
			else {
				continue;
			}
		}
		
		Assert.assertEquals(checkFlag, true);
	}

	@Then("Redirect User to Transactions Page")
	public void redirect_user_to_transactions_page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://ethwdashboard.xyz/transactions");
	}

	@Then("Display alert warning User")
	public void display_alert_warning_user() {
		String text = PricesPageInstance.getNavbarAlertElement().getText();
		Assert.assertEquals("You need to enter a valid address!", text);
	}

	@Then("Redirect User to that link")
	public void redirect_user_to_that_link() {
		boolean footerFlag = false;
		
		String [] footerLnks = new String[] {
				"https://docs.alchemy.com/reference/api-overview", "https://www.blocknative.com/", "https://www.coingecko.com/",
				"https://etherscan.io/", "https://moralis.io/", "https://www.transpose.io/"
		};
		
		List<String> windowList = new ArrayList<String>(this.driver.getWindowHandles());
		this.driver.switchTo().window(windowList.get(1)); // Second window opened will contain the name of the link
		String URL = this.driver.getCurrentUrl();
		
		for (int i = 0; i < footerLnks.length; i++) {
			if (URL == footerLnks[i]) {
				footerFlag = true;
				break;
			}
			else {
				continue;
			}
		}
		
		Assert.assertEquals(footerFlag, true);
	}
	
	
	@Then("Display coin prices to User and change button to hide coin prices")
	public void Display_coin_prices_to_User_and_change_button_to_hide_coin_prices() {
		String coinButtonText  = PricesPageInstance.getHideCoinPricesButtonElement().getText();
		String URL = this.driver.getCurrentUrl();
		
		Assert.assertEquals("https://ethwdashboard.xyz", URL);
		Assert.assertEquals("Hide Coin Prices", coinButtonText);
	}
	
	@Then("Redirect User to the selected coin price page")
	public void Redirect_User_to_the_selected_coin_price_page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals("https://ethwdashboard.xyz/prices", URL);
	}
	
	@Then("Hide coin prices to User and change button to show coin prices")
	public void Hide_coin_prices_to_User_and_change_button_to_show_coin_prices() {
		String coinButtonText = PricesPageInstance.getCoinPricesButtonElement().getText();
		String URL = this.driver.getCurrentUrl();
		
		Assert.assertEquals("https://ethwdashboard.xyz/prices", URL);
		Assert.assertEquals("Show Coin Prices", coinButtonText);
	}
}