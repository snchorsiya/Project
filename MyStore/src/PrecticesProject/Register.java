package PrecticesProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

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
		driver.findElement(By.id("email_create")).sendKeys("jj420867+a13@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();

		Thread.sleep(4000);

		WebElement rediobutton = driver.findElement(By.xpath("//input[@name='id_gender']"));
		rediobutton.click();
		System.out.println(rediobutton.isSelected());
		
	
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Raju");
		driver.findElement(By.name("customer_lastname")).sendKeys("Testing");
		driver.findElement(By.name("passwd")).sendKeys("Demo@123");

		WebElement day = driver.findElement(By.id("days"));
		Select select = new Select(day);
		select.selectByIndex(1);
		
		WebElement month = driver.findElement(By.id("months"));
		Select select2 = new Select(month);
		select2.selectByIndex(1);
		
		WebElement year = driver.findElement(By.id("years"));
		Select select3 = new Select(year);
		select3.selectByVisibleText("1997  ");
		
		driver.findElement(By.name("newsletter")).click();
		
		driver.findElement(By.name("address1")).sendKeys("203,summary,Testing");
		driver.findElement(By.name("city")).sendKeys("Ahmedabad");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select select4 = new Select(state);
		select4.selectByValue("14");
		
		driver.findElement(By.name("postcode")).sendKeys("00000");
		
		WebElement country = driver.findElement(By.name("id_country"));
		Select select5 = new Select(country);
		select5.selectByValue("21");
		
		driver.findElement(By.name("phone_mobile")).sendKeys("8458523658");
		driver.findElement(By.name("alias")).sendKeys("Demo Testing 123");
		driver.findElement(By.name("submitAccount")).click();
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();

		// driver.close();

	}

}
