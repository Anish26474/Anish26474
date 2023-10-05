package MultipleRegisteration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NameChangesEverytime {
	
  @Test
  public void registerUsers() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://BrowserDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sremv3testprod.ctpltest.online");
        driver.manage().window().maximize();

        String[] names = {"Anish", "John", "Alice", "Eva", "Michael", "Sophia", "David", "Olivia", "Daniel"};
        String[] domains = {"@gmail.com", "@yahoo.com", "@hotmail.com", "@outlook.com"};
        String state = "Assam";
        String district = "Cachar";
        String programId = "PG";
        String courseId = "M.Sc. - Botany";

        for (int i = 0; i < names.length; i++) {
            String userName = names[i];
            String email = "userr" + userName.toLowerCase() + i + domains[i % domains.length];
            String mobile = "620410334" + i;

            driver.findElement(By.partialLinkText("Register Now")).click();
            driver.findElement(By.id("name")).sendKeys(userName);
            driver.findElement(By.id("mobile_number")).clear();
            driver.findElement(By.id("mobile_number")).sendKeys(mobile);
            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("state")).sendKeys(state);
            driver.findElement(By.id("district")).sendKeys(district);
            driver.findElement(By.id("programid")).sendKeys(programId);
            driver.findElement(By.id("courseid")).sendKeys(courseId);
            driver.findElement(By.name("tocagreed")).click();
            driver.findElement(By.xpath("//*[@id=\"dataFormRegistration\"]/div/input[4]")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("dropdownMenuButton")).click();
            driver.findElement(By.xpath("/html/body/nav/div[2]/div/a[2]/i")).click();
        }

        driver.quit();
    }
}
