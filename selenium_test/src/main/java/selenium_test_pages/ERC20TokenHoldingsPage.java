package selenium_test_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ERC20TokenHoldingsPage {
	// Represent ERC20 Token Holdings Page as a model using Page Factory architecture
	
	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;
	
	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[2]//nav//div[3]//table//tbody//tr")
	private List<WebElement> sidebarSelectionElements;
	
	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[1]//a")
	private List<WebElement> footerLinkElements;
	
	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[2]//p")
	private WebElement footerCopyrightElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[1]//h2")
	private WebElement erc20HoldingsMainElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//form//button")
	private WebElement submitButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//button[1]")
	private WebElement homeButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//button[2]")
	private WebElement clearButtonElement;
		
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//div//form//label")
	private WebElement erc20HoldingsInstructionTitleElement;

	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//div//form//input")
	private WebElement erc20HoldingsInputElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//div//form//main//label//p")
	private WebElement erc20HoldingsNetworkSelectorTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//div//form//main//div[@class='form-check']//label")
	private List<WebElement> erc20HoldingsNetworkSelectorLabelsElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//div//form//main//div[@class='form-check']//input")
	private List<WebElement> erc20HoldingsNetworkSelectorsElement;

	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//main//div//h3")
	private WebElement erc20HoldingsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//table")
	private WebElement erc20HoldingsTableElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//div//h3")
	private WebElement erc20HoldingsTransferTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//div//table")
	private WebElement erc20HoldingsTransferTableElement;
	
	public ERC20TokenHoldingsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setNavbarInputElement(String keys) {
		this.navbarInputElement.sendKeys(keys);
	}

	public void setERC20HoldingsInputElement(String keys) {
		this.erc20HoldingsInputElement.sendKeys(keys);
	}
	
	public void clickHomeButtonElement() {
		this.homeButtonElement.click();
	}
	
	public void clickClearButtonElement() {
		this.clearButtonElement.click();
	}
	
	public void clickSubmitButtonElement() {
		this.submitButtonElement.click();
	}
	
	public void clickNavbarButtonElement() {
		this.navbarButtonElement.click();
	}
	
	public List<WebElement> getSidebarSelectionElements(){
		return this.sidebarSelectionElements;
	}

	public List<WebElement> getFooterLinkElements() {
		return footerLinkElements;
	}

	public WebElement getFooterCopyrightElement() {
		return footerCopyrightElement;
	}

	public WebElement getNavbarInputElement() {
		return navbarInputElement;
	}

	public WebElement getNavbarButtonElement() {
		return navbarButtonElement;
	}

	public WebElement getErc20HoldingsMainElement() {
		return erc20HoldingsMainElement;
	}

	public WebElement getSubmitButtonElement() {
		return submitButtonElement;
	}

	public WebElement getHomeButtonElement() {
		return homeButtonElement;
	}

	public WebElement getClearButtonElement() {
		return clearButtonElement;
	}

	public WebElement getErc20HoldingsInstructionTitleElement() {
		return erc20HoldingsInstructionTitleElement;
	}

	public WebElement getErc20HoldingsInputElement() {
		return erc20HoldingsInputElement;
	}

	public WebElement getErc20HoldingsNetworkSelectorTitleElement() {
		return erc20HoldingsNetworkSelectorTitleElement;
	}

	public List<WebElement> getErc20HoldingsNetworkSelectorLabelsElement() {
		return erc20HoldingsNetworkSelectorLabelsElement;
	}

	public List<WebElement> getErc20HoldingsNetworkSelectorsElement() {
		return erc20HoldingsNetworkSelectorsElement;
	}

	public WebElement getErc20HoldingsTitleElement() {
		return erc20HoldingsTitleElement;
	}

	public WebElement getErc20HoldingsTableElement() {
		return erc20HoldingsTableElement;
	}

	public WebElement getErc20HoldingsTransferTitleElement() {
		return erc20HoldingsTransferTitleElement;
	}

	public WebElement getErc20HoldingsTransferTableElement() {
		return erc20HoldingsTransferTableElement;
	}
}