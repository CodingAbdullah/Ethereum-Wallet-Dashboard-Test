package selenium_test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {

	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;
	
	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//div[@class='about']//button")
	private WebElement aboutPageButtonElement;
	
	@FindBy(xpath="//div[@class='about']//main//div[1]//h1")
	private WebElement aboutTitleElement;
	
	@FindBy(xpath="//div[@class='about']//main//div[2]//p")
	private WebElement aboutDescriptionElement;
	
	@FindBy(xpath="//div[@class='about']//main//div[3]//h4")
	private WebElement featuresTitleElement;
	
	@FindBy(xpath="//div[@class='about']//main//div[4]//p")
	private WebElement featuresDescriptionElement;
	
	@FindBy(xpath="//div[@class='about']//main//div[5]//h4")
	private WebElement creditsTitleElement;
	
	@FindBy(xpath="//div[@class='about']//main//div[6]//p")
	private WebElement creditsDescriptionElement;
	
	@FindBy(xpath="//div[@class='about']//main//div[7]//h4")
	private WebElement developerTitleElement;
	
	@FindBy(xpath="//div[@class='about']//main//div[8]//p")
	private WebElement developerDescriptionElement;
	

	// Page Object Model in action for about page
	public AboutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setNavbarInputElement(String keys) {
		this.navbarInputElement.sendKeys(keys);
	}
	
	public void clickNavbarButtonElement() {
		this.navbarButtonElement.click();
	}
	
	public void clickHomeButtonElement() {
		this.aboutPageButtonElement.click();
	}
	
	public WebElement getNavbarInputElement() {
		return this.navbarInputElement;
	}
	
	public WebElement getNavbarButtonElement() {
		return this.navbarButtonElement;
	}
	
	public WebElement getHomeButtonElement() {
		return this.aboutPageButtonElement;
	}
	
	public WebElement getAboutTitleElement() {
		return this.aboutTitleElement;
	}
	
	public WebElement getAboutDescriptionElement() {
		return this.aboutDescriptionElement;
	}
	
	public WebElement getFeaturesTitleElement() {
		return this.featuresTitleElement;
	}
	
	public WebElement getFeaturesDescriptionElement() {
		return this.featuresDescriptionElement;
	}
	
	public WebElement getCreditsTitleElement() {
		return this.creditsTitleElement;
	}
	
	public WebElement getCreditsDescriptionElement() {
		return this.creditsDescriptionElement;
	}
	
	public WebElement getDeveloperTitleElement() {
		return this.developerTitleElement;
	}
	
	public WebElement getDeveloperDescriptionElement() {
		return this.developerDescriptionElement;
	}
}
