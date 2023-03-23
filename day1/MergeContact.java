package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(options);
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
        
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		System.out.println(driver.getTitle());
		Set<String> handles = driver.getWindowHandles();
		List<String>merge=new ArrayList<String>(handles);
		driver.switchTo().window(merge.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
        driver.switchTo().window(merge.get(0));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		String handle1 = driver.getWindowHandle();
		System.out.println(handle1);
		System.out.println(driver.getTitle());
		Set<String> handles1 = driver.getWindowHandles();
		List<String>merge1=new ArrayList<String>(handles1);
		driver.switchTo().window(merge1.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		driver.switchTo().window(merge.get(0));
	    System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
