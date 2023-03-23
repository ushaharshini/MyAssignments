package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rakbus {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.rakbus.ae/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.findElement(By.xpath("//input[@id='travel_from']")).click();
		
		driver.findElement(By.xpath("//input[@id='travel_from']")).sendKeys("rak");
		
		driver.findElement(By.xpath("//span[text()='RAK - Al Hamra Bus Station - Ras Al Khaimah']")).click();
		
		driver.findElement(By.xpath("//input[@id='travel_to']")).click();
		
		driver.findElement(By.xpath("//input[@id='travel_to']")).sendKeys("umm");

		driver.findElement(By.xpath("//span[text()='Umm Al Quawain - Salama Supermarket - Umm Al Quwain']")).click();
		
		driver.findElement(By.xpath("(//a [@class='ui-state-default'])[1]")).click();
		
		driver.findElement(By.xpath("//button[@id='pass_done']")).click();
		
		driver.findElement(By.xpath("//input[@id='submit-travel']")).click();
		
		
		System.out.println(driver.getTitle());

		//driver.close();
		

	}

}
