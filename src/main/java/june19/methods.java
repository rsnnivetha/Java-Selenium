package june19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {

	public methods() {
		// invoke browser
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}

	public static void main(String[] args) {
		// call the method
		methods d= new methods();
		d.getdata();
		
		

	}

	private void getdata() {
		// TODO Auto-generated method stub
		
	}

}
