package selenium.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
	
@Test
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--headless");
WebDriver driver = new ChromeDriver();
System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
driver.get("http://localhost:3001");
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//driver.findElement(By.className("v-button")).click();
driver.findElement(By.xpath("//*[@id='img1']/form/div/div/div/div[1]/div[2]/input")).click();
System.out.println("it clicked for username");
driver.findElement(By.xpath("//*[@id='img1']/form/div/div/div/div[1]/div[2]/input")).sendKeys("edureka"); 
System.out.println("it did input for username");


driver.findElement(By.xpath("//*[@id='img1']/form/div/div/div/div[1]/div[4]/input")).click();
System.out.println("it clicked for password");
driver.findElement(By.xpath("//*[@id='img1']/form/div/div/div/div[1]/div[4]/input")).sendKeys("edureka"); 
System.out.println("it did input for password");


driver.findElement(By.xpath("//*[@id='img1']/form/div/div/div/div[1]/div[6]/input")).click();
System.out.println("it clicked for submit button");
driver.findElement(By.xpath("//*[@id='img1']/form/div/div/div/div[1]/div[6]/input")).sendKeys("edureka"); 
System.out.println("it did input for submit button");
String data = driver.findElement(By.xpath("//*[@id='img1']/form/div/div/div/div[2]")).getText();


if (data.equals("Login Failed!")) {
	System.out.println("negative test has been complete this test case passed");
} else {
System.out.println("this has bypassed login test cases failed");
}


//driver.quit();
}
}
