package cases.dashboard;

import base.TestInit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class dashboard_own extends TestInit {

    /**
     * 我创建的 卡片收藏验证
     *
     * @author 陈清杰
     * @Time 2018-03-20 账号状态：有一个文件
     */
    @Test
    public void own2() {
        login("own2@shimo.im", "123123");
        click(dashboard_3);

        moveToElement(dashboard_share_file_1);
        driver.findElement(By.xpath("//div[@class='category-card-container']//div//a//div[1]//div[2]//div//div[2]"))
                .click();// hover收藏
        click(favorites);
        String text = getText(By.xpath("//div[@class='tile-inner']//div[1]//a[1]//div[2]"));
        assertEquals(text, "无标题");

        click(dashboard);
        click(dashboard_3);
        moveToElement(dashboard_share_file_1);
        driver.findElement(By.xpath("//div[@class='category-card-container']//div//a//div[1]//div[2]//div//div[2]"))
                .click();
        click(favorites);
        String text2 = getText(By.xpath("//div[@class='none-file']//span"));
        assertEquals(text2, "没有文件");

    }


    /**
     * 我创建的 点点点
     *
     * @author 陈清杰
     * @Time 2018-03-20 账号状态：有一个文档
     */
    @Test
    public void own3() {
        login("own3@shimo.im", "123123");
        click(dashboard_3);
        click(menu_Point_Menu);
        // Thread.sleep(500);
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
     * 我创建的 移交所有权在我创建的里面生成卡片
     *
     * @author 陈清杰
     * @Time 2018-03-20 账号状态：两个账号都没有文件
     */
    @Test
    public void own4() throws InterruptedException {
        login("own4@shimo.im", "123123");
        click(desktop_new);
        click(desktop_newDoc);
        String time = getDate();
        sendKeys(doc_title_input, time);
        sendKeys(doc_edit, "la");
        click(b_back);
        click(dashboard_3);
        contextClick(dashboard_update_file);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);
        click(addCollaborator_1_add);
        click(b_addCollaborator_ok);

        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);

        logout();

        login("own5@shimo.im", "123123");
        click(dashboard_3);
        Boolean result = getText(dashboard_share_file_1).equals(time);
        Thread.sleep(500);
        contextClick(dashboard_share_file_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        assertFalse(result);


    }

    /**
     * 新的的共享
     *
     * @author 陈清杰
     * @Time 2018-03-21
     */
    @Test
    public void own5() {
        login("own6@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1);
        moveToElement(menu_cooperation);
        sendKeys(input_addCollaborator, "own7@shimo.im");
        click(b_addCollaborator_1_add);
        // 获取当前时间
        Boolean a = false;
        String time = getDate();
        int dat1 = Integer.parseInt(time);
//		click(Shut_down_sm_modal_close_x);
        logout();
        login("own7@shimo.im", "123123");
        String n = getText(dashboard_shareTime_1);
        String time1 = n.substring(0, 2);
        String m = "刚刚";
        if (time1.equals(m)) {
            assertEquals(n, "刚刚");
            a = true;
        } else if (time1 != m) {
            String time3 = n.substring(0, 8);
            time3 = time3.substring(time3.length() - 5);
            time3 = time3.replace(":", "");
            int dat2 = Integer.parseInt(time3);
            if (dat2 == dat1 || dat2 > dat1) {
                a = true;
            }
        }
        contextClick(New_Share_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        assertTrue(a);

    }

}
