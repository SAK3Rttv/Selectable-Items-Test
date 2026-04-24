package ch8_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectablePage {
	private WebDriver driver;
	
	private By listTab = By.id("demo-tab-list");
	private By gridTab = By.id("demo-tab-grid");
	
	private By selectedItemInList = By.xpath(".//li[contains(text(),'Dapibus') and contains(@class,'list-group-item')]");
	private By selectedItemInGrid = By.xpath(".//li[contains(text(),'Three') and contains(@class,'list-group-item')]");
	
	public SelectablePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// List Tab
	public void clickListTab() {
		driver.findElement(listTab).click();
	}
	
	public void selectItemInList() {
		driver.findElement(selectedItemInList).click();
	}
	
	public boolean isListTabActive() {
		WebElement element = driver.findElement(listTab);
		return element.getAttribute("class").contains("active");
	}
	
	public boolean isSelectedItemInListActive() {
		WebElement element = driver.findElement(selectedItemInList);
		return element.getAttribute("class").contains("active");
	}
	
	
	// Grid Tab
	public void clickGridTab() {
		driver.findElement(gridTab).click();
	}
	
	public void selectItemInGrid() {
		driver.findElement(selectedItemInGrid).click();
	}
	
	public boolean isGridTabActive() {
		WebElement element = driver.findElement(gridTab);
		return element.getAttribute("class").contains("active");
	}
	
	public boolean isSelectedItemInGridActive() {
		WebElement element = driver.findElement(selectedItemInGrid);
		return element.getAttribute("class").contains("active");
	}
}
