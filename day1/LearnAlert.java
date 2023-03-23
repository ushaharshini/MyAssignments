package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(options);

		driver.get("https://leafground.com/alert.xhtml");
driver.manage().window().maximize();
driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[6]")).click();
Alert alert = driver.switchTo().alert();
String text = alert.getText();
System.out.println(text);
alert.sendKeys("Usha");
alert.accept();
String text2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
System.out.println(text2);





	}

}
