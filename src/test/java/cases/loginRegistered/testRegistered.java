package cases.loginRegistered;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testRegistered extends TestInit {

    /**
     * 用户注册特殊情况输入空昵称
     *
     * @author 王继程
     * @Time 2018-01-09
     */
    @Test(enabled = true)
    public void Registered_1() {
        Registered("", "liuchen123132@shimo.im", "123123", 2, "123123");

        String tishi = driver.findElement(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[4]//div[1]")).getText();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[4]//div[1]")));
        // System.out.println(tishi);
        assertEquals(tishi, "请填写昵称");
    }

    /**
     * 用户注册特殊情况输入包含特殊字符的用户名
     *
     * @author 王继程
     * @Time 2018-01-08
     */
    @Test(enabled = true)
    public void Registered_2() {
        Registered("��都嗨��、齐静��给你��", "qazwsx@qaz.cn", "123123", 2, "123123");
        String tishi = driver.findElement(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[4]//div[1]")).getText();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[4]//div[1]")));
        // System.out.println(tishi);
        assertEquals(tishi, "用户名包含不支持的符号，请检查并重新输入");
    }

    /**
     * 用户注册特殊情况输入空邮箱
     *
     * @author 王继程
     * @Time 2018-01-08
     */
    @Test(enabled = true)
    public void Registered_3() {
        Registered("测试", "", "123123", 2, "123123");
        String tishi = driver.findElement(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]")).getText();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]")));
        // System.out.println(tishi);
        assertEquals(tishi, "请填写邮箱");
    }

    /**
     * 用户注册特殊情况输入空密码
     *
     * @author 王继程
     * @Time 2018-01-08
     */

    @Test(enabled = true)
    public void Registered_4() {
        Registered("测试", "qazwsx@qaz.cn", "", 2, "");
        String tishi = driver.findElement(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[2]//div[1]")).getText();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[2]//div[1]")));
        // System.out.println(tishi);
        assertEquals(tishi, "请填写密码");
        String tishi2 = driver.findElement(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[3]//div[1]")).getText();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[3]//div[1]")));
        assertEquals(tishi2, "请填写确认密码");
    }

    /**
     * 用户注册特殊情况输入3位密码
     *
     * @author 王继程
     * @Time 2018-01-08
     */
    @Test(enabled = true)
    public void Registered_5() {
        Registered("测试", "qazwsx@qaz.cn", "111", 2, "111");
        String tishi = driver.findElement(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[2]//div[1]")).getText();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[2]//div[1]")));
        // System.out.println(tishi);
        assertEquals(tishi, "请填写 6-72 位的密码");
    }

    /**
     * 用户注册特殊情况输入空格开头的密码
     *
     * @author 王继程
     * @Time 2018-01-08
     */
    @Test(enabled = true)
    public void Registered_6() {
        Registered("测试", "qazwsx@qaz.cn", " 111111 ", 2, " 111111 ");
        String tishi = driver.findElement(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[2]//div[1]")).getText();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[2]//div[1]")));
        // System.out.println(tishi);
        assertEquals(tishi, "密码首尾不能有空格");
    }

    /**
     * 用户注册特殊情况输入包含特殊字符密码
     *
     * @author 王继程
     * @Time 2018-01-08
     */
    @Test(enabled = true)
    public void Registered_7() {
        Registered("测试", "1350334784@qq.com", "��都嗨��", 2, "��都嗨��");
        String tishi = driver.findElement(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[2]//div[1]")).getText();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[2]//div[1]")));
        // System.out.println(tishi);
        assertEquals(tishi, "密码包含不支持的特殊符号，请检查并重新输入");

    }

    /**
     * 用户注册特殊情况输入错误邮箱
     *
     * @author 王继程
     * @Time 2018-01-08
     */
    @Test(enabled = true)
    public void Registered_8() {
        Registered("测试", "qazwsx", "123123", 2, "123123");
        String tishi = driver.findElement(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]")).getText();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main']//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]")));
        // System.out.println(tishi);
        assertEquals(tishi, "邮箱格式不正确，请重新输入");

    }

    /**
     * 用户手机号成功注册并注销
     *
     * @author 刘晨
     * @Time 2018-12-05
     */
    @Test
    public void Registered_success() throws InterruptedException {
        //17610101523
        Registered("测试", "17610101523", "123123", 3, "123123");
        click(b_pass);
//        click(b_next);
//        click(b_finish);
        click(desktop_user_icon);
        click(desktop_user_icon_personSetting);
        click(mobile_setting);
        click(mobile_setting_getVerifyCode);
        sendKeys(mobile_setting_verifyCodeInput,"2222");

        click(mobile_setting_confirm);
        Thread.sleep(1000);
        WebElement b_jiebang = driver.findElement(By.xpath("//div[@class='row mobile']/span[@class='action danger']"));
        click(b_jiebang);
        Thread.sleep(11000);
        WebElement b_zhuxiao = driver.findElement(By.xpath("//div[@class='sm-modal-footer']/button[1]"));
        click(b_zhuxiao);
        Boolean r1 = getText(profile_toast).equals("账号注销成功");
        System.out.print(getText(profile_toast));
        assertTrue(r1);
    }

}
