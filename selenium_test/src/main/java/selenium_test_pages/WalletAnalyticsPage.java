package selenium_test_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalletAnalyticsPage {
	// Represent Wallet Analytics Page as a model using Page Factory architecture
	
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
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//form//input")
	private WebElement addressInputElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//form//main//label//p")
	private WebElement networkSelectorDescriptionTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//form//main//div//label")
	private List<WebElement> networkSelectorLabelsElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//form//main//div//input")
	private List<WebElement> networkSelectorInputsElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//form//button")
	private WebElement submitButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//button[1]")
	private WebElement homeButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//button[2]")
	private WebElement clearButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//h4")
	private WebElement balanceInformationTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//h5")
	private WebElement walletBalanceTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//h6")
	private WebElement walletAmountTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//div//div[1]//h3")
	private WebElement walletTransactionTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//div//div[2]//div//table")
	private WebElement walletTransactionTableElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[3]//div//div[1]//h3")
	private WebElement walletERC20HoldingsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[3]//div//div[2]//table")
	private WebElement walletERC20HoldingsTableElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[4]//div//div[1]//h3")
	private WebElement walletERC721HoldingsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[4]//div//div[2]//div//table")
	private WebElement walletERC721HoldingsTableElement;
	
	public WalletAnalyticsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setNavbarInputElement(String keys) {
		this.navbarInputElement.sendKeys(keys);
	}
	
	public void setAddressInputElement(String keys) {
		this.addressInputElement.sendKeys(keys);
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

	public WebElement getAddressInputElement() {
		return addressInputElement;
	}

	public WebElement getNetworkSelectorDescriptionTitleElement() {
		return networkSelectorDescriptionTitleElement;
	}

	public List<WebElement> getNetworkSelectorLabelsElement() {
		return networkSelectorLabelsElement;
	}

	public List<WebElement> getNetworkSelectorInputsElement() {
		return networkSelectorInputsElement;
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

	public WebElement getBalanceInformationTitleElement() {
		return balanceInformationTitleElement;
	}

	public WebElement getWalletBalanceTitleElement() {
		return walletBalanceTitleElement;
	}

	public WebElement getWalletAmountTitleElement() {
		return walletAmountTitleElement;
	}

	public WebElement getWalletTransactionTitleElement() {
		return walletTransactionTitleElement;
	}

	public WebElement getWalletTransactionTableElement() {
		return walletTransactionTableElement;
	}

	public WebElement getWalletERC20HoldingsTitleElement() {
		return walletERC20HoldingsTitleElement;
	}

	public WebElement getWalletERC20HoldingsTableElement() {
		return walletERC20HoldingsTableElement;
	}

	public WebElement getWalletERC721HoldingsTitleElement() {
		return walletERC721HoldingsTitleElement;
	}

	public WebElement getWalletERC721HoldingsTableElement() {
		return walletERC721HoldingsTableElement;
	}
}