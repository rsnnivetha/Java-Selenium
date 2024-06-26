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
//	/import java.time.Duration;




//public class Locators {
//
//
//
//public static void main(String[] args) throws InterruptedException {
//
//// TODO Auto-generated method stub
//
////implicit wait - 2 seconds time out
//
//System.setProperty("webdriver.chrome.driver");
//
//WebDriver driver = new ChromeDriver();
//
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//driver.get("https://freelance25.odoo.com/web/login?redirect=%2Fodoo%2Finventory%3Fcids%3D1");
//
//driver.findElement(By.id("")).sendKeys("");
//
//driver.findElement(By.name("")).sendKeys("");
//
//driver.findElement(By.classname("signInBtn")).click();
//
//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//
//driver.findElement(By.linkText("Forgot your password?")).click();
//
//Thread.sleep(1000);//
	//find inventory, stock, add stock
//
//driver.findElement(By.xpath("]")).sendKeys("");
//
//driver.findElement(By.cssSelector(")).sendKeys("");
//
//driver.findElement(By.xpath("")).clear();
//
//driver.findElement(By.cssSelector("")).sendKeys("");
//
//driver.findElement(By.xpath("")).sendKeys("");
//
//driver.findElement(By.cssSelector("")).click();
//
//System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//
//driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//
//Thread.sleep(1000);
//

//
//}



}





}
