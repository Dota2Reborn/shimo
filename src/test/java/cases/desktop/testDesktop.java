package cases.desktop;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testDesktop extends TestInit {

    /**
     * 右键文档-在新标签页中打开
     *
     * @throws InterruptedException
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test
    public void desktop_doc_setting_1() {
        login("autoTest@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1);
        click(menu_newPage);

        Set<String> winHandles = driver.getWindowHandles();
        List<String> it = new ArrayList<String>(winHandles);
        int n = it.size();
        assertEquals(2, n);
    }

    /**
     * 右键文档-添加到快捷方式
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test
    public void desktop_doc_setting_2() {
        login("autoTest@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1);

//        Boolean r1 = doesWebElementExist(menu_shortcut_cancel);
        String menu_text = getText(menu_shortcut);
        if(menu_text.equals("从快速访问移除")){
            click(menu_shortcut);
            contextClick(desktop1_1);
        }

        click(menu_shortcut);

        String msg = getText(desktop_shortcut_1);
        String doc_name = getText(desktop1_1);

        contextClick(desktop1_1);
        click(menu_shortcut);
        if (!doc_name.equals(msg)) {
            contextClick(desktop1_1);
            click(menu_shortcut);
        }

        assertTrue(doc_name.equals(msg));

    }

    /**
     * 右键文档-收藏
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test
    public void desktop_doc_setting_3() {
        login("autoTest@shimo.im", "123123");
        click(desktop);

        String doc_name = getText(desktop1_1);
        contextClick(desktop1_1);

//        Boolean r1 = doesWebElementExist(menu_collection_cancel);
        String menu_text = getText(menu_shortcut);
        if(menu_text.equals("从我的收藏移除")){
            click(menu_collection);
            contextClick(desktop1_1);
        }

        click(menu_collection);

        click(favorites);
        String doc_name1 = getText(favorites1_1);
        contextClick(favorites1_1);
        click(menu_collection);

        assertEquals(doc_name, doc_name1);
    }

    /**
     * 右键文档-移动
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test
    public void desktop_doc_setting_6() {
        login("autoTest@shimo.im", "123123");
        click(desktop);

        click(desktop_new);
        click(desktop_newDoc);

        String time = getDate();
        sendKeys(doc_title_input, time);

        click(b_back);

        contextClick(desktop1_1);
        click(menu_move);
        click(desktop_moveFolder_back_button);
        click(desktop_moveFolder_list_1);
        click(desktop_moveFolder_button);

        driver.navigate().refresh();
        click(desktop1_1_folder);
        contextClick(desktop1_1);
        click(menu_move);
        click(desktop_moveFolder_back_button);
        click(desktop_moveFolder_button);

        driver.navigate().refresh();
        click(desktop);
        String msg1 = getText(desktop1_1_name);

        assertEquals(time, msg1);
    }

    /**
     * 右键文档-重命名
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test
    public void desktop_doc_setting_8() {
        login("autoTest@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1);
        click(menu_rename);

        String time = getDate();

        sendKeys(desktop_newFolder_name, time);
        click(desktop_newFolder_name_ok);

        driver.navigate().refresh();
        String msg = getText(desktop1_1_name);

        assertEquals(msg, time);
    }

    /**
     * 右键文档-创建副本
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test
    public void desktop_doc_setting_9() {
        login("autoTest@shimo.im", "123123");
        click(desktop);

        String msg = getText(desktop1_1_name);
        contextClick(desktop1_1);
        click(menu_createCopy);

        driver.navigate().refresh();
        String msg1 = getText(desktop1_1_name);
        delFile(desktop1_1);

        assertEquals(msg1, "副本 " + msg);
    }

}
