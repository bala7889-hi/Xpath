package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement first=driver.findElement(By.cssSelector("input#vfb-5"));
		first.sendKeys("Bala Prasanna");
		WebElement last=driver.findElement(By.cssSelector("input[name=\"vfb-7\"]"));
		last.sendKeys("Nambula");
		WebElement button=driver.findElement(By.cssSelector("label[for=\"vfb-31-2\"]"));
		button.click();
		Thread.sleep(1000);
		
		//for address
//		
//		WebElement address =driver.findElement(By.cssSelector("span.vfb-full  input[id=\"vfb-13-address\"]"));
//		address.sendKeys("electronic city");
		WebElement a=driver.findElement(By.cssSelector("input[id=\"vfb-13-address\"]"));
		a.sendKeys("electronic city");
//		WebElement a1=driver.findElement(By.xpath("//input[@id=\"vfb-13-address\"]"));
//		a.sendKeys("electronic city");
		
		
		//for street
		
//		WebElement street=driver.findElement(By.cssSelector("span.vfb-full input[name=\"vfb-13[address-2]\"]"));
//		street.sendKeys("Celebrity Paradise Layout");

		driver.findElement(By.xpath("//input[@id=\"vfb-13-address-2\"]")).sendKeys("Celebrity Paradise Layout");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".vfb-left input[id=\"vfb-13-city\"]")).sendKeys("Sreevaru Sreevasine's");
		
		//for city
		
		driver.findElement(By.xpath("//input[@id=\"vfb-13-zip\"]")).sendKeys("Bengaluru");

	}

}
