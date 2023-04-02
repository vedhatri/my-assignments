package portal;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;



public class Nyakaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
driver.get("https://www.nykaa.com/");
driver.manage().window().maximize();
driver.switchTo().alert().dismiss();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebElement Nyakaa=driver.findElement(By.xpath("//a[text='brands']"));
Actions builder=new Actions(driver);
builder.moveToElement(Nyakaa).perform();

driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
driver.findElement(By.linkText("L'Oreal Paris")).click();
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.xpath("//span[text='Sort By : popularity']"));
driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Category']")).click();
driver.findElement(By.xpath("//span[text()='Hair']")).click();
//Hair Care
driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
//Shampoo
driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
driver.findElement(By.xpath("//span[text()='Concern']")).click();
//Color Protection
driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
driver.findElement(By.xpath("//div[@class='css-1emjbq5']")).click();
driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
Thread.sleep(2000);
Set<String> windowHandles=driver.getWindowHandles();
List<String> newwindow=new ArrayList<String>(windowHandles);
Thread.sleep(2000);
driver.switchTo().window(newwindow.get(1));
driver.findElement(By.className("active css-d3w64v")).click();
String mrp = driver.findElement(By.className("css-1jczs19")).getText();
System.out.println(mrp);
driver.findElement(By.xpath("//span[@class='btn-text']")).click();
Actions acc=new Actions(driver);
acc.moveToElement(driver.findElement(By.xpath("(//*[local-name()='svg' and @fill='none']/*[local-name()='path'])[2]"))).click().perform();
WebElement f = driver.findElement(By.xpath("//iframe[@class='css-1um1mkq e171rb9k3']"));
driver.switchTo().frame(f);
//css-1um1mkq e171rb9k3
String Total=driver.findElement(By.xpath("(//p[@class='css-1um1mkq e171rb9k3']")).getText();
System.out.println(Total);
driver.findElement(By.xpath("//div[@class='css-15vhhhd e25lf6d4']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
driver.quit();














	}

}
