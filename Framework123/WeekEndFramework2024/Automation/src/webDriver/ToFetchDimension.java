package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDimension {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		Dimension dim = driver.manage().window().getSize();
		
		int width = dim.getWidth();
		int height = dim.getHeight();
		
		System.out.println("The Width is : "+width);
		System.out.println("The Height is : "+height);

	}

}
