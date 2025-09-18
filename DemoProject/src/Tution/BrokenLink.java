package Tution;

import java.net.URL;
import java.util.List;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> list =driver.findElement(By.tagName("a"));
				
		for(WebElement ls: list)
		{
			String hrefvalue =ls.getAttribute("href");
			
			if(hrefvalue==null || hrefvalue.isEmpty())
			{
				System.out.println("we cant check htis , this is not broken ");
			}
		
		
		try
		{
			URL url = new URL(hrefValue)
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			
			connection.connect();
			
			if(connection.getResponseCode()>=400)
			{
				System.out.println("this is the broken link" + hrefValue);
				brokenlink++;
			}else
			{
				System.out.println("this is not the broken link" + hrefValue);

			}
			connection.disconnect();

			
		}
		catch(Exception e)
		{
			System.out.println("Exception occuring at this link" +hrefValue);
		}
				
	}

}
