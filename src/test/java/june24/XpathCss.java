package june24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCss {

	public static void main(String[] args) {
		// start driver-SeleniumManager
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					//wait concept for the driver to locate web elements
					
					driver.get("https://freelance25.odoo.com/web/login?redirect=%2Fodoo%2Finventory%3Fcids%3D1");
					//find element by tagname
					driver.findElement(By.id("login")).sendKeys("nivethasivakumar1998@gmail.com");
					//find element by attribute
					driver.findElement(By.name("password")).sendKeys("Nivetha@98");
					//find element by classname
					driver.findElement(By.className("btn-primary")).click();
                    driver.quit();
	}

}
