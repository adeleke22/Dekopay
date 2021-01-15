package Selenuim_Deko;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Deko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\koduk\\eclipse-workspace\\Selenuim software\\chromedriver.exe");
		
		RemoteWebDriver driver = new ChromeDriver();
	
		driver.get("https://release.dekopay.org/backoffice/v2/#/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"ng-app\"]/div/div/div/div/div/form/div[2]/input")).sendKeys("Collins.Adeleke");;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"ng-app\"]/div/div/div/div/div/form/div[3]/input")).sendKeys("DekoQA2020");
		
		driver.findElement(By.xpath("//*[@id=\"ng-app\"]/div/div/div/div/div/form/div[6]/button")).click();
		
		driver.findElement(By.className(null));
		
		
	}

}
