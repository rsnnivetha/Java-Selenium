package june24;

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
		String username = (driver.findElement(By.xpath("//input[@value='John Doe']")).getAttribute("value"));
		
		driver.findElement(By.id("txt-username")).sendKeys(username);
		
		String password = (driver.findElement(By.xpath("//input[@aria-describedby='demo_password_label']")).getAttribute("value"));
		driver.findElement(By.id("txt-password")).sendKeys(password);
		//using classname;
		//driver.findElement(By.className("input.form-control")).sendKeys("John Doe");
		//driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		
		//driver.findElement(By.id("input#txt-username")).sendKeys("John Doe");
		
		driver.findElement(By.className("btn-default")).click();
		 	}

}