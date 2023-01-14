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
import pages.ERC20CollectionPage;

public class ERC20CollectionPageStepDefinition {

	private WebDriver driver;
	private ERC20CollectionPage ERC20CollectionPageInstance;
	
	@Given("User lands on a particular page")
	public void user_lands_on_a_particular_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/collections/erc720-collection"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ERC20CollectionPageInstance = new ERC20CollectionPage(this.driver);
		String ERC20Title = ERC20CollectionPageInstance.getERC20TitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/collections/erc720-collection", this.driver.getCurrentUrl());
		Assert.assertEquals("ERC20 Token Analytics", ERC20Title);
	}
	
	@Given("User lands on ERC20 Collection Page")
	public void User_lands_on_ERC20_Collection_Page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/collections/erc720-collection"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ERC20CollectionPageInstance = new ERC20CollectionPage(this.driver);
		String ERC20Title = ERC20CollectionPageInstance.getERC20TitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/collections/erc720-collection", this.driver.getCurrentUrl());
		Assert.assertEquals("ERC20 Token Analytics", ERC20Title);
	}

	@When("User selects a certain link")
	public void user_selects_a_certain_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*ERC20CollectionPageInstance.getSidebarSelectionElements().size() - 1);
		ERC20CollectionPageInstance.getSidebarSelectionElements().get(randomNumber).click();
	}

	@When("User selects Navbar to enter an incorrect wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_an_incorrect_wallet_address(String address) {
		ERC20CollectionPageInstance.setNavbarInputElement(address);
		ERC20CollectionPageInstance.clickNavbarButtonElement();
	}

	@When("User selects Navbar to enter a correct wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_a_correct_wallet_address(String address) {
		ERC20CollectionPageInstance.setNavbarInputElement(address);
		ERC20CollectionPageInstance.clickNavbarButtonElement();
	}

	@When("User selects a footer link")
	public void user_selects_a_footer_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*ERC20CollectionPageInstance.getFooterLinkElements().size() - 1); 
		ERC20CollectionPageInstance.getFooterLinkElements().get(randomNumber).click();
	}
	
	@When("User enters a correct contract address for ERC20 analytics \\”([^\\”]*)\\")
	public void User_enters_a_correct_contract_address_for_ERC20_analytics(String address) {
		ERC20CollectionPageInstance.setAddressInputElement(address);
		ERC20CollectionPageInstance.clickNavbarButtonElement();
	}
	
	@When("User enters an incorrect contract address for ERC20 analytics \\”([^\\”]*)\\")
	public void User_enters_an_incorrect_contract_address_for_ERC20_analytics(String address) {
		ERC20CollectionPageInstance.setAddressInputElement(address);
		ERC20CollectionPageInstance.clickNavbarButtonElement();
	}
	
	@When("User enters a contract address for ERC20 analytics and requests to clear \\”([^\\”]*)\\")
	public void User_enters_a_contract_address_for_ERC20_analytics_and_requests_to_clear(String address) {
		ERC20CollectionPageInstance.setAddressInputElement(address);
		ERC20CollectionPageInstance.clickNavbarButtonElement();
		ERC20CollectionPageInstance.clickClearButtonElement();
	}
	
	@When("User enters a contract address for ERC20 analytics and requests to go back \\”([^\\”]*)\\")
	public void User_enters_a_contract_address_for_ERC20_analytics_and_requests_to_go_back(String address) {
		ERC20CollectionPageInstance.setAddressInputElement(address);
		ERC20CollectionPageInstance.clickNavbarButtonElement();
		ERC20CollectionPageInstance.clickHomeButtonElement();
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
		String text = ERC20CollectionPageInstance.getNavbarAlertElement().getText();
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
	
	@Then("Display wallet analytics information to User")
	public void Display_wallet_analytics_information_to_User() {
		String PriceTitle = ERC20CollectionPageInstance.getPriceTitleElement().getText();
		String ERC20StatisticsTitle = ERC20CollectionPageInstance.getERC20StatisticsTitleElement().getText();
		String ERC20Title = ERC20CollectionPageInstance.getERC20TitleElement().getText();
		String ERC20TransfersTitle = ERC20CollectionPageInstance.getERC20TransfersTitleElement().getText();
		String URL = this.driver.getCurrentUrl();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/collections/erc720-collection", URL);
		Assert.assertEquals(ERC20Title, "ERC20 Token Analytics");
		Assert.assertEquals(PriceTitle.split(" ")[0], "Price:");
		Assert.assertEquals(ERC20StatisticsTitle, "ERC20 Token Analytics");
		Assert.assertEquals(ERC20TransfersTitle, "ERC20 Transfers (Recent or Top 100)");
	}
	
	@Then("Display alert warning User clear data if any")
	public void Display_alert_warning_User_clear_data_if_any() {
		String text = ERC20CollectionPageInstance.getNavbarAlertElement().getText();
		Assert.assertEquals("You need to enter a valid address!", text);
	}
	
	@Then("Clear any contract analytics data")
	public void Clear_any_contract_analytics_data() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals("https://www.ethwdashboard.xyz/collections/erc720-collection", URL);
	}
	
	@Then("Redirect User to home Page")
	public void Redirect_User_to_home_Page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals("https://www.ethwdashboard.xyz", URL);
	}
}
