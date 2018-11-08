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
	public void notice_1() {
		login("autoTest11@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);

		wait.until(ExpectedConditions.elementToBeClickable(doc_edit));
		doc_edit.clear();
		sendKeys(doc_edit, "@autoTest12");
		click(doc_notice_user);
		click(b_back);
		logout();
		login("autoTest12@shimo.im", "123123");
		moveToElement(dashboard_notice);
		click(dashboard_notice_list_1);

		switchToPage(1);
		wait.until(ExpectedConditions.elementToBeClickable(b_back));
		String url = driver.getCurrentUrl();
		assertTrue(url.startsWith(getURL()+"docs/MQHNJBqnsUQUPuYV"));
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
		sendKeys(doc_edit, "@autoTest12");
		click(doc_notice_user);
		click(b_back);
		logout();
		login("autoTest12@shimo.im", "123123");
		moveToElement(dashboard_notice);
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
		moveToElement(menu_cooperation);
		click(button_addCollaborator);

		sendKeys(input_addCollaborator, "autoTest12@shimo.im");
		Thread.sleep(500);
		click(b_addCollaborator_1_add);
		click(b_addCollaborator_ok);

		logout();
		login("autoTest12@shimo.im", "123123");
		moveToElement(dashboard_notice);
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
		moveToElement(menu_cooperation);
		click(button_addCollaborator);

		sendKeys(input_addCollaborator, "autoTest12@shimo.im");
		Thread.sleep(500);
		click(b_addCollaborator_1_add);
		click(b_addCollaborator_ok);

		wait.until(ExpectedConditions.elementToBeClickable(button_addCollaborator));
		click(b_addCollaborator_2_list);
		click(list_addCollaborator_4);

		logout();
		login("autoTest12@shimo.im", "123123");
		moveToElement(dashboard_notice);
		click(dashboard_notice_list_1);
		switchToPage(1);
		String result = getText(By.xpath("//div[@id='root']/div/div[2]/div"));
		assertEquals(result, "当前登录账号 autoTest12@shimo.im 没有权限访问这个 文档");
	}

	/**
	 * 点击文档评论通知，跳转到文档，并且打开通知当前评论
	 * 
	 * @author 刘晨
	 * @Time 2018-01-09
	 *
	 */
	@Test(enabled = true)
	public void notice_5() {
		login("autoTest14@shimo.im", "123123");
		click(desktop);
		click(desktop1_1);
		wait.until(ExpectedConditions.elementToBeClickable(doc_edit));
		doc_edit.clear();
		sendKeys(doc_edit, "lala");
		click(ql_comment_Comments);
		sendKeys(doc_discuss_input, "yoyoyo");
		action.sendKeys(Keys.ENTER);
		click(doc_discuss_input_ok);
//		wait.until(
//				ExpectedConditions.textToBe(By.className("doc-comment-input-placeholder"), "按enter发送，shift+enter换行"));

		click(b_back);
		logout();
		login("autoTest12@shimo.im", "123123");
		moveToElement(dashboard_notice);
		click(dashboard_notice_list_1);

		switchToPage(1);
		wait.until(ExpectedConditions.elementToBeClickable(End_Discussion));
		Boolean resutl = doc_discuss_input.isDisplayed();
		assertTrue(resutl);
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
		sendKeys(doc_edit, "@autoTest12");
		click(doc_notice_user);

		click(b_back);
		logout();
		login("autoTest12@shimo.im", "123123");
		moveToElement(dashboard_notice);
		click(dashboard_notice_list_unread);

		String result = dashboard_notice_list_unread.getAttribute("data-test");
		List<WebElement> elements;
		int i = 100;
		if (result.equals("active")) {
			Thread.sleep(500);
			elements = driver.findElements(
					By.xpath("//div[@class='sm-tab-content']//div[2]//div//div[@data-test='notification-item']"));
			if (elements != null) {
				i = elements.size();
			}
		} else {
			assertFalse(true);
		}

		String msg1 = dashboard_notice_list_unread.getText();
		String msg2 = "未读 (" + i + ")";
		assertTrue(msg1.equals(msg2));
	}
}
