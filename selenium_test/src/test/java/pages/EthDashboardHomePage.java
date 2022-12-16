package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EthDashboardHomePage {

	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;
	
	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;

	@FindBy(xpath="//div[@class='App']//div[2]//nav//div[3]//table//tbody//tr")
	private List<WebElement> sidebarSelectionElements;
	
	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[1]//a")
	private List<WebElement> footerLinkElements;
	
	@FindBy(xpath="//div[@class='App']//div[4]//footer//div[@class='container']//p[2]//p")
	private WebElement footerCopyrightElement;
	
	@FindBy(xpath="//div[@class='jumbotron']//div[@class='container']//form//input")
	private WebElement dashboardInputElement;
	
	@FindBy(xpath="//div[@class='jumbotron']//div[@class='container']//form//button")
	private WebElement dashboardButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//div[4]//div[@class='row']//button[1]")
	private WebElement btcChartButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//div[4]//div[@class='row']//button[2]")
	private WebElement ethChartButtonElement;
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	// Page Object Model in action for home page
	public EthDashboardHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setDashboardInputElement(String keys) {
		this.dashboardInputElement.sendKeys(keys);
	}
	
	public void clickDashboardInputElement() {
		this.dashboardButtonElement.click();
	}
	
	public void clickNavbarButtonElement() {
		this.navbarButtonElement.click();
	}
	
	public void setNavbarInputElement(String keys) {
		this.navbarInputElement.sendKeys(keys);
	}
	
	public void clickBTCChartButtonElement() {
		this.btcChartButtonElement.click();
	}
	
	public void clickETHChartButtonElement() {
		this.ethChartButtonElement.click();
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

	public WebElement getDashboardInputElement() {
		return dashboardInputElement;
	}

	public WebElement getDashboardButtonElement() {
		return dashboardButtonElement;
	}

	public WebElement getBtcChartButtonElement() {
		return btcChartButtonElement;
	}

	public WebElement getEthChartButtonElement() {
		return ethChartButtonElement;
	}
}
