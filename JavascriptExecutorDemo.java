package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("expereinceDD")).click();
		Thread.sleep(1000);
		List <WebElement> divs= driver.findElements(By.xpath("//div[@class=\"dropdownContainer dropdownShow \"]//ul//li")); //all the elements
		List <WebElement> name=driver.findElements(By.xpath("//div[@class=\"dropdownContainer dropdownShow \"]//ul/li//span[1]"));//only one
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i).getText());
			if(name.get(i).getText().equals("12 years")) {
				System.out.println("inside the condition");
//				divs.get(i).click();
				JavascriptExecutor js=((JavascriptExecutor)driver);
				 js.executeScript("arguments[0].click()",divs.get(i));

				
			}
		}
//		

	}

	
	
	
}
