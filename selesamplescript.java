package seleniumsamplepack;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class selesamplescript {
	
		 
	public static void main(String[] args)
	{	
           System.out.println("swapnil selenium inruance website testing study "); 
	
       
        //windows
   		//System.setProperty("webdriver.chrome.driver","C:\\Users\\jadha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        
        //ubuntu
  		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        //schromeOptions.addArguments("--no-sandbox");

        System.out.println("got the chromdriver");
        
        WebDriver driver = new ChromeDriver(chromeOptions);
   		
        driver.manage().window().maximize();
   		       
   		System.out.println("NOW lets goto website");
   		
   		
   		
  //testing for actual insurance code		
   		driver.get("http://15.206.117.190:8082//contact.html"); //where website is up on test serevr
   		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   		driver.findElement(By.id("inputName")).sendKeys("swapnil jadhav");
   		driver.findElement(By.id("inputNumber")).sendKeys("9975179519");
   		driver.findElement(By.id("inputMail")).sendKeys("swapnil919@gmail.com");
   		driver.findElement(By.id("inputMessage")).sendKeys("Hello Insurer");
   		driver.findElement(By.id("my-button")).click();
   		
   		String message = driver.findElement(By.id("response")).getText();
   		if(message.equals("Message Sent")) {
   			System.out.println("contact page tested Successfully");
   		} else 
   		{
   			System.out.println("contact page testing failed");
   		} 
   		
  		
   		
   		
   		             	
	System.out.println("selenuim contact page testing executed"); 
		
	}

 }

