package cases.docSheet;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testDocHeader extends TestInit {

    /**
     * 文档编辑页，header 保存模板
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_template() throws InterruptedException {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        click(file_menu_template);
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='sm-modal-footer']/button[1]")).click();
        String msg = getText(toast_msg);
        assertEquals(msg, "模板保存成功。在「模板库」-「我的模板」中查看。");

    }

    /**
     * 文档编辑页，header上搜索，点击搜索结果跳转
     *
     * @author 刘晨
     * @Time 2018-12-20
     */
    @Test(enabled = true)
    public void doc_search() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(quick_access_point);
        sendKeys(input_headerSearch,"新建测试文件");
        click(searchList_1);
        switchToPage(1);
        Boolean r1 = driver.getCurrentUrl().equals(getURL() + "docs/YJytKPDkptqGdxq8");
        assertTrue(r1);
    }

    /**
     * 文档编辑页，header 点击返回桌面
     *
     * @author 刘晨
     * @Time 2018-12-20
     */
    @Test(enabled = true)
    public void doc_backToDesktop() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(quick_access_point);
        click(Back_to_Desktop);
        Boolean r1 = driver.getCurrentUrl().startsWith(getURL() + "desktop");
        assertTrue(r1);
    }

    /**
     * 文档编辑页，header 点击返回工作台
     *
     * @author 刘晨
     * @Time 2018-12-20
     */
    @Test(enabled = true)
    public void doc_backToDashboard() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(quick_access_point);
        click(Back_to_Dashboard);
        Boolean r1 = driver.getCurrentUrl().startsWith(getURL() + "dashboard/");
        assertTrue(r1);
    }

    /**
     * 文档编辑页，header 新建文档
     *
     * @author 刘晨
     * @Time 2018-12-20
     */
    @Test(enabled = false)
    public void doc_createDoc() {
//        login("testDocHeader@shimo.im", "123123");
//
//        click(desktop);
//        click(desktop1_1);
//        click(b_headerCreate);
//        click(b_headerCreateDoc);
        //Collection_OK

    }

    /**
     * 文档编辑页，header 收藏文件
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_collectionDoc() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(Collection_OK);

        String toastMsg = getText(toast_msg);

        Boolean r1 = toastMsg.endsWith("「testDocHeader」已取消收藏");
        Boolean r2 = toastMsg.endsWith("「testDocHeader」已收藏");

        assertTrue(r1 || r2);
    }

    /**
     * 文档编辑页，header 点击用户头像展开用户菜单
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_click_userIcon() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(b_user_icon);

        String result2 = getText(desktop_user_icon_status_L);
        assertEquals(result2, "个人高级版");
    }

    /**
     * 文档编辑页，header 点击讨论按钮
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_click_discord() throws InterruptedException {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(b_discord);

        Thread.sleep(500);
        Boolean r1 = driver.findElement(By.xpath("//div[@id='discordpanel-show']//ul/li[2]")).getAttribute("class").contains(" active__");
        assertTrue(r1);
    }

    /**
     * 文档编辑页，header 点击演示按钮
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_click_screenShow() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(b_screenShow);
        click(b_demoScreenBack);
        click(b_back);
    }

    /**
     * 文档编辑页，header 添加协作者
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_addCollaborator() throws InterruptedException {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(b_collaborator);
//        sendKeys(input_collaborator, "test0910@qq.com");
//        click(b_addCollaborator_1_add);
//        click(b_addCollaborator_ok);
        sendKeys(input_add_Collaborator, "test0910@qq.com");
        Thread.sleep(500);
        click(b_add_CollaboratorList_1);
        click(cpList_edit);

//        wait.until(ExpectedConditions.elementToBeClickable(b_addCollaborator));
//        click(b_addCollaborator_2_list);
//        click(list_addCollaborator_4);
        driver.navigate().refresh();
        click(b_collaborator);
        click(b_collaboratorsList_1);
        click(cpList_remove);

        int r1 = getCollaboratorSize();
        assertEquals(r1, 1);
    }

    /**
     * 文档编辑页，header 添加快捷方式
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_shortcut() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        String b_Msg = getText(file_menu_shortcut);
        click(file_menu_shortcut);
        String msg = getText(toast_msg);

        String title = doc_title_input.getAttribute("value");
        if(b_Msg.equals("添加到快速访问")){
            assertEquals(msg, "「"+ title +"」已添加到快速访问");
        }else {
            assertEquals(msg, "「"+ title +"」已从快速访问移除");
        }

    }

    /**
     * 文档编辑页，header 消息免打扰
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_messageMute() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        String b_Msg = getText(file_menu_mute);
        click(file_menu_mute);
        String msg = getText(toast_msg);
        String title = doc_title_input.getAttribute("value");
        if(b_Msg.equals("接收消息提醒")){
            assertEquals(msg, "「"+ title + "」已设置为接收消息提醒");
        }else {
            assertEquals(msg, "「"+ title + "」已设置为消息免打扰");
        }

    }

    /**
     * 文档编辑页，header 收藏
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_collection() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        String b_Msg = getText(file_menu_collection);
        click(file_menu_collection);
        String msg = getText(toast_msg);
        String title = doc_title_input.getAttribute("value");
        if(b_Msg.equals("收藏")){
            assertEquals(msg, "「"+ title + "」已收藏");
        }else {
            assertEquals(msg, "「"+ title + "」已取消收藏");
        }

    }

    /**
     * 文档编辑页，header 移动
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_move() {
        login("testDocHeader@shimo.im", "123123");

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
     * 文档编辑页，header 创建副本
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_create() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1_folder);
        click(desktop1_1_folder);
        click(desktop_new);
        click(desktop_newDoc);
        click(doc_menu);
        click(file_menu_createCopy);
        String msg = getText(toast_msg);
        assertEquals(msg, "副本已保存到「搜索文件夹」文件夹");

        click(doc_menu);
        click(doc_menu_delete);
        click(doc_menu_delete_OK);

        delFile(desktop1_1);

    }

    /**
     * 文档编辑页，header 保存版本
     *
     * @author 刘晨
     * @Time 2018-12-26
     */
    @Test(enabled = true)
    public void doc_saveVersion() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        click(file_menu_version);
        String msg = getText(toast_msg);
        assertEquals(msg, "不能重复创建版本");
    }

    /**
     * 文档编辑页菜单，点击文档信息
     *
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test(enabled = true)
    public void doc_msg() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        click(file_menu_msg);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sm-modal-footer']//button")));
        Boolean R1 = driver.findElement(By.xpath("//div[@class='sm-modal-footer']//button")).isDisplayed();
        assertTrue(R1);

    }
}
