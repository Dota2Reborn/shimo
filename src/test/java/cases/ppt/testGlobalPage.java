package cases.ppt;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testGlobalPage extends TestInit {// 全局页面
	/**
	 * 幻灯片中新增模板页面
	 *
	 * @author 王继程
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	public void New_Page() {
		login("New_Page@shimo.im", "123123");
		click(desktop_new);
		click(desktop_newslides);
		click(add_page);
		Boolean result = doesWebElementExist(ppt_page_2);
		click(ppt_dotdotdot);
		click(ppt_delete);
		click(desktop_newFolder_name_ok);
		assertTrue(result);

	}
	/**
	 * 幻灯片中新增模板页面
	 *
	 * @author 王继程
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	public void New_Template() {
		login("NewTemplate@shimo.im", "123123");
		click(desktop_new);
		click(desktop_newslides);
		for (int i = 1; i < 11; i++) {
			click(down_arrow);
			WebElement template = driver.findElement(By.xpath("//ul[@id='sm-slide-layout']//li[" + i + "]"));
			click(template);
		}
		Boolean result = doesWebElementExist(ppt_page_11);
		click(ppt_dotdotdot);
		click(ppt_delete);
		click(desktop_newFolder_name_ok);
		assertTrue(result);

	}
	/**
	 * 幻灯片中删除页面后撤销
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Remove_Pages() {
		login("Addpages@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_2);
		action.sendKeys(Keys.DELETE).perform();
		Boolean result1 = doesWebElementExist(ppt_page_2);
		click(ppt_revoke);
		Boolean result2 = doesWebElementExist(ppt_page_2);
		assertTrue(result2 && !result1);
	}

	/**
	 * 幻灯片中删除唯一页面
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Remove_Pages_1() {
		login("Addpages@shimo.im", "123123");
		click(desktop);
		click(desktop1_2);
		// click(ppt_text);
		click(ppt_page_1);
		action.sendKeys(Keys.DELETE).perform();
		Boolean result1 = doesWebElementExist(page_elements_2);
		click(ppt_revoke);
		click(ppt_revoke);
		Boolean result2 = doesWebElementExist(page_elements_2);
		assertTrue(result1 && !result2);
	}

	/**
	 * 幻灯片中右键复制粘贴页面
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Ppt_Right_1() {
		login("ppt_right_1@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		contextClick(ppt_page_1);
		click(replication_pasting);
		Boolean result1 = doesWebElementExist(page_elements_4);
		action.sendKeys(Keys.DELETE).perform();
		assertTrue(result1);
	}
	/**
	 * 右键新建幻灯片
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Ppt_Right_2() {
		login("ppt_right_2@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		contextClick(ppt_page_1);
		click(right_key_new);
		Boolean result1 = doesWebElementExist(ppt_page_2);
		action.sendKeys(Keys.DELETE).perform();
		assertTrue(result1);
	}
	/**
	 * 右键删除幻灯片
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Ppt_Right_3() {
		login("ppt_right_3@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		contextClick(ppt_page_2);
		click(delete_page);
		Boolean result1 = doesWebElementExist(ppt_page_2);
		click(ppt_revoke);
		assertFalse(result1);
	}

	/**
	 * 右键删除幻灯片
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Ppt_Right_4() {
		login("ppt_right_4@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		contextClick(ppt_page_1);
		click(cutting);
		Boolean result = doesWebElementExist(onlineshown_off);
		assertTrue(result);
	}

	/**
	 * 播放幻灯片
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Play_1() {
		login("Play_1@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_broadcast);
		WebElement input = driver.findElement(By.xpath("//div[@class='sm-slide-player-slide-viewer']"));
		String time1 = getText(input);
		action.click().build().perform();
		String time2 = getText(input);
		action.click().build().perform();
		String time3 = getText(input);
		action.click().build().perform();
		String time4 = getText(input);
		action.click().build().perform();
		String time5 = getText(input);
		action.click().build().perform();
		action.click().build().perform();
		assertEquals(time1, "第一页");
		assertEquals(time2, "第二页");
		assertEquals(time3, "第三页");
		assertEquals(time4, "第四页");
		assertEquals(time5, "第五页");
	}
	/**
	 * 播放幻灯片
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Play_2() {
		login("Play_1@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_3);
		click(ppt_broadcast);
		WebElement input = driver.findElement(By.xpath("//div[@class='sm-slide-player-slide-viewer']"));
		String time3 = getText(input);
		action.click().build().perform();
		String time4 = getText(input);
		action.click().build().perform();
		String time5 = getText(input);
		action.click().build().perform();
		action.click().build().perform();
		assertEquals(time3, "第三页");
		assertEquals(time4, "第四页");
		assertEquals(time5, "第五页");
	}
	/**
	 * 页面缩放调整
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Page_Style() {
		login("pagestyle@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(narrow_trying);
		String zomm1 = getText(ppt_zoom);
		driver.navigate().refresh();// 刷新页面
		click(enlarge_trying);
		String zomm2 = getText(ppt_zoom);;
		assertEquals(zomm1, "75%");
		assertEquals(zomm2, "125%");
	}


	/**
	 * 调整页面排序
	 *
	 * @author 王继程
	 * @Time 2018-07-23 false
	 */
	@Test(enabled = false)
	public void Sorting_Order() {
		login("SortingOrder@shimo.im", "123123");
	}

}
