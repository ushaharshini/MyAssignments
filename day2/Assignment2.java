package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://html.com/tags/table//");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement table = driver.findElement(By.xpath("//table[@class='attributes-list']"));
		List<WebElement> rowcount= table.findElements(By.tagName("tr"));
		System.out.println("Row Count " +rowcount.size());
		
		List<WebElement> column = table.findElements(By.tagName("th"));
		System.out.println("Column count " +column.size());
		
		

	}

}
