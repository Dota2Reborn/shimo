package cases.ppt;

import base.TestInit;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testGlobalOther extends TestInit {//全局其他
	/**
	 * 页面缩放调整
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Page_Style() throws InterruptedException {
		login("pagestyle@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		//boolean bl = true;
		String zomm = getText(ppt_zoom);
		zomm = zomm.substring(0,zomm.length() - 1);
		click(narrow_trying);
		String zomm1 = getText(ppt_zoom);
		zomm1 = zomm1.substring(0,zomm1.length() - 1);
		driver.navigate().refresh();
		click(enlarge_trying);
		String zomm2 = getText(ppt_zoom);
		zomm2 = zomm2.substring(0,zomm2.length() - 1);
		int a = Integer.parseInt(zomm);
		int b = Integer.parseInt(zomm1);
		int c = Integer.parseInt(zomm2);
		if(c>a&&a>b) {
			assertTrue(true);
		}else {
			assertFalse(true);
		}

	}
	/**
	 * 全局与页面的快捷键测试
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Shortcuts_1() throws InterruptedException {
		login("Shortcuts1@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_1);
		action.sendKeys(Keys.chord(Keys.CONTROL, "c")).build().perform();
		click(ppt_page_3);
		action.sendKeys(Keys.chord(Keys.CONTROL, "v")).build().perform();
		click(ppt_page_4);
		String time = getText(page_elements_1);
		action.sendKeys(Keys.DELETE).perform();
		assertEquals(time, "第一页");
	}

}
