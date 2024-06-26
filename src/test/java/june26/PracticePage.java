package june26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticePage {

	public PracticePage() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INITIALIZE WEBDRIVER
		WebDriver driver = new ChromeDriver();
		//NMAVIGATE TO THE PAGE
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
	//LOCATE WEBELEMENT WITH DROPDOWN-WEBELEMENT INTERFACE
	WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	//SELECT THIS BY USING select METHOD
	Select dropdown = new Select(staticDropdown);
	//USE DROPDOWN method- CAN SELECT BY INDEX,VALUES OR VISIBLE TEXT
	dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	}
	}