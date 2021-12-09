package org.box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoxerCom {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\eclipse-workspace\\BoxerCom\\escap\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	WebElement table = driver.findElement(By.id("customers"));
	
   List<WebElement> tableRows = table.findElements(By.tagName("tr"));
	for (int i = 0; i < tableRows.size(); i++) {
		WebElement tableRow = tableRows.get(i);
		String text = tableRow.getText();
		System.out.println(text);	
	}
	
	for (int i = 0; i < tableRows.size(); i++) {
		WebElement tableRow = tableRows.get(i);
		
	 List<WebElement> tableHeaders = tableRow.findElements(By.tagName("th"));
		for (int j = 0; j <tableHeaders.size() ; j++) {
			WebElement tableHeader = tableHeaders.get(j);
			String text = tableHeader.getText();
			System.out.println(text);
		}
	}
	
	for (int i = 0; i < tableRows.size(); i++) {
		WebElement tableRow = tableRows.get(i);
		
		List<WebElement> tableDatas = tableRow.findElements(By.tagName("td"));
		for (int j = 0; j < tableDatas.size(); j++) {
			WebElement tableData = tableDatas.get(j);
			String text = tableData.getText();
			System.out.println(text);
		}
		
	}
	
}
}
