package cases.collaborator;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testAuthorityForAddCollaborator extends TestInit {

    /**
     * 企业管理员被添加为协作者，在协作者列表显示为管理者
     *
     * @author 刘晨
     * @Time 2018-6-27
     */
    @Test(enabled = true)
    public void authorityForAddCollaborator_1() {
        login("0000000@qq.com", "123123");
        click(desktop);
        contextClick(desktop1_1);
        addCollaboratorByEmail("pipi@qq.com");

        click(b_addCollaborator_2_list);
        String msg = getText(Can_edit_1);
        click(list_addCollaborator_4);

        assertEquals(msg, "管理者");
    }

    /**
     * 企业创建者被添加为协作者，在协作者列表显示为管理者
     *
     * @author 刘晨
     * @Time 2018-6-27
     */
    @Test(enabled = true)
    public void authorityForAddCollaborator_2() {
        login("0000000@qq.com", "123123");
        click(desktop);
        contextClick(desktop1_1);
        addCollaboratorByEmail("panpan@qq.com");

        click(b_addCollaborator_2_list);
        String msg = getText(Can_edit_1);
        click(list_addCollaborator_4);

        assertEquals(msg, "管理者");
    }

    /**
     * 父文件夹为编辑权限，子文件中为可评论/可阅读
     *
     * @author 刘晨
     * @Time 2018-7-2
     */
    @Test(enabled = true)
    public void authorityForAddCollaborator_3() {
        login("AddCollaborator_01@shimo.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        contextClick(desktop1_1);
        click(menu_cooperation);

        click(b_addCollaborator_2_list);
        click(can_only_comment_2);
//        Thread.sleep(200);
        String msg = getText(b_addCollaborator_2_list);

        click(b_addCollaborator_2_list);
        click(Can_edit_1);

        assertEquals(msg, "只能评论");
    }

    /**
     * 文件夹协作者权限为可编辑的用户，为文件夹添加协作者，只会对文件夹中自己权限为可编辑的添加协作者
     *
     * @author 刘晨
     * @Time 2018-7-3
     */
    @Test(enabled = true)
    public void authorityForAddCollaborator_4() {
        login("AddCollaborator_02@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        addCollaboratorByEmail("liuchen@shimo.im");
        click(Shut_down_sm_modal_close_x);

        click(desktop1_1_folder);
        contextClick(desktop1_1);
        click(menu_cooperation);
        int result1 = getCollaboratorSize();//获取协作者数量
        click(Shut_down_sm_modal_close_x);
        contextClick(desktop1_2);
        click(menu_cooperation);
        int result2 = getCollaboratorSize();//获取协作者数量
        click(Shut_down_sm_modal_close_x);

        click(Folder_settings);
        removeCollaboratorByPosition(3);

        assertEquals(result2, result1 + 1);
    }

    /**
     * 文件夹协作者权限为只读的用户，为文件夹添加协作者，不能添加
     *
     * @author 刘晨
     * @Time 2018-7-3
     */
    @Test(enabled = true)
    public void authorityForAddCollaborator_5() {
        login("AddCollaborator_02@shimo.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        contextClick(desktop1_1_folder);

        click(menu_cooperation);
        String t = b_addCollaborator.getAttribute("disabled");
        assertEquals(t, "true");
    }

    /**
     * 文件夹协作者权限为只读的用户，右键菜单添加协作者，公开分享，重命名和移动置灰
     *
     * @author 刘晨
     * @Time 2018-7-3
     */
    @Test(enabled = true)
    public void authorityForAddCollaborator_6() {
        login("AddCollaborator_02@shimo.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        click(desktop1_1_folder);
        contextClick(desktop1_1);

        Boolean r1 = getAttribute(menu_rename,"disabled").equals("true");
        Boolean r2 = getAttribute(menu_move,"disabled").equals("true");

        moveToElement(menu_share);
        click(menu_share_1);

        Boolean r3 = getText(toast_msg).equals("根据企业设置，你没有权限修改公开链接，请联系文件所有者或企业管理员");
        wait.until(ExpectedConditions.visibilityOf(menu_cooperation));
        click(menu_cooperation);
        Boolean r4 = getAttribute(b_addCollaborator, "disabled").equals("true");
        assertTrue(r1 && r2 && r3 && r4);
    }

    /**
     * 协作者被添加为文件协作者（文件出现在协作者桌面），然后被添加为该文件夹父文件夹的协作者（文件在协作者桌面消失出现在共享文件夹中）
     *
     * @author 刘晨
     * @Time 2018-7-3
     */
    @Test(enabled = true)
    public void authorityForAddCollaborator_7() {
        login("AddCollaborator_04_1@shimo.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        String file_name = getText(desktop1_1_name);
        contextClick(desktop1_1);
        addCollaboratorByEmail("AddCollaborator_04_2@shimo.im");

        logout();
        login("AddCollaborator_04_2@shimo.im", "123123");
        click(desktop);

        Boolean r1 = getText(desktop1_1_name).equals(file_name);

        logout();
        login("AddCollaborator_04_1@shimo.im", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        addCollaboratorByEmail("AddCollaborator_04_2@shimo.im");

        logout();
        login("AddCollaborator_04_2@shimo.im", "123123");
        click(desktop);

        Boolean r2 = getText(desktop1_1_folder).equals("test");
        Boolean r3 = doesWebElementExist(desktop1_2);

        click(desktop1_1_folder);
        Boolean r4 = getText(desktop1_1_name).equals(file_name);

        click(desktop);
        contextClick(desktop1_1_folder);
        removeCollaboratorByPosition(2);

        assertTrue(r1 && r2 && r3 && r4);
    }
}
