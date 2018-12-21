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
    @Test(enabled = true)
    public void doc_createDoc() {
        login("testDocHeader@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(b_headerCreate);
        click(b_headerCreateDoc);

        Boolean r1 = driver.getCurrentUrl().equals(getURL() + "dashboard/updated");
        assertTrue(r1);
    }
}
