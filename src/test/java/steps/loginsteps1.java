package steps;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class loginsteps1 {

       WebDriver driver = new ChromeDriver();         

    // Method to generate random names
   

    @Given("User navigation to the todo management website")
    public void userNavigationToTheTodoManagementWebsite() {
    
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/133.0.6943.53 chromedriver-linux64");
          driver.navigate().to("https://test.fundsheet.app/login");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//body/div[@id='main']/div[@id='register-r']/div[1]/form[1]/div[1]/input[1]")).sendKeys("akash@mailinator.com");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    System.out.println("Login Successful");                

    
 Thread.sleep(2000);
    driver.get("https://test.fundsheet.app/fund/create");
    
//    //Add fund
    Thread.sleep(4000);
  //  driver.findElement(By.xpath("//a[contains(text(),'Add Fund')]")).click();
	       driver.findElement(By.xpath("//input[@id='fund_code']")).sendKeys("013");
	WebElement namefund    = driver.findElement(By.xpath("//input[@id='name']"));
//	driver.findElement(By.xpath("//input[@id='legal_name']")).sendKeys("Auto-fund13");
	namefund.sendKeys("Remortfund");
	namefund.sendKeys(Keys.TAB, Keys.TAB);

	
	//	//Currency
	Select Currency = new Select(driver.findElement(By.name("currency")));
	Currency.selectByVisibleText("INR-Indian Rupee");
	  Thread.sleep(3000);
//	  //Comitted price
       driver.findElement(By.xpath("//input[@id='total_commitment']")).sendKeys("100000");
       Thread.sleep(3000);
   	JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("window.scrollBy(0, 600)");

       driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

    
    
    }
   
}







                   
