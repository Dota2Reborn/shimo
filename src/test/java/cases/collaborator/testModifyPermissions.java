package cases.collaborator;

import base.TestInit;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testModifyPermissions extends TestInit {

    /**
     * 父文件夹管理员修改子文件中可编辑协作者user a的权限
     *
     * @author 陈清杰
     * @Time 2018-07-20
     */
    @Test
    public void Modify_1() throws InterruptedException {

        login("modify2@shimo.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        contextClick(desktop1_1);
        click(menu_cooperation);
        modifyPermissions(b_add_CollaboratorList_2, "discuss");
        Thread.sleep(200);
        Boolean result = getText(b_add_CollaboratorList_2).equals("只能评论");
        assertTrue(result);
        modifyPermissions(b_add_CollaboratorList_2, "edit");
        click(b_spacingCollaborator_close);

    }

    /**
     * 修改子文件中管理者user a的权限，不能修改
     *
     * -----》新的逻辑，取消企业创建者/管理员在桌面文件协作者列表为管理者《--------
     * @author 陈清杰
     * @Time 2018-07-20
     */
    @Test(enabled = false)
    public void Modify_2() {
//        login("modify1@shimo.im", "123123");
//        click(desktop);
//        click(desktop1_1_folder);
//        contextClick(desktop1_1);
//        click(menu_cooperation);
//        click(b_addCollaborator_3_list);
//        Boolean result = getText(Can_edit_1).equals("可以编辑");
//        assertFalse(result);

    }

    /**
     * 修改父文件夹中user a的权限，子文件同步修改
     *
     * @author 陈清杰
     * @Time 2018-07-20
     */
    @Test
    public void Modify_3() {
        login("modify4@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        click(menu_cooperation);
        modifyPermissions(b_add_CollaboratorList_1, "read");
        click(b_spacingCollaborator_close);
        click(desktop1_1_folder);
        contextClick(desktop1_1);
        click(menu_cooperation);
        click(b_checkParent);
        Boolean result = getText(list_parentPermissions_1).equals("只能阅读");
        assertTrue(result);
        click(b_spacingCollaborator_close);

        click(desktop);
        contextClick(desktop1_1_folder);
        click(menu_cooperation);
        modifyPermissions(b_add_CollaboratorList_1, "edit");
        click(b_spacingCollaborator_close);

    }

    /**
     * 修改父文件夹中user a的权限，子文件同步修改但跳过user a为管理者的文件
     *
     * @author 陈清杰
     * @Time 2018-07-20
     */
    @Test
    public void Modify_4() {
        login("modify6@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        click(menu_cooperation);
        modifyPermissions(b_add_CollaboratorList_1, "read");
        click(b_spacingCollaborator_close);
        click(desktop1_1_folder);
        contextClick(desktop1_2);
        click(menu_cooperation);
        Boolean result = getText(name_adminList_1).equals("(我) modify6");
        assertTrue(result);
        click(b_spacingCollaborator_close);
        click(desktop);
        contextClick(desktop1_1_folder);
        click(menu_cooperation);
        modifyPermissions(b_add_CollaboratorList_1, "edit");
    }

    /**
     * 可编辑操作者修改父文件夹中user a的权限，子文件同步修改但跳过操作者为可编辑以外的
     *
     * ------------由于继承的逻辑变更，此用例作废---------------------
     *
     *
     * @author 陈清杰
     * @Time 2018-07-20
     */
    @Test(enabled = false)
    public void Modify_5() {
//        login("modify9@shimo.im", "123456");
//        click(desktop);
//        contextClick(desktop1_1_folder);
//        click(menu_cooperation);
//        click(b_addCollaborator_3_list);
//        click(can_only_comment_2);
//        click(button_addCollaborator_close);
//        click(desktop1_1_folder);
//        contextClick(desktop1_1);
//        click(menu_cooperation);
//        Boolean result = getText(b_addCollaborator_3_list).equals("可以编辑");
//        assertTrue(result);
//        click(button_addCollaborator_close);
//        click(desktop);
//        contextClick(desktop1_1_folder);
//        click(menu_cooperation);
//        click(b_addCollaborator_3_list);
//        click(Can_edit_1);
//        click(button_addCollaborator_close);
    }

    /**
     * 可编辑操作者修改父文件夹中user a的权限，子文件保持user a所有者身份（企业与权限相关86）
     *
     * ------------此用例作废---------------------
     *
     * @author 陈清杰
     * @Time 2018-07-20
     */
    @Test(enabled = false)
    public void Modify_6() {
//        login("modify9@shimo.im", "123456");
//        click(desktop);
//        contextClick(desktop1_1_folder);
//        click(menu_cooperation);
//        click(b_addCollaborator_3_list);
//        click(can_only_read_3);
//        click(button_addCollaborator_close);
//        click(desktop1_1_folder);
//        contextClick(desktop1_2);
//        click(menu_cooperation);
//        Boolean result = getText(b_addCollaborator_1_list).equals("所有者");
//        assertTrue(result);
//        click(button_addCollaborator_close);
//        click(desktop);
//        contextClick(desktop1_1_folder);
//        click(menu_cooperation);
//        click(b_addCollaborator_3_list);
//        click(Can_edit_1);
//        click(button_addCollaborator_close);
    }

    /**
     * 只读协作者修改父文件夹中user a的权限，无法修改（企业与权限相关87）
     *
     * @author 陈清杰
     * @Time 2018-07-20
     */

    @Test
    public void Modify_7() {
        login("modify11@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        click(menu_cooperation);
        String t = getAttribute(b_collaboratorsList_1,"data-disabled");
        assertEquals(t, "true");

    }

}
