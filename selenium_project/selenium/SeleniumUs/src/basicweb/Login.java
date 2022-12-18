package basicweb;



	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Login {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver",

	"D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	// Instantiate a ChromeDriver class.

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize(); //Maximizes thebrowser window

	driver.get("https://www.instagram.com/"); // launch Chromeand redirect it to the Base URL
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("username")).sendKeys("username");
	}
	}

