package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		
		Select selectDay = new Select(dayDropdown);
		selectDay.selectByIndex(26);
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select selectmonth = new Select(monthDropdown);
		selectmonth.selectByValue("11");
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select selectyear = new Select(yearDropdown);
		selectyear.selectByVisibleText("2007");
		
	}

}
