package selenium_test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

public class GasStationPage {
		// Represent Gas Station Page as a model using Page Factory architecture
		
		@FindBy(xpath="//nav//form//input")
		private WebElement navbarInputElement;
		
		@FindBy(xpath="//nav//form//button")
		private WebElement navbarButtonElement;
		
		@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[1]//h1")
		private WebElement gasInformationTitleElement;
		
		@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//h4")
		private WebElement generalMetricsTitleElement;
		
		@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[2]//div//p")
		private List<WebElement> gasMetricsListElement;
		
		@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[3]//h3")
		private WebElement blockPricesTitleElement;
		
		@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[4]//div")
		private List<WebElement> blockPricesListElement;
		
		@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[5]//h3")
		private WebElement baseFeesTitleElement;
		
		@FindBy(xpath="//div[@class='App']//div[3]//div//main//div[6]//div")
		private List<WebElement> baseFeesListElement;
		
		
		// Page Object Model in action for Gas Station Page
		public GasStationPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void setNavbarInputElement(String keys) {
			this.navbarInputElement.sendKeys(keys);
		}
		
		public void clickNavbarButtonElement() {
			this.navbarButtonElement.click();
		}

		public WebElement getNavbarInputElement() {
			return navbarInputElement;
		}

		public WebElement getNavbarButtonElement() {
			return navbarButtonElement;
		}

		public WebElement getGasInformationTitleElement() {
			return gasInformationTitleElement;
		}

		public WebElement getGeneralMetricsTitleElement() {
			return generalMetricsTitleElement;
		}

		public List<WebElement> getGasMetricsListElement() {
			return gasMetricsListElement;
		}

		public WebElement getBlockPricesTitleElement() {
			return blockPricesTitleElement;
		}

		public List<WebElement> getBlockPricesListElement() {
			return blockPricesListElement;
		}

		public WebElement getBaseFeesTitleElement() {
			return baseFeesTitleElement;
		}

		public List<WebElement> getBaseFeesListElement() {
			return baseFeesListElement;
		}
}