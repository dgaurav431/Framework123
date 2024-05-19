package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchThePositionOfWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		Point pos = driver.manage().window().getPosition();
		
		int xCoordinate = pos.getX();
		int yCoordinate = pos.getY();
		
		System.out.println("The X Coordinate is : "+xCoordinate);
		System.out.println("The Y Coordinate is : "+yCoordinate);


	}

}
