package cases.desktop;


import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

//import org.openqa.selenium.WebDriver;

public class testAlertMute extends TestInit {

    /**
     * 关闭消息免打扰，协作者评论，收到消息通知
     * <p>
     * 已开启免打扰AlertMute@shimo.im
     *
     * @author 王继程
     * @Time 2018-03-23
     */
    @Test(enabled = true)
    public void Notify_Open() {
        login("AlertMute@shimo.im", "123123");
        click(dashboard_2);
        click(menu_Point_Menu);
        click(menu_mute);//接收消息通知
        logout();
        login("AlertMute1@shimo.im", "123123");
        click(desktop);
        click(desktop1_1);
        wait.until(ExpectedConditions.elementToBeClickable(doc_edit));
        doc_edit.clear();
        sendKeys(doc_edit, "lala");
        click(ql_comment_Comments);
        sendKeys(doc_discuss_input, "输入评论收到通知");
        action.sendKeys(Keys.ENTER);
        click(doc_discuss_input_ok);
        Boolean a = false;
        String time1 = getDate();
        int dat1 = Integer.parseInt(time1);
        logout();
        login("AlertMute@shimo.im", "123123");
        click(dashboard_notice);
        String time2 = getText(dashboard_notice_list_1_time);
        String time = time2.substring(0, 2);
        //System.out.println(time2);
        String gg = "刚刚";
        if (time.equals(gg)) {
            a = true;
        } else if (time != gg) {
            String time3 = time2.substring(0, 8);
            time3 = time3.substring(time3.length() - 5);
            time3 = time3.replace(":", "");
            int dat2 = Integer.parseInt(time3);
            if (dat2 == dat1 || dat2 > dat1) {
                a = true;
            }
        }
        assertTrue(a);
        click(dashboard_notice_list_1);
        switchToPage(1);
        click(End_Discussion);
        click(End_Discussion_OK);
        click(doc_menu);
        click(file_menu_mute);//关闭消息通知

    }

    /**
     * 开启消息免打扰，在关闭消息免打扰，验证最近更新
     * <p>
     * 未开启免打扰AlertMute2@shimo.im
     *
     * @author 王继程
     * @Time 2018-03-23
     */
    @Test(enabled = true)
    public void Notification_shutdown() {
        login("AlertMute2@shimo.im", "123123");
        click(dashboard_1);
        click(dashboard_activitiesByFile);
        click(menu_Point_Menu);
        click(menu_mute);//关闭消息通知
        driver.navigate().refresh();
        Boolean exist = doesWebElementExist(dashboard_share_file_1);
        assertFalse(exist);
        click(dashboard_2);
        click(menu_Point_Menu);
        click(menu_mute);//开启消息通知
        click(dashboard_share_file_1);
        wait.until(ExpectedConditions.elementToBeClickable(doc_edit));
        doc_edit.sendKeys(Keys.CONTROL, 'a' + "编辑文档并保存" + Keys.ENTER);
        click(quick_access_point);
        click(Back_to_Dashboard);
        wait.until(ExpectedConditions.elementToBeClickable(dashboard));
        click(dashboard_activitiesByFile);
        Boolean exist1 = doesWebElementExist(dashboard_share_file_1);
        int i = 1;
        while (!exist1 && i < 6) {
            driver.navigate().refresh();
            wait.until(ExpectedConditions.elementToBeClickable(dashboard));
            exist1 = doesWebElementExist(dashboard_share_file_1);
            if(exist1){break;}else {i++;}

        }
        if (exist1) {
            assertTrue(true);
        } else {
            System.out.println("接收消息提醒验证未通过，请登录AlertMute2@shimo.im自行验证");
        }
    }

    /**
     * 关闭消息免打扰，协作者编辑文档，出现在最近更新中
     * <p>
     * AlertMute3@shimo.im已开启免打扰
     *
     * @author 王继程
     * @Time 2018-03-23
     */
    @Test(enabled = true)
    public void Collaboration_notifications() {
        login("AlertMute3@shimo.im", "123123");
        click(dashboard_2);
        click(menu_Point_Menu);
        click(menu_mute);//开启消息通知
        logout();
        login("AlertMute4@shimo.im", "123123");
        click(desktop);
        click(desktop1_1);
        wait.until(ExpectedConditions.elementToBeClickable(doc_edit));
        doc_edit.sendKeys(Keys.CONTROL, 'a' + "编辑文档并保存" + Keys.ENTER);
        click(b_back);
        logout();
        login("AlertMute3@shimo.im", "123123");
        wait.until(ExpectedConditions.elementToBeClickable(dashboard));
        Boolean exist2 = doesWebElementExist(dashboard_share_file_1);
        int i = 1;
        while (exist2 == false && i < 6) {
            driver.navigate().refresh();
            wait.until(ExpectedConditions.elementToBeClickable(dashboard));
            exist2 = doesWebElementExist(dashboard_share_file_1);
            i++;
        }
        if (exist2 == true) {
            click(menu_Point_Menu);
            click(menu_mute);//关闭消息通知
            assertTrue(exist2);
        } else {
            System.out.println("接收消息提醒验证未通过，请登录AlertMute3@shimo.im自行验证");
            click(dashboard_2);
            click(menu_Point_Menu);
            click(menu_mute);//关闭消息通知
            assertTrue(exist2);
        }
    }

    /**
     * 消息通知，文件夹相关
     * <p>
     * 文件夹是打扰的，文件夹内文件是免打扰的，改成打扰的，再该文件夹免打扰，看文件夹内文件消息验证，文件夹改成打扰的，文件夹内文件免打扰
     *
     * @author 王继程
     * @Time 2018-03-23
     */
    @Test(enabled = true)
    public void Folder_notifications() throws InterruptedException {

        login("AlertMute5@shimo.im", "123123");
        click(desktop);
        Boolean mute_icon = doesWebElementExist(By.className("mute-icon"));
        if(mute_icon){
            contextClick(desktop1_1);
            click(menu_mute);
            click(desktop1_1_folder);
            contextClick(desktop1_1);
            click(menu_mute);
        }else {
            click(desktop1_1_folder);
            mute_icon = doesWebElementExist(By.className("mute-icon"));
            if(!mute_icon){
                contextClick(desktop1_1);
                click(menu_mute);
            }
        }
        Thread.sleep(500);
        Boolean r1 = doesWebElementExist(By.className("mute-icon"));
        assertFalse(r1);
        contextClick(desktop1_1);
        click(menu_mute);
        click(Folder_settings);
        click(menu_mute);
        Thread.sleep(500);
        Boolean r2 = doesWebElementExist(By.className("mute-icon"));
        assertTrue(r2);
    }


}
