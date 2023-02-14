package webdrivep;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class google
{
String exp="google";
ChromeDriver driver=new ChromeDriver();

	@Before
	public void open()
	{
		
		driver.get("http://www.google.com");
		System.out.println("browser opened");
		
	}
	@Test
	public void test()
	{
		String actualtitle=driver.getTitle();
		System.out.println("actualtitle="+actualtitle);
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@After
	public void testdown()
	{
	    driver.quit();
	}
}

	


