package cases.ppt;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testTextboxCopy extends TestInit {//文本框复制粘贴相关
	/**
	 * 删除文本框中内容，粘贴内容是否保存
	 *
	 * @author 王继程
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	public void Text_Editing9() throws InterruptedException {
		login("textediting@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("HHmmss");
		String time1 = format.format(date);
		setClipbordContents(time1);
		click(page_elements_1);
		for (int i = 1; i < 7; i++) {
			action.sendKeys(Keys.chord(Keys.BACK_SPACE)).build().perform();
		}
		action.sendKeys(Keys.chord(Keys.CONTROL, "v")).build().perform();
		Thread.sleep(1000);
		driver.navigate().refresh();// 刷新页面
		String time2 = getText(page_elements_1);
		assertEquals(time1, time2);

	}
	/**
	 * 复制文本内容，选中幻灯片页面粘贴
	 *
	 * @author 王继程
	 *
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	public void Text_Editing3() throws InterruptedException, AWTException {
		login("textstyle3@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_1);
		setClipbordContents("复制文本内容直接粘贴是否成功");
		action.sendKeys(Keys.chord(Keys.CONTROL, "v")).build().perform();
		Thread.sleep(500);
		Boolean element = doesWebElementExist(page_elements_1);
		if (element) {
			String time = getText(page_elements_1);
			click(page_elements_1);
			click(smslide_frame_anchor_1);
			action.sendKeys(Keys.chord(Keys.DELETE)).perform();
			assertEquals(time, "复制文本内容直接粘贴是否成功");
		} else {
			assertTrue(element);
		}
	}
	private void setClipbordContents(String texts) {// 写入系统剪贴板
		StringSelection stringSelection = new StringSelection(texts);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

	}

	/**
	 * 复制文本框，选中幻灯片页面粘贴
	 *
	 * @author 王继程
	 *
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	public void Text_Editing4() throws InterruptedException {
		login("textstyle4@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_1);
		click(page_elements_1);
		click(smslide_frame_anchor_1);
		action.sendKeys(Keys.chord(Keys.CONTROL, "c")).build().perform();
		click(ppt_page_2);
		Thread.sleep(500);
		// Robot robot = new Robot();
		action.sendKeys(Keys.chord(Keys.CONTROL, "v")).build().perform();
		Thread.sleep(500);
		driver.navigate().refresh();// 刷新页面
		click(ppt_page_2);
		Boolean element = doesWebElementExist(page_elements_1);
		click(page_elements_1);
		click(smslide_frame_anchor_1);
		action.sendKeys(Keys.DELETE).perform();
		assertTrue(element);

	}


}
