package Week2.day2.assignments.mandatory;

import java.awt.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		
		String brokenLink =driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).getAttribute("href");
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		Thread.sleep(700);
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("The  broken link is " + brokenLink);
		}
		String url="";
	     java.util.List<WebElement> allURLs = driver.findElements(By.tagName("a"));
	      System.out.println("Total links on the Wb Page: " + allURLs.size());

	      //We will iterate through the list and will check the elements in the list.
	      Iterator<WebElement> iterator = allURLs.iterator();
	      while (iterator.hasNext()) {
	    	  url = iterator.next().getText();
	    	  System.out.println(url);
	    	 
	      }
	}

}
