package selenium_test_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ERC721CollectionPage {
	// Represent ERC721 Collection Page as a model using Page Factory architecture
	
	@FindBy(xpath="//nav//form//input")
	private WebElement navbarInputElement;
	
	@FindBy(xpath="//nav//form//button")
	private WebElement navbarButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div//h1")
	private WebElement erc721CollectionTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//p")
	private WebElement erc721CollectionDescriptionElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//form//input")
	private WebElement addressInputElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//form//button")
	private WebElement submitButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//button[1]")
	private WebElement homeButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[1]//div[2]//button[2]")
	private WebElement clearButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//h4[1]")
	private WebElement erc721CollectionNameTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//h4[2]")
	private WebElement erc721CollectionAddressTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[2]//h4[3]")
	private WebElement erc721CollectionQuantityTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[3]//div//h3")
	private WebElement erc721SampleCollectionDataTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//div[1]//table")
	private WebElement erc721SampleCollectionDataTableElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[4]//div//h3")
	private WebElement erc721CollectionAttributesTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//div[2]//table")
	private List<WebElement> erc721CollectionAttributeTablesElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[5]//div//h3")
	private WebElement erc721CollectionTransferDataTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//div[3]//table")
	private WebElement erc721CollectionTransferDataTableElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//main[6]//div//h3")
	private WebElement erc721CollectionRecentSalesTitleElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//div//div[4]//table")
	private WebElement erc721CollectionRecentSalesTableElement;
	
	
	// Page Object Model in action for ERC721Collection Page
	public ERC721CollectionPage(WebDriver driver) {
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

	public WebElement getErc721CollectionTitleElement() {
		return erc721CollectionTitleElement;
	}

	public WebElement getErc721CollectionDescriptionElement() {
		return erc721CollectionDescriptionElement;
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

	public WebElement getErc721CollectionNameTitleElement() {
		return erc721CollectionNameTitleElement;
	}

	public WebElement getErc721CollectionAddressTitleElement() {
		return erc721CollectionAddressTitleElement;
	}

	public WebElement getErc721CollectionQuantityTitleElement() {
		return erc721CollectionQuantityTitleElement;
	}

	public WebElement getErc721SampleCollectionDataTitleElement() {
		return erc721SampleCollectionDataTitleElement;
	}

	public WebElement getErc721SampleCollectionDataTableElement() {
		return erc721SampleCollectionDataTableElement;
	}

	public WebElement getErc721CollectionAttributesTitleElement() {
		return erc721CollectionAttributesTitleElement;
	}

	public List<WebElement> getErc721CollectionAttributeTablesElement() {
		return erc721CollectionAttributeTablesElement;
	}

	public WebElement getErc721CollectionTransferDataTitleElement() {
		return erc721CollectionTransferDataTitleElement;
	}

	public WebElement getErc721CollectionTransferDataTableElement() {
		return erc721CollectionTransferDataTableElement;
	}

	public WebElement getErc721CollectionRecentSalesTitleElement() {
		return erc721CollectionRecentSalesTitleElement;
	}

	public WebElement getErc721CollectionRecentSalesTableElement() {
		return erc721CollectionRecentSalesTableElement;
	}
}