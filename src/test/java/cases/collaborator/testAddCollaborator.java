package cases.collaborator;

import base.TestInit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testAddCollaborator extends TestInit {

    /**
     * 基础版用户，文件协作者为5人，不能继续添加协作者
     *
     * @author 刘晨
     * @Time 2017-11-22
     */
    @Test(enabled = true)
    public void addCollaborator_1() {
        login("autoTest01@shimo.im", "123123");

        click(desktop);
        contextClick(desktop1_1);
        moveToElement(menu_cooperation);

        wait.until(ExpectedConditions.elementToBeClickable(b_addCollaborator_2_list));
        Boolean exist = button_addCollaborator.isEnabled();

        assertFalse(exist);

    }

    /**
     * 通过输入邮箱地址添加协作者，并且在协作者列表中移除该协作者
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    @Test(enabled = true)
    public void addCollaborator_2() throws InterruptedException {
        login("folder_addCollaborat@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);

        String msg_a = getText(addCollaborator_total);
        click(button_addCollaborator);

        sendKeys(input_addCollaborator, "11@cc.ccc");
        Thread.sleep(500);
        click(b_addCollaborator_1_add);
        click(b_addCollaborator_ok);

        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);

        Thread.sleep(500);
        String msg_b = getText(addCollaborator_total);

        assertEquals(msg_a, msg_b);
    }

    /**
     * 通过【最近】列表中的第一个添加为协作者
     *
     * @author 刘晨
     * @Time 2017-11-29
     */
    @Test(enabled = true)
    public void addCollaborator_3() throws InterruptedException {
        login("autoTest01@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);

        String msg_a = getText(addCollaborator_total);
        click(button_addCollaborator);
        click(addCollaborator_1_add);
        click(b_addCollaborator_ok);

        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);

        Thread.sleep(500);
        String msg_b = getText(addCollaborator_total);

        assertEquals(msg_a, msg_b);
    }

    /**
     * 通过【企业成员】列表中的第二个添加为协作者
     *
     * @author 刘晨
     * @Time 2017-11-29
     */
    @Test(enabled = true)
    public void addCollaborator_4() throws InterruptedException {
        login("autoTest01@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);

        String msg_a = getText(addCollaborator_total);
        click(button_addCollaborator);
        click(addCollaborator_company_list);
        click(addCollaborator_companyList_2_add);
        click(b_addCollaborator_ok);

        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);

        Thread.sleep(500);
        String msg_b = getText(addCollaborator_total);

        assertEquals(msg_a, msg_b);
    }

    /**
     * 点击协作者列表中添加协作者之后，不点击确定，点击返回，协作者不会被添加
     *
     * @author 刘晨
     * @Time 2017-11-29
     */
    @Test(enabled = true)
    public void addCollaborator_5() throws InterruptedException {
        login("autoTest01@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        String msg_a = getText(addCollaborator_total);
        click(button_addCollaborator);
        click(addCollaborator_1_add);
        click(b_addCollaborator_back);
        Thread.sleep(500);
        String msg_b = getText(addCollaborator_total);
        assertEquals(msg_a, msg_b);
    }

    /**
     * 协作者在协作者列表中移除自己
     *
     * @author 刘晨
     * @Time 2017-12-01
     */
    @Test(enabled = true)
    public void addCollaborator_6() throws InterruptedException {
        login("autoTest01@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);
        sendKeys(input_addCollaborator, "autoTest04@shimo.im");
        Thread.sleep(500);
        click(b_addCollaborator_1_add);
        click(b_addCollaborator_ok);

        logout();
        login("autoTest04@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);
//		click(b_addCollaborator_confirm);
        Thread.sleep(500);
        String fileName = getText(desktop1_1_folder);
        assertNotEquals(fileName, "添加协作者测试");
    }

    /**
     * 作为协作者添加协作者
     *
     * @author 刘晨
     * @Time 2017-12-01
     */
    @Test(enabled = true)
    public void addCollaborator_7() throws InterruptedException {
        login("autoTest03@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);

        sendKeys(input_addCollaborator, "autoTest04@shimo.im");
        Thread.sleep(500);
        click(b_addCollaborator_1_add);
        click(b_addCollaborator_ok);

        logout();
        login("autoTest04@shimo.im", "123123");

        click(desktop);

        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);
//		click(b_addCollaborator_confirm);

        Thread.sleep(500);
        String fileName = desktop1_1_folder.getText();
        assertNotEquals(fileName, "添加协作者测试");
    }

    /**
     * 企业成员之间转让所有权
     *
     * @author 刘晨
     * @Time 2017-12-01
     */
    @Test(enabled = true)
    public void addCollaborator_8() throws InterruptedException {
        login("autoTest01@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);
        Thread.sleep(500);

        logout();
        login("autoTest03@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);

        Thread.sleep(500);
        String email = getText(addCollaborator_1_list_userName);
        assertEquals(email, "autoTest01");
    }

    /**
     * 通过文件夹右侧添加协作者
     *
     * @author 刘晨
     * @Time 2017-12-07
     */
    @Test(enabled = true)
    public void addCollaborator_9() throws InterruptedException {
        login("folder_addCollaborat@shimo.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        click(addCollaborator_folder_add);

        sendKeys(input_addCollaborator, "11@cc.ccc");

        Thread.sleep(500);
        click(b_addCollaborator_1_add);
        click(b_addCollaborator_ok);

        String username = getText(addCollaborator_2_list_userName);
        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);

        assertEquals(username, "李磊");

    }

    /**
     * 非企业成员之间转让所有权
     *
     * @author 刘晨
     * @Time 2017-12-07
     */
    @Test(enabled = true)
    public void addCollaborator_10() throws InterruptedException {
        login("autoTest01@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_2_folder);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);

        Thread.sleep(500);

        logout();
        login("autoTest_addCollabor@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);
        Thread.sleep(500);
        String email = getText(addCollaborator_1_list_userName);
        assertEquals(email, "autoTest01");
    }

    /**
     * 非席位成员，在5个人以上协作者文件夹中不能新建
     *
     * @author 刘晨
     * @Time 2017-12-07
     */
    @Test(enabled = true)
    public void addCollaborator_fail() throws InterruptedException {
        login("autoTest10@shimo.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        String t = desktop_new.getAttribute("disabled");

        assertEquals(t, "true");
    }

}
