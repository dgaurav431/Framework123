package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/table");
		Thread.sleep(2000);
		
		String levisShirtPrice = driver.findElement(By.xpath("//th[text()='Levis Shirt']/..//td[text()='896']")).getText();

		System.out.println(levisShirtPrice);
		
		
		//th[contains(text(), 'Levi')]/..//td[text()='"+var+"']
	}

}
