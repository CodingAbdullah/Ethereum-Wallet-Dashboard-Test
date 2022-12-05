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
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//p")
	private WebElement erc20CollectionDescriptionElement;
	
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
		return navbarInputElement;
	}

	public WebElement getNavbarButtonElement() {
		return navbarButtonElement;
	}

	public WebElement getErc20CollectionTitleElement() {
		return erc20CollectionTitleElement;
	}

	public WebElement getErc20CollectionDescriptionElement() {
		return erc20CollectionDescriptionElement;
	}

	public WebElement getAddressInputElement() {
		return addressInputElement;
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

	public WebElement getErc20PriceTitleElement() {
		return erc20PriceTitleElement;
	}

	public WebElement getErc20StatisticsTitleElement() {
		return erc20StatisticsTitleElement;
	}

	public WebElement getErc20StatisticsTableElement() {
		return erc20StatisticsTableElement;
	}

	public WebElement getErc20TransfersTitleElement() {
		return erc20TransfersTitleElement;
	}

	public WebElement getErc20TransfersTableElement() {
		return erc20TransfersTableElement;
	}
}
