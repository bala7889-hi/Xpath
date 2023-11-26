package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicAxesMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement w=driver.findElement(By.xpath("//div[@class=\"container\"]"));
        //driver.switchTo().frame(w);
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@maxlength=\"10\"]/preceding::label")).sendKeys("Bala Prasanna");
		driver.findElement(By.xpath("//input[@maxlength=\"15\"]/preceding-sibling::label[1]")).sendKeys("Nambula");
//		driver.findElement(By.xpath("//label[text()=\"First Name \"]")).sendKeys("BalaPrasanna");
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("hvcvh@gmail.com");

	}

}
