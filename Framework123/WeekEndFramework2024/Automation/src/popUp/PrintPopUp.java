package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/print?sublist=0");
		
		driver.findElement(By.xpath("//button[text()='Print this out!']")).click();
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_December_WeekendBatch2023\\Automation\\autoIT\\print123.exe");
		
	}

}
