import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;




public class googleTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		//maximize chrome window
		driver.manage().window().maximize();
		//google search
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("youtube");
		
		//click on button
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
		//click on link
		driver.findElement(By.className("S3Uucc")).click();
		//search on youtube
		driver.findElement(By.id("search")).sendKeys("Linkin Park - Numb");
		//click on button
		driver.findElement(By.id("search-icon-legacy")).sendKeys(Keys.ENTER);
		//press on link
		driver.findElement(By.linkText("\"Numb (Official Video) - Linkin Park\"")).click();
		
		
		
		
		

	}

}
