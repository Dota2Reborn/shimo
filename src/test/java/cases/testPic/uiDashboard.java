package cases.testPic;

import base.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class uiDashboard extends TestInit {

	@Test
	public void pic_dashboard_1() throws InterruptedException {
		login("UITest@shimo.im", "123123");
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelectorAll('.divider-label-wrapper').forEach(node => node.innerHTML = '1月27日')");
		js.executeScript(
				"document.querySelectorAll('.card-content-update').forEach(node => node.innerHTML = '1月27日 14:45 我 更新')");
		js.executeScript(
				"document.querySelectorAll('.update-time').forEach(node => node.innerHTML = '刚刚')");

		Thread.sleep(500);
		screenShot();
	}

	@Test
	public void pic_dashboard_2() throws InterruptedException {
		login("UITest@shimo.im", "123123");
		click(dashboard_2);
		Thread.sleep(500);
//file-title
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelectorAll('.divider-label-wrapper').forEach(node => node.innerHTML = '1月27日')");
		js.executeScript(
				"document.querySelectorAll('.file-title').forEach(node => node.innerHTML = 'test')");
		js.executeScript(
				"document.querySelectorAll('.card-content-update').forEach(node => node.innerHTML = '1月27日 14:45 我 打开')");
		js.executeScript(
				"document.querySelectorAll('.update-time').forEach(node => node.innerHTML = '刚刚')");

		Thread.sleep(500);
		screenShot();
	}

	@Test
	public void pic_dashboard_3() throws InterruptedException {
		login("UITest@shimo.im", "123123");
//		click(dashboard_3);
		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelectorAll('.divider-label-wrapper').forEach(node => node.innerHTML = '1月27日')");
		js.executeScript(
				"document.querySelectorAll('.card-content-update').forEach(node => node.innerHTML = 'test')");
		js.executeScript(
				"document.querySelectorAll('.update-time').forEach(node => node.innerHTML = '刚刚')");

		Thread.sleep(500);
		screenShot();
	}

	@Test
	public void pic_dashboard_4() throws InterruptedException {
		login("UITest@shimo.im", "123123");
		click(dashboard_4);
		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelectorAll('.divider-label-wrapper').forEach(node => node.innerHTML = '1月27日')");
		js.executeScript(
				"document.querySelectorAll('.card-content-update').forEach(node => node.innerHTML = '1月27日 14:45 我 更新')");
		js.executeScript(
				"document.querySelectorAll('.update-time').forEach(node => node.innerHTML = '刚刚')");

		Thread.sleep(500);
		screenShot();
	}
}
