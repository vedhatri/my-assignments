package portal;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        String Price=driver.findElement(By.xpath("//span[text()='46,699']")).getText();
		 System.out.println(Price);
		 
		 WebElement rating = driver.findElement(By.xpath("//span[text()='3.0 out of 5 stars']"));
		 
		 Actions mouse=new Actions(driver);
		 mouse.moveToElement(rating).click().perform();
		 
		 driver.findElement(By.linkText("(Renewed) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)")).click();
		 
		 File source = driver.getScreenshotAs(OutputType.FILE);
			File destination = new File("./snaps/amazon.png");
			FileUtils.copyFile(source, destination);
			
			driver.findElement(By.id("submit.add-to-cart")).click();
			String cart = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
			System.out.println(cart);
			driver.close();
			
		 
		 
		 

	}

}
