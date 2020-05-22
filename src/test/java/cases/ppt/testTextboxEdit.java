package cases.ppt;

import base.TestInit;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testTextboxEdit extends TestInit {// 编辑文本框

	/**
	 * 在文本框占位符中输入文本检查是否保存
	 *
	 * @author 王继程
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	public void Text_Editing1() throws InterruptedException {
		login("textstyle1@shimo.im", "123123");
		click(desktop_new);
		click(desktop_newSlides);
		click(page_elements_1);
		action.sendKeys("在文本占位符输入验证保存").build().perform();
		Thread.sleep(1500);
		driver.navigate().refresh();// 刷新页面
		String time = getText(page_elements_1);
		click(ppt_dotdotdot);
		click(ppt_delete);
		click(desktop_newFolder_name_ok);
		assertEquals(time, "在文本占位符输入验证保存");

	}

	/**
	 * 新建文本框中输入文本检查是否保存
	 *
	 * @author 王继程
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	public void Text_Editing2() throws InterruptedException {
		login("textstyle2@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(add_text);
		action.moveToElement(ppt_text).click().perform();
		Thread.sleep(500);
		action.sendKeys("新建文本框输入").perform();
		Thread.sleep(500);
		driver.navigate().refresh();// 刷新页面
		String time = getText(page_elements_1);
		click(page_elements_1);
		click(smslide_frame_anchor_1);
		action.sendKeys(Keys.DELETE).perform();
		assertEquals(time, "新建文本框输入");

	}

	/**
	 *文本框中文本删除后刷新,再编辑文本框是否正常
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
		click(page_elements_1);
		for (int i = 1; i < 5; i++) {
			action.sendKeys(Keys.chord(Keys.BACK_SPACE)).build().perform();
		}
		Thread.sleep(500);
		driver.navigate().refresh();
		click(page_elements_1);
		action.sendKeys("再次验证").build().perform();
		Thread.sleep(500);
		driver.navigate().refresh();// 刷新页面
		String time = getText(page_elements_1);
		assertEquals(time, "再次验证");

	}

	/**
	 *新建文本框不编辑，切换页面后编辑
	 *
	 * @author 王继程
	 *
	 * @Time
	 *
	 */
	@Test(enabled = true)
	public void Text_Editing4() throws InterruptedException {
		login("textstyle4@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_1);
		click(add_text);
		action.moveToElement(ppt_text).click().perform();
		click(ppt_page_2);
		click(ppt_page_1);
		click(page_elements_1);
		action.sendKeys("编辑文本框").build().perform();
		Thread.sleep(500);
		driver.navigate().refresh();// 刷新页面
		String time = getText(page_elements_1);
		click(page_elements_1);
		click(smslide_frame_anchor_2);
		action.sendKeys(Keys.DELETE).perform();
		assertEquals(time, "编辑文本框");



	}
	/**
	 * 編輯文本，设置文本有序无序列表
	 *
	 * @author 王继程
	 * @throws AWTException
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	public void Text_Editing5() throws InterruptedException, AWTException {
		login("textstyle5@shimo.im", "123123");
		click(desktop_new);
		click(desktop_newSlides);
		click(ppt_page_1);
		click(page_elements_1);
		action.sendKeys("第一行"+Keys.ENTER+"第二行").build().perform();
		click(smslide_frame_anchor_1);
		click(ppt_animation);
		click(ppt_right_order);
		Boolean element1 = doesWebElementExist(smslide_ordered_2);
		click(ppt_right_disorder);
		Boolean element2 = doesWebElementExist(smslide_unordered_2);
		click(ppt_dotdotdot);
		click(ppt_delete);
		click(desktop_newFolder_name_ok);
		assertTrue(element1 && element2);

	}
	/**
	 *在有序列表换行后编辑
	 *
	 * @author 王继程
	 * @throws AWTException
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	public void Text_Editing6() throws InterruptedException, AWTException {
		login("textstyle6@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_1);
		click(page_elements_1);
		action.sendKeys(Keys.ENTER+"第二行").build().perform();
		Boolean element1 = doesWebElementExist(smslide_ordered_2);
		for (int i = 1; i < 5; i++) {
			action.sendKeys(Keys.chord(Keys.BACK_SPACE)).build().perform();
		}
		assertTrue(element1);
	}

	/**
	 *编辑组合中的文本框
	 *
	 * @author 王继程
	 * @throws AWTException
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	public void Text_Editing7() throws InterruptedException, AWTException {
		login("textstyle7@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_1);
//		String time1 = getText(page_elements_1);
//		System.out.println(time1);
		click(page_elements_1);
		click(page_elements_1);
		action.sendKeys("输入六个字符").build().perform();
		Thread.sleep(500);
		driver.navigate().refresh();// 刷新页面
		String time = getText(page_elements_1);
		click(page_elements_1);
		click(page_elements_1);
		for (int i = 1; i < 7; i++) {
			action.sendKeys(Keys.chord(Keys.BACK_SPACE)).build().perform();
		}

		assertEquals(time, "输入六个字符");
	}

	/**
	 *编辑设置过样式的文本框
	 *
	 * @author 王继程
	 * @throws AWTException
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = false)
	public void Text_Editing8() throws InterruptedException, AWTException {
		login("textstyle8@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_1);
		click(page_elements_1);
//		action.sendKeys("输入文本").build().perform();
//		Thread.sleep(500);
//		driver.navigate().refresh();// 刷新页面
//		String time = getText(page_elements_1);
		//page_elements_1.getLocation();
		String a=page_elements_1.getCssValue("font-family");
		String s=page_elements_1.getAttribute("font-family");
		System.out.println(a);
		System.out.println(s);
		click(ppt_page_1);
		String d = getText(Note_content);
		System.out.println(d);
//		click(page_elements_1);
//		for (int i = 1; i < 5; i++) {
//			action.sendKeys(Keys.chord(Keys.BACK_SPACE)).build().perform();
//		}
//
//		assertEquals(time, "输入文本");
	}

	/**
	 *
	 *
	 * @author 王继程
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = false)
	public void Text_Editing9() throws InterruptedException {
//		login("textediting@shimo.im", "123123");
//		click(desktop);
//		click(desktop1_1);
//		Date date = new Date();
//		DateFormat format = new SimpleDateFormat("HHmmss");
//		String time1 = format.format(date);
//		//setClipbordContents(time1);
//		click(page_elements_1);
//		for (int i = 1; i < 7; i++) {
//			action.sendKeys(Keys.chord(Keys.BACK_SPACE)).build().perform();
//		}
//		action.sendKeys(Keys.chord(Keys.CONTROL, "v")).build().perform();
//		Thread.sleep(1000);
//		driver.navigate().refresh();// 刷新页面
//		String time2 = getText(page_elements_1);
//		assertEquals(time1, time2);

	}



}