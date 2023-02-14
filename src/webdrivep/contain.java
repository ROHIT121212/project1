package webdrivep;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class contain {
	ChromeDriver driver=new ChromeDriver();
	
@Before
public void open()
{
driver.get("http://www.google.com");
System.out.println("browser opened");
}
@Test
public void testveirfy()
{
String src=driver.getPageSource();
if(src.contains("Image"))
{
	System.out.println("test is present");

}
else
{
	System.out.println("test not present");
}
}
@After
public void testdown()
{
	driver.quit();
}
}
