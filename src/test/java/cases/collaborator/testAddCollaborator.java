package cases.collaborator;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testAddCollaborator extends TestInit {

    /**
     * 基础版用户，文件协作者为15人，不能继续添加协作者
     *
     * @author 刘晨
     * @Time 2017-11-22
     */
    @Test(enabled = true)
    public void addCollaborator_1() {
        login("jcbyh@shimo.im", "123123");

        click(desktop);
        contextClick(desktop1_1);
        click(menu_cooperation);

        wait.until(ExpectedConditions.elementToBeClickable(b_addCollaborator_2_list));
        Boolean exist = b_addCollaborator.isEnabled();

        assertFalse(exist);

    }

    /**
     * 通过输入邮箱地址添加协作者，并且在协作者列表中移除该协作者
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    @Test(enabled = true)
    public void addCollaborator_2() {
        login("folder_addCollaborat@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        addCollaboratorByEmail("11@cc.ccc");


        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);

    }

    /**
     * 通过【最近】列表中的第一个添加为协作者
     *
     * @author 刘晨
     * @Time 2017-11-29
     */
    @Test(enabled = true)
    public void addCollaborator_3() {
        login("autoTest01@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);

        click(menu_cooperation);
        click(b_addCollaborator);
        click(addCollaborator_1_add);
        click(b_addCollaborator_ok);

        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);
    }

    /**
     * 通过【企业成员】列表中的第二个添加为协作者
     *
     * @author 刘晨
     * @Time 2017-11-29
     */
    @Test(enabled = true)
    public void addCollaborator_4() {
        login("autoTest01@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        click(menu_cooperation);

        click(b_addCollaborator);
        click(addCollaborator_company_list);
        click(addCollaborator_companyList_2_add);
        click(b_addCollaborator_ok);

        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);

    }

    /**
     * 点击协作者列表中添加协作者之后，不点击确定，点击返回，协作者不会被添加
     *
     * @author 刘晨
     * @Time 2017-11-29
     */
    @Test(enabled = true)
    public void addCollaborator_5() {
        login("autoTest01@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        click(menu_cooperation);
        click(b_addCollaborator);
        click(addCollaborator_1_add);
        click(b_addCollaborator_back);
    }

    /**
     * 协作者在协作者列表中移除自己
     *
     * @author 刘晨
     * @Time 2017-12-01
     */
    @Test(enabled = true)
    public void addCollaborator_6() {
        login("autoTest01@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        addCollaboratorByEmail("autoTest04@shimo.im");

        logout();
        login("autoTest04@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        removeCollaboratorByPosition(2);
        String fileName = getText(desktop1_1_folder);
        assertNotEquals(fileName, "测试文件夹");
    }

    /**
     * 作为协作者添加协作者
     *
     * @author 刘晨
     * @Time 2017-12-01
     */
    @Test(enabled = true)
    public void addCollaborator_7() {
        login("autoTest03@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        addCollaboratorByEmail("autoTest04@shimo.im");

        logout();
        login("autoTest04@shimo.im", "123123");

        click(desktop);
        contextClick(desktop1_1_folder);
        removeCollaboratorByPosition(2);

        String toast = getText(toast_msg);
        assertEquals(toast, "你已退出协作「内部协作者」");
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

        contextClick(desktop1_3_folder);
        click(menu_cooperation);
        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);
//        Thread.sleep(500);

        logout();
        login("autoTest03@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        click(menu_cooperation);
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
    public void addCollaborator_9() {
        login("folder_addCollaborat@shimo.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        click(Folder_settings);
        addCollaboratorByEmail("11@cc.ccc");

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
        click(menu_cooperation);
        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);

//        Thread.sleep(500);

        logout();
        login("autoTest_addCollabor@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        click(menu_cooperation);
        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);
        Thread.sleep(500);
        String email = getText(addCollaborator_1_list_userName);
        assertEquals(email, "autoTest01");
    }

    /**
     * 当前非席位企业成员，任何情况下都不能新建
     *
     * @author 刘晨
     * @Time 2017-12-07
     */
    @Test(enabled = true)
    public void addCollaborator_fail() {
        login("autoTest10@shimo.im", "123123");
        click(desktop);
        click(desktop_new);

        String msg = "非企业席位成员，不能新建文件或文件夹，请联系企业创建者或直接购买席位。";
        Boolean r = getText(By.xpath("//div[@class='sm-tooltip-inner']/div/p")).equals(msg);
        assertTrue(r);
    }

}
