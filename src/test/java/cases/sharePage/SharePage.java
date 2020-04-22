package cases.sharePage;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SharePage extends TestInit {

    /**
     * 打开共享加密只读链接
     *
     * @author 刘晨
     * @Time 2019-7-11
     */
    @Test(enabled = true)
    public void sharePage_pwd_readOnly() {
        jumpToURL("https://release.shimodev.com/docs/XVx190oAY2Mc318W/");
        sendKeys(sharePage_inputPwd, "2x7b");
        click(sharePage_buttonConfirm);

        String title = getAttribute(doc_title_input,"value");

        assertEquals(title, "加密只读文件");

    }

    /**
     * 打开共享加密可编辑链接
     *
     * @author 刘晨
     * @Time 2019-7-11
     */
    @Test(enabled = true)
    public void sharePage_pwd_edit() {
        jumpToURL("https://release.shimodev.com/docs/mFf4ATQxe94dzXxt/");
        sendKeys(sharePage_inputPwd, "vpew");
        click(sharePage_buttonConfirm);

        String title = getAttribute(doc_title_input,"value");

        assertEquals(title, "加密可编辑文件");

    }

    /**
     * 仅限企业成员访问只读
     *
     * @author 刘晨
     * @Time 2019-7-11
     */
    @Test(enabled = true)
    public void sharePage_companyOnly_read() throws InterruptedException {
        jumpToURL("https://release.shimodev.com/docs/T1XIgAok6eQ02WUJ/");

        Thread.sleep(1000);
        WebElement button_Confirm =  driver.findElement(By.xpath("//div[@id='root']/div//a"));
        click(button_Confirm);

        login("liuchen@shimo.im","123123");

        String title = getAttribute(doc_title_input,"value");

        assertEquals(title, "仅限企业成员访问只读");

    }

    /**
     * 仅限企业成员访问,加密可编辑
     *
     * @author 刘晨
     * @Time 2019-7-11
     */
    @Test(enabled = true)
    public void sharePage_companyOnly_pwd_edit() throws InterruptedException {
        login("pipi@qq.com", "123123");
        jumpToURL("https://release.shimodev.com/docs/8tJwCFbJ7vgUNqFA/");
        click(b_share);
        click(share_changePWD);
        Thread.sleep(500);
        String pwd = getAttribute(share_PWD, "value");

        logout();

        jumpToURL("https://release.shimodev.com/docs/8tJwCFbJ7vgUNqFA/");
        Thread.sleep(1000);
        WebElement button_Confirm =  driver.findElement(By.xpath("//div[@id='root']/div//a"));
        click(button_Confirm);
        login("liuchen@shimo.im","123123");

//        System.out.println(pwd);
        sendKeys(sharePage_inputPwd, pwd);
        click(sharePage_buttonConfirm);

        String title = getAttribute(doc_title_input,"value");

        assertEquals(title, "仅限企业成员访问,加密可编辑");

    }
}
