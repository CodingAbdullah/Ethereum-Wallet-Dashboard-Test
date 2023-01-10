package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ENSToAddressPage {
	// Represent ENS To Address Page as a model using Page Factory architecture
	
	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;
	
	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//div[1]//h1")
	private WebElement ENSToAddressTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[2]//nav//div[3]//table//tbody//tr")
	private List<WebElement> sidebarSelectionElements;
	
	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[1]//a")
	private List<WebElement> footerLinkElements;
	
	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[2]//p")
	private WebElement footerCopyrightElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//form//input")
	private WebElement addressInputElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//form//button")
	private WebElement lookupReversalButtonElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//button[1]")
	private WebElement homeButtonElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//button[2]")
	private WebElement clearButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//div[3]//div[1]//h3")
	private WebElement ResolverTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//div[4]//div[1]//h3")
	private WebElement AdditionalInfoTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//div[5]//div[1]//h3")
	private WebElement OwnerTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//div[6]//div[1]//h3")
	private WebElement AddressResolverTitleElement;
		
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	// Page Object Model in action for ENSToAddress page
	public ENSToAddressPage(WebDriver driver) {
		this.driver = driver;
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
	
	public void clickLookupReversalButtonElement() {
		this.lookupReversalButtonElement.click();
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

	public WebElement getENSToAddressTitleElement() {
		return ENSToAddressTitleElement;
	}

	public WebElement getResolverTitleElement() {
		return ResolverTitleElement;
	}

	public WebElement getAdditionalInfoTitleElement() {
		return AdditionalInfoTitleElement;
	}

	public WebElement getOwnerTitleElement() {
		return OwnerTitleElement;
	}

	public WebElement getAddressResolverTitleElement() {
		return AddressResolverTitleElement;
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

	public WebElement getLookupReversalButtonElement() {
		return lookupReversalButtonElement;
	}

	public WebElement getHomeButtonElement() {
		return homeButtonElement;
	}

	public WebElement getClearButtonElement() {
		return clearButtonElement;
	}
}
