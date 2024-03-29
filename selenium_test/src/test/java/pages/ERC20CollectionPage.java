package pages;

import java.util.List;

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
	
	@FindBy(xpath="//nav//div[@class='alert']//div[1]")
	private WebElement navbarAlertElement;
	
	@FindBy(xpath="//div[@class='App']//div[2]//nav//div[3]//table//tbody//a")
	private List<WebElement> sidebarSelectionElements;

	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[1]//a")
	private List<WebElement> footerLinkElements;
	
	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[2]//p")
	private WebElement footerCopyrightElement;
	
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
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[3]//div//div//table")
	private WebElement erc20TransfersTableElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main[1]//div//h1")
	private WebElement ERC20TitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//h3")
	private WebElement PriceTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//div[1]//main//div//h3")
	private WebElement ERC20StatisticsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[3]//div[1]//main//div//h3")
	private WebElement ERC20TransfersTitleElement;
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	// Page Object Model in action for ERC20Collection page
	public ERC20CollectionPage(WebDriver driver) {
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

	public WebElement getErc20TransfersTableElement() {
		return erc20TransfersTableElement;
	}

	public WebElement getNavbarAlertElement() {
		return navbarAlertElement;
	}

	public WebElement getPriceTitleElement() {
		return PriceTitleElement;
	}

	public WebElement getERC20StatisticsTitleElement() {
		return ERC20StatisticsTitleElement;
	}

	public WebElement getERC20TransfersTitleElement() {
		return ERC20TransfersTitleElement;
	}
	
	public WebElement getERC20TitleElement() {
		return ERC20TitleElement;
	}
}