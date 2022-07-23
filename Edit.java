package Week2.day2.assignments.mandatory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("saranyarinu1991@gmail.com", Keys.TAB);
		driver.findElement(By.xpath("(//input)[2]")).click();
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Text", Keys.TAB);
		
		driver.findElement(By.xpath("(//input)[3]")).click();
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("-Best place to learn Testing", Keys.TAB);
		
		driver.findElement(By.xpath("(//input)[4]")).clear();
		
		boolean field= driver.findElement(By.xpath("(//input)[5]")).isEnabled();
		
		if(field)
		{
		System.out.print("Edit field is enable");
		}
		else {
			System.out.print("Edit field is disable");
		}
			
	}

}
