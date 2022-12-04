package selenium_test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ERC20CollectionPage {
	// Represent ERC20 Collection Page as a model using Page Factory architecture
	
	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;
	
	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div//h1")
	private WebElement erc20CollectionTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//form//input")
	private WebElement addressInputElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//form//button")
	private WebElement submitButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//button[1]")
	private WebElement homeButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//button[2]")
	private WebElement clearButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//h3")
	private WebElement erc20PriceTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//div//main//div//h3")
	private WebElement erc20StatisticsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//div//div//table")
	private WebElement erc20StatisticsTableElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[3]//div//main//div//h3")
	private WebElement erc20TransfersTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[3]//div//div//table")
	private WebElement erc20TransfersTableElement;
	
	
	// Page Object Model in action for ERC20Collection page
	public ERC20CollectionPage(WebDriver driver) {
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
	
	public WebElement getERC20CollectionTitleElement() {
		return this.erc20CollectionTitleElement;
	}
	
	public WebElement getERC20PriceTitleElement() {
		return this.erc20PriceTitleElement;
	}
	
	public WebElement getERC20StatisticsTitleElement() {
		return this.erc20StatisticsTitleElement;
	}
	
	public WebElement getERC20StatisticsTableElement() {
		return this.erc20StatisticsTableElement;
	}
	
	public WebElement getERC20TransfersTitleElement() {
		return this.erc20TransfersTitleElement;
	}
	
	public WebElement getERC20TransfersTableElement() {
		return this.erc20TransfersTableElement;
	}
}
