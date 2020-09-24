package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini {
	
    public static void main(String[] args) throws InterruptedException {
    	System.out.println("Introduce tu nombre y el numero de veces que se repetira la pelea");
    	
    	Scanner s = new Scanner(System.in);
    	String name = s.next();
    	int num = Integer.parseInt(s.next());
    	s.close();
    	
    	System.setProperty("webdriver.chrome.driver", "C://Windows/chromedriver.exe");
    	WebDriver driver= new ChromeDriver();
    	WebElement td3; 
    	
    	for(int i=0;i<num;i++) {
        	driver.get("http://"+name+".minitroopers.es/hq");
        	td3 = driver.findElement(By.cssSelector("a.b_bg.bgo_bg"));
        	td3.click();        	
        	Thread.sleep(3000);
    	}
    	driver.quit();
    }

}
