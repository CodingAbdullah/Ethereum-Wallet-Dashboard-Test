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
import pages.ERC721LookupsPage;

public class ERC721LookupsPageStepDefinition {

	private WebDriver driver;
	private ERC721LookupsPage ERC721LookupsPageInstance;
	
	@Given("User lands on a particular page")
	public void user_lands_on_a_particular_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/erc721-lookups"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ERC721LookupsPageInstance = new ERC721LookupsPage(this.driver);		
		Assert.assertEquals("https://www.ethwdashboard.xyz/erc721-lookups", this.driver.getCurrentUrl());
	}
	
	@Given("User lands on ERC721 Lookups Page")
	public void User_lands_on_ERC721_Lookups_Page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/erc721-lookups"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ERC721LookupsPageInstance = new ERC721LookupsPage(this.driver);
		Assert.assertEquals("https://www.ethwdashboard.xyz/erc721-lookups", this.driver.getCurrentUrl());
	}

	@When("User selects a certain link")
	public void user_selects_a_certain_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*ERC721LookupsPageInstance.getSidebarSelectionElements().size() - 1);
		ERC721LookupsPageInstance.getSidebarSelectionElements().get(randomNumber).click();
	}

	@When("User selects Navbar to enter an incorrect wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_an_incorrect_wallet_address(String address) {
		ERC721LookupsPageInstance.setNavbarInputElement(address);
		ERC721LookupsPageInstance.clickNavbarButtonElement();
	}

	@When("User selects Navbar to enter a correct wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_a_correct_wallet_address(String address) {
		ERC721LookupsPageInstance.setNavbarInputElement(address);
		ERC721LookupsPageInstance.clickNavbarButtonElement();
	}
	@When("User selects a footer link")
	public void user_selects_a_footer_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*ERC721LookupsPageInstance.getFooterLinkElements().size() - 1); 
		ERC721LookupsPageInstance.getFooterLinkElements().get(randomNumber).click();
	}
	
	@When("User enters correct information for ERC721 lookups \\”([^\\”]*)\\ \\”([^\\”]*)\\")
	public void User_enters_correct_information_for_ERC721_lookups(String address, String id) {
		int randomNumber = (int)((Math.random())*ERC721LookupsPageInstance.getErc721LookupsNetworkSelectorInputsElement().size() - 1);
		ERC721LookupsPageInstance.setTokenAddressInputElement(address);
		ERC721LookupsPageInstance.setTokenIdInputElement(id);
		ERC721LookupsPageInstance.getErc721LookupsNetworkSelectorInputsElement().get(randomNumber).click();
		ERC721LookupsPageInstance.clickSubmitButtonElement();
		
	}
	
	@When("User enters incorrect information for ERC721 lookups \\”([^\\”]*)\\ \\”([^\\”]*)\\")
	public void User_enters_incorrect_information_for_ERC721_lookups(String address, String id) {
		int randomNumber = (int)((Math.random())*ERC721LookupsPageInstance.getErc721LookupsNetworkSelectorInputsElement().size() - 1);
		ERC721LookupsPageInstance.setTokenAddressInputElement(address);
		ERC721LookupsPageInstance.setTokenIdInputElement(id);
		ERC721LookupsPageInstance.getErc721LookupsNetworkSelectorInputsElement().get(randomNumber).click();
		ERC721LookupsPageInstance.clickSubmitButtonElement();
	}
	
	@When("User enters information for ERC721 lookups and requests to clear \\”([^\\”]*)\\ \\”([^\\”]*)\\")
	public void User_enters_information_for_ERC721_lookups_and_requests_to_clear(String address, String id) {
		int randomNumber = (int)((Math.random())*ERC721LookupsPageInstance.getErc721LookupsNetworkSelectorInputsElement().size() - 1);
		ERC721LookupsPageInstance.setTokenAddressInputElement(address);
		ERC721LookupsPageInstance.setTokenIdInputElement(id);
		ERC721LookupsPageInstance.getErc721LookupsNetworkSelectorInputsElement().get(randomNumber).click();
		ERC721LookupsPageInstance.clickSubmitButtonElement();
		ERC721LookupsPageInstance.clickClearButtonElement();
	}
	
	@When("User enters information for ERC721 lookups and requests to go back \\”([^\\”]*)\\ \\”([^\\”]*)\\")
	public void User_enters_information_for_ERC721_lookups_and_requests_to_go_back(String address, String id) {
		int randomNumber = (int)((Math.random())*ERC721LookupsPageInstance.getErc721LookupsNetworkSelectorInputsElement().size() - 1);
		ERC721LookupsPageInstance.setTokenAddressInputElement(address);
		ERC721LookupsPageInstance.setTokenIdInputElement(id);
		ERC721LookupsPageInstance.getErc721LookupsNetworkSelectorInputsElement().get(randomNumber).click();
		ERC721LookupsPageInstance.clickSubmitButtonElement();
		ERC721LookupsPageInstance.clickHomeButtonElement();
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
		String text = ERC721LookupsPageInstance.getNavbarAlertElement().getText();
		Assert.assertEquals("You need to enter a valid address!", text);
	}

	@Then("Display ERC721 lookups information to User")
	public void Display_ERC721_lookups_information_to_User() {
		String informationText = ERC721LookupsPageInstance.getErc721LookupsInformationTitleElement().getText();
		String rarityText = ERC721LookupsPageInstance.getErc721LookupsRarityTitleElement().getText();
		String transferText = ERC721LookupsPageInstance.getErc721LookupsTransfersTitleElement().getText();
		String salesText = ERC721LookupsPageInstance.getErc721LookupsSalesTitleElement().getText();
		
		Assert.assertEquals("ERC721 Token Lookup Information", informationText);
		Assert.assertEquals("ERC721 Token Rarity Calculator", rarityText);
		Assert.assertEquals("ERC721 Token Transfers", transferText);
		Assert.assertEquals("ERC-721 Token Sales", salesText);
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
	
	@Then("Display alert warning User clear data if any")
	public void Display_alert_warning_User_clear_data_if_any() {
		String text = ERC721LookupsPageInstance.getNavbarAlertElement().getText();
		Assert.assertEquals("You need to enter a valid address!", text);
	}
	
	@Then("Clear any ERC721 lookup data")
	public void Clear_any_ERC721_lookup_data() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals("https://www.ethwdashboard.xyz/erc721-lookups", URL);
	}
	
	@Then("Redirect User to home Page")
	public void Redirect_User_to_home_Page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals("https://www.ethwdashboard.xyz/erc721-lookups", URL);
	}
}