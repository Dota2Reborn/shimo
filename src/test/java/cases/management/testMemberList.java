package cases.management;

import base.TestInit;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testMemberList extends TestInit {

    /**
     * 邀请成员加入企业，再取消邀请
     *
     * @author 刘晨
     * @Time 2019-11-27
     */
    @Test(enabled = true)
    public void add_delMember() {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);
        click(b_addMember);
        sendKeys(input_addMember, "testEnterprise01@qq.com");
        click(b_confirm_addMember);
//        click(b_close_addMember);
        controlMember("testEnterprise01@qq.com");
        click(b_cancel_invite);

        String msg = getText(toast_msg);
        assertEquals(msg, "成功添加 1 人");

        driver.navigate().refresh();
        Boolean r = checkMember("testEnterprise01@qq.com");
        assertFalse(r);

    }


    /**
     * 邀请加入成员，成员加入企业，再退出企业
     *
     * @author 刘晨
     * @Time 2019-11-28
     */
    @Test(enabled = true)
    public void add_exitMember() throws InterruptedException {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);
        Boolean r = checkMember("testEnterprise02@qq.com");

        if(r){
            controlMember("testEnterprise02@qq.com");
            click(b_delMember);
            click(b_delMember_confirm);
        }

        click(b_addMember);
        sendKeys(input_addMember, "testEnterprise02@qq.com");
        click(b_confirm_addMember);

        logout();
        login("testEnterprise02@qq.com", "123123");

        click(dashboard_notice);
        click(dashboard_notice_list_1_button);
        click(confirmJoinCompany);

        Thread.sleep(1000);
        click(company_setting);
        click(button_exitCompany);
        click(message_ok);

        String msg = getText(toast_msg);
        assertEquals(msg, "操作成功");
    }

    /**
     * 通讯录中禁用成员，在激活成员
     *
     * @author 刘晨
     * @Time 2019-11-28
     */
    @Test(enabled = true)
    public void disableMember() {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);
        controlMember("testEnterprise05@qq.com");
        click(b_delMember);
        click(b_disableMember);
        click(b_delMember_confirm);

        String msg = getText(toast_msg);
        assertEquals(msg, "操作成功");

        click(list_disableMember);
        controlMember("testEnterprise05@qq.com");
        click(b_resetMember);

        msg = getText(toast_msg);
        assertEquals(msg, "操作成功");

        click(list_department_1);

        Boolean r = checkMember("testEnterprise05@qq.com");
        assertTrue(r);

    }


    /**
     * 通讯录为成员设置部门，移出部门
     *
     * @author 刘晨
     * @Time 2019-12-2
     */
    @Test(enabled = true)
    public void setDepartment() throws InterruptedException {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);
        selectMember("testEnterprise04@qq.com");

        click(b_setDepartment);
        click(list_setDepartment_2);
        click(message_ok);
        String msg = getText(toast_msg);
        assertEquals(msg, "添加成功");

        click(list_memberListDepartment_1);
        Thread.sleep(500);
        selectMember("testEnterprise04@qq.com");
        click(b_removeFromDepartment);
        click(message_ok);

        Boolean r = checkMember("testEnterprise04@qq.com");
        assertFalse(r);
    }

    /**
     * 通讯录中成员01只有一个部门，移出部门，提示至少需要一个部门
     *
     * @author 刘晨
     * @Time 2019-12-2
     */
    @Test(enabled = true)
    public void removeMemberFromDepartment() {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);
        selectMember("testEnterprise06@qq.com");
        click(b_removeFromDepartment);
        click(message_ok);

        String msg = getText(toast_msg);
        assertEquals(msg, "成员移出失败，每位成员至少属于一个部门");
    }

    /**
     * 通讯录创建子部门，并删除
     *
     * @author 刘晨
     * @Time 2019-12-2
     */
    @Test(enabled = true)
    public void createDepartment() {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);

        click(list_department_2);
        click(b_addSubDepartment);
        sendKeys(input_subDepartmentName, "新建部门");
        click(message_ok);

        String msg = getText(toast_msg);
        assertEquals(msg, "“新建部门” 创建成功");

        click(list_department_3);
        click(b_setDepartment_3);
        click(b_setting_renameDepartment);
        sendKeys(input_setting_renameDepartment, "待删除部门");
        click(message_ok);
        String name = getText(list_department_3);
        assertEquals(name, "待删除部门");

        click(list_department_3);
        click(b_setDepartment_3);
        click(b_setting_delDepartment);
        click(message_ok);

        msg = getText(toast_msg);
        assertEquals(msg, "删除成功");
    }

    /**
     * 通讯录搜索管理员
     *
     * @author 刘晨
     * @Time 2019-12-2
     */
    @Test(enabled = true)
    public void memberSearch_admin() throws InterruptedException {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);

        sendKeys(memberSearch, "常驻管理员");
        Thread.sleep(200);
        String name = getText(memberList_email_1);
        assertEquals(name, "testEnterprise03@qq.com");

        controlMember("testEnterprise03@qq.com");
        String r1 = getText(b_setMember);
        String r2 = getText(b_delMember);

        assertEquals(r1, "设置为成员");
        assertEquals(r2, "移除成员");

    }

    /**
     * 通讯录搜索成员
     *
     * @author 刘晨
     * @Time 2019-12-2
     */
    @Test(enabled = true)
    public void memberSearch() throws InterruptedException {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);

        sendKeys(memberSearch, "常驻成员");
        Thread.sleep(200);
        String name = getText(memberList_email_1);
        assertEquals(name, "testEnterprise04@qq.com");

        controlMember("testEnterprise04@qq.com");
        String r1 = getText(b_setAdmin);
        String r2 = getText(b_delMember);

        assertEquals(r1, "设置为管理员");
        assertEquals(r2, "移除成员");

    }

    /**
     * 通讯录搜索禁用成员
     *
     * @author 刘晨
     * @Time 2019-12-2
     */
    @Test(enabled = true)
    public void memberSearch_disable() throws InterruptedException {
        login("testEnterprise@qq.com", "123123");
        click(company_Management);
        switchToPage(1);

        sendKeys(memberSearch, "常驻禁用成员");
        Thread.sleep(200);
        String name = getText(memberList_email_1);
        assertEquals(name, "testEnterprise07@qq.com");

        controlMember("testEnterprise07@qq.com");
        String r1 = getText(b_resetMember);
        String r2 = getText(b_handover);

        assertEquals(r1, "重新激活成员");
        assertEquals(r2, "发起交接");

    }

}
