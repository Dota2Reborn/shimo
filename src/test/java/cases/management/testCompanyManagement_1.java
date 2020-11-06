package cases.management;

import base.TestInit;
import com.google.common.base.Preconditions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.TreeMap;

import static org.testng.Assert.*;

public class testCompanyManagement_1 extends TestInit {

    /**
     * 谁能邀请新成员进企业-所有企业成员
     *
     * @author 刘晨
     * @Time 2017-01-08
     */
    @Test(enabled = true)
    public void inviteMember_allMember() {
        login("autoTest_company_1@shimo.im", "123123");
        click(company_Management);
        switchToPage(1);
        click(company_setting);
        click(invite_member);
        click(menu_1);

        logout();
        login("autoTest_company_3@shimo.im", "123123");

        click(desktop_user_icon);
        click(desktop_user_icon_companyManagement);

        wait.until(ExpectedConditions.visibilityOf(b_addMember));
        Boolean clickable = b_addMember.isEnabled();
        assertTrue(clickable);
    }

    /**
     * 谁能邀请新成员进企业-仅企业创建者和管理员
     *
     * @author 刘晨
     * @Time 2017-01-08
     */
    @Test(enabled = true)
    public void inviteMember_ManagerAndCreator() {
        login("autoTest_company_1@shimo.im", "123123");
        click(company_Management);
        switchToPage(1);
        click(company_setting);
        click(invite_member);
        click(menu_2);

        logout();
        login("autoTest_company_3@shimo.im", "123123");

        click(desktop_user_icon);
        click(desktop_user_icon_companyManagement);

        wait.until(ExpectedConditions.visibilityOf(b_addMember));
        Boolean clickable = b_addMember.isEnabled();
        assertFalse(clickable);
    }

    /**
     * 谁能邀请新成员进企业-仅企业创建者
     *
     * @author 刘晨
     * @Time 2017-01-08
     */
    @Test(enabled = true)
    public void inviteMember_JustByCreator() {
        login("autoTest_company_1@shimo.im", "123123");
        click(company_Management);
        switchToPage(1);
        click(company_setting);
        click(invite_member);
        click(menu_3);

        logout();
        login("autoTest_company_2@shimo.im", "123123");

        click(desktop_user_icon);
        click(desktop_user_icon_companyManagement);

        wait.until(ExpectedConditions.visibilityOf(b_addMember));
        Boolean clickable = b_addMember.isEnabled();
        assertFalse(clickable);
    }

    /**
     * 更改企业名称
     *
     * @author 刘晨
     * @Time 2017-01-08
     */
    @Test(enabled = true)
    public void inviteMember_changeCompanyName() {
        String time = getDate();

        login("autoTest_company_1@shimo.im", "123123");
        click(company_Management);
        switchToPage(1);
        click(company_setting);
        click(button_companyName);
        wait.until(ExpectedConditions.elementToBeClickable(message_ok));

        input_companyName.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        input_companyName.sendKeys(Keys.DELETE);
        sendKeys(input_companyName,time);
        click(message_ok);

        wait.until(ExpectedConditions.textToBePresentInElement(text_companyName, time));
        String companyName = getText(text_companyName);

        assertEquals(time, companyName);

    }

    /**
     * 谁能设置管理员-仅企业创建者
     *
     * @author 刘晨
     * @Time 2017-01-08
     */
    @Test(enabled = true)
    public void setManager_Creator() {
        login("autoTest_company_1@shimo.im", "123123");
        click(company_Management);
        switchToPage(1);
        click(company_setting);
        click(setAdmin);
        click(menu_2);

        logout();
        login("autoTest_company_2@shimo.im", "123123");

        click(desktop_user_icon);
        click(desktop_user_icon_companyManagement);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-test='action'])[2]")));
        driver.findElement(By.xpath("(//div[@data-test='action'])[2]")).click();
        Boolean r1 = doesWebElementExist(b_setAdmin);
        assertFalse(r1);
    }

    /**
     * 谁能设置管理员-仅企业创建者和管理者
     *
     * @author 刘晨
     * @Time 2018-03-05
     */
    @Test(enabled = true)
    public void setManager_ManagerAndCreator() {
        login("autoTest_company_1@shimo.im", "123123");
        click(company_Management);
        switchToPage(1);
        click(company_setting);
        click(setAdmin);
        click(menu_1);

        logout();
        login("autoTest_company_2@shimo.im", "123123");

        click(desktop_user_icon);
        click(desktop_user_icon_companyManagement);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-test='action'])[2]")));
        driver.findElement(By.xpath("(//div[@data-test='action'])[2]")).click();
        Boolean r1 = doesWebElementExist(b_setAdmin);
        assertTrue(r1);
    }

    /**
     * 移交企业
     *
     * @author 刘晨
     * @Time 2018-03-06
     */
    @Test(enabled = true)
    public void transferCompany() throws InterruptedException {
        login("autoTest_company_1@shimo.im", "123123");
        click(company_Management);
        switchToPage(1);
        click(company_setting);

        Preconditions.checkArgument(transferCompany.isDisplayed(), "Creater is not panpan");
        click(transferCompany);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'autoTest_company_2@shimo.im')]")));
        driver.findElement(By.xpath("//span[contains(text(),'autoTest_company_2@shimo.im')]")).click();
        click(b_transferCompany_confirm);

        logout();
        login("autoTest_company_2@shimo.im", "123123");
        click(desktop_user_icon);
        click(desktop_user_icon_companyManagement);
        click(company_setting);

        Preconditions.checkArgument(transferCompany.isDisplayed(), "Creater is not panpan");
        click(transferCompany);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'autoTest_company_1@shimo.im')]")));
        driver.findElement(By.xpath("//span[contains(text(),'autoTest_company_1@shimo.im')]")).click();
        click(b_transferCompany_confirm);

    }
}
