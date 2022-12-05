package selenium_test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressToENSPage {

// Obtaining xpath for elements existing and to exist, upon submission of an eth address
	
	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;
	
	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//form//input")
	private WebElement addressInputElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//form//button")
	private WebElement lookupReversalButtonElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//button[1]")
	private WebElement homeButtonElement;
	
	@FindBy(xpath="//main//div[@class='jumbotron']//div[@class='container']//button[2]")
	private WebElement clearButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div[@class='ens-page']//main//div[3]//div//h3")
	private WebElement resolverTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div[@class='ens-page']//main//div[3]//h6")
	private WebElement resolverTableTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div[@class='ens-page']//main//div[3]//table//tbody//tr//td[1]")
	private WebElement resolverNameElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div[@class='ens-page']//main//div[3]//table//tbody//tr//td[2]")
	private WebElement resolverLinkElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div[@class='ens-page']//main//div[4]//div[1]//h3")
	private WebElement additionalInformationTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div[@class='ens-page']//main//div[4]//div[2]//table")
	private WebElement additionalInformationTableElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div[@class='ens-page']//main//div[5]//div[1]//h3")
	private WebElement namesToOwnerTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div[@class='ens-page']//main//div[5]//div[2]//table")
	private WebElement namesToOwnerTableElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div[@class='ens-page']//main//div[6]//div[1]//h3")
	private WebElement nameResolveToAddressTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div[@class='ens-page']//main//div[6]//div[2]//table")
	private WebElement nameResolveToAddressTableElement;
	

	public AddressToENSPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setNavbarInputElement(String keys) {
		this.navbarInputElement.sendKeys(keys);
	}
	
	public void clickNavbarButtonElement() {
		this.navbarButtonElement.click();
	}
	
	public void setAddressToENSInputElement(String keys) {
		this.addressInputElement.sendKeys(keys);
	}
	
	public void clickLookupReversalButtonElement() {
		this.lookupReversalButtonElement.click();
	}
	
	public void clickHomeButtonElement() {
		this.homeButtonElement.click();
	}
	
	public void clickClearButtonElement() {
		this.clearButtonElement.click();
	}

	public WebElement getNavbarInputElement() {
		return navbarInputElement;
	}

	public WebElement getNavbarButtonElement() {
		return navbarButtonElement;
	}

	public WebElement getAddressInputElement() {
		return addressInputElement;
	}

	public WebElement getLookupReversalButtonElement() {
		return lookupReversalButtonElement;
	}

	public WebElement getHomeButtonElement() {
		return homeButtonElement;
	}

	public WebElement getClearButtonElement() {
		return clearButtonElement;
	}

	public WebElement getResolverTitleElement() {
		return resolverTitleElement;
	}

	public WebElement getResolverTableTitleElement() {
		return resolverTableTitleElement;
	}

	public WebElement getResolverNameElement() {
		return resolverNameElement;
	}

	public WebElement getResolverLinkElement() {
		return resolverLinkElement;
	}

	public WebElement getAdditionalInformationTitleElement() {
		return additionalInformationTitleElement;
	}

	public WebElement getAdditionalInformationTableElement() {
		return additionalInformationTableElement;
	}

	public WebElement getNamesToOwnerTitleElement() {
		return namesToOwnerTitleElement;
	}

	public WebElement getNamesToOwnerTableElement() {
		return namesToOwnerTableElement;
	}

	public WebElement getNameResolveToAddressTitleElement() {
		return nameResolveToAddressTitleElement;
	}

	public WebElement getNameResolveToAddressTableElement() {
		return nameResolveToAddressTableElement;
	}
}