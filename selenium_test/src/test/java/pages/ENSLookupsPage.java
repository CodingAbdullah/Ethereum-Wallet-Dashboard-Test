package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ENSLookupsPage {
	// Represent ENS Lookups Page as a model using Page Factory architecture
	
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
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[1]//h1")
	private WebElement ensLookupsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//label[1]")
	private WebElement addressToEnsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//label[2]")
	private WebElement ensToAddressTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//label[3]")
	private WebElement ensTransfersByNameElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//label[4]")
	private WebElement ensTransfersByIdElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//button[1]")
	private WebElement addressToEnsButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//button[2]")
	private WebElement ensToAddressButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//button[3]")
	private WebElement ensTransfersByNameButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//button[4]")
	private WebElement ensTransfersByIdButtonElement;
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	// Page Object Model in action for ENS Lookups page
	public ENSLookupsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setNavbarInputElement(String keys) {
		this.navbarInputElement.sendKeys(keys);
	}
	
	public void clickNavbarButtonElement() {
		this.navbarButtonElement.click();
	}
	
	public void clickAddressToENSButtonElement() {
		this.addressToEnsButtonElement.click();
	}
	
	public void clickENSToAddressButtonElement() {
		this.ensToAddressButtonElement.click();
	}
	
	public void clickENSTransfersByNameButtonElement() {
		this.ensTransfersByNameButtonElement.click();
	}
	
	public void clickENSTransfersByIdButtonElement() {
		this.ensTransfersByIdButtonElement.click();
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

	public WebElement getEnsLookupsTitleElement() {
		return ensLookupsTitleElement;
	}

	public WebElement getAddressToEnsTitleElement() {
		return addressToEnsTitleElement;
	}

	public WebElement getEnsToAddressTitleElement() {
		return ensToAddressTitleElement;
	}

	public WebElement getEnsTransfersByNameElement() {
		return ensTransfersByNameElement;
	}

	public WebElement getEnsTransfersByIdElement() {
		return ensTransfersByIdElement;
	}

	public WebElement getAddressToEnsButtonElement() {
		return addressToEnsButtonElement;
	}

	public WebElement getEnsToAddressButtonElement() {
		return ensToAddressButtonElement;
	}

	public WebElement getEnsTransfersByNameButtonElement() {
		return ensTransfersByNameButtonElement;
	}

	public WebElement getEnsTransfersByIdButtonElement() {
		return ensTransfersByIdButtonElement;
	}
	
	public WebElement getNavbarAlertElement() {
		return navbarAlertElement;
	}	
}