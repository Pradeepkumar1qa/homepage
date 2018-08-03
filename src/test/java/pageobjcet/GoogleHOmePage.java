package pageobjcet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Common.Base_Page;

public class GoogleHOmePage extends Base_Page {

	public GoogleHOmePage() {
		driver=new ChromeDriver();
	}
	public void launchBrowser() {
		String url="https://www.google.com";
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	public boolean isSearchBoxDisplayed() {
		
		return driver.findElement(By.id("lst-ib")).isDisplayed();
	}
	
	public boolean isGoogleSearchBtnDisplayed() {
		return driver.findElement(By.id("btnk")).isDisplayed();
	}
	
	public void searchForInput(String word) {
		driver.findElement(By.id("lst-ib")).sendKeys(word);
		
	}
	public  void clickOnSearchBtn() {
		driver.findElement(By.id("btnk")).click();
	}
	public void validationOfResultProvidedAfterSearch() {
		//to be implemented in future
	}
	
 
	
	
}
