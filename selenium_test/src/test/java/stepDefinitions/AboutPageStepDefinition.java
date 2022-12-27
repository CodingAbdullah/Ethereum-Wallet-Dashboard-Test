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
import pages.AboutPage;
import pages.EthDashboardHomePage;

public class AboutPageStepDefinition {
	private WebDriver driver;
	private AboutPage AboutPageInstance;	
	private EthDashboardHomePage HomePageInstance;
	
	@Given("User lands on About Page")
	public void user_lands_on_About_Page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://ethwdashboard.xyz/"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		HomePageInstance = new EthDashboardHomePage(this.driver);
		HomePageInstance.getSidebarSelectionElements().get(0).click();
		
		AboutPageInstance = new AboutPage(HomePageInstance.getDriver());
		AboutPageInstance.getSidebarSelectionElements().get(0).click(); // Click the first link in the side bar to get to About Page
		
		String aboutTitle = AboutPageInstance.getAboutTitleElement().getText();
		String featureTitle = AboutPageInstance.getFeaturesTitleElement().getText();
		String creditsTitle = AboutPageInstance.getCreditsTitleElement().getText();
		String authorInfo = AboutPageInstance.getDeveloperTitleElement().getText();
		
		Assert.assertEquals("https://ethwdashboard.xyz/about", this.driver.getCurrentUrl());
		Assert.assertEquals("About", aboutTitle);
		Assert.assertEquals("Features", featureTitle);
		Assert.assertEquals("Credits", creditsTitle);
		Assert.assertEquals("Author/Developer Information", authorInfo);
	}
	
	@Given("User lands on a particular page")
	public void user_lands_on_a_particular_page() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver"); // Wild card address added for example

		this.driver = new ChromeDriver(); // Setting up driver
		this.driver.get("https://ethwdashboard.xyz/"); // Launch home page of the Ethereum Wallet Dash board

		this.driver.manage().window().maximize(); // Maximize window
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		HomePageInstance = new EthDashboardHomePage(this.driver);
		HomePageInstance.getSidebarSelectionElements().get(0).click();
		
		AboutPageInstance = new AboutPage(HomePageInstance.getDriver());
		AboutPageInstance.getSidebarSelectionElements().get(0).click(); // Click the first link in the side bar to get to About Page
		
		String aboutTitle = AboutPageInstance.getAboutTitleElement().getText();
		String featureTitle = AboutPageInstance.getFeaturesTitleElement().getText();
		String creditsTitle = AboutPageInstance.getCreditsTitleElement().getText();
		String authorInfo = AboutPageInstance.getDeveloperTitleElement().getText();
		
		Assert.assertEquals("https://ethwdashboard.xyz/about", this.driver.getCurrentUrl());
		Assert.assertEquals("About", aboutTitle);
		Assert.assertEquals("Features", featureTitle);
		Assert.assertEquals("Credits", creditsTitle);
		Assert.assertEquals("Author/Developer Information", authorInfo);
	}
	
	@When("User selects the developer information link")
	public void user_selects_the_developer_information_link() {
		AboutPageInstance.getDeveloperLinkElement().click();
	}
	
	@When("User selects the Go Home button")
	public void user_selects_the_go_home_button() {
		AboutPageInstance.clickHomeButtonElement();
	}
	
	@When("User selects a footer link")
	public void user_selects_a_footer_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*AboutPageInstance.getFooterLinkElements().size() - 1); 
		AboutPageInstance.getFooterLinkElements().get(randomNumber).click();
	}
	
	@When("User selects a certain link")
	public void user_selects_a_certain_link() {
		// Randomize selection on each test run
		int randomNumber = (int) ((Math.random())*AboutPageInstance.getSidebarSelectionElements().size() - 1);
		AboutPageInstance.getSidebarSelectionElements().get(randomNumber).click();
	}
	
	@When("User selects Navbar to enter an incorrect wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_an_incorrect_wallet_address(String address) {
		AboutPageInstance.setNavbarInputElement(address);
		AboutPageInstance.clickNavbarButtonElement();
	}
	
	@When("User selects Navbar to enter a correct wallet address \\”([^\\”]*)\\")
	public void user_selects_navbar_to_enter_a_correct_wallet_address(String address) {
		AboutPageInstance.setNavbarInputElement(address);
		AboutPageInstance.clickNavbarButtonElement();
	}
	
	@Then("Redirect User to the developer's about page")
	public void redirect_user_to_the_developers_about_page() {
		List<String> windowList = new ArrayList<String>(this.driver.getWindowHandles());
		this.driver.switchTo().window(windowList.get(1)); // Second window will be the newly opened link to the developer website
		
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://kingabdul.eth.xyz/");
	}
	
	@Then("Redirect User to the Home Page")
	public void redirect_user_to_the_home_page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://ethwdashboard.xyz/");
	}
	
	@Then("Redirect User to that link")
	public void redirect_user_to_that_link() {
		boolean footerFlag = false;
		
		String [] footerLnks = new String[] {
				"https://docs.alchemy.com/reference/api-overview", "https://www.blocknative.com/", "https://www.coingecko.com/",
				"https://etherscan.io/", "https://moralis.io/", "https://www.transpose.io/"
		};
		
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

	@Then("Display alert warning User")
	public void display_alert_warning_user() {
		String text = AboutPageInstance.getNavbarAlertElement().getText();
		Assert.assertEquals("You need to enter a valid address!", text);
	}
	
	@Then("Redirect User to Transactions Page")
	public void redirect_user_to_transactions_page() {
		String URL = this.driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://ethwdashboard.xyz/transactions");
	}
}