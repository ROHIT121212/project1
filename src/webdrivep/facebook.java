package webdrivep;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void open()
	{
		driver.get("http://www.facebook.com");
		System.out.println("browser opened");
	}
   @Test
   public void testverify()
   {
	   driver.findElement(By.id("email")).sendKeys("abcei09@gmail.com");
	   driver.findElement(By.name("pass")).sendKeys("anju");
	   driver.findElement(By.name("login")).click();
   }
   @After
   public void testdown()
   {
	   
   }
}
