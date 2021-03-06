package cases.desktop;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class testNotice extends TestInit {
	/**
	 * 通知中收到被@消息，点击跳转
	 * 
	 * @author 刘晨
	 * @Time 2018-01-09
	 *
	 */
	@Test(enabled = true)
	public void notice_1() throws InterruptedException {
		login("autoTest11@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);

		wait.until(ExpectedConditions.elementToBeClickable(doc_edit));
		doc_edit.clear();
		sendKeys(doc_edit, "@autoTest12@shimo.im");
		click(doc_notice_user);
		String url1 = driver.getCurrentUrl();
		click(b_back);
		logout();
		login("autoTest12@shimo.im", "123123");
		click(dashboard_notice);
		click(dashboard_notice_list_1);

		switchToPage(1);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(b_back));
		String url2 = driver.getCurrentUrl();
		assertTrue(url1.equalsIgnoreCase(url2));
	}

	/**
	 * 点击通知中全部已读
	 * 
	 * @author 刘晨
	 * @Time 2018-01-09
	 *
	 */
	@Test(enabled = true)
	public void notice_2() throws InterruptedException {
		login("autoTest11@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		wait.until(ExpectedConditions.elementToBeClickable(doc_edit));
		doc_edit.clear();
		sendKeys(doc_edit, "@autoTest12@shimo.im");
		click(doc_notice_user);
		click(b_back);
		logout();
		login("autoTest12@shimo.im", "123123");
		click(dashboard_notice);
		wait.until(ExpectedConditions.elementToBeClickable(dashboard_notice_list_1));

		String msg1 = getText(dashboard_notice_list_unread);
		click(dashboard_notice_list_allRead);
		Thread.sleep(500);
		String msg2 = getText(dashboard_notice_list_unread);

		assertFalse(msg1.equals(msg2));
	}

	/**
	 * 点击文档添加协作通知，跳转到通知对应文档
	 * 
	 * @author 刘晨
	 * @Time 2018-01-09
	 *
	 */
	@Test(enabled = true)
	public void notice_3() throws InterruptedException {
		login("autoTest13@shimo.im", "123123");
		click(desktop);

		contextClick(desktop1_1);
		addCollaboratorByEmail("autoTest12@shimo.im", 1);

		logout();
		login("autoTest12@shimo.im", "123123");
		click(dashboard_notice);
		click(dashboard_notice_list_1);

		switchToPage(1);
		click(doc_menu);
		click(doc_menu_delete);
		click(doc_menu_delete_OK);

		assertTrue(true);
	}

	/**
	 * 点击文档，跳转到权限提示页面
	 * 
	 * @author 刘晨
	 * @Time 2018-01-09
	 *
	 */
	@Test(enabled = true)
	public void notice_4() throws InterruptedException {
		login("autoTest13@shimo.im", "123123");
		click(desktop);

		contextClick(desktop1_1);
		addCollaboratorByEmail("autoTest12@shimo.im", 1);

		contextClick(desktop1_1);
		removeCollaboratorByPosition(1);

		logout();
		login("autoTest12@shimo.im", "123123");
		click(dashboard_notice);
		click(dashboard_notice_list_1);
		switchToPage(1);
		String result = getText(By.xpath("//div[@id='root']/div/div/div[2]"));
		assertEquals(result, "当前登录账号 autoTest12@shimo.im 没有权限访问这个文档");
	}

	/**
	 * 点击文档评论通知，跳转到文档，并且打开通知当前评论
	 * 
	 * @author 刘晨
	 * @Time 2018-01-09
	 *
	 */
	@Test(enabled = true)
	public void notice_5() throws InterruptedException {
		login("autoTest14@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		Thread.sleep(1000);
		doc_ui_close();

		wait.until(ExpectedConditions.elementToBeClickable(doc_edit));
		doc_edit.clear();
		sendKeys(doc_edit, "lala");
		click(ql_comment_Comments);
		sendKeys(doc_discuss_input, "yoyoyo");
		action.sendKeys(Keys.ENTER);
		click(doc_discuss_input_ok);

		click(b_back);
		logout();
		login("autoTest12@shimo.im", "123123");
		click(dashboard_notice);
		click(dashboard_notice_list_1);

		switchToPage(1);
		Thread.sleep(1000);
		doc_ui_close();
		Boolean result = doesWebElementExist(doc_discuss_input);
		assertTrue(result);
	}

	/**
	 * 全部通知与未读通知列表切换
	 * 
	 * @author 刘晨
	 * @Time 2018-01-12
	 *
	 */
	@Test(enabled = true)
	public void notice_6() throws InterruptedException {
		login("autoTest11@shimo.im", "123123");
		click(desktop);

		click(desktop1_1);
		wait.until(ExpectedConditions.elementToBeClickable(doc_edit));
		doc_edit.clear();
		sendKeys(doc_edit, "@autoTest12@shimo.im");
		click(doc_notice_user);

		click(b_back);
		logout();
		login("autoTest12@shimo.im", "123123");
		click(dashboard_notice);
		click(dashboard_notice_list_unread);

//		String result = getAttribute(dashboard_notice_list_unread,"active");
		List<WebElement> elements;
		int i = 13;
//		if (result.equals("true")) {
		Thread.sleep(500);
		elements = driver.findElements(
				By.xpath("//div[@class='sm-tab-content']/div[2]//li[@data-test='message-item']"));
		if (elements != null) {
			i = elements.size();
			}
//		} else {
//			assertFalse(true);
//		}

		String msg1 = getText(dashboard_notice_list_unread);
		String msg2 = "未读 (" + i + ")";
		assertTrue(msg1.equals(msg2));
	}
}
