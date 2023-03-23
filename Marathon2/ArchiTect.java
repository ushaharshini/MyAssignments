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

public class ArchiTect {
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
	driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
	String text = driver.findElement(By.xpath("//div[@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large']")).getText();
	System.out.println(text);
	List<WebElement> architect = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
	for (WebElement string : architect) {
		String text2 = string.getText();
		System.out.println("The Architect Ceritifications are: "+text2);
	}
	driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
	String text2 = driver.findElement(By.xpath("//div[text()='Certification']")).getText();
	List<WebElement> cert = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
	for(int i=0; i<cert.size(); i++) {
		if(text2.contains("Certification")) {
			System.out.println(cert.get(i).getText());
		}
	}
}
}

