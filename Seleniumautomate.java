package day5.SeleniumAutomate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumautomate {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/newtours/register.php\r\n");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.name("firstName")).sendKeys("Taru");
driver.findElement(By.name("lastName")).sendKeys("G");
driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("2134567892");
driver.findElement(By.id("userName")).sendKeys("abc@gmail.com");
////tagName[contains(@attribute,'partial Attribute Value')]
driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Downtown");
driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Toronto");
driver.findElement(By.xpath("//input[@name='state']")).sendKeys("ON");
driver.findElement(By.xpath("//input[contains(@name,'postal')]")).sendKeys("L45J67");
Select country=new Select(driver.findElement(By.name("country")));
country.selectByVisibleText("CANADA");

//Syntax: (xpath)/following-sibling::sibling-tagName
//(//input[@name='password'])/following-sibling::label
driver.findElement(By.xpath("//input[@name='email'])")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//input[@name='password'])")).sendKeys("1234");
driver.findElement(By.xpath("//input[@name='confirmPassword'])")).sendKeys("1234");
driver.findElement(By.xpath("//input[@name='submit'])")).click();



	}

}
