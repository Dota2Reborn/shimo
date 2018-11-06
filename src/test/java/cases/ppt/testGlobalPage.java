package cases.ppt;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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
	public void New_Template() throws InterruptedException {
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
	public void Remove_Pages() throws InterruptedException {
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
	public void Remove_Pages_1() throws InterruptedException {
		login("Addpages@shimo.im", "123123");
		click(desktop);
		click(desktop1_2);
		// click(ppt_text);
		click(ppt_page_1);
		action.sendKeys(Keys.DELETE).perform();
		Boolean result1 = doesWebElementExist(page_elements_2);
		click(ppt_revoke);
		Boolean result2 = doesWebElementExist(page_elements_2);
		assertTrue(result1 && !result2);
	}

	/**
	 * 调整页面排序
	 * 
	 * @author 王继程
	 * @Time 2018-07-23 false
	 */
	@Test(enabled = false)
	public void Sorting_Order() throws InterruptedException {
		login("SortingOrder@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		click(ppt_page_1);
		click(ppt_text);
		click(ppt_text);
		//
		// WebElement template1 =
		// driver.findElement(By.xpath("//div[@data-test='viewport']//div[1]//div[1]//div[1]//div[1]"));
		// String time1 = getText(template1);
		// System.out.println(time1+"aaaaa");

		// template1 =
		// driver.findElement(By.xpath("//div[@data-test='viewport']//div[1]//div[1]//div[1]"));
		// 他腹肌标签1包含里面的元素
		// 那就说明实际上已经取到了是吧，就是不是

		// System.out.println(template1.getText());

		// template1 =
		// driver.findElement(By.xpath("//div[@data-test='viewport']//div[1]//div[1]//div[1]//div[2]"));
		//
		// System.out.println(template1.getText());
		//// time1 = getText(template1);
		//// System.out.println(time1+"bbbbbb");
		// template1 =
		// driver.findElement(By.xpath("//div[@data-test='viewport']//div[1]//div[1]//div[1]//div[3]"));
		// time1 = getText(template1);
		// System.out.println(time1+"cccccc");
		// template1 =
		// driver.findElement(By.xpath("//div[@data-test='viewport']//div[1]//div[1]//div[1]//div[4]"));
		// time1 = getText(template1);
		// System.out.println(time1+"ddddd");
		// template1 =
		// driver.findElement(By.xpath("//div[@data-test='viewport']//div[1]//div[1]//div[1]//div[5]"));
		// time1 = getText(template1);
		// System.out.println(time1+"eeeeee");
		//
		// List<WebElement> weList =
		// driver.findElements(By.xpath("//div[@data-test='viewport']//div[1]//div[1]//div[1]//div"));
		//
		// System.out.println(weList.size());

		// driver.quit();
//		click(page_elements_1);
//		click(page_elements_2);
//		click(page_elements_3);
//		click(page_elements_4);
//		click(page_elements_5);
//		click(page_elements_1);
//		click(page_elements_2);
//		click(page_elements_3);
//		click(page_elements_4);
//		click(page_elements_5);
//		click(page_elements_1);
//		click(page_elements_2);
//		click(page_elements_3);
//		click(page_elements_4);
//		click(page_elements_5);


	}

}
