package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricesPage {
	// Represent Prices Page as a model using Page Factory architecture
	
	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;

	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//nav//div[@class='alert']//div[1]")
	private WebElement navbarAlertElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//button")
	private WebElement coinPricesButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//h1")
	private WebElement pricesPageTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[2]//nav//div[3]//table//tbody//tr")
	private List<WebElement> sidebarSelectionElements;
	
	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[1]//a")
	private List<WebElement> footerLinkElements;
	
	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[2]//p")
	private WebElement footerCopyrightElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//p")
	private WebElement pricesPageDescriptionElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//div[@class='row']//button")
	private List<WebElement> coinPricesCardsElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//button")
	private WebElement hideCoinPricesButtonElement;
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public PricesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setNavbarInputElement(String address) {
		this.navbarInputElement.sendKeys(address);
	}

	public void clickCoinPricesButtonElement() {
		this.coinPricesButtonElement.click();
	}
	
	public void clickHideCoinPricesButtonElement() {
		this.hideCoinPricesButtonElement.click();
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

	public WebElement getCoinPricesButtonElement() {
		return coinPricesButtonElement;
	}

	public WebElement getPricesPageTitleElement() {
		return pricesPageTitleElement;
	}

	public WebElement getPricesPageDescriptionElement() {
		return pricesPageDescriptionElement;
	}

	public List<WebElement> getCoinPricesCardsElement() {
		return coinPricesCardsElement;
	}

	public WebElement getHideCoinPricesButtonElement() {
		return hideCoinPricesButtonElement;
	}

	public WebElement getNavbarInputElement() {
		return navbarInputElement;
	}

	public WebElement getNavbarButtonElement() {
		return navbarButtonElement;
	}

	public WebElement getNavbarAlertElement() {
		return navbarAlertElement;
	}
}