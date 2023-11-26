package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class scrollmethodsinjs2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.get("https://internshala.com/");
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.findElement(By.cssSelector("button[data-target=\"#login-modal\"]")).click();
         driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("nambulabalaprasanna100@gmail.com");
         driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Bala@Udemy1");
         Thread.sleep(4000);
         WebElement login=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
         JavascriptExecutor js=((JavascriptExecutor)driver);
//         js.executeScript("arguments[0].click();", login);
         System.out.println(js.executeScript("return document.title").toString());
        WebElement net=driver.findElement(By.xpath("(//span[@class=\"duration\"])[4]/following-sibling::h6"));
         js.executeScript("arguments[0].scrollIntoView(true);",net );
//         js.executeScript("window.scrollTo(20,360)");
//         js.executeScript("window.scrollBy(40,900)" );
         
	}

}
