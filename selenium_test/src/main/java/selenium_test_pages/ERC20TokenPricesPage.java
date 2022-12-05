package selenium_test_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ERC20TokenPricesPage {
	// Represent ERC20 Token Prices Page as a model using Page Factory architecture
	
	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;
	
	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[1]//h2")
	private WebElement erc20TokenPricesMainTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[3]//div//form//label")
	private WebElement erc20TokenPricesDescriptionElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[3]//div//form//input")
	private WebElement addressInputElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[3]//div//form//button")
	private WebElement submitButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[3]//div//div//button[1]")
	private WebElement homeButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[3]//div//div//button[2]")
	private WebElement clearButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//h3")
	private WebElement erc20TokenNameTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//h5")
	private WebElement erc20TokenDayChangeTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[4]//canvas")
	private WebElement erc20TokenGraphElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[5]//div//table")
	private WebElement erc20TokenAdditionalInformationTableElement;
	
	
	// Page Object Model in action for ERC20 Token Prices Page
	public ERC20TokenPricesPage(WebDriver driver) {
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

	public WebElement getNavbarInputElement() {
		return this.navbarInputElement;
	}
	
	public WebElement getNavbarButtonElement() {
		return this.navbarButtonElement;
	}
	
	public WebElement getAddressInputElement() {
		return this.addressInputElement;
	}
	
	public WebElement getSubmitButtonElement() {
		return this.submitButtonElement;
	}
	
	public WebElement getHomeButtonElement() {
		return this.homeButtonElement;
	}
	
	public WebElement getClearButtonElement() {
		return this.clearButtonElement;
	}

	public WebElement getErc20TokenPricesMainTitleElement() {
		return erc20TokenPricesMainTitleElement;
	}

	public WebElement getErc20TokenPricesDescriptionElement() {
		return erc20TokenPricesDescriptionElement;
	}

	public WebElement getErc20TokenNameTitleElement() {
		return erc20TokenNameTitleElement;
	}

	public WebElement getErc20TokenDayChangeTitleElement() {
		return erc20TokenDayChangeTitleElement;
	}

	public WebElement getErc20TokenGraphElement() {
		return erc20TokenGraphElement;
	}

	public WebElement getErc20TokenAdditionalInformationTableElement() {
		return erc20TokenAdditionalInformationTableElement;
	}
}