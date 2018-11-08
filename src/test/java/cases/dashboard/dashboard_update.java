package cases.dashboard;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class dashboard_update extends TestInit {

    /**
     * 最近更新 点点点
     *
     * @author 陈清杰 @Time2018-03-26 账号状态：有一个固定文件
     */
    @Test
    public void update2() {
        login("gengxin2@shimo.im", "123123");

        click(desktop);
        contextClick(desktop1_1);
        click(menu_rename);
        sendKeys(desktop_newFolder_name, getDate());
        click(desktop_newFolder_name_ok);

        click(dashboard);
        click(dashboard_1);
        click(menu_Point_Menu);
        boolean text1 = getText(menu_newPage).equals("在新标签页中打开");
        boolean text2 = getText(menu_mute).equals("消息免打扰");
        boolean text3 = getText(menu_shortcut).equals("添加到快捷方式");
        boolean text4 = getText(menu_collection).equals("收藏");
        boolean text6 = getText(menu_cooperation).equals("1 人协作");
        boolean text7 = getText(menu_move).equals("移动");
        boolean text9 = getText(menu_moveToFolder).equals("定位到所在文件夹");
        boolean text10 = getText(menu_rename).equals("重命名");
        boolean text11 = getText(menu_creatCopy).equals("创建副本");
        boolean text13 = getText(menu_delete).equals("删除");
        assertTrue(text1 && text2 && text3 && text4 && text6 && text7 && text9 && text10 && text11 && text13);
    }

    /**
     * 最近更新 所有者编辑内容更新
     *
     * @author 陈清杰 @Time2018-03-26 账号状态：有一个固定文件
     */
    @Test
    public void update3() {
        login("gengxin3@shimo.im", "123123");
        click(dashboard_update_name);
        click(doc_edit);
        sendKeys(doc_edit, "1");
        click(b_back);
        driver.navigate().refresh();
        String text1 = getText(dashboard_update_time);
        assertEquals(text1, "刚刚 我 更新");

    }

    /**
     * 最近更新 协作者编辑内容更新
     *
     * @author 陈清杰 @Time2018-03-26 账号状态：两个账号有一个固定文件
     */
    @Test
    public void update4() {
        login("gengxin5@shimo.im", "123123");
        click(desktop);
        click(desktop1_1);
        click(doc_edit);
        sendKeys(doc_edit, "1");
        click(b_back);
        logout();

        login("gengxin4@shimo.im", "123123");
        String text1 = getText(dashboard_update_time);
        assertEquals(text1, "刚刚 AA 更新");
    }

    /**
     * 最近更新 所有者评论
     *
     * @author 陈清杰 @Time2018-03-26 账号状态：有一个固定文件
     */
    @Test
    public void update5() {
        login("gengxin6@shimo.im", "123123");
        click(dashboard_update_time);
        click(doc_edit);
        doc_edit.clear();
        sendKeys(doc_edit,"身体健康");
        click(ql_comment_Comments);
        click(doc_discuss_input);
        sendKeys(doc_discuss_input, "通过");
        click(doc_discuss_input_ok);
        click(b_back);
        driver.navigate().refresh();
        String text1 = getText(dashboard_update_time);

        assertEquals(text1, "刚刚 我 评论：通过");
    }

    /**
     * 最近更新 协作者评论
     *
     * @author 陈清杰 @Time2018-03-27 账号状态：两个账号有一个固定文件
     */
    @Test
    public void update6() {
        login("gengxin7@shimo.im", "123123");
        click(desktop);
        click(desktop1_1);
        click(doc_edit);
        doc_edit.clear();
        sendKeys(doc_edit, "哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
        click(ql_comment_Comments);
        click(doc_discuss_input);
        sendKeys(doc_discuss_input, "通过");
        click(doc_discuss_input_ok);
        click(b_back);
        logout();

        login("gengxin8@shimo.im", "123123");
        String text1 = getText(dashboard_update_time);
        click(dashboard_update_time);
        click(b_back);
        assertEquals(text1, "1 评论刚刚 cc 评论：通过");

    }

    /**
     * 最近更新 自己退出共享，已经生成的卡片从最近更新消失
     *
     * @author 陈清杰 @Time2018-03-27 账号状态：gengxin10里面有一个9共享的文件
     */
    @Test
    public void update7() {
        login("gengxin10@shimo.im", "123123");
        click(dashboard_4);
        click(dashboard_update_time);
        click(doc_edit);
        sendKeys(doc_edit, "1");
        click(b_back);
        click(dashboard_1);
        String text1 = getText(dashboard_update_name);
        assertEquals(text1, "突然想起你");
        click(menu_Point_Menu);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);
//		click(b_addCollaborator_confirm);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='none-file']//span")));
        String text2 = driver.findElement(By.xpath("//div[@class='none-file']//span")).getText();
        assertEquals(text2, "没有文件");

        logout();
        login("gengxin9@shimo.im", "123123");
        contextClick(dashboard_update_name);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);
        click(addCollaborator_1_add);
        click(b_addCollaborator_ok);
        click(Shut_down_sm_modal_close_x);
    }

    /**
     * 最近更新 自己删除自己文件，已经在最近更新生成卡片的
     *
     * @author 陈清杰 @Time2018-03-27 账号状态：有一个文件
     */
    @Test
    public void update8() {
        login("gengxin11@shimo.im", "123123");
        click(desktop_new);
        click(desktop_newDoc);
        String time = getDate();
        sendKeys(doc_title_input, time);
        sendKeys(doc_edit, "la");
        click(b_back);
        contextClick(dashboard_update_file);
        click(menu_delete);
        click(desktop_newFolder_name_ok);

        Boolean f = doesWebElementExist(dashboard_update_file);
        Boolean result;
        if (f.equals(true)) {
            result = getText(dashboard_update_file).equals(time);
        } else {
            result = false;
        }
        assertFalse(result);

    }

    /**
     * 最近更新 被所有者移除协作，已经在最近更新生成过卡片
     *
     * @author 陈清杰 @Time2018-03-27 账号状态：gengxin13有12共享的文件
     */
    @Test
    public void update9() {
        login("gengxin13@shimo.im", "123123");
        click(dashboard_4);
        click(dashboard_update_time);
        click(doc_edit);
        doc_edit.sendKeys("q");
        click(b_back);
        click(dashboard_1);

        logout();

        login("gengxin12@shimo.im", "123123");
        contextClick(dashboard_update_name);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);
        click(Shut_down_sm_modal_close_x);

        logout();
        login("gengxin13@shimo.im", "123123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='none-file']//span")));
        String text2 = driver.findElement(By.xpath("//div[@class='none-file']//span")).getText();
        assertEquals(text2, "没有文件");

        logout();
        login("gengxin12@shimo.im", "123123");
        click(dashboard_3);
        contextClick(dashboard_update_name);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);
        click(addCollaborator_1_add);
        click(b_addCollaborator_ok);
        click(Shut_down_sm_modal_close_x);

    }

    /**
     * 最近更新 删除后再恢复
     *
     * @author 陈清杰 @Time2018-03-27 账号状态：没有文件
     */
    @Test
    public void update10() {
        login("gengxin14@shimo.im", "123123");
        click(desktop_new);
        click(desktop_newDoc);
        String time = getDate();
        sendKeys(doc_title_input, time);
        sendKeys(doc_edit, "c");
        click(doc_menu);
        click(doc_menu_delete);
        click(doc_menu_delete_OK);

        click(trash);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='file-icon doc']")));
        driver.findElement(By.xpath("//div[@class='file-icon doc']")).click();
        click(menu_Recovery);
        click(dashboard);

        Boolean f = doesWebElementExist(dashboard_update_file);
        Boolean result;
        if (f.equals(true)) {
            result = getText(dashboard_update_file).equals(time);
        } else {
            result = false;
        }

        boolean text1 = getText(dashboard_update_time).equals("刚刚 我 更新");
        assertFalse(result);
        assertTrue(text1);

        contextClick(dashboard_update_name);
        click(menu_delete);
        click(desktop_newFolder_name_ok);

    }

}
