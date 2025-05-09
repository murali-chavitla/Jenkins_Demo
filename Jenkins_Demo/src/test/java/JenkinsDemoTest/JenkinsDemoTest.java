package JenkinsDemoTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JenkinsDemoTest {
	
	@Test
	public void login() {
		//lauch browser
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				//navigate
				driver.get("https://www.automationexercise.com/");
				
				//3. Verify that home page is visible successfully
				String expected_url="https://www.automationexercise.com/";
				String actual_url="https://www.automationexercise.com/";
				
				if(actual_url.equalsIgnoreCase(expected_url)) {
					System.out.println("home page is verified");
				}else {
					System.out.println("home page is not verified");
				}
				
				//4. Click on 'Signup / Login' button
				driver.findElement(By.xpath("//a[contains(text(), ' Signup / Login')]")).click();
				
				//6. Enter incorrect email address and password
				driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("dinga1@gmail.com");
				driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("dinga1234");
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				
				//7.Click 'login' button
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Login')]"))).click();
				
				driver.close();
	}

}
