package cases.loginRegistered;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class login_error extends TestInit {

    /**
     * 登录 输入不符合格式的邮箱登录
     *
     * @return
     * @author 陈清杰
     * @Time 2018-01-08
     */


    @Test
    public void login_error66() {


        login_error("chenqingjie@", "123123");
        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='tips']"), "邮箱格式不正确，请重新输入"));
        String toast = driver.findElement(By.xpath("//div[@class='tips']")).getText();

        assertEquals(toast, "邮箱格式不正确，请重新输入");

    }

    /**
     * 登录 邮箱输入为空注册
     *
     * @author 陈清杰
     * @Time 2018-01-08
     */

    @Test
    public void login_error0() {


        login_error("", "123123");
        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='tips']"), "请填写手机号或邮箱"));

        String toast = "";
        toast = driver.findElement(By.xpath("//div[@class='tips']")).getText();
        assertEquals(toast, "请填写手机号或邮箱");

    }

	/*
	 * 登录 输入未注册的邮箱登录
	 * 
	 * @author 陈清杰
	 * @Time 2018-01-08
	 *
	 
	@Test
	public void login_error1() throws InterruptedException {
		
		login_error("nizhidaomilandexiaotiejiangma@qq.com", "123123");
		wait.until(ExpectedConditions.textToBe(By.className("error-block"), "用户不存在"));

		String toast = "";
		toast = driver.findElement(By.className("error-block")).getText();
		assertEquals(toast, "用户不存在");
	}*/

    /**
     * 登录 密码输入为空
     * ss
     *
     * @author 陈清杰
     * @Time 2018-01-08
     */
    @Test
    public void login_error2() {


        login_error("chenqingjie@shimo.im", "");
        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='tips']"), "请填写密码"));

        String toast = "";
        toast = driver.findElement(By.xpath("//div[@class='tips']")).getText();
        assertEquals(toast, "请填写密码");

    }

    /**
     * 登录 密码输入为空格
     *
     * @author 陈清杰
     * @Time 2018-01-08
     */

    @Test
    public void login_error3() {


        login_error("chenqingjie@shimo.im", " ");
        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='tips']"), "请填写 6-72 位的密码"));

        String toast = "";
        toast = driver.findElement(By.xpath("//div[@class='tips']")).getText();
        assertEquals(toast, "请填写 6-72 位的密码");
    }

    /**
     * 登录 密码输入错误
     *
     * @author 陈清杰
     * @Time 2018-01-08
     */

    @Test
    public void login_error4() {


        login_error("chenqingjie@shimo.im", "8294854");
        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='tips']"), "密码错误，请重新输入"));

        String toast = "";
        toast = driver.findElement(By.xpath("//div[@class='tips']")).getText();
        assertEquals(toast, "密码错误，请重新输入");
    }

	/*
	 * 登录 密码连续输错
	 * 
	 * @author 陈清杰
	 * @Time 2018-01-09
	 *
	 
	@Test(enabled = false)
	public void login_error5() throws Exception {

		

		login_error("chenqingjie@shimo.im", "777777");
		// wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("error-block"),
		// "密码有误"));

		String msg = driver.findElement(By.className("error-block")).getText();

		for (int n = 0; n < 20; n++) {
			if (msg != "验证码错误") {
				userPwd.sendKeys("03940984");
				login_submit.click();
				msg = driver.findElement(By.className("error-block")).getText();
			} else {
				break;
			}
		}
		Boolean ii = driver.findElement(By.xpath("//div[@class='inline']//div[2]")).isDisplayed();
		assertTrue(ii);

	}*/

}

