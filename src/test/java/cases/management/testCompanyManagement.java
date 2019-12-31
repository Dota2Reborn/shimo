package cases.management;

import base.TestInit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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
        addCollaboratorByEmail("erdan@qq.com", 1);
        String msg = getText(toast_addCollaborator);
        assertEquals("根据企业设置，你不能添加外部协作者，请联系企业管理员", msg);

        logout();
        login("testEnterprise03@qq.com", "123123");

        click(desktop);

        contextClick(desktop1_1);
        addCollaboratorByEmail("erdan@qq.com", 1);
        String m1 = getText(toast_addCollaborator);

        contextClick(desktop1_1);
        removeCollaboratorByPosition(1);

        assertEquals("二蛋 的权限已修改为「可以编辑」", m1);

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
        String m1 = getText(toast_addCollaborator);

        contextClick(desktop1_1);
        removeCollaboratorByPosition(1);

        assertEquals("二蛋 的权限已修改为「可以编辑」", m1);
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
        addCollaboratorByEmail("erdan@qq.com", 1);
        String msg = getText(toast_addCollaborator);
        assertEquals("根据企业设置，你不能添加外部协作者，请联系企业管理员", msg);

        logout();
        login("testEnterprise04@qq.com", "123123");

        click(desktop);
        contextClick(desktop1_1);
        addCollaboratorByEmail("erdan@qq.com", 1);
        String m1 = getText(toast_addCollaborator);

        contextClick(desktop1_1);
        removeCollaboratorByPosition(1);

        assertEquals("二蛋 的权限已修改为「可以编辑」", m1);

        logout();
        login("testEnterprise03@qq.com", "123123");

        click(desktop);

        contextClick(desktop1_1);
        addCollaboratorByEmail("erdan@qq.com", 1);
        String m2 = getText(toast_addCollaborator);

        contextClick(desktop1_1);
        removeCollaboratorByPosition(1);

        assertEquals("二蛋 的权限已修改为「可以编辑」", m2);

    }

}
