package functionalTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAdmin {
	public void testSearchAdmin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/AVI_registration_system/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Missaka");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("login_admin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("viewAdminLink")).click();
		Thread.sleep(2000);
		
		//search with search an empty search field
		driver.findElement(By.name("submit-admin-search")).click();
		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "Admin List";
		if(at.equalsIgnoreCase(et)) {
				System.out.println("didnt proceed with an empty search field, test passed");
			} else {
				System.out.println("test failed");
			}
		
		//search with a string
		driver.findElement(By.name("search")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.name("submit-admin-search")).click();
		Thread.sleep(2000);
		String at2 = driver.getTitle();
		String et2 = "Search Results";
		if(at2.equalsIgnoreCase(et2)) {
			System.out.println("search admin test passed");
		} else {
			System.out.println("test failed");
		}
		driver.close();
	}
}
