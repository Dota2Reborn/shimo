package cases.drag;


import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testDragShortcut extends TestInit {

	/**
	 * 拖拽文件夹到快捷方式
	 * 
	 * @author 王继程
	 * @Time 2018-05-07
	 *
	 */
	@Test(enabled = false)
	public void Dragging_folders() throws InterruptedException {
		login("Dragging_folders@shimo.im", "123123");
		click(desktop);
		
		desktop.click();
		action.clickAndHold(desktop1_1).perform();
		action.moveToElement(desktop_shortcut_Increase).perform();
//		action.release(desktop1_1).perform();
//		 new Actions(driver).dragAndDropBy(desktop1_1, 0, 10).build().perform();
//		//new Actions(driver).DragAndDrop(desktop1_1,desktop_shortcut_Increase).Perform();
//		//new Actions(driver).dragAndDrop(desktop1_1,desktop_shortcut_Increase).perform();
//		 WebDriver driver = new FirefoxDriver();
//
//		//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		//Launch website
//		driver.navigate().to("http://www.keenthemes.com/preview/metronic/templates/admin/ui_tree.htmll");
	
		
		//driver.manage().window().maximize();
			 
		WebElement From = driver.findElement(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']//div[1]//div[1]//div[1]//div[1]"));
		//WebElement To = driver.findElement(By.xpath("//ul[@id='right-sidebar-shortcuts']//li[2]"));
		WebElement To = driver.findElement(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']//div[1]//div[2]//div[1]//div[1]"));
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
		dragAndDrop.perform();
//			
////		
//		 WebElement draggable = driver.findElement(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']//div[1]//div[1]"));
//
//	      //向下移动10个像素
//	      for(int i = 0; i<20; i++){
//	          new Actions(driver).dragAndDropBy(draggable, 50, 0).build().perform();
//	      }
//		
		//driver.close(); 
	}
}
