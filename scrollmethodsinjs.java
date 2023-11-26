package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollmethodsinjs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   WebDriver driver =new ChromeDriver();
	        driver.get("https://practice.automationtesting.in/my-account/");
			driver.manage().window().maximize();
//			driver.findElement(By.id("username")).sendKeys("mprasannakumar124@gmail.com");
//			driver.findElement(By.id("password")).sendKeys("BensonNeal@59");
//			driver.findElement(By.name("login"));
			//JavascriptExecutor js=(JavascriptExecutor)driver;
//			System.out.println(js.executeScript("return document.title").toString());
//			js.executeScript("arguments[0].click();", driver.findElement(By.name("login")));
//			
//			Thread.sleep(2000);
//			js.executeScript("window.scrollTo(0,50)");
//			Thread.sleep(2000);
//			js.executeScript("window.scrollBy(0,50)");
//			Thread.sleep(2000);
//			js.executeScript("window.scrollBy(0,50)");
driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/scrollbar_themes_demo.html");

JavascriptExecutor js=(JavascriptExecutor)driver;	
				
WebElement ele=driver.findElement(By.xpath("//div[@id='mCSB_10_container']"));
	Thread.sleep(4000);	
		js.executeScript("arguments[0].scrollIntoView(true);",ele);

	}

}
