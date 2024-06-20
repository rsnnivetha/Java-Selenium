package june20;

import org.openqa.selenium.By;

public class pageobjectsoodoologin {
	//in the odoo landing page, there is email, password and submit button

public void NavigateToURL() {
driver.get("https://freelance25.odoo.com/web/login?redirect=%2Fodoo%2Finventory%3Fcids%3D1");
}
//find element by tagname
public void Email() {
driver.findElement(By.id("login")).sendKeys("nivethasivakumar1998@gmail.com");
}
//find element by attribute
public void Password() {
driver.findElement(By.name("password")).sendKeys("Nivetha@98");
}
//find element by classname
//driver.findElement(By.className("btn-primary")).click();
//find element by cnstructing CSS selector using classname - tagname.classname
public void clickbutton() {
driver.findElement(By.cssSelector("button.btn")).click();
}