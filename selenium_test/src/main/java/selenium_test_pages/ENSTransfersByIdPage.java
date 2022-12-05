package selenium_test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ENSTransfersByIdPage {
	// Represent ENS Transfers By Id Page as a model using Page Factory architecture 
	
	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;
	
	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//form//input")
	private WebElement addressInputElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//form//button")
	private WebElement lookupTransfersButtonElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//button[1]")
	private WebElement homeButtonElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//button[2]")
	private WebElement clearButtonElement;
	
	
	// Page Object Model in action for ENSTransfersById page
	public ENSTransfersByIdPage(WebDriver driver) {
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
		this.lookupTransfersButtonElement.click();
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

	public WebElement getLookupTransfersButtonElement() {
		return lookupTransfersButtonElement;
	}

	public WebElement getHomeButtonElement() {
		return homeButtonElement;
	}

	public WebElement getClearButtonElement() {
		return clearButtonElement;
	}
	
}
