package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestClass {


public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");

WebDriver driver= new ChromeDriver();

driver.get("https://www.instagram.com/"); 
}
}