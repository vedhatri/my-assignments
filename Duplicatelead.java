package logins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicatelead {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//driver.findElement(By.name("USERNAME")).sendKeys("DemoCSR");
		//driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("redmi");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vedha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tri");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("samsung");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("iphone");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TRAI");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Telephone");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vvv@gmail.com");
		WebElement Market = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select Mar=new Select(Market);
		Mar.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title8 = driver.getTitle();
		System.out.println(title8);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Iphone");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Safari");
		driver.findElement(By.name("submitButton")).click();
		String title9 = driver.getTitle();
		System.out.println(title9);
		
		
		
		
		
		
		
		
		

	}

}
