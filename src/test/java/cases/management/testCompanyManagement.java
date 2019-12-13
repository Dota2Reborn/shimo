package cases.management;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testCompanyManagement extends TestInit {

    /**
     * 谁能添加外部协作者-仅企业创建者和管理员
     *
     * @author 刘晨
     * @Time 2018-03-05
     */
    @Test(enabled = true)
    public void addCollaborators_ManagerAndCreator() {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);
        click(company_setting);
        click(button_addCollaborators);
        click(menu_3);

        logout();
        login("testEnterprise04@qq.com", "123123");

        click(desktop);

        contextClick(desktop1_1);
        click(menu_cooperation);
        click(b_addCollaborator);

        sendKeys(input_addCollaborator, "erdan@qq.com");
        String t = getAttribute(b_addCollaborator_1_add,"disabled");
        Boolean R1 = t.equals("true");

        logout();
        login("testEnterprise03@qq.com", "123123");

        click(desktop);

        contextClick(desktop1_1);
        addCollaboratorByEmail("erdan@qq.com", 1);

        String m1 = getText(toast_msg);
        Boolean R2 = m1.equals("二蛋 已添加");

        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);

        assertTrue(R1 && R2);
    }

    /**
     * 谁能添加外部协作者-全体成员
     *
     * @author 刘晨
     * @Time 2018-03-05
     */
    @Test(enabled = true)
    public void addCollaborators_all() {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);
        click(company_setting);
        click(button_addCollaborators);
        click(menu_1);

        logout();
        login("testEnterprise04@qq.com", "123123");

        click(desktop);
        contextClick(desktop1_1);
        addCollaboratorByEmail("erdan@qq.com", 1);

        String m1 = getText(toast_msg);
        Boolean R2 = m1.equals("二蛋 已添加");

        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);

        assertTrue(R2);
    }

    /**
     * 谁能添加外部协作者-所有者，企业创建者和管理员
     *
     * @author 刘晨
     * @Time 2018-03-06
     */
    @Test(enabled = true)
    public void addCollaborators_ownerManagerAndCreator() {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);
        click(company_setting);
        click(button_addCollaborators);
        click(menu_2);

        logout();
        login("testEnterprise06@qq.com", "123123");

        click(desktop);
        contextClick(desktop1_1);
        click(menu_cooperation);
        click(b_addCollaborator);

        sendKeys(input_addCollaborator,"erdan@qq.com");
        Boolean R1 = getAttribute(b_addCollaborator_1_add,"disabled").equalsIgnoreCase("true");

        logout();
        login("testEnterprise04@qq.com", "123123");

        click(desktop);
        contextClick(desktop1_1);
        addCollaboratorByEmail("erdan@qq.com", 1);

        String m1 = getText(toast_msg);
        Boolean R2 = m1.equals("二蛋 已添加");

        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);

        logout();
        login("testEnterprise03@qq.com", "123123");

        click(desktop);

        contextClick(desktop1_1);
        addCollaboratorByEmail("erdan@qq.com", 1);

        String m2 = getText(toast_msg);
        Boolean R3 = m2.equals("二蛋 已添加");

        click(b_addCollaborator_3_list);
        click(list_addCollaborator_4);

        assertTrue(R1 && R2 && R3);
    }

}
