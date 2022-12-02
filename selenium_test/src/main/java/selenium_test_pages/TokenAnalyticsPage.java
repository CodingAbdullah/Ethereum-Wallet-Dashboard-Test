package selenium_test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TokenAnalyticsPage {
	// Represent Token Analytics Page as a model using Page Factory architecture

	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;
	
	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[1]//h1")
	private WebElement tokenAnalyticsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//label[1]")
	private WebElement erc20TitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//label[2]")
	private WebElement erc721TitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//button[1]")
	private WebElement erc20ButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//button[2]")
	private WebElement erc721ButtonElement;
	
	
	// Page Object Model in action for Token Analytics Page
	public TokenAnalyticsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setNavbarInputElement(String keys) {
		this.navbarInputElement.sendKeys(keys);
	}
	
	public void clickNavbarButtonElement() {
		this.navbarButtonElement.click();
	}
	
	public void setERC20ButtonElement() {
		this.erc20ButtonElement.click();
	}
	
	public void setERC721ButtonElement() {
		this.erc721ButtonElement.click();
	}
	
	public WebElement getNavbarInputElement() {
		return this.navbarInputElement;
	}
	
	public WebElement getNavbarButtonElement() {
		return this.navbarButtonElement;
	}
	
	public WebElement getTokenAnalyticsTitleElement() {
		return this.tokenAnalyticsTitleElement;
	}
	
	public WebElement getERC20TitleElement() {
		return this.erc20TitleElement;
	}
	
	public WebElement getERC721TitleElement() {
		return this.erc721TitleElement;
	}
	
	public WebElement getERC20ButtonElement() {
		return this.erc20ButtonElement;
	}
	
	public WebElement getERC721ButtonElement() {
		return this.erc721ButtonElement;
	}
}
