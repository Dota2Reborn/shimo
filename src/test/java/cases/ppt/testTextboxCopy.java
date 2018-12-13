package cases.ppt;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class testTextboxCopy extends TestInit {//编辑文本框

	/**
	 * 幻灯片中新增模板页面
	 * 
	 * @author 王继程
	 * @Time 2018-07-24
	 *
	 */
	@Test(enabled = true)
	public void Text_Editing() throws InterruptedException {
		login("NewTemplate@shimo.im","123123");
		click(desktop_new);
		click(desktop_newslides);
		for(int i=1;i<9;i++) {
			click(down_arrow);
			WebElement template = driver.findElement(By.xpath("//div[@class='smslide-only-container']//div[1]//div[3]//div[1]"));
			click(template);
		}
		Boolean result = doesWebElementExist(ppt_page_9);
		assertTrue(result);
		//Thread.sleep(4000);
		//Boolean chexiao = doesWebElementExist(ppt_revoke);
		//System.out.println(chexiao);

		
	}
}
