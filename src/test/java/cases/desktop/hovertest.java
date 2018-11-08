package cases.desktop;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class hovertest extends TestInit {

    /**
     * 基础版 hover头像 鼠标 hover 到头像上
     *
     * @author 陈清杰
     * @Time 2018-01-09
     */
    @Test
    public void hover_person() {

        login("autoTesthover@shimo.im", "123123");
        moveToElement(desktop_user_icon);
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[1]")));
        String aa = "//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[1]";
        String result = driver.findElement(By.xpath(aa)).getText();
        assertEquals(result, "基础版");

        String result2 = getText(desktop_user_icon_status_L);
        assertEquals(result2, "基础版");

        String result3 = getText(desktop_user_icon_status_R);
        assertEquals(result3, "升级到企业版或高级版");

        String dd = "//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[3]//div//div[2]";
        String result4 = driver.findElement(By.xpath(dd)).getText();
        assertEquals(result4, "autoTesthover@shimo.im");

        String ee = "//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[5]";
        String result5 = driver.findElement(By.xpath(ee)).getText();
        assertEquals(result5, "帐号设置");

        String ff = "//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[7]//span";
        String result6 = driver.findElement(By.xpath(ff)).getText();
        assertEquals(result6, "邀请好友免费获得高级版");

        String gg = "//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[8]";
        String result7 = driver.findElement(By.xpath(gg)).getText();
        assertEquals(result7, "下载石墨文档 App");

        String hh = "//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[9]";
        String result8 = driver.findElement(By.xpath(hh)).getText();
        assertEquals(result8, "使用帮助");

        String ii = "//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[11]";
        String result9 = driver.findElement(By.xpath(ii)).getText();
        assertEquals(result9, "退出登录");

    }

    /**
     * hover头像 鼠标 hover头像，点击升级（基础版）
     *
     * @author 陈清杰
     * @Time 2018-01-09
     */
    @Test
    public void hover_person1() {

        login("autoTesthover@shimo.im", "123123");
        moveToElement(desktop_user_icon);
        click(desktop_user_icon_status_R);

        switchToPage(1);
        String url = driver.getCurrentUrl();
        assertEquals(url, getURL() + "pricing");
    }

    /**
     * hover头像 鼠标 hover头像，点击账号设置（基础版）
     *
     * @author 陈清杰
     * @Time 2018-01-09
     */
    @Test
    public void hover_person2() {

        login("autoTesthover@shimo.im", "123123");
        moveToElement(desktop_user_icon);
        click(desktop_user_icon_personSetting);

        String url = driver.getCurrentUrl();
        assertEquals(url, getURL() + "profile");

    }

    /**
     * hover头像没写完 鼠标 hover头像，点击邀请好友（基础版）
     *
     * @author 陈清杰
     * @Time 2018-01-12
     */
    @Test
    public void hover_person3() {

        login("autoTesthover@shimo.im", "123123");
        moveToElement(desktop_user_icon);

        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[7]//span")));
        driver.findElement(By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[7]//span")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sm-modal-title']//div[1]")));
        String text = driver.findElement(By.xpath("//div[@class='sm-modal-title']//div[1]")).getText();
        assertEquals(text, "免费获得石墨文档高级版！ ?");

    }

    /**
     * hover头像 鼠标 hover头像，点击下载（基础版）
     *
     * @author 陈清杰
     * @Time 2018-01-12
     */
    @Test
    public void hover_person4() {

        login("autoTesthover@shimo.im", "123123");
        moveToElement(desktop_user_icon);

        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[8]")));
        driver.findElement(By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[8]")).click();

        String aa = "//div[@role='document']//div//div//div//h3";
        String text = driver.findElement(By.xpath(aa)).getText();
        assertEquals(text, "扫码下载 石墨文档 App");

    }

    /**
     * hover头像 鼠标 hover头像，点击使用帮助（基础版）
     *
     * @author 陈清杰
     * @Time 2018-01-12
     */
    @Test
    public void hover_person5() {

        login("autoTesthover@shimo.im", "123123");
        moveToElement(desktop_user_icon);

        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[9]")));
        driver.findElement(By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[9]")).click();

        String url = driver.getCurrentUrl();
        assertEquals(url, getURL() + "help");
    }

    /**
     * hover头像 鼠标 hover头像，点击退出登录（基础版）
     *
     * @author 陈清杰
     * @Time 2018-01-12
     */
    @Test
    public void hover_person6() {

        login("logoutTest@shimo.im", "123123");
        moveToElement(desktop_user_icon);

        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[11]")));
        driver.findElement(By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[11]")).click();

        String url = driver.getCurrentUrl();
        assertEquals(url, getURL());
    }

    /**
     * 高级版 hover头像 鼠标 hover 到头像上
     *
     * @author 陈清杰
     * @Time 2018-01-16
     */
    @Test
    public void hover_person7() {

        login("gaoji1@shimo.im", "123456");
        moveToElement(desktop_user_icon);
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[1]")));
        String cc = "//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[1]";
        String result = driver.findElement(By.xpath(cc)).getText();
        assertEquals(result, "gaoji1");

        String aa = "//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[3]//div//div//span[1]";
        String result1 = driver.findElement(By.xpath(aa)).getText();
        assertEquals(result1, "高级版");

        String bb = "//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[3]//div//div//span[2]//span";
        String result2 = driver.findElement(By.xpath(bb)).getText();
        assertEquals(result2, "续费或升级到企业版");

        String dd = "//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[3]//div//div[2]";
        String result3 = driver.findElement(By.xpath(dd)).getText();
        assertEquals(result3, "gaoji1@shimo.im");

    }

    /**
     * 高级版 hover头像 鼠标 hover 到头像上，点击续费
     *
     * @author 陈清杰
     * @Time 2018-01-16
     */
    @Test
    public void hover_person8() {

        login("gaoji1@shimo.im", "123456");
        moveToElement(desktop_user_icon);

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[3]//div//div//span[2]//span//a")));
        driver.findElement(
                By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[3]//div//div//span[2]//span//a"))
                .click();

        switchToPage(1);
        String url = driver.getCurrentUrl();
        assertEquals(url, getURL() + "pricing?renew");

    }

    /**
     * 高级版 hover头像 鼠标 hover 到头像上，点击升级到企业版
     *
     * @author 陈清杰
     * @Time 2018-01-16
     */
    @Test
    public void hover_person9() {

        login("gaoji1@shimo.im", "123456");
        moveToElement(desktop_user_icon);

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[3]//div//div//span[2]//span//a[2]")));
        driver.findElement(
                By.xpath("//ul[contains(@class,'sm-menu sm-menu-vertical')]//li[3]//div//div//span[2]//span//a[2]"))
                .click();

        switchToPage(1);
        String url = driver.getCurrentUrl();
        assertEquals(url, getURL() + "company/register");

    }

    /**
     * 企业试用版 hover头像 鼠标 hover 到头像上
     *
     * @author 陈清杰
     * @Time 2018-01-16
     */
    @Test
    public void hover_person10() {

        login("shiyongtest@shimo.im", "123123");

        moveToElement(desktop_user_icon);
        Boolean r1 = getText(desktop_user_icon_status_L).equals("购买企业版");
        Boolean r2 = getText(desktop_user_icon_status_R).equals("企业版试用中");
        Boolean r4 = getText(desktop_user_icon_companyManagement).equals("企业管理");
        click(desktop_user_icon_status_L);
        switchToPage(1);
        Boolean r3 = driver.getCurrentUrl().equals(getURL() + "enterprise/billing");
        assertTrue(r1 && r2 && r3 && r4);

    }

    /**
     * 高级版过期，hover到头像上
     *
     * @author 陈清杰
     * @Time 2018-01-16
     */
    @Test
    public void hover_person11() {

        login("pijiu@shimo.im", "123123");
        moveToElement(desktop_user_icon);
        Boolean r1 = getText(desktop_user_icon_status_L).equals("基础版");
        Boolean r2 = getText(desktop_user_icon_status_R).equals("续费或升级到企业版");

        assertTrue(r1 && r2);
    }

    /**
     * 企业试用版 hover头像 鼠标 hover 到头像上，点击企业管理
     *
     * @author 陈清杰
     * @Time 2018-01-16
     */
    @Test
    public void hover_person12() {

        login("shiyongtest@shimo.im", "123123");
        moveToElement(desktop_user_icon);
        click(desktop_user_icon_companyManagement);
        Boolean r1 = driver.getCurrentUrl().equals(getURL() + "enterprise/members");
        assertTrue(r1);
    }

    /**
     * 企业版 hover头像 鼠标 hover 到头像上，点击账号设置
     *
     * @author 陈清杰
     * @Time 2018-01-24
     */
    @Test
    public void hover_person13() {

        login("fufei1@shimo.im", "123456");
        moveToElement(desktop_user_icon);
        click(desktop_user_icon_personSetting);

        String url = driver.getCurrentUrl();
        assertEquals(url, getURL() + "profile");

    }

    /**
     * 企业版 hover头像 鼠标 hover 到头像上，点击企业管理
     *
     * @author 陈清杰
     * @Time 2018-01-24
     */
    @Test
    public void hover_person14() {

        login("fufei1@shimo.im", "123456");

        moveToElement(desktop_user_icon);
        click(desktop_user_icon_companyManagement);

        String url = driver.getCurrentUrl();
        assertEquals(url, getURL() + "enterprise/members");
    }

    /**
     * 鼠标 hover 到头像上，点击下载石墨文档app
     *
     * @author 陈清杰
     * @Time 2018-01-24
     */
    @Test(enabled = true)
    public void hover_person15() {

        login("fufei1@shimo.im", "123456");
        moveToElement(desktop_user_icon);

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@data-test='usermenu-container']//ul//li[contains(text(),'下载石墨文档 App')]")));
        WebElement download = driver
                .findElement(By.xpath("//div[@data-test='usermenu-container']//ul//li[contains(text(),'下载石墨文档 App')]"));
        click(download);

        WebElement header = driver.findElement(By.xpath("//div[@class='sm-modal-body']//div//h3"));
        wait.until(ExpectedConditions.visibilityOf(header));
        Boolean r1 = getText(header).equals("扫码下载 石墨文档 App");

        Boolean r2 = driver.findElement(By.xpath("//div[@class='sm-modal-body']//div[1]//img")).getAttribute("src")
                .startsWith("data:image/png;");

        WebElement download_IOS = driver.findElement(By.xpath("//div[@class='sm-modal-body']//div[2]//a[1]"));
        click(download_IOS);
        Boolean r3 = driver.getCurrentUrl()
                .equals("https://itunes.apple.com/cn/app/shi-mo-wen-dang-zui-mei-xie/id1013727678?l=en&mt=8");
        driver.navigate().back();
        assertTrue(r1 && r2 && r3);
    }

    /**
     * 过期企业版 hover头像 鼠标 hover 到头像上
     *
     * @author 陈清杰
     * @Time 2018-01-24
     */
    @Test(enabled = true)
    public void hover_person16() {

        login("monvzhaijibian@morsin.com", "123123");
        moveToElement(desktop_user_icon);

        Boolean r1 = getText(desktop_user_icon_status_L).equals("购买企业版");
        Boolean r2 = getText(desktop_user_icon_status_R).equals("企业版已过期");

        assertTrue(r1 && r2);
    }

    /**
     * 企业成员 hover头像 鼠标 hover 到头像上，显示【我的企业】
     *
     * @author 陈清杰
     * @Time 2018-01-24
     */
    @Test(enabled = true)
    public void hover_person17() {

        login("liuchen@shimo.im", "123123");
        moveToElement(desktop_user_icon);

        Boolean r1 = getText(desktop_user_icon_companyManagement).equals("我的企业");

        assertTrue(r1);
    }

}
