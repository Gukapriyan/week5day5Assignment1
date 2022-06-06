package week5.day5;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.functions.Action;

public class Droganddrop {

	public static void main(String[] args) {
	
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://www.leafground.com/pages/drag.html");
			driver.manage().window().maximize();
			WebElement move =driver.findElement(By.xpath("//div[@id='draggable']"));
			Actions builder=new Actions(driver);
			builder.dragAndDropBy(move,100,100).perform();

	}

}
