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
import pages.ENSTransfersByIdPage;

public class ENSTransfersByIdPageStepDefinition {

	private WebDriver driver;
	private ENSTransfersByIdPage ENSTransfersByIdInstance;
	
	@Given("User lands on a particular page")
	public void user_lands_on_a_particular_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/ens-lookup/ens-transfers-by-id"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ENSTransfersByIdInstance = new ENSTransfersByIdPage(this.driver);
		String ResolverTitle = ENSTransfersByIdInstance.getENSTransfersByIdTitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/ens-lookup/ens-transfers-by-id", this.driver.getCurrentUrl());
		Assert.assertEquals("ENS Lookups", ResolverTitle);
	}
	
	@Given("User lands on ENS Transfers By ID Page")
	public void User_lands_on_ENS_Transfers_By_ID_Page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/ens-lookup/ens-transfers-by-id"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ENSTransfersByIdInstance = new ENSTransfersByIdPage(this.driver);
		String ResolverTitle = ENSTransfersByIdInstance.getENSTransfersByIdTitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/ens-lookup/ens-transfers-by-id", this.driver.getCurrentUrl());
		Assert.assertEquals("ENS Lookups", ResolverTitle);
	}
	
	@When("User enters a correct ENS ID for address lookup \\”([^\\”]*)\\")
	public void User_enters_a_correct_ENS_ID_for_address_lookup(String id) {
		ENSTransfersByIdInstance.setAddressInputElement(id);
		ENSTransfersByIdInstance.clickLookupReversalButtonElement();
	}
	
	@When("User enters an incorrect ENS ID for address lookup \\”([^\\”]*)\\")
	public void User_enters_an_incorrect_ENS_ID_for_address_lookup(String id) {
		ENSTransfersByIdInstance.setAddressInputElement(id);
		ENSTransfersByIdInstance.clickLookupReversalButtonElement();
	}
	
	@When("User enters an ENS ID for address lookup and requests to clear \\”([^\\”]*)\\")
	public void User_enters_an_ENS_ID_for_address_lookup_and_requests_to_clear(String id) {
		ENSTransfersByIdInstance.setAddressInputElement(id);
		ENSTransfersByIdInstance.clickLookupReversalButtonElement();
		ENSTransfersByIdInstance.clickClearButtonElement();
	}
	
	@When("User enters an ENS ID for address lookup and requests to go back \\”([^\\”]*)\\")
	public void User_enters_an_ENS_ID_for_address_lookup_and_requests_to_go_back(String id) {
		ENSTransfersByIdInstance.setAddressInputElement(id);
		ENSTransfersByIdInstance.clickLookupReversalButtonElement();
		ENSTransfersByIdInstance.clickHomeButtonElement();
	}

	@When("User selects a certain link")
	public void user_selects_a_certain_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*ENSTransfersByIdInstance.getSidebarSelectionElements().size() - 1);
		ENSTransfersByIdInstance.getSidebarSelectionElements().get(randomNumber).click();
	}

	@When("User selects Navbar to enter an incorrect wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_an_incorrect_wallet_address(String address) {
		ENSTransfersByIdInstance.setNavbarInputElement(address);
		ENSTransfersByIdInstance.clickNavbarButtonElement();
	}

	@When("User selects Navbar to enter a correct wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_a_correct_wallet_address(String address) {
		ENSTransfersByIdInstance.setNavbarInputElement(address);
		ENSTransfersByIdInstance.clickNavbarButtonElement();
	}


	@When("User selects a footer link")
	public void user_selects_a_footer_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*ENSTransfersByIdInstance.getFooterLinkElements().size() - 1); 
		ENSTransfersByIdInstance.getFooterLinkElements().get(randomNumber).click();
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
		Assert.assertEquals("https://ethwdashboard.xyz/transactions", URL);
	}

	@Then("Display alert warning User")
	public void display_alert_warning_user() {
		String text = ENSTransfersByIdInstance.getNavbarAlertElement().getText();
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
	
	@Then("Redirect User to Home Page")
	public void Redirect_User_to_Home_Page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals("https://ethwdashboard.xyz", URL);
	}
	
	@Then("Display wallet information to User")
	public void Display_wallet_information_to_User() {
		String URL = this.driver.getCurrentUrl();
		String AdditionalInformationTitle = ENSTransfersByIdInstance.getENSTransfersByIdTitleElement().getText();

		
		Assert.assertEquals("https://www.ethwdashboard.xyz/ens-lookup/ens-transfers-by-id", URL);
		Assert.assertEquals("ENS Transfers", AdditionalInformationTitle);
	}
	
	@Then("Display alert warning User clear data if any")
	public void Display_alert_warning_User_clear_data_if_any() {
		String text = ENSTransfersByIdInstance.getNavbarAlertElement().getText();
		Assert.assertEquals("You need to enter a valid address!", text);
	}
	
	@Then("Data or alerts clear on page")
	public void Data_or_alerts_clear_on_page(String id) {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals("https://www.ethwdashboard.xyz/ens-lookup/ens-transfers-by-id", URL);
	}
 }
