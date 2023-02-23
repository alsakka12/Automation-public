

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hjljllljl {

	public static void main(String[] args) {
		String email ="ghf3328@gmail.com";
        String pass ="Omaralsaka12345";
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.facebook.com");
		driver1.manage().window().maximize(); 
		
		driver1.findElement(By.id("email")).sendKeys(email);
		driver1.findElement(By.id("pass")).sendKeys(pass);
		driver1.findElement(By.name("login")).click();
		
	}

}
