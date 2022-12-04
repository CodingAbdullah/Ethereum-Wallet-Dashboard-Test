package selenium_test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ENSERC721SelectionPage {
	
	
	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;
	
	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[1]//h1")
	private WebElement ensERC721TitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//label[1]")
	private WebElement ensLookupsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//label[2]")
	private WebElement erc721LookupsTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//button[1]")
	private WebElement ensLookupsButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div[@class='container']//div//button[2]")
	private WebElement erc721LookupsButtonElement;
	
	
	public ENSERC721SelectionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setNavbarInputElement(String keys) {
		this.navbarInputElement.sendKeys(keys);
	}
	
	public void clickNavbarButtonElement() {
		this.navbarButtonElement.click();
	}
	
	public void clickENSLookupsButtonElement() {
		this.ensLookupsButtonElement.click();
	}
	
	public void clickERC721LookupsButtonElement() {
		this.erc721LookupsButtonElement.click();
	}
	
	public WebElement getNavbarInputElement() {
		return this.navbarInputElement;
	}
	
	public WebElement getNavbarButtonElement() {
		return this.navbarButtonElement;
	}
	
	public WebElement getENSERC721TitleElement() {
		return this.ensERC721TitleElement;
	}
	
	public WebElement getENSLookupsButtonElement() {
		return this.ensLookupsButtonElement;
	}
	
	public WebElement getERC721LookupsButtonElement() {
		return this.erc721LookupsButtonElement;
	}
	
	public WebElement getERC721LookupsTitleElement() {
		return this.erc721LookupsTitleElement;
	}
	
	public WebElement getENSLookupsTitleElement() {
		return this.ensLookupsTitleElement;
	}	
}