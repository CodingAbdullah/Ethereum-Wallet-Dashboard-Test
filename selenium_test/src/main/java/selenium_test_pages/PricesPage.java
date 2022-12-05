package selenium_test_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricesPage {
	// Represent Prices Page as a model using Page Factory architecture
	
	@FindBy(xpath="//div[@class='App']//div[3]//button")
	private WebElement coinPricesButtonElement;
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//h1")
	private WebElement pricesPageTitleElement;
	
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//p")
	private WebElement pricesPageDescriptionElement;
	
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//div[@class='row']")
	private List<WebElement> coinPricesCardsElement;
	
	
	@FindBy(xpath="//div[@class='App']//div[3]//main//button")
	private WebElement hideCoinPricesButtonElement;
	
	
	public PricesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickCoinPricesButtonElement() {
		this.coinPricesButtonElement.click();
	}
	
	public void clickHideCoinPricesButtonElement() {
		this.hideCoinPricesButtonElement.click();
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
	
}
