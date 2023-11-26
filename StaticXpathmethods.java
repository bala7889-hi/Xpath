package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticXpathmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@id=\"vfb-5\" and @name=\"vfb-5\"]")).sendKeys("Bala");
		driver.findElement(By.xpath("(//input[@id=\"vfb-7\" or @name=\"vfb-5\"])[2]")).sendKeys("Nambula");
		driver.findElement(By.xpath("//label[starts-with(text(),\"Ma\")]")).click();
		driver.findElement(By.xpath("//input[contains(@name,\"vfb-13[address]\")]")).sendKeys("Electronic city");
		

	}

}
