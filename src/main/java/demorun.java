import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demorun {

	public demorun() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// start driver-SeleniumManager
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance25.odoo.com/web/login?redirect=%2Fodoo%2Finventory%3Fcids%3D1");

	}

}
