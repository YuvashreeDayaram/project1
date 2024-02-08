package locatordom;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class selenium {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\V.Gopinathan\\eclipse-workspace\\locatordom\\target\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String s= "https://www.facebook.com/login/";
		driver.get(s);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		WebElement email = driver.findElement(By.id("email"));//tag name,attribute name
//		email.sendKeys("yuva");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));//xpath
		email.sendKeys("yuva");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("yuva");
		
		String attribute = pass.getAttribute("value");
		System.out.println(attribute);
		
		WebElement Login = driver.findElement(By.xpath("//button[text()='Log in']"));
		Login.click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		
//		WebElement Log1 = driver.findElement(By.id("not_me_link"));
//		Log1.click();
//		Thread.sleep(4000);
		
		WebElement Log2 = driver.findElement(By.linkText("Forgotten account?"));
		Log2.click();
		Thread.sleep(5000);
		driver.navigate().back();
		
//		WebElement Logi = driver.findElement(By.partialLinkText("Forgotten"));
//		Logi.click();
//		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for(int i=0;i<link.size();i++){
		WebElement link1 = link.get(i);
		String text = link1.getText();
		System.out.println(text);
		}
}
}
