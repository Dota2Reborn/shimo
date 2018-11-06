package cases.desktop;

import base.TestInit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testDesktop_remove extends TestInit {
	/**
	 * 右键文档-删除文件
	 * 
	 * @author 崔明亮
	 * @Time 2018-7-17
	 *
	 */
	@Test
	public void desktop_remove() {
		login("autoTest-cui@shimo.im", "123123");
		
		click(desktop);
		String msg = getText(desktop1_1);
		contextClick(desktop1_1);
		click(menu_delete);
		click(Exit_share_OK);
		
		click(trash);
		String msg1 = getText(desktop1_1);
		contextClick(desktop1_1);
		click(menu_Recovery);
		
		assertEquals(msg, msg1);
	}
	
	/**
	 * 右键文档-恢复删除文件
	 * 
	 * @author 崔明亮
	 * @Time 2018-7-17
	 *
	 */
	@Test
	public void desktop_recover()  {
		login("autoTest-cui@shimo.im", "123123");
		
		click(trash);
		String msg = getText(desktop1_1);
		contextClick(desktop1_1);
		click(menu_Recovery);
		
		click(desktop);
		String msg1 = getText(desktop1_1);
		
		contextClick(desktop1_1);
		click(menu_delete);
		click(Exit_share_OK);
		
		assertEquals(msg, msg1);
	}
	
	/**
	 * 右键文档-删除文件夹
	 * 
	 * @author 崔明亮
	 * @Time 2018-7-17
	 *
	 */
	@Test
	public void desktop_removeFolder() {
		login("autoTest-removeFolder@shimo.im", "123123");
		
		click(desktop);
		String msg = getText(desktop1_1_folder);
		contextClick(desktop1_1_folder);
		click(menu_delete);
		click(Exit_share_OK);
		
		click(trash);
		String msg1 = getText(desktop1_1_folder);
		contextClick(desktop1_1_folder);
		click(menu_Recovery);
		
		assertEquals(msg, msg1);
	}
	
	/**
	 * 右键文档-删除文件夹内文件
	 * 
	 * @author 崔明亮
	 * @Time 2018-7-17
	 *
	 */
	@Test
	public void desktop_removeFileinFolder()  {
		login("autoTest-removeFolder@shimo.im", "123123");
		
		click(desktop);
		click(desktop1_1_folder);
		String msg = getText(desktop1_1);
		contextClick(desktop1_1);
		click(menu_delete);
		click(Exit_share_OK);
		
		click(trash);
		contextClick(desktop1_1);
		click(menu_Recovery);
		
		click(desktop);
		click(desktop1_1_folder);
		String msg1 = getText(desktop1_1);
		
		assertEquals(msg, msg1);
	}
	
	/**
	 * 右键文档-删除协作文件
	 * 
	 * @author 崔明亮
	 * @Time 2018-7-17
	 *
	 */
	@Test
	public void desktop_removeCollaboration() throws InterruptedException {
		removeCollaboration("cuimingliang@shimo.im");
		removeCollaboration("joker@shimo.im");
	}
	
	public void removeCollaboration(String authority) throws InterruptedException {
		login(authority, "123123");
		
		click(desktop);
		click(desktop_new);
		click(desktop_newDoc);
		sendKeys(doc_title_input,"自动协作文件");
		click(b_back);
		
		contextClick(desktop1_1);
		moveToElement(menu_cooperation);
		click(button_addCollaborator);
		sendKeys(input_addCollaborator, "autoTest-cui@shimo.im");
		Thread.sleep(500);
		click(b_addCollaborator_1_add);
		click(b_addCollaborator_ok);

		logout();
		
		login("autoTest-cui@shimo.im", "123123");
		click(desktop);
		String msg = getText(desktop1_2);
		contextClick(desktop1_1);
		click(menu_delete);
		click(Exit_share_OK);	
		String msg1 = getText(desktop1_1);
		
		assertEquals(msg, msg1);
	}
	
	

}
