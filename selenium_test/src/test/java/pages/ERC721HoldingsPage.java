package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ERC721HoldingsPage {
	// Represent ERC721 Holdings Page as a model using Page Factory architecture

	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;

	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//nav//div[@class='alert']//div[1]")
	private WebElement navbarAlertElement;
	
	@FindBy(xpath="//div[@class='App']//div[2]//nav//div[3]//table//tbody//a")
	private List<WebElement> sidebarSelectionElements;
	
	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[1]//a")
	private List<WebElement> footerLinkElements;
	
	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[2]//p")
	private WebElement footerCopyrightElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//form//button")
	private WebElement submitButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//button[1]")
	private WebElement homeButtonElement;

	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[1]//h2")
	private WebElement erc721HoldingsMainElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//button[2]")
	private WebElement clearButtonElement;
		
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//div//form//label")
	private WebElement erc721HoldingsInstructionTitleElement;

	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//div//form//input")
	private WebElement erc721HoldingsInputElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//div//form//main//label//p")
	private WebElement erc721HoldingsNetworkSelectorTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//div//form//main//div[@class='form-check']//label")
	private List<WebElement> erc721HoldingsNetworkSelectorLabelsElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//div//form//main//div[@class='form-check']//input")
	private List<WebElement> erc721HoldingsNetworkSelectorsElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//div//main//div//h3")
	private WebElement erc721HoldingsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//div//div//table")
	private WebElement erc721HoldingsTableElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[3]//div//main//div//h3")
	private WebElement erc721HoldingsTransfersTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[3]//div//table")
	private WebElement erc721HoldingsTransfersTableElement;
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setNavbarInputElement(String keys) {
		this.navbarInputElement.sendKeys(keys);
	}

	public void setERC721HoldingsInputElement(String keys) {
		this.erc721HoldingsInputElement.sendKeys(keys);
	}
	
	public ERC721HoldingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
		return this.navbarInputElement;
	}
	
	public WebElement getNavbarButtonElement() {
		return this.navbarButtonElement;
	}
	
	public void clickNavbarButtonElement() {
		this.navbarButtonElement.click();
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

	public WebElement getSubmitButtonElement() {
		return submitButtonElement;
	}

	public WebElement getHomeButtonElement() {
		return homeButtonElement;
	}

	public WebElement getErc721HoldingsMainElement() {
		return erc721HoldingsMainElement;
	}

	public WebElement getClearButtonElement() {
		return clearButtonElement;
	}

	public WebElement getErc721HoldingsInstructionTitleElement() {
		return erc721HoldingsInstructionTitleElement;
	}

	public WebElement getErc721HoldingsInputElement() {
		return erc721HoldingsInputElement;
	}

	public WebElement getErc721HoldingsNetworkSelectorTitleElement() {
		return erc721HoldingsNetworkSelectorTitleElement;
	}

	public List<WebElement> getErc721HoldingsNetworkSelectorLabelsElement() {
		return erc721HoldingsNetworkSelectorLabelsElement;
	}

	public List<WebElement> getErc721HoldingsNetworkSelectorsElement() {
		return erc721HoldingsNetworkSelectorsElement;
	}

	public WebElement getErc721HoldingsTitleElement() {
		return erc721HoldingsTitleElement;
	}

	public WebElement getErc721HoldingsTableElement() {
		return erc721HoldingsTableElement;
	}

	public WebElement getErc721HoldingsTransfersTitleElement() {
		return erc721HoldingsTransfersTitleElement;
	}

	public WebElement getErc721HoldingsTransfersTableElement() {
		return erc721HoldingsTransfersTableElement;
	}
	
	public WebElement getNavbarAlertElement() {
		return navbarAlertElement;
	}
}