package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.AdvanceSearchPage;
import POM.HomePO;

public class Sample {

	// following types of elements are present")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\HighmarkApps\\web driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.autotrader.com/");
		driver.manage().window().maximize();
		System.out.println("launching Chrome browser");
		// HomePO home = PageFactory.initElements(driver, HomePO.class);
		// home.Homepage_actions();
		AdvanceSearchPage search = PageFactory.initElements(driver, AdvanceSearchPage.class);
		search.Advancepage_actions();
	}
}
