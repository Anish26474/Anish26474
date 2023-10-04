package MultipleRegisteration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TenUsers {
	
  @Test
  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://BrowserDrivers//chromedriver.exe");

		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the CRM login page
		driver.get("https://sremv3testprod.ctpltest.online");
		driver.manage().window().maximize();
		
		int i = 1;
		while (i <= 9) { // Change the condition to <= if you want to register 10 users
			String userName = "Anish";
			String email = "useranishhh" + i + "@automationn.com";
			String mobile = "630210130" + i;
			// Remove special and numeric characters from the username
			userName = userName.replaceAll("[^a-zA-Z\\s]", "");

			driver.findElement(By.partialLinkText("Register Now")).click();
			driver.findElement(By.id("name")).sendKeys(userName);

			// Clear the phone number field before entering a new one
			driver.findElement(By.id("mobile_number")).clear();

			driver.findElement(By.id("mobile_number")).sendKeys(mobile); // Change phone number format as

			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("state")).sendKeys("Assam");
			driver.findElement(By.id("district")).sendKeys("Cachar");
			driver.findElement(By.id("programid")).sendKeys("PG");
			driver.findElement(By.id("courseid")).sendKeys("M.Sc. - Botany");
			driver.findElement(By.name("tocagreed")).click();
			driver.findElement(By.xpath("//*[@id=\"dataFormRegistration\"]/div/input[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("dropdownMenuButton")).click();
			driver.findElement(By.xpath("/html/body/nav/div[2]/div/a[2]/i")).click();

			i++; // Increment the loop counter
		}

		// Quit the WebDriver after registering all users
		driver.quit();
	}
  }

