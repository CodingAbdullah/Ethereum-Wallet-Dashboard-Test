package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ERC721LookupsPage {
	// Represent ERC721 Lookups Page as a model using Page Factory architecture
	
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
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//button[2]")
	private WebElement clearButtonElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[1]//div[2]//form//p")
	private WebElement erc721LookupsDescriptionElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[1]//div[2]//form//input[1]")
	private WebElement erc721LookupsTokenAddressInputElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[1]//div[2]//form//input[2]")
	private WebElement erc721LookupsTokenIdInputElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[1]//div[2]//form//main//label//p")
	private WebElement erc721LookupsNetworkSelectorTitleElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[1]//div[2]//form//main//div//label")
	private List<WebElement> erc721LookupsNetworkSelectorLabelsElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[1]//div[2]//form//main//div//input")
	private List<WebElement> erc721LookupsNetworkSelectorInputsElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[2]//div//main//div//h3")
	private WebElement erc721LookupsInformationTitleElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[2]//div//div//table")
	private WebElement erc721LookupsInformationTableElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[3]//div//main//div//h3")
	private WebElement erc721LookupsRarityTitleElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[3]//div//div//table")
	private WebElement erc721LookupsRarityTableElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[4]//div//main//div//h3")
	private WebElement erc721LookupsTransfersTitleElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[4]//div//div//table")
	private WebElement erc721LookupsTransfersTableElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[5]//div//main//div//h3")
	private WebElement erc721LookupsSalesTitleElement;
	
	@FindBy(xpath="//div[@class='App']]//div[3]//div//main[5]//div//div//table")
	private WebElement erc721LookupsSalesTableElement;
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public ERC721LookupsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setNavbarInputElement(String keys) {
		this.navbarInputElement.sendKeys(keys);
	}
	
	public void setTokenAddressInputElement(String keys) {
		this.erc721LookupsTokenAddressInputElement.sendKeys(keys);
	}
	
	public void setTokenIdInputElement(String keys) {
		this.erc721LookupsTokenIdInputElement.sendKeys(keys);
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

	public WebElement getSubmitButtonElement() {
		return submitButtonElement;
	}

	public WebElement getHomeButtonElement() {
		return homeButtonElement;
	}

	public WebElement getClearButtonElement() {
		return clearButtonElement;
	}

	public WebElement getErc721LookupsDescriptionElement() {
		return erc721LookupsDescriptionElement;
	}

	public WebElement getErc721LookupsTokenAddressInputElement() {
		return erc721LookupsTokenAddressInputElement;
	}

	public WebElement getErc721LookupsTokenIdInputElement() {
		return erc721LookupsTokenIdInputElement;
	}

	public WebElement getErc721LookupsNetworkSelectorTitleElement() {
		return erc721LookupsNetworkSelectorTitleElement;
	}

	public List<WebElement> getErc721LookupsNetworkSelectorLabelsElement() {
		return erc721LookupsNetworkSelectorLabelsElement;
	}

	public List<WebElement> getErc721LookupsNetworkSelectorInputsElement() {
		return erc721LookupsNetworkSelectorInputsElement;
	}

	public WebElement getErc721LookupsInformationTitleElement() {
		return erc721LookupsInformationTitleElement;
	}

	public WebElement getErc721LookupsInformationTableElement() {
		return erc721LookupsInformationTableElement;
	}

	public WebElement getErc721LookupsRarityTitleElement() {
		return erc721LookupsRarityTitleElement;
	}

	public WebElement getErc721LookupsRarityTableElement() {
		return erc721LookupsRarityTableElement;
	}

	public WebElement getErc721LookupsTransfersTitleElement() {
		return erc721LookupsTransfersTitleElement;
	}

	public WebElement getErc721LookupsTransfersTableElement() {
		return erc721LookupsTransfersTableElement;
	}

	public WebElement getErc721LookupsSalesTitleElement() {
		return erc721LookupsSalesTitleElement;
	}

	public WebElement getErc721LookupsSalesTableElement() {
		return erc721LookupsSalesTableElement;
	}
	
	public WebElement getNavbarAlertElement() {
		return navbarAlertElement;
	}
}