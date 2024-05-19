package DynamixXpth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		
		String productPrice = "73,999";
		String productName = "APPLE iPhone 15 (Pink, 128 GB)";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		Thread.sleep(2000);
		
		String price = driver.findElement(By.xpath("//div[text()='"+productName+"']"
				+ "/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹"+productPrice+"']"))
				.getText();
		
		System.out.println(price);
	
	}

}
