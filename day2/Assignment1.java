package week4.day2;


import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.chittorgarh.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
	driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
	WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']"));
	List <WebElement> rowsize = table.findElements(By.tagName("tr"));
	System.out.println(rowsize.size());
	List<WebElement> security = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr/td[1]"));
	int size = security.size();
	System.out.println(size);
	for(int i=0; i<security.size();i++) {
    	String text = security.get(i).getText();
    	System.out.println(text);
	}
	Set<String> duplicate= new HashSet(security);
    int size2 = duplicate.size();
    System.out.println(size2);
    if(security.size()==duplicate.size()) {
    	System.out.println("Duplicate Found");
    }
    else {
    	System.out.println("No Duplicate");
    }
}
}