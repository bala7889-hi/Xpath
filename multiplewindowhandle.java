package xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;

public class multiplewindowhandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement btn=driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]"));
		btn.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		Set <String> WindowIds=driver.getWindowHandles();
		System.out.println(WindowIds);
		 for (String id : WindowIds) {
			   System.out.println("Tabs :"+id);
			  if(!id.equals(parentWindow)) {
				  driver.switchTo().window(id);
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Bala");
				  Thread.sleep(4000);
				  driver.close();  
		  }
		 }
		 driver.switchTo().window(parentWindow);
		   Thread.sleep(1000);
			  driver.findElement(By.id("name")).sendKeys("Iam Back to parent window");
	}
	

  
 }
