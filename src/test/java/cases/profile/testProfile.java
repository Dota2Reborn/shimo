package cases.profile;

import base.TestInit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class testProfile extends TestInit {

    /**
     * 绑定手机号，完整输入手机号，获取短信验证码按钮至可以点击的状态
     *
     * @author 刘晨
     * @Time 2019-09-25
     */
    @Test
    public void profile_mobile_1() {
        login("liuchen@shimo.im", "123123");
        moveToElement(desktop_user_icon);
        click(desktop_user_icon_personSetting);
        click(mobile_setting);
        sendKeys(mobile_setting_input, "13911658584");
        Boolean r1 = mobile_setting_getVerifyCode.getAttribute("class").equals("button btn-code");

        assertTrue(r1);
    }

    /**
     * 绑定手机号，完整输入手机号，不点获取验证码输入任意验证码，点击绑定手机号，提示“验证码已失效”
     *
     * @author 刘晨
     * @Time 2019-09-25
     */
    @Test
    public void profile_mobile_2() {
        login("liuchen@shimo.im", "123123");
        moveToElement(desktop_user_icon);
        click(desktop_user_icon_personSetting);
        click(mobile_setting);
        sendKeys(mobile_setting_input, "13614641612");
        sendKeys(mobile_setting_verifyCodeInput, "2222");
        click(mobile_setting_confirm);
        Boolean r1 = getText(profile_toast).equals("验证码不正确，请重新填写");
        Boolean r2 = getText(profile_toast).equals("验证码已失效");
        assertTrue(r1 || r2);
    }
}
