package cases.ppt;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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
		String time = getText(input);
		System.out.println(time);

		action.click().build().perform();
		time = getText(input);
		System.out.println(time);

		action.click().build().perform();
		time = getText(input);
		System.out.println(time);

		action.click().build().perform();
		time = getText(input);
		System.out.println(time);

		action.click().build().perform();
		time = getText(input);
		System.out.println(time);

		action.click().build().perform();
		time = getText(input);
		System.out.println(time);

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
		click(desktop);
		click(desktop1_1);
		click(ppt_page_1);
		click(ppt_text);
		click(ppt_text);



	}

}
