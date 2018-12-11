package cases.ppt;

import base.TestInit;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class testPictureUP extends TestInit {
	
	
	public String[]  formateData(Point point) {
		String data = point.toString();
		String dataSub = data.substring(1, data.length()-1);
		String[] dataSp = dataSub.split(",");
		//int dataX = Integer.parseInt(dataSp[0]);
		return dataSp;
	}
	
	
	/**
	 * 上方工具栏添加多张图片
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-31
	 *
	 */
	@Test(enabled = true)
	 public void Add_imgs() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);//"E:\\testImg\\11.png" "E:\\testImg\\12.jpg" "E:\\testImg\\13.jpg"
		StringSelection sel = new StringSelection( " \"E:\\testImg\\11.png\" \"E:\\testImg\\12.jpg\" \"E:\\testImg\\13.jpg\" " );
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		click(add_diagram);
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);    
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		Boolean result = page_elements_1.isDisplayed();
		Boolean result1 = page_elements_2.isDisplayed();
		Boolean result2 = page_elements_3.isDisplayed();
		assertTrue(result && result1 && result2);
		action.sendKeys(Keys.chord(Keys.CONTROL, "a")).sendKeys(Keys.DELETE).build().perform();
	}
	
	
	/**
	 * 点击占位符上传图片
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-31
	 *
	 */
	@Test(enabled = true)
	 public void Add_img() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_7);
		StringSelection sel = new StringSelection("E:\\testImg\\11.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		click(page_elements_1_1);
		Dimension size = page_elements_1.getSize();
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);    
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		Dimension size1 = page_elements_1.getSize();
		assertTrue(!size.equals(size1));
		click(ppt_revoke);
		click(ppt_revoke);
	}
	
	
	/**
	 * 复制图片
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-31
	 *
	 */
	@Test(enabled = true)
	 public void Copy_img() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_5);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"c"))
		.sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		Boolean result = doesWebElementExist(page_elements_2);
		assertTrue(result);
		action.sendKeys(Keys.DELETE).perform();
	}
	
	/**
	 * 复制图片后点击文本框
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-31
	 *
	 */
	@Test(enabled = true)
	 public void copyImg_clickTextbox() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_5);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
		click(ppt_page_6);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		Boolean result = doesWebElementExist(page_elements_2);
		System.out.println("======="+result+"=========");
		assertFalse(result);
	}
	
	
	/**
	 * 复制图片后点击形状
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-31
	 *
	 */
	@Test(enabled = true)
	 public void copyImg_clickShape() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_5);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
		click(ppt_page_4);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		Boolean result = doesWebElementExist(page_elements_2);
		assertTrue(result);
		action.sendKeys(Keys.DELETE).perform();
	}
	
	/**
	 * 复制图片到另一个页面
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-31
	 *
	 */
	@Test(enabled = true)
	 public void copyImg_clickPage() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_5);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
		action.click(ppt_page_1).sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		Boolean result = doesWebElementExist(page_elements_1);
		assertTrue(result);
		action.sendKeys(Keys.DELETE).perform();
	}
	
	/**
	 * 复制后删除当前选中图片粘贴
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-07-31
	 *
	 */
	@Test(enabled = true)
	 public void DeleteImg_Copy() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_5);
		action.click(page_elements_1).sendKeys(Keys.chord(Keys.CONTROL,"c"))
		.sendKeys(Keys.DELETE).sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		Boolean result = doesWebElementExist(page_elements_1);
		assertFalse(result);
		click(ppt_revoke);
	}
	
	
	/**
	 * 删除图片后撤销，撤销后重做
	 * 
	 * @author 张家晶
	 * @Time 2018-07-31
	 *
	 */
	@Test(enabled = true)
	 public void Delete_Img() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_5);
		click(page_elements_1);
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
		click(ppt_revoke);
	}
	
	
	/**
	 * 拖拽图片
	 * 
	 * @author 张家晶
	 * @Time 2018-07-31
	 *
	 */
	@Test(enabled = true)
	 public void Drag_Img() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_5);
		click(page_elements_1);
		Point location = page_elements_1.getLocation();
		System.out.println("location="+location);
		action.clickAndHold(page_elements_1);
		action.dragAndDropBy(page_elements_1, 50, 50).build().perform();
		action.release();
		Point location1 = page_elements_1.getLocation();
		System.out.println("location1="+location1);
		assertTrue(!location.equals(location1));
	}
	
	/**
	 * 缩放图片
	 * 
	 * @author 张家晶
	 * @Time 2018-07-31  
	 *
	 */
	@Test(enabled = true)
	 public void Resize_Img() throws InterruptedException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_5);
		click(page_elements_1);
		WebElement beforeImg = driver.findElement(By.xpath("//div[@class='smslide-action-layer']//div[1]//div[2]"));
		Dimension size = beforeImg.getSize();
		System.out.println("size="+size);
		WebElement northEast = driver.findElement(By.xpath("//div[@class='smslide-action-layer']//div[1]//div[2]//div[1]//div[1]"));
		moveToElement(northEast);
		action.clickAndHold(northEast);
		action.dragAndDropBy(northEast, 50, 0).build().perform();
		action.release();
		driver.navigate().refresh();
		click(ppt_page_5);
		click(page_elements_1);
		WebElement afterImg = driver.findElement(By.xpath("//div[@class='smslide-action-layer']//div[1]//div[2]"));
		Dimension size1 = afterImg.getSize();
		System.out.println("size1="+size1);
		assertTrue(!size.equals(size1));
	}
	
	/**
	 * 裁剪图片
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-10-09
	 *
	 */
	@Test(enabled = false)
	 public void Cut_Img() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_5);
		click(page_elements_1);
		Dimension beforeCut = page_elements_1.getSize();
		System.out.println("beforeCut="+beforeCut);
		WebElement cutButton = driver.findElement(By.xpath("//div[@data-test='viewport']//div[1]//div[2]//div[2]//div[1]//div[1]"));
		click(cutButton);
		click(ppt_type);
		//click(type_pictures_cut);
		action.click(type_pictures_proportionk).sendKeys(Keys.chord(Keys.CONTROL,"a"))
		.sendKeys(Keys.NUMPAD1).build().perform();//宽输入1
		action.click(type_pictures_proportiong).sendKeys(Keys.chord(Keys.CONTROL,"a"))
		.sendKeys(Keys.NUMPAD3).build().perform();//高输入3
		action.click(ppt_text).build().perform();
		Dimension afterCut = page_elements_1.getSize();
		System.out.println("afterCut="+afterCut);
		assertTrue(!beforeCut.equals(afterCut));
		click(ppt_revoke);
	}
	
	
	
	/**
	 * 替换图片
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-09-29
	 *
	 */
	@Test(enabled = true)
	 public void Replace_Img() throws InterruptedException, AWTException{
		login("test_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		//Thread.sleep(5000);
		click(ppt_page_5);
		click(page_elements_1);
		click(ppt_type);
		StringSelection sel = new StringSelection("E:\\testImg\\11.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		click(type_pictures_replace);
		Dimension size = page_elements_1.getSize();
		System.out.println("size="+size);
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);    
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(page_elements_1));
		Dimension size1 = page_elements_1.getSize();
		System.out.println("size1="+size1);
		assertTrue(!size.equals(size1));
		click(ppt_revoke);
		click(ppt_revoke);
	}

	
	/**
	 * 选中元素的不透明度
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-09-29
	 *
	 */
	@Test(enabled = true)
	 public void Opacity() throws InterruptedException, AWTException{
		login("testLevel_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		Thread.sleep(5000);
		for(int i = 1;i <3;i++) {
			WebElement page = driver.findElement(By.xpath("(//div[contains(@class,'sm-transparency-card')])["+i+"]"));
			click(page);
			for(int j = 1;j < 3;j++) {
				WebElement element = driver.findElement(By.xpath("(//div[@class='smslide-slide smslide-slide--shadowed']/div)["+j+"]"));
				click(element);
				click(ppt_type);
				String  opacity1 = element.getCssValue("opacity");
				System.out.println("opacity1="+opacity1);
				click(ppt_type);
				opacityAndCoord(transparency,transparencys,transparencyx);
				String  opacity2 = element.getCssValue("opacity");
				System.out.println("opacity2="+opacity2);
				assertTrue(!opacity1.equals(opacity2));
				action.click(transparency).sendKeys(Keys.NUMPAD9).build().perform();
			}
		}
	}
	
	
	/**
	 * 调整当前选中元素的层级
	 * 
	 * @author 张家晶
	 * @Time 2018-09-29  
	 *
	 */
	@Test(enabled = true)
	 public void elements_level() throws InterruptedException{
		login("testLevel_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		Thread.sleep(5000);
		for(int i = 1; i < 3; i++) {
			WebElement page = driver.findElement(By.xpath("(//div[contains(@class,'sm-transparency-card')])["+i+"]"));
			click(page);
			for (int j = 1; j < 3; j++) {
				System.out.println("==========================");
				WebElement element = driver.findElement(By.xpath("(//div[@class='smslide-slide smslide-slide--shadowed']/div)["+j+"]"));
				click(element);
				click(ppt_animation);
				String indexBefore = element.getCssValue("z-index");
				System.out.println("indexBefore="+indexBefore);
				if (indexBefore.equals("0")) {//当index=0，则上移一层，下移一层，置顶，置底
					click(element_moveUp);
					click(element_moveDown);
					click(element_setTop);
					click(element_setThe);
				}else if (indexBefore.equals("1")) {//当index=1，则置底，置顶，下移一层，上移一层
					click(element_setThe);
					click(element_setTop);
					click(element_moveDown);
					click(element_moveUp);
				}/*else if (indexBefore.equals("2")) {//当index=2，则上移一层，置底，置顶，下移一层
					click(element_moveUp);
					click(element_setThe);
					click(element_setTop);
					click(element_moveDown);
				}else{//当index=3，则下移一层，上移一层，置底，置顶
					click(element_moveDown);
					click(element_moveUp);
					click(element_setThe);
					click(element_setTop);
				}*/
			String indexAfter = element.getCssValue("z-index");
			System.out.println("indexAfter="+indexAfter);
			assertTrue(indexBefore.equals(indexAfter));
			}
		}
		
	}
	
	
	
	/**
	 * 设置选中元素X,y坐标
	 * 
	 * @author 张家晶
	 * @throws AWTException 
	 * @Time 2018-10-08
	 *
	 */
	@Test(enabled = true)
	 public void Coordinate() throws InterruptedException, AWTException{
		login("testCoordinate_zjj@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		Thread.sleep(5000);
		click(ppt_dotdotdot);
		click(ppt_now_copy);
		for(int i = 1;i < 3;i++) {
			WebElement page = driver.findElement(By.xpath("(//div[contains(@class,'sm-transparency-card')])["+i+"]"));
			click(page);
			for(int j = 1;j < 3;j++) {
				WebElement element = driver.findElement(By.xpath("(//div[@class='smslide-slide smslide-slide--shadowed']/div)["+j+"]"));
				click(element);
				click(ppt_animation);
				Point location = element.getLocation();
				System.out.println("location="+location);
				opacityAndCoord(element_horizontal_xvalue,element_horizontal_xvalues,element_horizontal_xvaluex);
				opacityAndCoord(element_vertically_xvalue,element_vertically_xvalues,element_vertically_xvaluex);
				Point location1 = element.getLocation();
				System.out.println("location1="+location1);
				assertTrue(!location.equals(location1));
			}
		}
		click(ppt_dotdotdot);
		click(ppt_delete);
		click(ppt_delete_sure);
	}
	
	
	
	
	
	
	
}
