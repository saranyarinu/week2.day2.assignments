package Week2.day2.assignments.mandatory;

import java.awt.Dimension;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.client.model.geojson.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("home")).click();
		
	/*WebElement element = driver.findElement(By.id("position"));
	org.openqa.selenium.Point location = element.getLocation();
	int xcord = location.getX();
	System.out.println("Position of the webelement from left side is "+xcord +" pixels");
	int ycord = location.getY();
	System.out.println("Position of the webelement from top side is "+ycord +" pixels");
    */
		
		/*String buttonColor = driver.findElement(By.id("color")).getCssValue("background-color");
        String buttonTextColor = driver.findElement(By.id("color")).getCssValue("color");
        System.out.println("Button color: " + buttonColor);
        System.out.println("Text color " + buttonTextColor);
		*/
		
		WebElement button = driver.findElement(By.id("size"));
        org.openqa.selenium.Dimension dim = button.getSize();
        System.out.println(dim);
		
	}

}
