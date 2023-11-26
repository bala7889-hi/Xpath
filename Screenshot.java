package xpath;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("balaprasanna@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("sjbxjibs");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		Files.copy(Src,new File("C:\\Users\\Saira\\OneDrive\\Desktop\\Screenshot\\image.jpg"));
		driver.close();

	}

}
