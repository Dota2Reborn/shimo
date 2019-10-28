package cases.dashboard;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class dashboard_shared extends TestInit {


    /**
     * 共享给我
     * 卡片样式
     *
     * @author 陈清杰
     * @Time2018-03-21 账号状态：gx1有，gx2没有
     */
    @Test
    public void shared1() throws InterruptedException {
        login("gx1@shimo.im", "123123");
        click(dashboard_3);
        contextClick(dashboard_update_name);
        addCollaboratorByEmail("gx2@shimo.im");
        logout();
        login("gx2@shimo.im", "123123");
        click(dashboard_4);
        wait.until(ExpectedConditions.elementToBeClickable(menu_Point_Menu));
        boolean b = driver.findElement(By.className("file-icon")).isDisplayed();//卡片图标
        boolean c = driver.findElement(By.className("avatar")).isDisplayed();//卡片图标
        boolean text = getText(dashboard_update_name).equals("无标题");
        boolean text1 = getText(dashboard_update_time).equals("刚刚 共享 共享");
        moveToElement(dashboard_update_name);
        boolean d = doesWebElementExist(dashboard_share_file_favorites);
        boolean e = doesWebElementExist(menu_Point_Menu);
        assertTrue(b && c && text && text1 && d && e);
        Thread.sleep(200);
        contextClick(dashboard_update_name);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
    }

    /**
     * 共享给我
     * hover收藏
     *
     * @author 陈清杰
     * @Time2018-03-22 账号状态：gx4有gx3共享的文件
     */
    @Test
    public void shared2() {
        login("gx4@shimo.im", "123123");
        click(dashboard_4);
        moveToElement(dashboard_share_file_1);
        click(dashboard_share_file_favorites);
        click(favorites);
        String text = getText(desktop1_1_name);
        assertEquals(text, "共享");


        click(dashboard);
        click(dashboard_4);
        moveToElement(dashboard_share_file_1);
        click(dashboard_share_file_favorites);
        click(favorites);
        Boolean r = doesWebElementExist(desktop_none_file);
        assertTrue(r);

    }

    /**
     * 共享给我
     * 卡片点点点选项验证（正常）
     *
     * @author 陈清杰
     * @Time2018-03-22 账号状态:gx5@shimo.im有固定文件；gx6@shimo.im有5共享的固定文件
     */
    @Test
    public void shared3() {


        login("gx6@shimo.im", "123123");
        click(dashboard_4);
        click(menu_Point_Menu);
        boolean text1 = getText(menu_newPage).equals("在新标签页中打开");
        boolean text2 = getText(menu_mute).equals("消息免打扰");
        boolean text3 = getText(menu_shortcut).equals("添加到快速访问");
        boolean text4 = getText(menu_collection).equals("收藏");
        boolean text6 = getText(menu_cooperation).equals("协作");
        boolean text7 = getText(menu_move).equals("移动");
        boolean text9 = getText(menu_moveToFolder).equals("定位到所在文件夹");
        boolean text10 = getText(menu_rename).equals("重命名");
        boolean text11 = getText(menu_createCopy).equals("创建副本");
        boolean text13 = getText(menu_delete).equals("删除");
        assertTrue(text1 && text2 && text3 && text4 && text6 && text7 && text9 && text10 && text11 && text13);


    }

}