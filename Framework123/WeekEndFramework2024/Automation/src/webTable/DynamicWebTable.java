package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/table/dynamic-table");
		Thread.sleep(2000);
		String levisShirtPrice = driver.findElement(By.xpath("//th[contains(text(), 'Levi')]/..//td[4]")).getText();

		System.out.println(levisShirtPrice);
		
		
	}

}
