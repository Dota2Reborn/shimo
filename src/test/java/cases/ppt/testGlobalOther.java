package cases.ppt;

import base.TestInit;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testGlobalOther extends TestInit {//全局其他

	/**
	 * 全局与页面的快捷键测试
	 *
	 * @author 王继程
	 * @Time 2018-07-23
	 *
	 */
	@Test(enabled = true)
	public void Shortcuts_1() {
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
