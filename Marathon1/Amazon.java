package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		

		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		String text=driver.findElement(By.xpath("//span[text()='1-48 of over 40,000 results for']")).getText();

        System.out.println("The total number of Result "+ text);
		 
		
		driver.findElement(By.xpath("//li[contains(@id,'American Tourister')]//div")).click();
		
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		String text1=driver.findElement(By.xpath("//span[text()='30 Litres Polyester Black laptop Backpack']")).getText();

		System.out.println("The first resulting bag info " + text1);
		
		String text2=driver.findElement(By.xpath("//span[text()='(35% off)']")).getText();
		
		System.out.println("The discounted price "+ text2);
		
		System.out.println(driver.getTitle());

		driver.close();
		

	}

}
