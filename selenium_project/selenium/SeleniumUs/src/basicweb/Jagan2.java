package basicweb;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jagan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("firstname")).sendKeys("Nisha");
		driver.findElement(By.name("lastname")).sendKeys("kutty");
		driver.findElement(By.name("reg_email__")).sendKeys("Nisha@gmail.com");
		driver.findElement(By.name("reg_password")).sendKeys("Nisha123");
		Select day =new Select(driver.findElement(By.id("day")));
		day.selectByValue("17");  
		Select month =new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue("12");
		Select year =new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("2001");
		//driver.findElement(By.xpath()//input[@value='2']")).click();
	}
}