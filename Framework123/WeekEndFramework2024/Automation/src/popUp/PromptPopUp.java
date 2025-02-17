package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		
		driver.findElement(By.id("buttonAlert1")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String message = alert.getText();
		System.out.println(message);
		
		alert.sendKeys("yes");
		
		alert.accept();
		
	}

}
