package cases.mobile;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class mobileTest extends TestInit {

    /**
     * mobile新建文档
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_createFileDoc() throws InterruptedException {
        login("mobile_test@shimo.im", "123123");
        click(mobile_file_2);

        new Actions(driver).click(mobile_B_create).build().perform();

        Thread.sleep(1000);
        new Actions(driver).click(mobile_B_createDoc).build().perform();

        mobile_I_fileReName.clear();
        sendKeys(mobile_I_fileReName,"新建新文档");
        click(mobile_B_confirm);
        Thread.sleep(1000);
//        driver.navigate().back();
        click(mobile_header_back);

        Thread.sleep(1000);
        click(mobile_B_setting);
        Thread.sleep(1000);
        new Actions(driver).click(mobile_B_setting_del).build().perform();
        Thread.sleep(1000);
        click(mobile_B_setting_del_confirm);

    }

    /**
     * mobile新建表格
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_createFileSheet() throws InterruptedException {
        login("mobile_test@shimo.im", "123123");
        click(mobile_file_2);

        new Actions(driver).click(mobile_B_create).build().perform();

        Thread.sleep(1000);
        new Actions(driver).click(mobile_B_createSheet).build().perform();

        mobile_I_fileReName.clear();
        sendKeys(mobile_I_fileReName,"新建表格");
        click(mobile_B_confirm);
        Thread.sleep(1000);
//        driver.navigate().back();
        click(mobile_header_back);

        Thread.sleep(1000);
        click(mobile_B_setting);
        Thread.sleep(1000);
        new Actions(driver).click(mobile_B_setting_del).build().perform();
        Thread.sleep(1000);
        click(mobile_B_setting_del_confirm);

    }

    /**
     * mobile新建表单
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_createFileForm() throws InterruptedException {
        login("mobile_test@shimo.im", "123123");
        click(mobile_file_2);

        new Actions(driver).click(mobile_B_create).build().perform();

        Thread.sleep(1000);
        new Actions(driver).click(mobile_B_createForm).build().perform();

        mobile_I_fileReName.clear();
        sendKeys(mobile_I_fileReName,"新建表单");
        click(mobile_B_confirm);
        Thread.sleep(1000);
        click(mobile_header_back);
//        driver.navigate().back();

        Thread.sleep(1000);
        click(mobile_B_setting);
        Thread.sleep(1000);
        new Actions(driver).click(mobile_B_setting_del).build().perform();
        Thread.sleep(1000);
        click(mobile_B_setting_del_confirm);

    }

    /**
     * mobile新文档Header
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_DocHeader() {
        login("mobile_testDoc@shimo.im", "123123");
        click(mobile_file_1);

        Boolean r1 = doesWebElementExist(mobile_header_back);
        Boolean r2 = doesWebElementExist(mobile_header_share);
        click(mobile_header_setting);
        Boolean r3 = doesWebElementExist(mobile_header_setting_collaborator);
        Boolean r4 = doesWebElementExist(mobile_header_setting_collection);
        Boolean r5 = doesWebElementExist(mobile_header_setting_createCopy);
        Boolean r6 = doesWebElementExist(mobile_header_setting_toApp);

        assertTrue(r1 && r2 && r3 && r4 && r5 && r6);
    }

    /**
     * mobile表格Header
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_SheetHeader() {
        login("mobile_testSheet@shimo.im", "123123");
        click(mobile_file_1);

        Boolean r1 = doesWebElementExist(mobile_header_back);
        Boolean r2 = doesWebElementExist(mobile_header_share);
        click(mobile_header_setting);
        Boolean r3 = doesWebElementExist(mobile_header_setting_collaborator);
        Boolean r4 = doesWebElementExist(mobile_header_setting_collection);
        Boolean r5 = doesWebElementExist(mobile_header_setting_createCopy);
        Boolean r6 = doesWebElementExist(mobile_header_setting_toApp);

        assertTrue(r1 && r2 && r3 && r4 && r5 && r6);
    }

    /**
     * mobile表单Header
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_FormHeader() {
        login("mobile_testForm@shimo.im", "123123");
        click(mobile_file_1);

        Boolean r1 = doesWebElementExist(mobile_header_back);
        Boolean r2 = doesWebElementExist(mobile_header_share);
        click(mobile_header_setting);
        Boolean r3 = doesWebElementExist(mobile_header_setting_collaborator);
        Boolean r4 = doesWebElementExist(mobile_header_setting_collection);
        Boolean r5 = doesWebElementExist(mobile_header_setting_createCopy);
        Boolean r6 = doesWebElementExist(mobile_header_setting_toApp);

        assertTrue(r1 && r2 && r3 && r4 && r5 && r6);
    }

    /**
     * mobile 专业文档Header
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_moDocHeader() {
        login("mobile_testModoc@shimo.im", "123123");
        click(mobile_file_1);

        Boolean r1 = doesWebElementExist(mobile_header_back);
        Boolean r2 = doesWebElementExist(mobile_header_share);
        click(mobile_header_setting);
        Boolean r3 = doesWebElementExist(mobile_header_setting_collaborator);
        Boolean r4 = doesWebElementExist(mobile_header_setting_collection);
        Boolean r5 = doesWebElementExist(mobile_header_setting_createCopy);

        assertTrue(r1 && r2 && r3 && r4 && r5);
    }

    /**
     * mobile脑图Header
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_MindMapHeader() {
        login("mobile_testMindMap@shimo.im", "123123");
        click(mobile_file_1);

        Boolean r1 = doesWebElementExist(mobile_header_back);
        Boolean r2 = doesWebElementExist(mobile_header_share);
        click(mobile_header_setting);
        Boolean r3 = doesWebElementExist(mobile_header_setting_collaborator);
        Boolean r4 = doesWebElementExist(mobile_header_setting_collection);
        Boolean r5 = doesWebElementExist(mobile_header_setting_createCopy);

        assertTrue(r1 && r2 && r3 && r4 && r5);
    }

    /**
     * mobile白板Header
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_boardHeader() {
        login("mobile_testBoardMap@shimo.im", "123123");
        click(mobile_file_1);

        Boolean r1 = doesWebElementExist(mobile_header_back);
        Boolean r2 = doesWebElementExist(mobile_header_share);
        click(mobile_header_setting);
        Boolean r3 = doesWebElementExist(mobile_header_setting_collaborator);
        Boolean r4 = doesWebElementExist(mobile_header_setting_collection);
        Boolean r5 = doesWebElementExist(mobile_header_setting_createCopy);

        assertTrue(r1 && r2 && r3 && r4 && r5);
    }

    /**
     * mobile添加协作
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_collaboration() throws InterruptedException {
        login("mobile_test@shimo.im", "123123");
        click(mobile_file_1);
        click(mobile_header_setting);
        click(mobile_header_setting_collaborator);
        click(mobile_header_collaborator_addCollaborator);
        addCollaboratorByEmail("liuchen@shimo.im",3);

        click(b_collaborator_Back);
        click(b_collaboratorsList_1);
        click(cpList_remove);

    }
    /**
     * mobile桌面添加协作
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_collaboration_1() throws InterruptedException {
        login("mobile_test@shimo.im", "123123");

        Thread.sleep(1000);
        click(mobile_B_setting);

        Thread.sleep(1000);
        click(mobile_B_setting_addCollaborator);


        addCollaboratorByEmail("liuchen@shimo.im",3);

        click(b_collaborator_Back);
        click(b_collaboratorsList_1);
        click(cpList_remove);

    }

    /**
     * mobile添加协作
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_createCopy() throws InterruptedException {
        login("mobile_test@shimo.im", "123123");
        click(mobile_file_1);
        click(mobile_header_setting);
        click(mobile_header_setting_createCopy);
        click(mobile_header_back);
        String fileName = getText(mobile_file_1);
        Boolean r = fileName.startsWith("副本");

        Thread.sleep(1000);
        click(mobile_B_setting);
        Thread.sleep(1000);
        new Actions(driver).click(mobile_B_setting_del).build().perform();
        Thread.sleep(1000);
        click(mobile_B_setting_del_confirm);

        assertTrue(r);
    }

    /**
     * mobile收藏文件
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_collection() throws InterruptedException {
        login("mobile_test@shimo.im", "123123");

        Thread.sleep(1000);
        click(mobile_B_setting);

        Thread.sleep(1000);
        click(mobile_B_setting_collection);

        String msg = getText(mobile_toast);
        assertTrue(msg.contains("收藏成功")||msg.contains("已取消收藏"));
    }

    /**
     * mobile重命名
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_rename() throws InterruptedException {
        login("mobile_test@shimo.im", "123123");

        Thread.sleep(1000);
        click(mobile_B_setting);

        Thread.sleep(1000);
        click(mobile_B_setting_rename);

        String time = getDate();
        mobile_I_fileReName.clear();
        sendKeys(mobile_I_fileReName,time);
        click(mobile_B_confirm);

        String msg = getText(mobile_file_1);
        assertTrue(msg.contains(time));
    }

    /**
     * mobile分享desktop
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_share() throws InterruptedException {
        login("mobile_test@shimo.im", "123123");

        Thread.sleep(1000);
        click(mobile_B_setting);

        Thread.sleep(1000);
        click(mobile_B_setting_share_2);
        String r1 = getText(mobile_toast);
        assertEquals("修改成功", r1);

        Thread.sleep(3000);
        click(mobile_B_setting_share_3);
        String r2 = getText(mobile_toast);
        assertEquals("修改成功", r2);

        Thread.sleep(3000);
        click(mobile_B_setting_share_1);
        String r3 = getText(mobile_toast);
        assertEquals("修改成功", r3);


    }

    /**
     * mobile分享header
     *
     * @author 刘晨
     * @Time 2020-11-02
     */
    @Test(enabled = true)
    public void mobile_share_1() throws InterruptedException {
        login("mobile_test@shimo.im", "123123");

        click(mobile_file_1);
        click(mobile_header_share);


        click(mobile_header_share_2);
        String r1 = getText(toast_msg);
        assertEquals("修改成功", r1);

        Thread.sleep(3000);
        click(mobile_header_share_3);
        String r2 = getText(toast_msg);
        assertEquals("修改成功", r2);

        Thread.sleep(3000);
        click(mobile_header_share_1);
        String r3 = getText(toast_msg);
        assertEquals("修改成功", r3);

    }

}
