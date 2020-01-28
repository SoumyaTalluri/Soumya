package orangehrm;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orangehrm1 {
   // static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAInfotech\\Desktop\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	     driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("opensourcecms");
	     driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("opensourcecms");
	     driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
	     driver.findElement(By.id("admin")).click();
		 driver.switchTo().frame("rightMenu");
		 driver.findElement(By.id("btnSaveGenInfo")).click();
	   /*  Actions action = new Actions(driver);
	     WebElement we = driver.findElement(By.xpath("//*[@class='drop']"));
	     action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@class='drop current']"))).click().build().perform();*/
	     
	     //driver.findElement(By.xpath("//*[@class=\"drop\"]")).click();
	    // driver.findElement(By.xpath("//*[@class='drop current']")).click();
	     
	}

}
