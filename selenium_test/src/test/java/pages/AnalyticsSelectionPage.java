package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnalyticsSelectionPage {
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
	private WebElement analyticsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//label[1]")
	private WebElement tokenAnalyticsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//label[2]")
	private WebElement walletAnalyticsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//button[1]")
	private WebElement tokenAnalyticsButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//button[2]")
	private WebElement walletAnalyticsButtonElement;
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	// Page Object Model in action for ENS Lookups page
	public AnalyticsSelectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setNavbarInputElement(String keys) {
		this.navbarInputElement.sendKeys(keys);
	}
	
	public void clickNavbarButtonElement() {
		this.navbarButtonElement.click();
	}
	
	public void clickTokenAnalyticsButtonElement() {
		this.tokenAnalyticsButtonElement.click();
	}
	
	public void clickWalletAnalyticsButtonElement() {
		this.walletAnalyticsButtonElement.click();
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

	public WebElement getAnalyticsTitleElement() {
		return analyticsTitleElement;
	}

	public WebElement getTokenAnalyticsTitleElement() {
		return tokenAnalyticsTitleElement;
	}

	public WebElement getWalletAnalyticsTitleElement() {
		return walletAnalyticsTitleElement;
	}

	public WebElement getTokenAnalyticsButtonElement() {
		return tokenAnalyticsButtonElement;
	}

	public WebElement getWalletAnalyticsButtonElement() {
		return walletAnalyticsButtonElement;
	}
	
	public WebElement getNavbarAlertElement() {
		return navbarAlertElement;
	}
}