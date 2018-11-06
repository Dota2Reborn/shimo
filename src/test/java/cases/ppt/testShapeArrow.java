package cases.ppt;

import base.TestInit;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class testShapeArrow extends TestInit {
	
	
	public void makeSure() {
		boolean result = page_elements_2.isDisplayed();
		assertTrue(result);	
		action.sendKeys(Keys.DELETE).perform();
		
	}
	
	
	/**
	 * 新增箭头
	 * 
	 * @author 张家晶
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	 public void Add_arrow() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(add_arrows);
		action.click(ppt_text).build().perform();
		Boolean result = doesWebElementExist(page_elements_1);
		assertTrue(result);
		click(page_elements_1);
		action.sendKeys(Keys.DELETE).perform();
	}
	
	
	/**
	 * 复制箭头
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	 public void Copy_arrow() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_2);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"c"))
		.sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		makeSure();
	}
	
	
	/**
	 * 复制箭头点击文本框后粘贴
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	 public void copyArrow_clickTextbox() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_2);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
		click(ppt_page_6);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		Boolean result = doesWebElementExist(page_elements_2);
		assertFalse(result);
	}
	
	/**
	 * 复制箭头点击形状后粘贴
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	 public void copyArrow_clickShape() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_2);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
		click(ppt_page_3);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		makeSure();
	}
	
	
	/**
	 * 复制箭头点击图片后粘贴
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	 public void copyArrow_clickImg() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_2);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
		click(ppt_page_5);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		makeSure();
	}
	
	/**
	 * 复制箭头到另一个页面
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-25
	 *
	 */
	@Test(enabled = true)
	 public void copyArrow_clickPage() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_2);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
		click(ppt_page_1);
		action.sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		Boolean result = doesWebElementExist(page_elements_1);
		assertTrue(result);
		//click(page_elements_1);
		action.sendKeys(Keys.DELETE).perform();
	}
	
	
	/**
	 * 复制后删除箭头粘贴
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-27
	 *
	 */
	@Test(enabled = true)
	 public void DeleteCopy_arrow() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_2);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"c"))
		.sendKeys(Keys.DELETE).sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		Boolean result = doesWebElementExist(page_elements_1);
		assertFalse(result);
		click(ppt_revoke);
	}
	
	
	/**
	 * 拖拽箭头
	 * 
	 * @author 张家晶
	 * @Time 2018-07-27
	 *
	 */
	@Test(enabled = true)
	 public void Drag_arrow() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_2);
		Point location = page_elements_1.getLocation();
		System.out.println("location="+location);
		action.clickAndHold(page_elements_1);
		action.dragAndDropBy(page_elements_1, 50, 50).build().perform();
		action.release();
		Point location1 = page_elements_1.getLocation();
		System.out.println("location1="+location1);
		assertTrue(!location.equals(location1));
		click(ppt_revoke);
	}
	
	
	
	/**
	 * 缩放箭头
	 * 
	 * @author 张家晶
	 * @Time 2018-07-26
	 *
	 */
	@Test(enabled = true)
	 public void Resize_arrow() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(add_arrows);
		action.click(ppt_text).build().perform();
		WebElement beforeArrow = driver.findElement(By.xpath("//div[@class='smslide-action-layer']//div[1]//div[2]"));
		Dimension size = beforeArrow.getSize();
		System.out.println("size="+size);
		WebElement arrowStart = driver.findElement(By.xpath("//div[@class='smslide-action-layer']//div[1]//div[2]//div[1]//div[1]"));
		moveToElement(arrowStart);
		action.clickAndHold(arrowStart);
		action.dragAndDropBy(arrowStart, 0, 50).build().perform();
		driver.navigate().refresh();
		Thread.sleep(5000);
		click(page_elements_1);
		WebElement arrow = driver.findElement(By.xpath("//div[@class='smslide-action-layer']//div[1]//div[2]"));
		Dimension size1 = arrow.getSize();
		System.out.println("size1="+size1);
		assertTrue(!size.equals(size1));
		//click(page_elements_1);
		action.sendKeys(Keys.DELETE).perform();
		
	}
	
	
	/**
	 * 删除箭头后撤销，撤销后重做
	 * 
	 * @author 张家晶
	 * @Time 2018-07-25
	 *
	 */
	@Test(enabled = true)
	 public void Delete_arrow() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(add_arrows);
		action.click(ppt_text).build().perform();
		action.sendKeys(Keys.DELETE).perform();
		Boolean result = doesWebElementExist(page_elements_1);
		assertFalse(result);
		click(ppt_revoke);
		result = doesWebElementExist(page_elements_1);
		assertTrue(result);
		click(ppt_redo);
		result = doesWebElementExist(page_elements_1);
		assertFalse(result);
		click(ppt_revoke);
		click(page_elements_1);
		action.sendKeys(Keys.BACK_SPACE).perform();
		result = doesWebElementExist(page_elements_1);
		assertFalse(result);
	}
	
	
	
	/**
	 * 设置箭头样式
	 * 
	 * @author 张家晶
	 * @Time 2018-08-08
	 *
	 */
	@Test(enabled = false)
	 public void arrow_styles() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		Thread.sleep(5000);
		WebElement setTop = driver.findElement(By.xpath("//div[@class='container-section flex-align-center']//button[3]"));
		click(setTop);
		action.moveByOffset(0, 100).clickAndHold().moveByOffset(100, 100).click().build().perform();
		String stroke = setTop.getCssValue("stroke");//形状边框线颜色
		String strokeWidth = setTop.getCssValue("stroke-width"); //形状边框线宽度
		System.out.println("stroke="+stroke + " ===== " +"strokeWidth="+ strokeWidth);
	}
	

}
