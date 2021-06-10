package PrecticesProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenum_Webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();
		String geturl = driver.getCurrentUrl();
		System.out.println(geturl);
		String gettitle = driver.getTitle();
		System.out.println(gettitle);

		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("jj420867+a13@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Demo@123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		WebElement element = driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
		
		 Actions action = new Actions(driver);
		 action.moveToElement(element).perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@title='T-shirts']")).click();
		 Thread.sleep(3000);
		 
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollBy(0,400)");
		 
		 WebElement element2 = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		 
		 Actions action1 = new Actions(driver);
		 action1.moveToElement(element2).perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@title='Add to cart']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@title='Add']")).click();
		 Thread.sleep(2000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,400)");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")).click();
		 Thread.sleep(2000);
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("window.scrollBy(0,400)");
		 Thread.sleep(2000);
		 driver.findElement(By.name("message")).sendKeys("The huge benefit of abandoned cart emails? They’re automated. You can set up a series that goes out all on its own – and wins back revenue that would otherwise have disappeared.");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		 driver.findElement(By.name("cgv")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("processCarrier")).click();
		 Thread.sleep(2000);
		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("window.scrollBy(0,400)");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		 driver.findElement(By.xpath("//a[@class='logout']")).click();
		 System.out.println("Testing Completed");
		 driver.close();

	}

}
