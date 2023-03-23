package Marathon2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderMobile {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://dev57553.service-now.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("2oaD6KN$q$vN");
	driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
	Shadow dom =new Shadow(driver);
	dom.setImplicitWait(10);
	dom.findElementByXPath("//div[@id='all']").click();
	dom.findElementByXPath("//span[text()='Service Catalog']").click();
	WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
	driver.findElement(By.xpath("//strong[text()='Apple iPhone 6s']")).click();
	WebElement color = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
	Select drop1 = new Select(color);
	drop1.selectByVisibleText("Gold");
	WebElement memory = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[3]"));
	Select drop2=new Select(memory);
	drop2.selectByVisibleText("128GB");
	driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
	String text2 = driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
	System.out.println(text2);
	String text = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
	System.out.println("Request id is : "+text);
	
	
	
}
}
