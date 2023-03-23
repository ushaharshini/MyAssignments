package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(options);
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement from = driver.findElement(By.id("txtStationFrom"));
        from.clear();
        from.sendKeys("MAS",Keys.ENTER);
        
        Thread.sleep(2000);
        
        WebElement to = driver.findElement(By.id("txtStationTo"));
        to.clear();
        to.sendKeys("MDU",Keys.ENTER);
        Thread.sleep(2000);
        
        driver.findElement(By.id("chkSelectDateOnly")).click();
        
        List<WebElement> name = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
  
   
        for (int i = 2; i < name.size(); i++) {
    	  
    	  WebElement trainname = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]"));
    	  
        
    	  System.out.println(trainname.getText());
    	  
		
	}
			
		}
    
        
        
       
        
        
	}


