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
		String msg = getText(desktop1_1_name);
//		contextClick(desktop1_1);
//		click(menu_delete);
//		click(Exit_share_OK);
		delFile(desktop1_1);
		
		click(trash);
		String msg1 = getText(desktop1_1_name);
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
		String msg = getText(desktop1_1_name);
		contextClick(desktop1_1);
		click(menu_Recovery);
		
		click(desktop);
		String msg1 = getText(desktop1_1_name);
		
//		contextClick(desktop1_1);
//		click(menu_delete);
//		click(Exit_share_OK);
		delFile(desktop1_1);
		
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
//		contextClick(desktop1_1_folder);
//		click(menu_delete);
//		click(Exit_share_OK);
		delFile(desktop1_1_folder);
		
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
	public void desktop_removeFileInFolder()  {
		login("autoTest-removeFolder@shimo.im", "123123");
		
		click(desktop);
		click(desktop1_1_folder);
		String msg = getText(desktop1_1_name);
//		contextClick(desktop1_1);
//		click(menu_delete);
//		click(Exit_share_OK);
		delFile(desktop1_1);
		
		click(trash);
		contextClick(desktop1_1);
		click(menu_Recovery);
		
		click(desktop);
		click(desktop1_1_folder);
		String msg1 = getText(desktop1_1_name);
		
		assertEquals(msg, msg1);
	}

}