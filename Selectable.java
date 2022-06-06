package week5.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement e1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement e2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement e3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement e4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		Actions builder=new Actions(driver);
		builder.clickAndHold(e1).clickAndHold(e2).clickAndHold(e3).clickAndHold(e4).release().perform();
		
	}
	
}
