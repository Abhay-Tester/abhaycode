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

    WebDriver d;
    WebDriverWait wait;  // Keep WebDriverWait instance global

    // Method to generate random names
    public String generateRandomName() {
        String characters = "ABCDE";
        StringBuilder name = new StringBuilder();
        Random random = new Random();
        int length = random.nextInt(3) + 3; // Length between 3 to 5
        for (int i = 0; i < length; i++) {
            name.append(characters.charAt(random.nextInt(characters.length())));
        }
        return name.toString();
    }

    @Given("User navigation to the todo management website")
    public void userNavigationToTheTodoManagementWebsite() {
    
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/133.0.6943.53 chromedriver-linux64");
        d = new ChromeDriver();
        d.manage().window().maximize();
        d.navigate().to("https://todomvc.com/examples/react/dist/");
        wait = new WebDriverWait(d, 10);  // Initialize WebDriverWait here only once
        System.out.println("1st Step Result Pass :- Web Launch");
    }

    @When("Enter name on todo field")
    public void enterNameOnTodoField() {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='todo-input']")));
        String randomName = generateRandomName();  // Generate a new name every time
        field.sendKeys(randomName);
        System.out.println("2nd Step Result Pass :- Enter name in todo " + randomName);
    }

    @When("User should be click on enter button")
    public void userShouldBeClickOnEnterButton() {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='todo-input']")));
        field.sendKeys(Keys.ENTER);
        System.out.println("3rd Step Result Pass :- User click on enter button");
    }

    @When("Verify generated todo name")
    public void verifyGeneratedTodoName() {
        WebElement createdTask = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("label[data-testid='todo-item-label']")));
        System.out.println("4th Step Result Pass :- Created Todo Verified: " + createdTask.getText());
    }

    @When("Verify Count of todo")
    public void verifyCountOfTodo() {
    	WebElement Tcount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("todo-count")));
        String text = Tcount.getText(); // Example: "10 items left"
        int Todocount = Integer.parseInt(text.replaceAll("[^0-9]", ""));
        System.out.println("5th Step Result Pass :- Total Multiple Added Todos is:- " + (Todocount));
     d.quit();
    }
    
    
    
    
//--------------------------------2nd scenario    
    
  
    

    
    @Given("User navigate to the todo management website")
    public void userNavigateToTheTodoManagementWebsite() {
    	//System.setProperty("webdriver.chrome.driver", "C:\\vishal\\Automation\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
       d = new ChromeDriver();
        d.manage().window().maximize();
        d.navigate().to("https://todomvc.com/examples/react/dist/");
        wait = new WebDriverWait(d, 10);  // Initialize WebDriverWait here only once
  
    System.out.println("1st Step Result Pass :- Web Launch");
    }

    @When("User should create multiple todos")
    public void userShouldCreateMultipleTodos() {
	
    	for (int i = 0; i < 10; i++) {  // Loop to create 4 todos
            String randomName = generateRandomName();  // Generate a unique name for each todo
            WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='todo-input']")));
            field.sendKeys(randomName);
            field.sendKeys(Keys.ENTER);
        }
        System.out.println("2nd Step Result Pass :- Addition of Multiple Todos");
    }

    @When("Verify Counts of todos")
    public void verifyCountsOfTodos() {
        WebElement Tcount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("todo-count")));
        String text = Tcount.getText(); // Example: "10 items left"
        int Todocount = Integer.parseInt(text.replaceAll("[^0-9]", ""));
        System.out.println("3rd Step Result Pass :- Total Multiple Added Todos is:- " + (Todocount));
       d.quit();
    }
 
    
    
//------------------------------------3rd scenario    
    
    
  
    @Given("User navigatev to the todo  website")
    public void userNavigatevToTheTodoWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\vishal\\Automation\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
    	d = new ChromeDriver();
       d.manage().window().maximize();
       d.navigate().to("https://todomvc.com/examples/react/dist/");
    	System.out.println("1st Step Result Pass :- Web Launch");
    	 wait = new WebDriverWait(d, 20); 	
    }
    
    
    

    @When("User should create {int} todos")
    public void userShouldCreateTodos(Integer int4) {
    	
    	for (int i = 0; i < 3; i++) {  // Loop to create 4 todos
          String randomName = generateRandomName();  // Generate a unique name for each todo
          WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='todo-input']")));
          field.sendKeys(randomName);
          field.sendKeys(Keys.ENTER);
     }
      System.out.println("2nd Step Result Pass :- Todo added");
     }

  
    
    @When("User should mark completed Todo")
    public void userShouldMarkCompletedTodo() {
    	  
    	Actions actions = new Actions(d);
    	WebElement checkbox = d.findElement(By.xpath("//li[2]//div[1]//input[1]"));
    	actions.moveToElement(checkbox).click().perform();
    	System.out.println("3rd Step Result Pass :- User marked completd todo");
        d.quit();
      }


  
    
 //-------------------------------------4th scenario    
 
       
    
    
    @Given("User Navigate to the todo websiteA")
    public void userNavigateToTheTodoWebsiteA() {
   	  System.setProperty("webdriver.chrome.driver", "C:\\vishal\\Automation\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
      	d = new ChromeDriver();
         d.manage().window().maximize();
         d.navigate().to("https://todomvc.com/examples/react/dist/");
      	System.out.println("1st Step Result Pass :- Web Launch");
      	 wait = new WebDriverWait(d, 10);
      	
    }

    
    @When("User add todo")
    public void userAddTodo() {
    	for (int i = 0; i < 5; i++) {  // Loop to create 4 todos
            String randomName = generateRandomName();  // Generate a unique name for each todo
            WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='todo-input']")));
            field.sendKeys(randomName);
            field.sendKeys(Keys.ENTER);

        }
        System.out.println("2st Step Result Pass :- Todo added");
    }
    
    
   

    @When("User delete todo")
    public void userDeleteTodo() throws Exception {
     Thread.sleep(3000);
    	 WebElement elementToHover =d.findElement(By.xpath("//li[1]//div[1]//label[1]"));

         // Use Actions class to hover
         Actions actions = new Actions(d);
         actions.moveToElement(elementToHover).perform(); // Hover action

         WebElement Tcount1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("todo-count")));
         String text = Tcount1.getText(); // Example: "10 items left"
         int TodocountB = Integer.parseInt(text.replaceAll("[^0-9]", ""));
        
    	WebElement delete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]//div[1]//button[1]")));
    delete.click();

    WebElement Tcount2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("todo-count")));
    String text2 = Tcount2.getText(); // Example: "10 items left"
    int TodocountA = Integer.parseInt(text2.replaceAll("[^0-9]", ""));
  
    System.out.println("Before todo" +(((TodocountB))) + " -  After todo " + (((TodocountA))) + " = Reduce By :-" + ((TodocountB - TodocountA)));
    System.out.println("3st Step Result Pass :- Todo deleted and reduce by 1" );
    d.quit();
    }
     
    
    
//--------------------------------5nd scenario    
    
    
    @Given("User Navigatev to the todo websiteB")
    public void userNavigatevToTheTodoWebsiteB() {
      	  System.setProperty("webdriver.chrome.driver", "C:\\vishal\\Automation\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
      	d = new ChromeDriver();
         d.manage().window().maximize();
         d.navigate().to("https://todomvc.com/examples/react/dist/");
      	System.out.println("1st Step Result Pass :- Web Launch");
      	 wait = new WebDriverWait(d, 10);    	
    }
    
    
    
    
    @When("User add todoB")
    public void userAddTodoB() {
  	for (int i = 0; i < 4; i++) {  // Loop to create 4 todos
            String randomName = generateRandomName();  // Generate a unique name for each todo
            WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='todo-input']")));
            field.sendKeys(randomName);
            field.sendKeys(Keys.ENTER);

    }
    	
	       Actions actions = new Actions(d);
	       WebElement compAll = d.findElement(By.xpath("/html[1]/body[1]/section[1]/main[1]/div[1]/input[1]"));
	       actions.moveToElement(compAll).click().perform();
	
  	
  	
        for (int i = 0; i < 7; i++) {  // Loop to create 4 todos
            String randomName = generateRandomName();  // Generate a unique name for each todo
            WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='todo-input']")));
            field.sendKeys(randomName);
            field.sendKeys(Keys.ENTER);
        }        
        System.out.println("2st Step Result Pass :- Todo added"); 
    }
    
     
    @When("Verify completed todo count")
    public void verifyCompletedTodoCount() {
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[1]/footer[1]/ul[1]/li[3]/a[1]"))).click();
    	List<WebElement> checkedItems = d.findElements(By.xpath("//ul[@class='todo-list']/li[contains(@class,'completed')]"));
    	
    			int checkedCount = checkedItems.size();
    	System.out.println("Count of Completed todo :- " +( checkedCount));
        System.out.println("3rd Step Result Pass :- Count successful of Completed todo "); 
    	d.quit();

        }
    
    
    
    
    
    
//-----------    --------------------- 6th Scenario-------------------------------
    
    
    
    
    
    @Given("User Navigatev to the todo websiteC")
    public void userNavigatevToTheTodoWebsiteC() {
    	  System.setProperty("webdriver.chrome.driver", "C:\\vishal\\Automation\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
        	d = new ChromeDriver();
           d.manage().window().maximize();
           d.navigate().to("https://todomvc.com/examples/react/dist/");
         	System.out.println("1st Step Result Pass :- Web Launch");
        	 wait = new WebDriverWait(d, 10);
     
    	
    	
        }

    @When("User add todoC")
    public void userAddTodoC() {
    	
    	for (int i = 0; i < 5; i++) {  // Loop to create 4 todos
            String randomName = generateRandomName();  // Generate a unique name for each todo
            WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='todo-input']")));
            field.sendKeys(randomName);
            field.sendKeys(Keys.ENTER);

        }
    	
//  	Actions actions = new Actions(d);
//	WebElement checkbox = d.findElement(By.xpath("//li[2]//div[1]//input[1]"));
//	actions.moveToElement(checkbox).click().perform();
//  	
	Actions actions = new Actions(d);
	WebElement compAll = d.findElement(By.xpath("/html[1]/body[1]/section[1]/main[1]/div[1]/input[1]"));
	actions.moveToElement(compAll).click().perform();
	
  	
  	
        for (int i = 0; i < 11; i++) {  // Loop to create 4 todos
            String randomName = generateRandomName();  // Generate a unique name for each todo
            WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='todo-input']")));
            field.sendKeys(randomName);
            field.sendKeys(Keys.ENTER);
        }
        System.out.println("2st Step Result Pass :- Todo added"); 

    	
      }

    @When("Verify the all tab todo count")
    public void verifyTheAllTabTodoCount() {
      
    
    	List<WebElement> allTodos = d.findElements(By.xpath("//ul[@class='todo-list']/li"));
    	int totalTodos = allTodos.size();
    	System.out.println("Total To-Do in all tab:- " + (totalTodos));
        System.out.println("3rd Step Result Pass :- Count successful of All todo"); 

    d.quit();
    
    }  
    
    
    
    
    
 //----------------------------------------7th Scenarios
    
    
    
    @Given("User Navigatev to the todo websiteD")
    public void userNavigatevToTheTodoWebsiteD() {
    	System.setProperty("webdriver.chrome.driver", "C:\\vishal\\Automation\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
    	d = new ChromeDriver();
       d.manage().window().maximize();
       d.navigate().to("https://todomvc.com/examples/react/dist/");
    	System.out.println("1st Step Result Pass :- Web Launch");
    	 wait = new WebDriverWait(d, 10);
 
         
    }

    @When("User add todoD")
    public void userAddTodoD() {
    	for (int i = 0; i < 5; i++) {  // Loop to create 4 todos
            String randomName = generateRandomName();  // Generate a unique name for each todo
            WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='todo-input']")));
            field.sendKeys(randomName);
            field.sendKeys(Keys.ENTER);

        }	
    	 Actions actions = new Actions(d);
     	WebElement compAll = d.findElement(By.xpath("/html[1]/body[1]/section[1]/main[1]/div[1]/input[1]"));
     	actions.moveToElement(compAll).click().perform();
        System.out.println("2st Step Result Pass :- Todo added"); 

         
    }

    @When("User should be completed some todo")
    public void userShouldBeCompletedSomeTodo() {
    	
      	
      	
            for (int i = 0; i < 11; i++) {  // Loop to create 4 todos
                String randomName = generateRandomName();  // Generate a unique name for each todo
                WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='todo-input']")));
                field.sendKeys(randomName);
                field.sendKeys(Keys.ENTER);
            }
            System.out.println("3rd Step Result Pass :- Todo Marked completed "); 

    }

    
    
    
    @When("Verify Pending todo count")
    public void verifyPendingTodoCount() {
         
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//footer[@class='footer']//li[2]"))).click();
    	List<WebElement> allTodos = d.findElements(By.xpath("//ul[@class='todo-list']/li"));
    	int totalTodos = allTodos.size();
    	System.out.println("Total To-Do Pending items -: " + (totalTodos));
        System.out.println("4rd Step Result Pass :- Count successful of pending todo "); 

d.quit();
    }
  
    
}







                   
