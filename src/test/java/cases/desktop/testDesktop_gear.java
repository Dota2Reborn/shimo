package cases.desktop;

import base.TestInit;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testDesktop_gear extends TestInit {

    /**
     * hover文档/表格，齿轮-在新标签页中打开
     *
     * @throws InterruptedException
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test
    public void desktop_doc_newPage() {
        login("autoTest_gear@shimo.im", "123123");
        click(desktop);

        moveToElement(desktop1_1);
        click(desktop_setting);
        click(menu_newPage);

        Set<String> windowsHandles = driver.getWindowHandles();
        List<String> it = new ArrayList<String>(windowsHandles);
        int n = it.size();
        assertEquals(2, n);
    }

    /**
     * hover文档/表格，齿轮-添加到快捷方式
     *
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test
    public void desktop_doc_shortcut() {
        login("autoTest_gear@shimo.im", "123123");
        click(desktop);

        moveToElement(desktop1_1);
        click(desktop_setting);

        Boolean r1 = getText(menu_shortcut).equals("从快速访问移除");
        if(r1){
            click(menu_shortcut);
            moveToElement(desktop1_1);
            click(desktop_setting);
        }

        click(menu_shortcut);

        driver.navigate().refresh();
        String msg = getText(desktop_shortcut_1);
        String doc_name = getText(desktop1_1_name);

        contextClick(desktop1_1);
        click(menu_shortcut);

        if (!doc_name.equals(msg)) {
            contextClick(desktop1_1);
            click(menu_shortcut);
        }

        assertTrue(doc_name.equals(msg));

    }

    /**
     * hover文档/表格，齿轮-收藏
     *
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test
    public void desktop_doc_collection() {
        login("autoTest_gear@shimo.im", "123123");
        click(desktop);
        String doc_name = getText(desktop1_1_name);
        moveToElement(desktop1_1);
        click(desktop_setting);
        click(menu_collection);

        click(dashboard);
        click(favorites);
        String doc_name1 = getText(desktop1_1_name);
        contextClick(desktop1_1);
        click(space_RightMenu_collection);

        assertEquals(doc_name, doc_name1);
    }

    /**
     * hover文档/表格，齿轮-重命名
     *
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test
    public void desktop_doc_rename() {
        login("autoTest_gear@shimo.im", "123123");
        click(desktop);
        moveToElement(desktop1_1);
        click(desktop_setting);
        click(menu_rename);

        String time = getDate();
        sendKeys(desktop_newFolder_name, time);
        click(desktop_newFolder_name_ok);

        driver.navigate().refresh();
        String msg = getText(desktop1_1_name);

        assertEquals(time, msg);
    }

    /**
     * hover文档/表格，齿轮-创建副本
     *
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test
    public void desktop_doc_createCopy() {
        login("autoTest_gear@shimo.im", "123123");
        click(desktop);
        String msg = getText(desktop1_1_name);
        moveToElement(desktop1_1);
        click(desktop_setting);
        click(menu_createCopy);

        driver.navigate().refresh();
        String msg1 = getText(desktop1_1_name);

        moveToElement(desktop1_1);
        click(desktop_setting);
        click(menu_delete);
        click(desktop_newFolder_name_ok);

        assertEquals(msg1, "副本 " + msg);
    }

}
