package test;

import base.TestInit;
import org.testng.annotations.Test;

public class uiDesktop extends TestInit {

	@Test
	public void pic_Desktop_1() throws InterruptedException {
		login("UITest@shimo.im", "123123");
		click(desktop);
		Thread.sleep(500);
		
		screenShot();
	}
	
	@Test
	public void pic_Desktop_2() throws InterruptedException {
		login("UITest@shimo.im", "123123");
		click(desktop);
		click(desktop_show_type);
		Thread.sleep(500);
		
		screenShot();
	}
	
	@Test
	public void pic_Desktop_3() throws InterruptedException {
		login("UITest@shimo.im", "123123");
		click(desktop);
		click(desktop1_1_folder);
		Thread.sleep(500);
		
		screenShot();
	}
	
	@Test
	public void pic_Desktop_4() throws InterruptedException {
		login("UITest@shimo.im", "123123");
		click(desktop);
		click(desktop1_1_folder);
		click(desktop_show_type);
		Thread.sleep(500);
		
		screenShot();
	}
	
	@Test
	public void pic_Desktop_5() throws InterruptedException {
		login("UITest@shimo.im", "123123");
		click(desktop);
		moveToElement(desktop_user_icon);
		Thread.sleep(500);
		screenShot();
	}
}
