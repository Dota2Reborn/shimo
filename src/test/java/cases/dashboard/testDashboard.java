package cases.dashboard;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testDashboard extends TestInit {

    /**
     * 最近更新验证
     *
     * @author 刘晨
     * @Time 2017-12-18
     */
    @Test(enabled = true)
    public void dashboard_update() {
        login("autoTest06@shimo.im", "123123");
        click(desktop);
        click(desktop1_1);
        sendKeys(doc_edit, "la");
        click(b_back);
        logout();
        login("autoTest05@shimo.im", "123123");
        driver.navigate().refresh();
        String msg = getText(dashboard_update_time);
        assertEquals(msg, "刚刚 autoTest... 更新");
    }

    /**
     * 最近使用验证
     *
     * @author 刘晨
     * @Time 2017-12-18
     */
    @Test(enabled = true)
    public void dashboard_used() {
        login("autoTest06@shimo.im", "123123");
        click(desktop);
        click(desktop1_1);
        click(b_back);
        click(dashboard);
        click(dashboard_2);

        String msg = getText(dashboard_update_time);

        assertEquals(msg, "刚刚 我 打开");
    }

    /**
     * 我创建的验证
     *
     * @author 刘晨
     * @Time 2017-12-18
     */
    @Test(enabled = true)
    public void dashboard_create() {
        login("autoTest07@shimo.im", "123123");

        click(desktop_new);
        click(desktop_newDoc);
        String time = getDate();
        sendKeys(doc_title_input, time);
        click(b_back);
        click(dashboard_3);
        String msg = getText(dashboard_update_name);
        contextClick(dashboard_update_name);
        click(menu_delete);
        click(desktop_newFolder_name_ok);

        assertEquals(msg, time);
    }

    /**
     * 共享给我的验证
     *
     * @author 刘晨
     * @Time 2017-12-19
     */
    @Test(enabled = true)
    public void dashboard_share() throws InterruptedException {
        login("autoTest06@shimo.im", "123123");

        click(desktop);
        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);

        sendKeys(input_addCollaborator, "autoTest07@shimo.im");
        Thread.sleep(500);
        click(b_addCollaborator_1_add);
        click(b_addCollaborator_ok);

        logout();
        login("autoTest07@shimo.im", "123123");

        wait.until(ExpectedConditions.elementToBeClickable(dashboard_shareTime_1));
        moveToElement(dashboard_shareTime_1);
        click(dashboard_shareTime_unread);
        click(dashboard_4);
        contextClick(dashboard_share_file_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);

        Thread.sleep(1000);

        String msg = driver.findElement(By.className("none-file")).getText();
        assertEquals(msg, "没有文件");

    }

    /**
     * 工作台-文件定位的所在文件夹
     *
     * @author 刘晨
     * @Time 2017-12-18
     */
    @Test(enabled = true)
    public void dashboard_setting_locatFolder() {
        login("autoTest08@shimo.im", "123123");
        click(dashboard_3);
        contextClick(dashboard_update_name);
        click(menu_moveToFolder);

        String url_sample = getURL() + "folder/x2zSDzXqfQI9TaKr";
        wait.until(ExpectedConditions.urlToBe(url_sample));
        String url = driver.getCurrentUrl();
        assertEquals(url, url_sample);
    }

    /**
     * 工作台-文件定位的所在文件夹
     *
     * @author 刘晨
     * @Time 2017-12-18
     */
    @Test(enabled = true)
    public void dashboard_setting_createCopy() {
        login("autoTest09@shimo.im", "123123");
        click(dashboard_3);

        contextClick(dashboard_update_name);
        click(menu_creatCopy);
        contextClick(dashboard_update_name);
        click(menu_moveToFolder);
        String fileName = getText(desktop1_1);

        moveToElement(desktop1_1);
        click(desktop_setting);
        click(menu_delete);
        click(desktop_newFolder_name_ok);

        assertEquals(fileName, "副本 创建副本");
    }

}
