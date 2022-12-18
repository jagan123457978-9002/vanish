package basicweb;
import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.io.IO;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import vanish1.Excel_read;
public class Sundaytest {
WebDriver driver;
@BeforeClass
public void setup()
{
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();//Maximizes the browser window


}
@Test(dataProvider="loginData")
public void loginTest(String user, String pwd, String exp) 
{
//driver.get("https:\\www.facebook.com");
driver.get("https://www.saucedemo.com/");
//WebElement Email = driver.findElement(By.id("email"));
WebElement Email = driver.findElement(By.id("user-name"));
Email.sendKeys(user);
//WebElement Pwd = driver.findElement(By.id("pass"));
WebElement Pwd = driver.findElement(By.id("password"));
Pwd.sendKeys(pwd);
//driver.findElement(By.name("login")).click();
driver.findElement(By.id("login-button")).click();
}
@DataProvider(name="loginData")
public String [][]getdata()
{
String loginData[][]= {
{"standard_user","secret_sauce","PASS"},
{"standard_user","secret_sauce","PASS"}

};
return loginData;
}
@AfterClass
public void teardown()
{
driver.close();
}
}
