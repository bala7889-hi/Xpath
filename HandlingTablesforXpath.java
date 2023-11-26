package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTablesforXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          WebDriver driver=new ChromeDriver();
          driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
          driver.manage().window().maximize();
          driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
          int row=driver.findElements(By.xpath("//table/tbody/tr")).size();
          System.out.println("no of rows "+row);
          int column=driver.findElements(By.xpath("//table/tbody/tr/th")).size();
          System.out.println("no of columns "+column);
          for (int i=2; i<=row;i++) {
        	  for (int j=1;j<=column;j++) {
        		  System.out.print(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
        	  }
        	  System.out.println();
          }
         
	}

}
