package week3.day2;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		//driver.findElement(By.id("Men")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		//Thread.sleep(2000);
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
		System.out.println(" List of Brands");
		System.out.println("****************");
		List<WebElement> bagBrandName = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandName.size());
		
		for (WebElement webElement : bagBrandName) {
			String text = webElement.getText();
			System.out.println(text);
		}
		List<WebElement> bagName = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagName.size());
		System.out.println(" Names of the Bags");
		System.out.println("*******************");
		for (WebElement webElement : bagName) {
			String text = webElement.getText();
			System.out.println(text);	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
