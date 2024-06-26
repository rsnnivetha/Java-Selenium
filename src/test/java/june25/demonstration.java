package june25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demonstration {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		driver.findElement(By.linkText("Make Appointment")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("input#txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("input#txt-password")).sendKeys("ThisIsNotAPassword");
		
		//driver.findElement(By.id("input#txt-username")).sendKeys("John Doe");
		 	}

}
