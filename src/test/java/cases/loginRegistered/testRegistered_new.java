package cases.loginRegistered;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testRegistered_new extends TestInit {


    /**
     * 验证码为空
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void mobile_Registered_1() {
        Registered_new("", "13911658584", "Ll123123", 1);

        String msg = getText(tips_registered_email);
        assertEquals("请填写验证码", msg);
    }


    /**
     * 用户注册输入错误的验证码
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void mobile_Registered_2() {
        Registered_new("1234", "13911658584", "Ll123123", 1);
        String msg = getText(tips_registered_email);
        assertEquals("验证码不正确，请重新填写", msg);
    }

    /**
     * 用户注册特殊情况输入空手机号
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void mobile_Registered_3() {
        Registered_new("", "", "Ll123123", 1);
        String msg = getText(tips_registered_email);
        assertEquals("请填写手机号", msg);
    }

    /**
     * 用户注册特殊情况输入空密码
     *
     * @author 刘晨
     * @Time 2019-03-21
     */

    @Test(enabled = true)
    public void mobile_Registered_4() {
        Registered_new("2222", "13911658584", "", 1);
        String msg = getText(tips_registered_email);
        assertEquals("密码不能为空", msg);
    }

    /**
     * 用户注册特殊情况输入3位密码
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void mobile_Registered_5() {
        Registered_new("2222", "13911658584", "123", 1);
        String msg = getText(tips_registered_email);
        assertEquals("密码不能少于8位字符", msg);

    }
    /**
     * 用户注册特殊情况输入8位纯数字密码
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void mobile_Registered_8() {
        Registered_new("2222", "13911658584", "12312312", 1);
        String msg = getText(tips_registered_email);
        assertEquals("密码必须包含数字、英文大写字母和小写字母", msg);

    }

    /**
     * 用户注册特殊情况输入空格开头的密码
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void mobile_Registered_6() {
        Registered_new("2222", "13911658584", " 123", 1);
        String msg = getText(tips_registered_email);
        assertEquals("密码首尾不能是空格", msg);
    }

    /**
     * 用户注册特殊情况输入包含特殊字符密码
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void mobile_Registered_7() {
        Registered_new("2222", "13911658584", "��都嗨��", 1);
        String msg = getText(tips_registered_email);
        assertEquals("密码包含不支持的特殊符号", msg);

    }


    /**
     * 用户注册特殊情况输入空昵称
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = false)
    public void email_Registered_1() {
//        Registered_new("", "13911658584", "123123", 2);
//
//        String msg = getText(tips_registered);
//        assertEquals("请填写昵称", msg);
    }

    /**
     * 用户注册特殊情况输入包含特殊字符的用户名
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = false)
    public void email_Registered_2() {

//        Registered_new("��都嗨��、齐静��给你��", "ApexLegendary@shimo.im", "123123", 2);
//        String msg = getText(tips_registered);
//        assertEquals("用户名包含不支持的符号，请检查并重新输入", msg);
    }

    /**
     * 用户注册特殊情况输入空邮箱
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void email_Registered_3() {
        Registered_new("", "", "Ll123123", 2);
        String msg = getText(tips_registered_email);
        assertEquals("请填写邮箱", msg);
    }

    /**
     * 用户注册特殊情况输入空密码
     *
     * @author 刘晨
     * @Time 2019-03-21
     */

    @Test(enabled = true)
    public void email_Registered_4() {
        Registered_new("", "ApexLegendary@shimo.im", "", 2);
        String msg = getText(tips_registered_email);
        assertEquals("密码不能为空", msg);
    }

    /**
     * 用户注册特殊情况输入3位密码
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void email_Registered_5() {
        Registered_new("", "ApexLegendary@shimo.im", "123", 2);
        String msg = getText(tips_registered_email);
        assertEquals("密码不能少于8位字符", msg);

    }

    /**
     * 用户注册特殊情况输入8位数字密码
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void email_Registered_9() {
        Registered_new("", "ApexLegendary@shimo.im", "12312312", 2);
        String msg = getText(tips_registered_email);
        assertEquals("密码必须包含数字、英文大写字母和小写字母", msg);

    }

    /**
     * 用户注册特殊情况输入空格开头的密码
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void email_Registered_6() {
        Registered_new("", "ApexLegendary@shimo.im", " 123", 2);
        String msg = getText(tips_registered_email);
        assertEquals("密码首尾不能是空格", msg);
    }

    /**
     * 用户注册特殊情况输入包含特殊字符密码
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void email_Registered_7() {
        Registered_new("", "ApexLegendary@shimo.im", "��都嗨��", 2);
        String msg = getText(tips_registered_email);
        assertEquals("密码包含不支持的特殊符号", msg);

    }

    /**
     * 用户注册特殊情况输入错误邮箱
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void email_Registered_8() {
        Registered_new("", "123", "Ll123123", 2);
        String msg = getText(tips_registered_email);
        assertEquals("邮箱格式不正确，请重新输入", msg);

    }

    /**
     * 注册输入正确的邮箱和密码，未勾选服务条款
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test(enabled = true)
    public void email_Registered_10() {
        Registered_new("", "ApexLegendary@shimo.im", "Ll123123", 2);
        String msg = getText(driver.findElement(By.xpath("//div[@class='sm-modal-body']")));
        assertEquals("请先同意 服务条款，隐私保护政策，用户行为规范。", msg);

    }

    /**
     * 用户手机号成功注册并注销
     *
     * @author 刘晨
     * @Time 2019-03-21
     */
    @Test
    public void mobile_Registered_success() throws InterruptedException {
        //17610101523
        Registered_new("2222", "17610101523", "Ll123123", 1);

        Thread.sleep(8000);
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
        Boolean r1 = getText(profile_toast).equals("帐号注销成功");
        assertTrue(r1);
    }

}
