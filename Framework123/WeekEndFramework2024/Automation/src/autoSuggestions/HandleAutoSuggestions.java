package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestions {

	public static void main(String[] args) {
		boolean flag = true;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(text(), 'selenium')]"));
		
		int noOfSuggestions = allSuggestions.size();
		
		System.out.println("The no of suggestions are : "+noOfSuggestions);
		
		for(WebElement sug:allSuggestions) {
			//System.out.println(sug.getText());
			
			if(sug.getText().contains("java")) {
				sug.click();
				flag = false;
				break;
			}
		
		}
		
		if(flag) {
			System.out.println("The Suggestion was not present");
		}
		
		else
			System.out.println("The Suggestion was present and clicked");
		
	}

}
