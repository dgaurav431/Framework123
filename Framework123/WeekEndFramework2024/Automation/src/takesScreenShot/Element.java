package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Element {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		//Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//img[@src=\"/assets/qspiderlogo-alLgFauW.png\"]"));
	
		File source = ele.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_December_WeekendBatch2023\\Automation\\screenshot\\logo.png");
		
		Files.copy(source, target);
	}

}
