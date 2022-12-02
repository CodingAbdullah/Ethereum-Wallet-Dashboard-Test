package selenium_test_pages;

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
	
	// Page Object Model in action for ENS lookups page
	public ENSLookupsPage(WebDriver driver) {
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
	
	public WebElement getAddressToENSTitleElement() {
		return this.addressToEnsTitleElement;
	}
	
	public WebElement getENSToAddressTitleElement() {
		return this.ensToAddressTitleElement;
	}
	
	public WebElement getENSTransfersByNameTitleElement() {
		return this.ensTransfersByNameElement;
	}
	
	public WebElement getENSTransfersByIdTitleElement() {
		return this.ensTransfersByIdElement;
	}
	
	public WebElement getAddressToENSButtonElement() {
		return this.addressToEnsButtonElement;
	}
	
	public WebElement getENSToAddressButtonElement() {
		return this.ensToAddressButtonElement;
	}
	
	public WebElement getENSTransfersByNameButtonElement() {
		return this.ensTransfersByNameButtonElement;
	}
	
	public WebElement getENSTransfersByIdButtonElement() {
		return this.ensTransfersByIdButtonElement;
	}
	
	public WebElement getNavbarInputElement() {
		return this.navbarInputElement;
	}
	
	public WebElement getNavbarButtonElement() {
		return this.navbarButtonElement;
	}
}
