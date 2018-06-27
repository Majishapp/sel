package Aprilmy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fffhweb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
	List<WebElement> radio=	driver.findElements(By.id("male"));
	
	int count=radio.size();
	
	System.out.println("total  radiobuttons" +count);
	
	for(int i=0;i<count;i++)
	{
		int x=radio.get(i).getLocation().getX();
		
		if(x!=0)
		
		{
			radio.get(i).click();
			break;
		}
	}
	
	}

}
