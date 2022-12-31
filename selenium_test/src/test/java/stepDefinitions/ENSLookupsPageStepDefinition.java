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
import pages.ENSLookupsPage;


public class ENSLookupsPageStepDefinition {

	private WebDriver driver;
	private ENSLookupsPage ENSLookupsPageInstance;
	
	@Given("User lands on a particular page")
	public void user_lands_on_a_particular_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/ens-lookup"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ENSLookupsPageInstance = new ENSLookupsPage(this.driver);
		
		String ENSLookupsTitle = ENSLookupsPageInstance.getEnsLookupsTitleElement().getText();
		String AddressToENSTitle = ENSLookupsPageInstance.getAddressToEnsTitleElement().getText();
		String ENSToAddressTitle = ENSLookupsPageInstance.getEnsToAddressTitleElement().getText();
		String ENSTransfersByNameTitle = ENSLookupsPageInstance.getEnsTransfersByNameElement().getText();
		String ENSTransfersByIdTitle = ENSLookupsPageInstance.getEnsTransfersByIdElement().getText();

		
		Assert.assertEquals("https://www.ethwdashboard.xyz/ens-lookup", this.driver.getCurrentUrl());
		Assert.assertEquals("ENS Lookups", ENSLookupsTitle);
		Assert.assertEquals("Address -----> ENS", AddressToENSTitle);
		Assert.assertEquals("ENS -----> Address", ENSToAddressTitle);
		Assert.assertEquals("ENS Transfers By Name", ENSTransfersByNameTitle);
		Assert.assertEquals("ENS Transfers By Token Id", ENSTransfersByIdTitle);
	}

	@Given("User lands on ENS Lookups Page")
	public void User_lands_on_ENS_Lookups_Page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/ens-lookup"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ENSLookupsPageInstance = new ENSLookupsPage(this.driver);
		
		String ENSLookupsTitle = ENSLookupsPageInstance.getEnsLookupsTitleElement().getText();
		String AddressToENSTitle = ENSLookupsPageInstance.getAddressToEnsTitleElement().getText();
		String ENSToAddressTitle = ENSLookupsPageInstance.getEnsToAddressTitleElement().getText();
		String ENSTransfersByNameTitle = ENSLookupsPageInstance.getEnsTransfersByNameElement().getText();
		String ENSTransfersByIdTitle = ENSLookupsPageInstance.getEnsTransfersByIdElement().getText();

		
		Assert.assertEquals("https://www.ethwdashboard.xyz/ens-lookup", this.driver.getCurrentUrl());
		Assert.assertEquals("ENS Lookups", ENSLookupsTitle);
		Assert.assertEquals("Address -----> ENS", AddressToENSTitle);
		Assert.assertEquals("ENS -----> Address", ENSToAddressTitle);
		Assert.assertEquals("ENS Transfers By Name", ENSTransfersByNameTitle);
		Assert.assertEquals("ENS Transfers By Token Id", ENSTransfersByIdTitle);
	}

	@When("User selects the view Address To ENS button")
	public void User_selects_the_view_Address_To_ENS_button() {
		ENSLookupsPageInstance.clickAddressToENSButtonElement();
	}
	
	@When("User selects the view ENS To Address button")
	public void User_selects_the_view_ENS_To_Address_button() {
		ENSLookupsPageInstance.clickENSToAddressButtonElement();
	}
	
	@When("User selects the view ENS Transfers By Name button")
	public void User_selects_the_view_ENS_Transfers_By_Name_button() {
		ENSLookupsPageInstance.clickENSTransfersByNameButtonElement();
	}
	
	@When("User selects the view ENS Transfers By Id button")
	public void User_selects_the_view_ENS_Transfers_By_Id_button() {
		ENSLookupsPageInstance.clickENSTransfersByIdButtonElement();
	}
	
	@When("User selects a certain link")
	public void user_selects_a_certain_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*ENSLookupsPageInstance.getSidebarSelectionElements().size() - 1);
		ENSLookupsPageInstance.getSidebarSelectionElements().get(randomNumber).click();
	}

	@When("User selects Navbar to enter an incorrect wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_an_incorrect_wallet_address(String address) {
		ENSLookupsPageInstance.setNavbarInputElement(address);
		ENSLookupsPageInstance.clickNavbarButtonElement();
	}

	@When("User selects Navbar to enter a correct wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_a_correct_wallet_address(String address) {
		ENSLookupsPageInstance.setNavbarInputElement(address);
		ENSLookupsPageInstance.clickNavbarButtonElement();
	}

	@When("User selects a footer link")
	public void user_selects_a_footer_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*ENSLookupsPageInstance.getFooterLinkElements().size() - 1); 
		ENSLookupsPageInstance.getFooterLinkElements().get(randomNumber).click();
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
		String text = ENSLookupsPageInstance.getNavbarAlertElement().getText();
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

	@Then("Redirect User to the Address To ENS page")
	public void Redirect_User_to_the_Address_To_ENS_page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.ethwdashboard.xyz/ens-lookup/address-to-ens-lookup");
	}
	
	@Then("Redirect User to the ENS To Address page")
	public void Redirect_User_to_the_ENS_To_Address_page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.ethwdashboard.xyz/ens-lookup/ens-to-address-lookup");
	}
	
	@Then("Redirect User to the ENS Transfers By Name page")
	public void Redirect_User_to_the_ENS_Transfers_By_Name_page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.ethwdashboard.xyz/ens-lookup/ens-transfers-by-name");
	}
	
	@Then("Redirect User to the ENS Transfers By Id page")
	public void Redirect_User_to_the_ENS_Transfers_By_Id_page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.ethwdashboard.xyz/ens-lookup/ens-transfers-by-id");
	}
}