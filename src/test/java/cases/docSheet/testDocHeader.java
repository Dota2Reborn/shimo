package cases.docSheet;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testDocHeader extends TestInit {

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
        Boolean r1 = driver.getCurrentUrl().equals(getURL() + "docs/0hAy2J5spkcDtJXx");
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
        Boolean r1 = driver.getCurrentUrl().equals(getURL() + "desktop");
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
        Boolean r1 = driver.getCurrentUrl().equals(getURL() + "dashboard/updated");
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
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(b_headerCreate);
        click(b_headerCreateDoc);
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
        assertEquals(result2, "基础版");

        String result3 = getText(desktop_user_icon_status_R);
        assertEquals(result3, "升级到企业版或高级版");

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
        Boolean r1 = driver.findElement(By.id("discordpanel-show")).isDisplayed();
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
}
