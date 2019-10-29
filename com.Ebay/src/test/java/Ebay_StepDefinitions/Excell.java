package Ebay_StepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excell {
	


public static void main(String[] args) throws BiffException, IOException {      
    Sheet s;
    WebDriver driver = new ChromeDriver();
    FileInputStream fi = new FileInputStream("C:\\Users\\shari\\eclipse-workspace\\com.Ebay\\Job Applications.xlsx");
    Workbook W = Workbook.getWorkbook(fi);

    s = W.getSheet(0);

    for(int row = 0;row <= s.getRows();row++){

    String Username = s.getCell(0,row).getContents();
    System.out.println("Username" +Username);
    driver.get("AppURL");
    driver.findElement(By.id("txtUserName")).sendKeys(Username);

    String password= s.getCell(1, row).getContents();
    System.out.println("Password "+password);

    driver.findElement(By.id("txtPassword")).sendKeys(password);

    driver.findElement(By.id("btnLogin")).click();
   }
 }}