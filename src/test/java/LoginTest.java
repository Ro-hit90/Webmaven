import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		driver=new FirefoxDriver();
	
		
	}
	@Test
	public void doLogIn() {
		/*
		 * driver.get("http://gmail.com");
		 * driver.findElement(By.id("identifierId")).sendKeys("rht.klI@gmail.com");
		 * driver.findElement(By.id("passwd")).sendKeys("asdfsd");
		 */
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("as");
		driver.findElement(By.name("pass")).sendKeys("1234");
		//driver.findElement(By.linkText("Forgotten password?")).click();
	}
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
}
