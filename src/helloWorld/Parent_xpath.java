package helloWorld;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_xpath {
	
	//Get all the text() present under Testing in www.guru99.com
	
public void method1() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.guru99.com/");
		List<WebElement> we = driver.findElement(By.xpath("//a[@title='Software Testing']/../..")).findElements(By.tagName("a"));
		
		for(WebElement w : we) {
			System.out.println(w.getText());
		}
		driver.close();
	}
	
	
	public static void main(String[] args) {
		Parent_xpath sf = new Parent_xpath();
		sf.method1();

	}

}
