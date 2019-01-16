package cases.space;

import base.TestInit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import static org.testng.Assert.assertEquals;

public class testNewTemplateFile extends TestInit {


    /**
     * 空间  新建文档模板
     * @author
     * @Time
     */
    @Test(enabled = true)
    public void space_newtemplate_doc(){
        login("spacebuild@shimo.im", "123123");
        click(space_listing_3);
        String msg = getText(desktop1_1);
        click(desktop_new);
        click(desktop_newtemplate);
        click(doc_template);
        click(doc_template01);
//        Set<String> winHandels = driver.getWindowHandles();
//        List<String> it = new ArrayList<String>(winHandels);
//        String url = driver.getCurrentUrl();
//        System.out.println(url);
//        driver.switchTo().window(it.get(1));
        switchToPage(1);
        click(b_back);
        click(space_listing_3);
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        String msg1 = getText(desktop1_1);
        assertEquals(msg, msg1);
    }


    /**
     * 空间  新建表格模板
     * @author
     * @Time
     */
    @Test(enabled = true)
    public void space_newtemplate_mosheet(){
        login("spacebuild@shimo.im", "123123");
        click(space_listing_3);
        String msg = getText(desktop1_1);
        click(desktop_new);
        click(desktop_newtemplate);
        wait.until(ExpectedConditions.elementToBeClickable(sheet_template));
        click(sheet_template);
        click(sheet_template01);
//        Set<String> winHandels = driver.getWindowHandles();
//        List<String> it = new ArrayList<String>(winHandels);
//        String url = driver.getCurrentUrl();
//        System.out.println(url);
//        driver.switchTo().window(it.get(1));
        switchToPage(1);
        click(b_back);
        click(space_listing_3);
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        String msg1 = getText(desktop1_1);
        assertEquals(msg, msg1);
    }


    /**
     * 空间  我的模板
     * @author
     * @Time
     */
    @Test(enabled = true)
    public void space_newtemplate_mine(){
        login("spacebuild001@shimo.im", "123123");
        click(space_listing_3);
        String msg = getText(desktop1_1);
        click(desktop_new);
        click(desktop_newtemplate);
        click(my_template);
        click(my_template02);
//        Set<String> winHandels = driver.getWindowHandles();
//        List<String> it = new ArrayList<String>(winHandels);
//        String url = driver.getCurrentUrl();
//        System.out.println(url);
//        driver.switchTo().window(it.get(1));
        switchToPage(1);
        click(b_back);
        click(space_listing_3);
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        String msg1 = getText(desktop1_1);
        assertEquals(msg, msg1);
    }
}
