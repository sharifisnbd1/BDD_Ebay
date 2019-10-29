package Ebay_StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListExample {
static WebDriver driver;
private static int i;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		 driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\shari\\eclipse-workspace\\com.Ebay\\Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		takeScreenshot("ebay_url");
		
		List <WebElement> listLink=driver.findElements(By.tagName("h3"));
		
		for(WebElement url : listLink) {
			String allElements=url.getText();
			System.out.println(allElements);
			
		}
		System.out.println("************");
		List<WebElement> dropdown=driver.findElements(By.xpath("//*[@id=\"gh-cat\"]"));
		Select prod=new Select((WebElement) dropdown);
		List<WebElement>pro_DD=prod.getOptions();
		for(i=0;i<pro_DD.size();i++) {
			String ddValues=pro_DD.get(i).getText();
			System.out.println(ddValues);
		}

	}
public static void takeScreenshot(String fileName) throws IOException {
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\Users\\shari\\eclipse-workspace\\com.Ebay\\src\\test\\java\\Ebay_StepDefinitions\\"+fileName+" .jpg"));
	
	
}
}
