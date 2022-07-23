package Week2.day2.assignments.mandatory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Saranya");
		driver.findElement(By.name("lastname")).sendKeys("Rajendran");
		driver.findElement(By.name("reg_email__")).sendKeys("saranyarinu1991gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("riya2020!!");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("saranyarinu1991gmail.com");
		
		WebElement dropdown1=driver.findElement(By.id("//select[@name='birthday_day']"));
		Select day = new Select(dropdown1);
		day.selectByValue("2");
		WebElement dropdown2=driver.findElement(By.xpath("//select[@id='month']"));
		Select month= new Select (dropdown2);
		month.selectByVisibleText("Sep");
		WebElement dropdown3=driver.findElement(By.id("year"));
		Select year=new Select(dropdown3);
		year.selectByVisibleText("1991");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}

}
