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
import pages.ERC20TokenPricesPage;

public class ERC20TokenPricesPageStepDefinition {
	
	private WebDriver driver;
	private ERC20TokenPricesPage ERC20TokenPricesInstance;
	
	@Given("User lands on a particular page")
	public void user_lands_on_a_particular_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/erc20-token-prices"); // Launch ERC20 Token price page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		ERC20TokenPricesInstance = new ERC20TokenPricesPage(this.driver);
		
		String ERC20Title = ERC20TokenPricesInstance.getErc20TokenNameTitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/erc20-token-prices", this.driver.getCurrentUrl());
		Assert.assertEquals("ERC20 Token Market Data", ERC20Title);
	}
	
	@Given("User lands on ERC20 Token Prices Page")
	public void User_lands_on_ERC20_Token_Prices_Page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/erc20-token-prices"); // Launch ERC20 Token price page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		ERC20TokenPricesInstance = new ERC20TokenPricesPage(this.driver);
		
		String ERC20Title = ERC20TokenPricesInstance.getErc20TokenNameTitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/erc20-token-prices", this.driver.getCurrentUrl());
		Assert.assertEquals("ERC20 Token Market Data", ERC20Title);
	}

	@When("User selects a certain link")
	public void user_selects_a_certain_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*ERC20TokenPricesInstance.getSidebarSelectionElements().size() - 1);
		ERC20TokenPricesInstance.getSidebarSelectionElements().get(randomNumber).click();
	}

	@When("User selects Navbar to enter an incorrect wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_an_incorrect_wallet_address(String address) {
		ERC20TokenPricesInstance.setNavbarInputElement(address);
		ERC20TokenPricesInstance.clickNavbarButtonElement();
	}

	@When("User selects Navbar to enter a correct wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_a_correct_wallet_address(String address) {
		ERC20TokenPricesInstance.setNavbarInputElement(address);
		ERC20TokenPricesInstance.clickNavbarButtonElement();
	}

	@When("User selects a footer link")
	public void user_selects_a_footer_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*ERC20TokenPricesInstance.getFooterLinkElements().size() - 1); 
		ERC20TokenPricesInstance.getFooterLinkElements().get(randomNumber).click();
	}		

	@When("User enters a correct ERC20 contract address for ERC20 price lookup \\”([^\\”]*)\\")
	public void User_enters_a_correct_ERC20_contract_address_for_ERC20_price_lookup(String address) {
		ERC20TokenPricesInstance.setAddressInputElement(address);
		ERC20TokenPricesInstance.clickSubmitButtonElement();
	}
	
	@When("User enters an incorrect ERC20 contract address for ERC20 price lookup \\”([^\\”]*)\\")
	public void User_enters_an_incorrect_ERC20_contract_address_for_ERC20_price_lookup(String address) {
		ERC20TokenPricesInstance.setAddressInputElement(address);
		ERC20TokenPricesInstance.clickSubmitButtonElement();
	}
	
	@When("User enters an ERC20 contract address for price lookup and requests to clear \\”([^\\”]*)\\")
	public void User_enters_an_ERC20_contract_address_for_price_lookup_and_requests_to_clear(String address) {
		ERC20TokenPricesInstance.setAddressInputElement(address);
		ERC20TokenPricesInstance.clickSubmitButtonElement();
		ERC20TokenPricesInstance.clickClearButtonElement();
	}
	
	@When("User enters an ERC20 contract address for price lookup and requests to go back \\”([^\\”]*)\\")
	public void User_enters_an_ERC20_contract_address_for_price_lookup_and_requests_to_go_back(String address) {
		ERC20TokenPricesInstance.setAddressInputElement(address);
		ERC20TokenPricesInstance.clickSubmitButtonElement();
		ERC20TokenPricesInstance.clickHomeButtonElement();
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
		String text = ERC20TokenPricesInstance.getNavbarAlertElement().getText();
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
	
	@Then("Display ERC20 price information to User")
	public void Display_ERC20_price_information_to_User() {
		boolean flag = false;
		String ERC20TokenTitle = ERC20TokenPricesInstance.getErc20TokenNameTitleElement().getText();
		
		if (!ERC20TokenTitle.contains("Ethereum Price: ")) {
			flag = true;
		}
		
		Assert.assertEquals(flag, true);
	}
	
	@Then("Display alert warning User clear data if any and default to ETH price chart")
	public void Display_alert_warning_User_clear_data_if_any_and_default_to_ETH_price_chart() {
		String message = ERC20TokenPricesInstance.getAddressAlertElement().getText();
		Assert.assertEquals(message, "You need to enter a valid address!");
	}
	
	@Then("Clear data if any and default to ETH price chart")
	public void Clear_data_if_any_and_default_to_ETH_price_chart() {
		boolean flag = false;
		String ERC20TokenTitle = ERC20TokenPricesInstance.getErc20TokenNameTitleElement().getText();
		
		if (ERC20TokenTitle.contains("Ethereum Price: ")) {
			flag = true;
		}
		
		Assert.assertEquals(flag, true);
	}
	
	@Then("Redirect User to Home Page")
	public void Redirect_User_to_Home_Page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.ethwdashboard.xyz/");
	}
}