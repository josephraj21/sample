import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {
	String text=" selenium ";
	
	public void method1() {
	
	List<String> obj=new ArrayList<>();
	
    String[] r = (text.trim().split("e", 0));
	
	System.out.println(r);
	
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wwww.facebook.com/");
	
	
	}
	}
	
	
	
	

