package ch8_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectableTest {
	protected WebDriver driver;
	private SelectablePage selectablePage;
	
	private static String baseUrl = "https://demoqa.com/selectable";
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("The browser has been opened.");
		
		selectablePage = new SelectablePage(driver);
		
		driver.get(baseUrl);
	}
	
	@Test (priority = 1)
	public void testSelectFromList() {
		Assert.assertTrue(selectablePage.isListTabActive(),"List tab must be active by default!");
		
		selectablePage.selectItemInList();
		
		Assert.assertTrue(selectablePage.isSelectedItemInListActive(),"Expected select in list value not selected correctly!");
	}
	
	@Test (priority = 2)
	public void testSelectFromGrid() {
		selectablePage.clickGridTab();
		
		Assert.assertTrue(selectablePage.isGridTabActive(),"Grid tab must be active after click on it!");
		
		
		selectablePage.selectItemInGrid();
		
		Assert.assertTrue(selectablePage.isSelectedItemInGridActive(),"Expected select in grid value not selected correctly!");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("The browser has been closed!");
		if(driver!=null) {
			driver.quit();
		}
	}
}
