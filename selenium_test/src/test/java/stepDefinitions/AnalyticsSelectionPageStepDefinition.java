package stepDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AnalyticsSelectionPage;
import pages.ENSERC721SelectionPage;

public class AnalyticsSelectionPageStepDefinition {

	private WebDriver driver;
	private AnalyticsSelectionPage AnalyticsSelectionPageInstance;
	
	@Given("User lands on a particular page")
	public void user_lands_on_a_particular_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/analytics-selection"); // Launch home page of the Ethereum Wallet Dash board and redirect to analytics section

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		AnalyticsSelectionPageInstance = new AnalyticsSelectionPage(this.driver);
		AnalyticsSelectionPageInstance.getSidebarSelectionElements().get(9).click(); // Click the nineth link in the side bar to get to Analytics Selection Page
		
		String AnalyticsTitleElement = AnalyticsSelectionPageInstance.getAnalyticsTitleElement().getText();
		String TokenAnalyticsTitleElement = AnalyticsSelectionPageInstance.getTokenAnalyticsTitleElement().getText();
		String WalletAnalyticsTitleElement = AnalyticsSelectionPageInstance.getWalletAnalyticsTitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/analytics-selection", this.driver.getCurrentUrl());
		Assert.assertEquals("Analytics", AnalyticsTitleElement);
		Assert.assertEquals("Token Analytics", TokenAnalyticsTitleElement);
		Assert.assertEquals("Wallet Analytics", WalletAnalyticsTitleElement);
	}
	
	@Given("User lands on Analytics Selection page")
	public void User_lands_on_Analytics_Selection_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/analytics-selection"); // Launch home page of the Ethereum Wallet Dash board and redirect to analytics section

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		AnalyticsSelectionPageInstance = new AnalyticsSelectionPage(this.driver);
		AnalyticsSelectionPageInstance.getSidebarSelectionElements().get(9).click(); // Click the nineth link in the side bar to get to Analytics Selection Page
		
		String AnalyticsTitleElement = AnalyticsSelectionPageInstance.getAnalyticsTitleElement().getText();
		String TokenAnalyticsTitleElement = AnalyticsSelectionPageInstance.getTokenAnalyticsTitleElement().getText();
		String WalletAnalyticsTitleElement = AnalyticsSelectionPageInstance.getWalletAnalyticsTitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/analytics-selection", this.driver.getCurrentUrl());
		Assert.assertEquals("Analytics", AnalyticsTitleElement);
		Assert.assertEquals("Token Analytics", TokenAnalyticsTitleElement);
		Assert.assertEquals("Wallet Analytics", WalletAnalyticsTitleElement);	
	}
	
	@When("User selects the view Token Analytics button")
	public void User_selects_the_view_Token_Analytics_button() {
		AnalyticsSelectionPageInstance.clickTokenAnalyticsButtonElement();
	}
	
	@When("User selects the view Wallet Analytics button")
	public void User_selects_the_view_Wallet_Analytics_button() {
		AnalyticsSelectionPageInstance.clickWalletAnalyticsButtonElement();
	}

	@When("User selects a certain link")
	public void user_selects_a_certain_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*AnalyticsSelectionPageInstance.getSidebarSelectionElements().size() - 1);
		AnalyticsSelectionPageInstance.getSidebarSelectionElements().get(randomNumber).click();
	}

	@When("User selects Navbar to enter an incorrect wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_an_incorrect_wallet_address(String address) {
		AnalyticsSelectionPageInstance.setNavbarInputElement(address);
		AnalyticsSelectionPageInstance.clickNavbarButtonElement();
	}

	@When("User selects Navbar to enter a correct wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_a_correct_wallet_address(String address) {
		AnalyticsSelectionPageInstance.setNavbarInputElement(address);
		AnalyticsSelectionPageInstance.clickNavbarButtonElement();
	}

	@When("User selects a footer link")
	public void user_selects_a_footer_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*AnalyticsSelectionPageInstance.getFooterLinkElements().size() - 1); 
		AnalyticsSelectionPageInstance.getFooterLinkElements().get(randomNumber).click();
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
		String text = AnalyticsSelectionPageInstance.getNavbarAlertElement().getText();
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
	
	@Then("Redirect User to the Token Analytics page")
	public void Redirect_User_to_the_Token_Analytics_page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.ethwdashboard.xyz/collections");
	}
	
	@Then("Redirect User to the Wallet Analytics page")
	public void Redirect_User_to_the_Wallet_Analytics_page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.ethwdashboard.xyz/walletAnalytics");
	}
}