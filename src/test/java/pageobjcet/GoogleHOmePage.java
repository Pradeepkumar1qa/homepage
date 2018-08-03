package pageobjcet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Common.Base_Page;

public class GoogleHOmePage extends Base_Page {
	String url="https://www.google.com";
	public GoogleHOmePage() {
		//System.setProperty("webdriver.chrome.driver"," C:\\Users\\pradeepkumar1\\Downloads\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public void launchBrowser() {
		
		driver.get(url);
		System.out.println("launched the browseer");
		driver.manage().deleteAllCookies();
		System.out.println("deleted all cookies");
		driver.manage().window().maximize();
		System.out.println("maximized the window");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("setting timeout 20 seconds");
		
	}
	public void goToGoogleHomePage() {
		driver.navigate().to(url);
		System.out.println("going to google home page");
	}
	
	public boolean isSearchBoxDisplayed() {
		
		 boolean ans=driver.findElement(By.id("lst-ib")).isDisplayed();
		 if(ans) {System.out.println("searchbox is displayed");}
		 else
			 System.out.println("search box is not displayed");
		 return ans;
		
	}
	
	public boolean isGoogleSearchBtnDisplayed() {
		boolean ans= driver.findElement(By.cssSelector("#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(1)")).isDisplayed();
		if(ans)
			System.out.println("search btn is visible on google homepage");
		else
			System.out.println("unable to locate the search btn ");
		return ans;
		
	}
	
	public void searchForInput(String word) {
		System.out.println("you are providing input "+word);
		driver.findElement(By.id("lst-ib")).sendKeys(word);
		System.out.println("result genrated by google search engine is being displayed");
		
	}
	public  void clickOnSearchBtn() {
		System.out.println("clicking on search btn ");
		driver.findElement(By.name("btnk")).click();
	}
	public void validationOfResultProvidedAfterSearch() {
		//to be implemented in future
	}
	public void closeSession() {
		driver.close();
	}
	
 
	
	
}
