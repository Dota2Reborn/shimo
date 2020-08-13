package cases.docSheet;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testSlideHeader extends TestInit {

    /**
     * 幻灯片编辑页，header上搜索，点击搜索结果跳转
     *
     * @author 刘晨
     * @Time 2018-12-20
     */
    @Test(enabled = true)
    public void slide_search() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(quick_access_point);
        sendKeys(input_headerSearch,"新建测试文件");
        click(searchList_1);
        switchToPage(1);
        Boolean r1 = driver.getCurrentUrl().contains(getURL() + "slides/0cOVFbr0NesLTc0w");
        assertTrue(r1);
    }

    /**
     * 幻灯片编辑页，header 点击返回桌面
     *
     * @author 刘晨
     * @Time 2018-12-20
     */
    @Test(enabled = true)
    public void slide_backToDesktop() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(quick_access_point);
        click(Back_to_Desktop);
        Boolean r1 = driver.getCurrentUrl().equals(getURL() + "desktop");
        assertTrue(r1);
    }

    /**
     * 幻灯片编辑页，header 点击返回工作台
     *
     * @author 刘晨
     * @Time 2018-12-20
     */
    @Test(enabled = true)
    public void slide_backToDashboard() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(quick_access_point);
        click(Back_to_Dashboard);
        Boolean r1 = driver.getCurrentUrl().equals(getURL() + "dashboard/used");
        assertTrue(r1);
    }

    /**
     * 幻灯片编辑页，header 新建文档
     *
     * @author 刘晨
     * @Time 2018-12-20
     */
    @Test(enabled = false)
    public void slide_createDoc() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(b_headerCreate);
        click(b_headerCreateDoc);
        //Collection_OK

    }

    /**
     * 幻灯片编辑页，header 收藏文件
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void slide_collectionDoc() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(Collection_OK);

        String toastMsg = getText(toast_msg);

        Boolean r1 = toastMsg.endsWith("「testSlideHeader」已取消收藏");
        Boolean r2 = toastMsg.endsWith("「testSlideHeader」已收藏");

        assertTrue(r1 || r2);
    }

    /**
     * 幻灯片编辑页，header 点击用户头像展开用户菜单
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void slide_click_userIcon() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(b_user_icon);

        String result2 = getText(desktop_user_icon_status_L);
        assertEquals(result2, "个人高级版");
    }



    /**
     * 幻灯片编辑页，header 添加快捷方式
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void slide_shortcut() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        String b_Msg = getText(file_menu_shortcut);
        click(file_menu_shortcut);
        String msg = getText(toast_msg);

        String title = ppt_filename.getAttribute("value");
        if(b_Msg.equals("添加到快速访问")){
            assertEquals(msg, "「"+ title +"」已添加到快速访问");
        }else {
            assertEquals(msg, "「"+ title +"」已从快速访问移除");
        }

    }

    /**
     * 幻灯片编辑页，header 消息免打扰
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void slide_messageMute() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        String b_Msg = getText(file_menu_mute);
        click(file_menu_mute);
        String msg = getText(toast_msg);
        String title = ppt_filename.getAttribute("value");
        if(b_Msg.equals("接收消息提醒")){
            assertEquals(msg, "「"+ title + "」已设置为接收消息提醒");
        }else {
            assertEquals(msg, "「"+ title + "」已设置为消息免打扰");
        }

    }

    /**
     * 幻灯片编辑页，header 收藏
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void slide_collection() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        String b_Msg = getText(file_menu_collection);
        click(file_menu_collection);
        String msg = getText(toast_msg);
        String title = ppt_filename.getAttribute("value");
        if(b_Msg.equals("收藏")){
            assertEquals(msg, "「"+ title + "」已收藏");
        }else {
            assertEquals(msg, "「"+ title + "」已取消收藏");
        }

    }

    /**
     * 幻灯片编辑页，header 移动
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void slide_move() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        click(file_menu_move);
        click(desktop_moveFolder_back_button);
        click(desktop_moveFolder_button);

        String msg = getText(toast_msg);
        assertEquals(msg, "目标文件夹已经存在该文件");

    }

    /**
     * 幻灯片编辑页，header 创建副本
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void slide_create() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1_folder);
        click(desktop1_1_folder);
        click(desktop_new);
        click(desktop_newSlides);
        click(doc_menu);
        click(file_menu_createCopy);
        String msg = getText(toast_msg);
        assertEquals(msg, "副本已保存到「搜索文件夹」文件夹");

        click(doc_menu);
        click(doc_menu_delete);
        click(doc_menu_delete_OK);

//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);

    }


    /**
     * 幻灯片编辑页菜单，点击幻灯片信息
     *
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test(enabled = true)
    public void slide_msg() {
        login("testSlideHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
//        moveToElement(file_menu_help);
        click(file_menu_msg);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sm-modal-footer']//button")));
        Boolean R1 = driver.findElement(By.xpath("//div[@class='sm-modal-footer']//button")).isDisplayed();
        assertTrue(R1);
    }

}
