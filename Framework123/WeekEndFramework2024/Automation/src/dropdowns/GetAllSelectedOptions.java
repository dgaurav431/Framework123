package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/select-menu");
		
		WebElement carDropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(carDropdown);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByVisibleText("Opel");
		Thread.sleep(2000);
		select.selectByVisibleText("Saab");
		
		List<WebElement> allSelected = select.getAllSelectedOptions();
		
		System.out.println("The No of selected options are : "+allSelected.size());
		
		for(WebElement option:allSelected) {
			System.out.println(option.getText());
		}
		
		String firstSelectedOption = select.getFirstSelectedOption().getText();
		
		System.out.println("The First Selected Option is : "+firstSelectedOption);
	}

}
