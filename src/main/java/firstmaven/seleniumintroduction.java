package firstmaven;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumintroduction {

	public static void main(String[] args) {
		// how to invoke browser - run selenium in chrome browser
		//chrome - driver- methods
		
	//Chromedriver.exe ->chrome
	//// Initialize ChromeDriver using Selenium Manager
	ChromeDriver driver = new ChromeDriver();
	// Initialize ChromeDriver using Selenium Manager
	//System. out. println("Hello World !"); 
	// Navigate to a website
    driver.get("https://www.google.ca/");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());

    // Close the browser
    driver.quit();

	}

}
