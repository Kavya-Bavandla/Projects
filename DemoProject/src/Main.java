
public class Main {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement el = driver.findElement(By.linkText("Privacy"));
		js.executeScript("arguments[0].scrollIntoView()", el);

	}

}
