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
import pages.EthDashboardHomePage;

public class EthDashboardHomePageStepDefinition {

	private WebDriver driver;
	private EthDashboardHomePage EthDashboardHomePageInstance;
	
	@Given("User lands on a particular page")
	public void User_lands_on_a_particular_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		EthDashboardHomePageInstance = new EthDashboardHomePage(this.driver);
		String HomePageTitle = EthDashboardHomePageInstance.getDashboardTitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz", this.driver.getCurrentUrl());
		Assert.assertEquals("Dashboard", HomePageTitle);
	}
	
	@Given("User lands on Home page")
	public void User_lands_on_Home_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		EthDashboardHomePageInstance = new EthDashboardHomePage(this.driver);
		String HomePageTitle = EthDashboardHomePageInstance.getDashboardTitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz", this.driver.getCurrentUrl());
		Assert.assertEquals("Dashboard", HomePageTitle);
	}

	@When("User selects a certain link")
	public void User_selects_a_certain_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*EthDashboardHomePageInstance.getSidebarSelectionElements().size() - 1);
		EthDashboardHomePageInstance.getSidebarSelectionElements().get(randomNumber).click();
	}

	@When("User selects Navbar to enter an incorrect wallet address \\”([^\\”]*)\\")
	public void User_selects_Navbar_to_enter_an_incorrect_wallet_address(String address) {
		EthDashboardHomePageInstance.setNavbarInputElement(address);
		EthDashboardHomePageInstance.clickNavbarButtonElement();
	}

	@When("User selects Navbar to enter a correct wallet address \\”([^\\”]*)\\")
	public void User_selects_Navbar_to_enter_a_correct_wallet_address(String address) {
		EthDashboardHomePageInstance.setNavbarInputElement(address);
		EthDashboardHomePageInstance.clickNavbarButtonElement();
	}
	
	@When("User selects home page input to enter a correct wallet address \\”([^\\”]*)\\")
	public void User_selects_home_page_input_to_enter_a_correct_wallet_address(String address) {
		EthDashboardHomePageInstance.setDashboardInputElement(address);
		EthDashboardHomePageInstance.getDashboardButtonElement().click();
	}

	@When("User selects home page input to enter an incorrect wallet address \\”([^\\”]*)\\")
	public void User_selects_home_page_input_to_enter_an_incorrect_wallet_address(String address) {
		EthDashboardHomePageInstance.setDashboardInputElement(address);
		EthDashboardHomePageInstance.getDashboardButtonElement().click();
	}

	@When("User selects a footer link")
	public void User_selects_a_footer_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*EthDashboardHomePageInstance.getFooterLinkElements().size() - 1); 
		EthDashboardHomePageInstance.getFooterLinkElements().get(randomNumber).click();
	}
	
	@When("User selects BTC price button")
	public void User_selects_BTC_price_button() {
		EthDashboardHomePageInstance.clickBTCChartButtonElement();
	}
	
	@When("User selects ETH price button")
	public void User_selects_ETH_price_button() {
		EthDashboardHomePageInstance.clickETHChartButtonElement();
	}
	
	@Then("Redirect User to that page")
	public void Redirect_user_to_that_page() {
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
	public void Redirect_user_to_transactions_page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals("https://www.ethwdashboard.xyz/transactions", URL);
	}

	@Then("Display alert warning User")
	public void Display_alert_warning_user() {
		String text = EthDashboardHomePageInstance.getNavbarAlertElement().getText();
		Assert.assertEquals("You need to enter a valid address!", text);
	}
	
	@Then("Display dashboard alert warning User")
	public void Display_dashboard_alert_warning_User() {
		String text = EthDashboardHomePageInstance.getDashboardInputAlertElement().getText();
		Assert.assertEquals("You need to enter a valid address!", text);
	}

	@Then("Redirect User to that link")
	public void Redirect_user_to_that_link() {
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
	
	@Then("Redirect User to BTC price chart")
	public void Redirect_User_to_BTC_price_chart() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals("https://www.ethwdashboard.xyz/chart", URL);
	}
	
	@Then("Redirect User to ETH price chart")
	public void Redirect_User_to_ETH_price_chart() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals("https://www.ethwdashboard.xyz/chart", URL);
	}
}
