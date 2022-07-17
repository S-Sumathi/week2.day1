package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		//Chromedriver setup
		WebDriverManager.chromedriver().setup();
		
		//Creating Class
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Clcik Lead
		driver.findElement(By.linkText("Leads")).click();
		//Click Create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Create Lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("leaf");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("local");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("department");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("DEscription");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");
		//Select Dropdown
		WebElement stateDropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select= new 	Select(stateDropdown);
		select.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		
		String title=driver.getTitle();
				System.out.println(title);
	}

}
