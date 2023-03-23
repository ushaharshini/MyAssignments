package Marathon2;



import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AdminCerti {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> listwindows=new ArrayList<String>(windowHandles);
	driver.switchTo().window(listwindows.get(1));
	driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	Shadow dom =new Shadow(driver);
	dom.findElementByXPath("//span[text()='Learning']").click();
	WebElement learn = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
	Actions builder= new Actions(driver);
	builder.moveToElement(learn).perform();
	dom.findElementByXPath("//a[text()='Salesforce Certification']").click();
	WebElement scroll = driver.findElement(By.xpath("//h1[text()='Administrator Credentials']"));
	builder.scrollToElement(scroll).perform();
	driver.findElement(By.xpath("//a[@href='/en/credentials/administrator']")).click();
	String text = driver.findElement(By.xpath("(//div[text()='Administrator'])[2]")).getText();
	System.out.println("This is: "+text+ "Page");
	List<WebElement> certifications = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
	for (WebElement web : certifications) {
		String text2 = web.getText();
		System.out.println(text2);
	}
	
}
}



