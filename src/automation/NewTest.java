package automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTest {

	@Test
public void headerbuttonhome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
		WebElement button=driver.findElement(By.id("qa_header-home"));
		button.click();
		
		String expectedUrl="https://politrip.com/";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		
		driver.close();
	}
	
	@Test
public void logo() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
		WebElement button=driver.findElement(By.id("qa_header-logo"));
		button.click();
		
		String expectedUrl="https://politrip.com/";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		
		driver.close();
	}
	
	@Test
public void headerbuttonsignup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts();

		Actions action = new Actions(driver);
		WebElement signup = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("qa_header-signup")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signup);
		action.moveToElement(signup).click(signup).perform();
		
		String expectedUrl="https://politrip.com/account/sign-up";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		
		driver.close();
	}
	
	@Test//verifying with empty 
  public void signup0() {
		  
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://politrip.com/account/sign-up");
			driver.manage().window().maximize();
			driver.manage().timeouts();
			
			Actions action = new Actions(driver);
			WebElement signup = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id(" qa_loader-button")));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signup);
			action.moveToElement(signup).click(signup).perform();
			
			String expectedUrl="https://politrip.com/account/sign-up";
			String actualUrl=driver.getCurrentUrl();
			Assert.assertEquals(actualUrl,expectedUrl);
			
			
			driver.close();
	  }
	
	
  @Test//verifying with bad password and email
  public void signup1() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
		WebElement firstname=driver.findElement(By.id("first-name"));
		firstname.clear();
		firstname.sendKeys(" xxxxxxx");
		
		WebElement lastname=driver.findElement(By.id("last-name"));
		lastname.clear();
		lastname.sendKeys("xxxxxxx");
		
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("gmail.com");
		
		WebElement password=driver.findElement(By.id("sign-up-password-input"));
		password.clear();
		password.sendKeys("your_password");
		
		WebElement confirmpassword=driver.findElement(By.id("sign-up-confirm-password-input"));
		confirmpassword.clear();
		confirmpassword.sendKeys("your_password");
		
		Select heard=new Select(driver.findElement(By.name("heard")));
		heard.selectByValue("webSearch");
		
		Actions action = new Actions(driver);
		WebElement signup = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id(" qa_loader-button")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signup);
		action.moveToElement(signup).click(signup).perform();
		
		String expectedUrl="https://politrip.com/account/sign-up";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		
		driver.close();
  }
  
  @Test//verifying with bad email good password
  public void signup2() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
		WebElement firstname=driver.findElement(By.id("first-name"));
		firstname.clear();
		firstname.sendKeys(" xxxxxxx");
		
		WebElement lastname=driver.findElement(By.id("last-name"));
		lastname.clear();
		lastname.sendKeys("xxxxxxx");
		
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("gmail.com");
		
		WebElement password=driver.findElement(By.id("sign-up-password-input"));
		password.clear();
		password.sendKeys("wsgHjs.738");
		
		WebElement confirmpassword=driver.findElement(By.id("sign-up-confirm-password-input"));
		confirmpassword.clear();
		confirmpassword.sendKeys("wsgHjs.738");
		
		Select heard=new Select(driver.findElement(By.name("heard")));
		heard.selectByValue("webSearch");
		
		Actions action = new Actions(driver);
		WebElement signup = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id(" qa_loader-button")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signup);
		action.moveToElement(signup).click(signup).perform();
		
		String expectedUrl="https://politrip.com/account/sign-up";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		
		driver.close();
  }
  
  @Test//verifying with different confirm password
  public void signup3() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
		WebElement firstname=driver.findElement(By.id("first-name"));
		firstname.clear();
		firstname.sendKeys(" xxxxxxx");
		
		WebElement lastname=driver.findElement(By.id("last-name"));
		lastname.clear();
		lastname.sendKeys("xxxxxxx");
		
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("abc@gmail.com");
		
		WebElement password=driver.findElement(By.id("sign-up-password-input"));
		password.clear();
		password.sendKeys("wsgHjs.738");
		
		WebElement confirmpassword=driver.findElement(By.id("sign-up-confirm-password-input"));
		confirmpassword.clear();
		confirmpassword.sendKeys("wrwawr");
		
		Select heard=new Select(driver.findElement(By.name("heard")));
		heard.selectByValue("webSearch");
		
		Actions action = new Actions(driver);
		WebElement signup = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id(" qa_loader-button")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signup);
		action.moveToElement(signup).click(signup).perform();
		
		String expectedUrl="https://politrip.com/account/sign-up";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);

		driver.close();
  }
  
  @Test//verifying with valid 
  public void signup4() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
		WebElement firstname=driver.findElement(By.id("first-name"));
		firstname.clear();
		firstname.sendKeys(" xxxxxxx");
		
		WebElement lastname=driver.findElement(By.id("last-name"));
		lastname.clear();
		lastname.sendKeys("xxxxxxx");
		
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("abc@gmail.com");
		
		WebElement password=driver.findElement(By.id("sign-up-password-input"));
		password.clear();
		password.sendKeys("wsgHjs.738");
		
		WebElement confirmpassword=driver.findElement(By.id("sign-up-confirm-password-input"));
		confirmpassword.clear();
		confirmpassword.sendKeys("wsgHjs.738");
		
		Select heard=new Select(driver.findElement(By.name("heard")));
		heard.selectByValue("webSearch");
			
		Actions action = new Actions(driver);
		WebElement signup = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id(" qa_loader-button")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signup);
		action.moveToElement(signup).click(signup).perform();
		
		System.out.println(driver.getTitle());
		
		String expectedUrl="https://politrip.com/account/sign-up/type-select";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		
		driver.close();		
  }
  
  @Test
  public void headerbuttonhowitworks() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
			
		WebElement button=driver.findElement(By.id("qa_header-how-it-works"));
		button.click();
		
		String expectedUrl="https://politrip.com/how-it-works";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		
		driver.close();
  }
  
  @Test
  public void headerbuttonlogin() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
			
		WebElement button=driver.findElement(By.id("qa_header-login"));
		button.click();
		
		String expectedUrl="https://politrip.com/account/login";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		
		driver.close();
  }

  /*
  @Test
  public void igbutton() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
		WebElement button=driver.findElement(By.id("socialmedia-account-instagram-button"));
		button.click();
		
		String expectedUrl="https://politrip.com/";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
		driver.close();
	}
  
  */
  @Test
  public void alreadyaccount() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
		Actions action = new Actions(driver);
		WebElement signup = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.className("goto-container")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signup);
		action.moveToElement(signup).click(signup).perform();
		
		String expectedUrl="https://politrip.com/account/login";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		
		driver.close();
	}
  
  @Test
  public void footerLegalagreements() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
		Actions action = new Actions(driver);
		WebElement signup = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("qa_footer-terms-and-conditions")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signup);
		action.moveToElement(signup).click(signup).perform();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String expectedUrl="https://politrip.com/legal-agreements/service-assurance-agreement";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		
		driver.close();
	}
  
  @Test
  public void footerlogo1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vieleidi\\Downloads\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://politrip.com/account/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
		WebElement s=driver.findElement(By.id("cookiescript_reject"));
		s.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		WebElement button=driver.findElement(By.cssSelector("img[alt=\"ue\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
		action.moveToElement(button).click(button).perform();
		
		
		String expectedUrl="https://european-union.europa.eu/index_ro";
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,expectedUrl);
		
		driver.close();
	}
}
