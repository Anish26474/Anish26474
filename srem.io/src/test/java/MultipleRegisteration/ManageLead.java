package MultipleRegisteration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ManageLead {
  @Test
  public void f() throws InterruptedException  {
		
//			driver.get("https://sremv3stage.ctpltest.online");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://sremv3stage.ctpltest.online");
			driver.manage().window().maximize();
			Actions a=new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.findElement(By.id("loginwith")).click();
			driver.findElement(By.id("loginwith")).sendKeys("admin@admin.co");
			driver.findElement(By.id("checkLogin")).click();
			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).sendKeys("Welcome@AdmiN#");
			driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
			driver.findElement(By.xpath("//*[@class='large icon content']")).click();
			driver.findElement(By.xpath("//*[text()=' CRM ']")).click();
			driver.findElement(By.xpath("(//*[text()=' Manage Leads'])[1]")).click();
			int i = 1;
			while (i <= 10) {
				String userName = "Anish";
				String email = "usertwo" + i + "@automation.com";
				String mobile= "920319223" + i  ;
				userName = userName.replaceAll("[^a-zA-Z\\s]", "");
				
				driver.findElement(By.xpath("//*[@class='dx-icon dx-icon-plus']")).click();
				driver.findElement(By.id("profile_contact_name")).click();
				driver.findElement(By.id("profile_contact_name")).sendKeys(userName);
				driver.findElement(By.id("profile_email")).click();
				driver.findElement(By.id("profile_email")).sendKeys(email);
				driver.findElement(By.xpath("(//*[@class='search'])[1]")).click();
				driver.findElement(By.xpath("(//*[@class='search'])[1]")).sendKeys("india");			
				a.moveToElement(driver.findElement(By.xpath("(//*[text()='India'])[2]"))).click().build().perform();
				driver.findElement(By.xpath("(//*[@class='search'])[2]")).click();			
				{
					WebElement dropdown = driver.findElement(By.xpath("(//*[@class='search'])[2]"));
					a.moveToElement(dropdown.findElement(By.xpath("(//*[text()='Arunachal pradesh'])[2]"))).click().build()
							.perform();
				}			
				driver.findElement(By.id("contact_phone_no1")).click();
				driver.findElement(By.id("contact_phone_no1")).sendKeys(mobile);
				Thread.sleep(1000);	
				js.executeScript("scrollBy(0,500)", "");
				driver.findElement(By.xpath("(//*[@class='search'])[5]")).click();		
				{
					WebElement dropdown = driver.findElement(By.xpath("(//*[@class='search'])[5]"));
					Thread.sleep(1000);
					dropdown.findElement(By.xpath("(//*[text()='Neutral'])[2]")).click();
				}			
				driver.findElement(By.xpath("//*[@class='dx-dropdowneditor-icon']")).click();
				{
					WebElement dropdown = driver.findElement(By.xpath("//*[@class='dx-dropdowneditor-icon']"));
					dropdown.findElement(By.xpath("(//*[@class='dx-treeview-toggle-item-visibility'])[6]")).click();
					Thread.sleep(1000);
					dropdown.findElement(By.xpath("//*[text()='Test Dilipji']")).click();
					
				}			
				driver.findElement(By.xpath("(//*[@class='search'])[6]")).click();
				{
					WebElement dropdown = driver.findElement(By.xpath("(//*[@class='search'])[6]"));				
					dropdown.findElement(By.xpath("(//*[text()='Follow up Later'])[2]")).click();
				}			
				driver.findElement(By.xpath("(//*[@class='search'])[8]")).click();
				{
					WebElement dropdown = driver.findElement(By.xpath("(//*[@class='search'])[8]"));				
					dropdown.findElement(By.xpath("(//*[text()='AIFSET'])[4]")).click();
				}			
				driver.findElement(By.id("leaddescription_followup_date")).click();
				driver.findElement(By.xpath("(//*[text()='30'])[4]")).click();
				Thread.sleep(1000);
				js.executeScript("scrollBy(0,400)", "");
				driver.findElement(By.xpath("(//*[@class='search'])[9]")).click();
				{
					WebElement dropdown = driver.findElement(By.xpath("(//*[@class='search'])[9]"));
					Thread.sleep(1000);
					dropdown.findElement(By.xpath("(//*[text()='UG'])[2]")).click();
				}			
				driver.findElement(By.xpath("(//*[@class='search'])[10]")).click();
				{
					WebElement dropdown = driver.findElement(By.xpath("(//*[@class='search'])[10]"));
					Thread.sleep(1000);
					dropdown.findElement(By.xpath("(//*[text()='B.Arch'])[2]")).click();
				}
				driver.findElement(By.id("comments")).click();
				driver.findElement(By.id("comments")).sendKeys("Test By Nirmala");
				Thread.sleep(1000);
				js.executeScript("scrollBy(0,100)", "");
				driver.findElement(By.xpath("//*[text()=' Save Lead']")).click();
				
	          }
			i++;
			}
		
  }

