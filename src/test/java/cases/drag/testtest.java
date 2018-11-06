package cases.drag;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static org.testng.Assert.assertTrue;

public class testtest extends TestInit {
	/**
	 * 拖拽文件夹到快捷方式
	 * 
	 * @author 王继程
	 * @Time 2018-05-07
	 *
	 */
	@Test(enabled = false)
	 public void Dragging_folders() throws InterruptedException{
		login("Dragging_folders@shimo.im", "123123");
		//WebDriver driver = new FirefoxDriver();

		//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch website
		//driver.manage().window().maximize();
//		driver.navigate().to("http://keenthemes.com/preview/metronic/theme/admin_1/ui_tree.html");
//	 	WebElement From = driver.findElement(By.xpath(".//*[@id='j3_7']/a"));
//		WebElement To = driver.findElement(By.xpath(".//*[@id='j3_1']/a"));
		
//		desktop.click();
//		Thread.sleep(2000);
//		WebElement From = driver.findElement(By.xpath(".//div[@class='ReactVirtualized__Grid__innerScrollContainer']//div[1]//div[1]"));
//		WebElement To = driver.findElement(By.xpath(".//ul[@id='right-sidebar-shortcuts']//li[2]"));
//		
//		Actions builder = new Actions(driver);
//		Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
//		dragAndDrop.perform();
		
//		desktop.click();
//		Thread.sleep(2000);
//		WebElement  element = driver.findElement(By.xpath(".//*[@class='ReactVirtualized__Grid__innerScrollContainer']//div[1]//div[1]"));  
//        WebElement  target = driver.findElement(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']//div[1]//div[contains(@class,'folder-tile')]"));  
//        (new Actions(driver)).dragAndDrop(element, target).perform();  
		
		click(desktop);
		Thread.sleep(2000);
//		action.clickAndHold(desktop_shortcut_Increase).moveToElement(desktop1_1).perform();
//		action.release();
		
		
		
		Actions action = new Actions(driver);
		for (int i = 0; i < 5; i++) {
			action.dragAndDropBy(desktop1_1, 10, 0).build().perform();
			
		}
		//action.dragAndDrop(desktop1_1,desktop_shortcut_Increase).perform();
		//move_to_element_with_offset
		//action.moveToElement(desktop1_1).moveByOffset(50,50).perform();
//		action.moveToElement(desktop_new).perform();
//		Thread.sleep(5000);
//		WebElement From = driver.findElement(By.xpath(".//*[@id='j1_1_anchor']/a"));
//		WebElement To = driver.findElement(By.xpath(".//*[@id='j3_1']/a"));
		action.moveToElement(desktop1_1).perform();
		Thread.sleep(5000);
		//action.moveToElement(desktop_new).perform();
		action.dragAndDrop(desktop1_1,desktop_shortcut_Increase).perform();
		action.clickAndHold(desktop1_1).perform();
		//action.clickAndHold().perform();
		//action.dragAndDrop(desktop1_1,desktop_shortcut_Increase);
		Thread.sleep(4000);
		//action.moveByOffset(100,100).perform();
		//drag_and_drop
		
		action.moveToElement(desktop_shortcut_Increase,20,20).perform();
		Thread.sleep(4000);
		action.release().perform();
		
	   }

	@Test(enabled = false)
	 public void Add_circle() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		Thread.sleep(2000);
		click(desktop1_1);
		Thread.sleep(5000);
		click(add_circular);
		boolean result = driver.findElement(By.xpath("//div[@class='smslide-only-container']//div[1]//div[3]//div[1]")).isDisplayed();
		assertTrue(result);	
	}
	
	
	@Test(enabled = true)
	 public void Dragging_circle() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		Thread.sleep(2000);
		click(desktop1_1);
		Thread.sleep(5000);
		click(add_circular);
		action.clickAndHold(page_elements_1);
		action.dragAndDropBy(page_elements_1, 40, 0).build().perform();
		action.release().perform();
	}
	
	
	@Test(enabled = false)
	 public void Delete_circle() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		Thread.sleep(2000);
		click(desktop1_1);
		Thread.sleep(5000);
		click(add_circular);
		WebElement circle = driver.findElement(By.xpath("//div[@class='smslide-only-container']//div[1]//div[3]//div[1]"));
		moveToElement(circle);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DELETE).perform();
		//action.moveToElement(ppt_revoke).click();
		//click(ppt_revoke);
		//click(ppt_redo);
	}

	
	@Test(enabled = false)
	 public void Add_page() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		Thread.sleep(2000);
		click(desktop1_1);
		Thread.sleep(5000);
		click(add_page);
		boolean result = driver.findElement(By.xpath("//div[@class='sm-slide-filmstrip-container']//div[1]//div[2]")).isDisplayed();
		System.out.println(result);
		assertTrue(result);	
		Actions action = new Actions(driver);
		WebElement input = driver.findElement(By.xpath("//div[@class='smslide-only-container']//div[1]//div[3]//div[1]"));
		action.moveToElement(input, 0, 200).click().perform();
		action.sendKeys(Keys.DELETE).perform();
		
	}
	
	
	@Test(enabled = false)
	 public void Add_img() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		Thread.sleep(2000);
		click(desktop1_1);
		Thread.sleep(5000);//"E:\\testImg\\11.png" "E:\\testImg\\12.jpg" "E:\\testImg\\13.jpg"
		StringSelection sel = new StringSelection( " \"E:\\testImg\\11.png\" \"E:\\testImg\\12.jpg\" \"E:\\testImg\\13.jpg\" " );
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		click(add_diagram);
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);    
		Thread.sleep(1000); 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		boolean result = driver.findElement(By.xpath("//div[@class='smslide-only-container']//div[1]//div[3]//div[1]")).isDisplayed();
		assertTrue(result);	
	}
	
}
