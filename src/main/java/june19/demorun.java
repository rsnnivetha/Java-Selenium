package june19;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class demorun {

	public demorun() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// start driver-SeleniumManager
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//wait concept for the driver to locate web elements
		
		driver.get("https://freelance25.odoo.com/web/login?redirect=%2Fodoo%2Finventory%3Fcids%3D1");
		//find element by tagname
		driver.findElement(By.id("login")).sendKeys("nivethasivakumar1998@gmail.com");
		//find element by attribute
		driver.findElement(By.name("password")).sendKeys("Nivetha@12398");
		//find element by classname
		//driver.findElement(By.className("btn-primary")).click();
		//find element by cnstructing CSS selector using classname - tagname.classname
	    driver.findElement(By.cssSelector("button.btn")).click();
		//driver.findElement(By.className("alert-danger")).isDisplayed();
	    //System.out.println(driver.findElement(By.cssSelector("p.alert")).getText());
	    driver.findElement(By.linkText("Reset Password")).click();
	    driver.findElement(By.cssSelector("input.form-control")).sendKeys("nivethasivakumar1998@gmail.com");
	    driver.findElement(By.cssSelector("button.btn-primary")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.linkText("Back to Login")).click();
	    driver.findElement(By.id("login")).sendKeys("nivethasivakumar1998@gmail.com");
		//find element by attribute
		driver.findElement(By.name("password")).sendKeys("Nivetha@98");
		driver.findElement(By.className("btn")).click();
		//driver.findElement(By.xpath("//*button[@class='btn]")).click();
	
	    
	}

	
	}


