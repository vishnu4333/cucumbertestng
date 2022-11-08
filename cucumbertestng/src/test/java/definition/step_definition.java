package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class step_definition {
	
	public static String url="https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver;
	
	
	@When("Enter Username {string}")
	public void enter_username(String string) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(string);
	}
	@When("Enter Password {string}")
	public void enter_password(String string) {
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(string);
	}
	@When("Click on the loginbutton")
	public void click_on_the_loginbutton() {
		driver.findElement(By.xpath("//*[@name='submit']")).click();
	}
	@Then("i should see the title as {string}")
	public void i_should_see_the_title_as(String string)throws InterruptedException {
	    Thread.sleep(2000);
	    driver.quit();
	}

}
