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
import org.openqa.selenium.support.ui.Select;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement men = driver.findElement(By.xpath("//span[@class='catText']"));
        Actions snap=new Actions(driver);
        snap.moveToElement(men).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
        String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
        System.out.println(count);
        driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		 driver.findElement(By.className("sort-label")).click();
		 WebElement sec=driver.findElement(By.className("sort-label"));
		 Select sort=new Select(sec);
		 sort.selectByVisibleText("Price Low To High");
		 driver.findElement(By.xpath("//input[@class='input-filter']")).sendKeys("900");
		 driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("1200");
		 driver.findElement(By.className("price-go-arrow btn btn-line btn-theme-secondary")).click();
		 driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		 WebElement sports=driver.findElement(By.xpath("//img[@title='UrbanMark Men Comfortable Slip On Sports Shoes - Navy']"));
		 Actions Spo=new Actions(driver);
		 Spo.moveToElement(sports).perform();
		 
		 driver.findElement(By.xpath("//div[@pogid='621868725223']")).click();
		 String Price=driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText();
		 System.out.println(Price);
		 
		 File source = driver.getScreenshotAs(OutputType.FILE);
			File destination = new File("./snaps/SnapDeal.png");
			FileUtils.copyFile(source, destination);
		 
		 Thread.sleep(1000);
		 
	
		 driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		 
		 driver.quit();
		 
		 
		 
		 
		 

	}

}
