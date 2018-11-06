package cases.desktop;

import base.TestInit;
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

        Set<String> winHandels = driver.getWindowHandles();
        List<String> it = new ArrayList<String>(winHandels);
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
        click(menu_shortcut);

        driver.navigate().refresh();
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
        click(menu_collection);

        click(favorites);
        String doc_name1 = getText(desktop1_1);
        contextClick(desktop1_1);
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
    public void desktop_doc_setting_6() throws InterruptedException {
        login("autoTest@shimo.im", "123123");
        click(desktop);

        String msg = getText(desktop1_1);
        contextClick(desktop1_1);
        click(menu_move);
        click(desktop_moveFolder_list_1);
        click(desktop_moveFolder_button);

        driver.navigate().refresh();
        click(desktop1_1_folder);
        contextClick(desktop1_1);
        click(menu_move);
        click(desktop_moveFolder_back_button);
        Thread.sleep(500);
        click(desktop_moveFolder_button);

        driver.navigate().refresh();
        click(desktop);
        String msg1 = getText(desktop1_1);

        assertEquals(msg, msg1);
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
        click(desktop1_1_folder);
        contextClick(desktop1_1);
        click(menu_rename);

        String time = getDate();

        sendKeys(desktop_newFolder_name, time);
        click(desktop_newFolder_name_ok);

        driver.navigate().refresh();
        String msg = getText(desktop1_1);

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
        wait.until(ExpectedConditions.elementToBeClickable(desktop1_1));

        String msg = getText(desktop1_1);
        contextClick(desktop1_1);
        click(menu_creatCopy);

        driver.navigate().refresh();
        String msg1 = getText(desktop1_1);
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);

        assertEquals(msg1, "副本 " + msg);
    }

}
