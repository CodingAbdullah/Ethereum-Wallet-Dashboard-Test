package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddressToENSPage;
import pages.ENSToAddressPage;

public class ENSToAddressPageStepDefinition {

	private WebDriver driver;
	private ENSToAddressPage ENSToAddressInstance;
	
	
	@Given("User lands on a particular page")
	public void user_lands_on_a_particular_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/ens-lookup/ens-to-address-lookup"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ENSToAddressInstance = new ENSToAddressPage(this.driver);
		String ResolverTitle = ENSToAddressInstance.getENSToAddressTitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/ens-lookup/ens-to-address-lookup", this.driver.getCurrentUrl());
		Assert.assertEquals("ENS Lookups", ResolverTitle);
	}

	@Given("User lands on ENS To Address Page")
	public void User_lands_on_ENS_To_Address_Page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://www.ethwdashboard.xyz/ens-lookup/address-to-ens-lookup"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ENSToAddressInstance = new ENSToAddressPage(this.driver);
		String ResolverTitle = ENSToAddressInstance.getENSToAddressTitleElement().getText();
		
		Assert.assertEquals("https://www.ethwdashboard.xyz/ens-lookup/ens-to-address-lookup", this.driver.getCurrentUrl());
		Assert.assertEquals("ENS Lookups", ResolverTitle);
	}

	@When("User selects a certain link")
	public void user_selects_a_certain_link() {
		
	}

	@When("User selects Navbar to enter an incorrect wallet address")
	public void user_selects_navbar_to_enter_an_incorrect_wallet_address() {
		
	}

	@When("User selects Navbar to enter a correct wallet address")
	public void user_selects_navbar_to_enter_a_correct_wallet_address() {
		
	}

	@When("User selects a footer link")
	public void user_selects_a_footer_link() {
		
	}

	@Then("Redirect User to that page")
	public void redirect_user_to_that_page() {
		
	}

	@Then("Redirect User to Transactions Page")
	public void redirect_user_to_transactions_page() {
		
	}

	@Then("Display alert warning User")
	public void display_alert_warning_user() {
		
	}

	@Then("Redirect User to that link")
	public void redirect_user_to_that_link() {
		
	}
}
