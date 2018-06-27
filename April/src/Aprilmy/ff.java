package Aprilmy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		int x= driver.findElement(By.id("male")).getLocation().getX();
		int y=driver.findElement(By.id("male")).getLocation().getX();
		
		System.out.println("x chord" +x);
		System.out.println("y chord" +y);
		

	}

}
