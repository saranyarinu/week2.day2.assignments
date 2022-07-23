package Week2.day2.assignments.mandatory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Phone Number')])[4]/following::input[@name='phoneNumber']")).sendKeys("5632169854");
		driver.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		String text = driver.findElement(By.xpath("(//div[contains(text(),'5632169854')])[1]/preceding::div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("Lead ID of 1st Lead : " + text);
		driver.findElement(By.xpath("(//div[contains(text(),'5632169854')])[1]/preceding::div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(300);
		String message = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		//System.out.println(message);
		if (message.contains("No records")) {
			System.out.println("Delete Lead is Successful");
		}
		else {
			System.out.println("It is unsuccessful");
		}



	}

}
