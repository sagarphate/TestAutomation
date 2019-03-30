package com.mphasis.testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LaunchBrowserAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/key_presses"); // link used for check clicks
		
		//driver.get("https://the-internet.herokuapp.com/hovers"); // link used for click on hold method
		
		driver.get("http://demo.guru99.com/test/drag_drop.html"); // Drag and drop Method check in Action class
		
		Actions obj = new Actions(driver);
		
		//obj.keyDown(Keys.CONTROL).perform(); // perform action on signal key action
		//obj.keyDown(Keys.CONTROL).build().perform(); // perform combination of keys 
		//obj.keyDown(Keys.ENTER).perform(); //keydown don't work with enter
		
		//Key Down option only work with Shift, Alt and Control not with others 
		
		//obj.sendKeys(Keys.ENTER).perform();
		
		//obj.keyDown(Keys.CONTROL).pause(1000).sendKeys(Keys.ENTER).perform();
		
		//obj.contextClick().perform();
		
		
	/*   obj.moveToElement(driver.findElement(By.xpath("//div[1]/img[@alt='User Avatar']")))
		.click(driver.findElement(By.xpath("//div[1]/a[@href='/users/1']")))
		.build().perform();*/
		
		/* obj.clickAndHold(driver.findElement(By.xpath("//div[1]/img[@alt='User Avatar']")))
		.release() // click on image and after need to release and click on View profile option 
		.click(driver.findElement(By.xpath("//div[1]/a[@href='/users/1']")))
		.build().perform();*/

		//obj.doubleClick().click().perform(); // Double click method

		//Drag and Drop method can not work every time then we use click and hold / move to element / release methods for same action
		//obj.dragAndDrop(driver.findElement(By.xpath("//li[2]/a[@class=\"button button-orange\"]")), driver.findElement(By.xpath("//ol[@id=\"amt7\"][@class=\"field13 ui-droppable ui-sortable\"]"))).build().perform();
	
		obj.clickAndHold(driver.findElement(By.xpath("//li[2]/a[@class=\"button button-orange\"]"))).moveToElement(driver.findElement(By.xpath("//ol[@id=\"amt7\"][@class=\"field13 ui-droppable ui-sortable\"]"))).release().click().perform();
	}
}
