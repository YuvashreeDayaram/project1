package locatordom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yuvaa {
	
		public static void main(String[]args) throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\V.Gopinathan\\eclipse-workspace\\locatordom\\target\\driver\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					String s= "https://www.facebook.com/login/";
					driver.get(s);
					driver.manage().window().maximize();
					Thread.sleep(5000);
	}
	}

