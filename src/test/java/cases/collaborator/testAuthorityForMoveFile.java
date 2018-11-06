package cases.collaborator;

import base.TestInit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class testAuthorityForMoveFile extends TestInit {

    /**
     * 文件夹A所有者移动文件夹内自己创建的文件至一个自己有编辑权限的文件夹B，文件继承文件夹B的协作者
     *
     * @throws InterruptedException
     * @author 刘晨
     * @Time 2018-7-24
     */
    @Test(enabled = true)
    public void authorityForMoveFile_1() throws InterruptedException {
        login("authorityForMoveFile_1_1@shimo.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        click(desktop_new);
        click(desktop_newDoc);
        click(b_back);

        contextClick(desktop1_1);
        click(menu_move);
        click(desktop_moveFolder_back_button);
        Thread.sleep(500);
        click(desktop_moveFolder_list_2);
        click(desktop_moveFolder_button);

        click(folder_backToDesktop);
        click(desktop1_2_folder);

        contextClick(desktop1_1);
        moveToElement(menu_cooperation);

        Boolean r1 = getText(addCollaborator_1_list_userName).equals("authorit... (我)");
        Boolean r2 = getText(addCollaborator_2_list_userName).equals("MoveFile_1_2");
        Boolean r3 = getText(b_addCollaborator_1_list).equals("所有者");
        Boolean r4 = getText(b_addCollaborator_2_list).equals("管理者");

        click(Shut_down_sm_modal_close_x);

        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        assertTrue(r1 && r2 && r3 && r4);

    }

    /**
     * 文件夹A所有者移动文件夹内自己为管理者的文件至一个自己有编辑权限的文件夹B，文件继承文件夹B的协作者
     *
     * @throws InterruptedException
     * @author 刘晨
     * @Time 2018-7-24
     */
    @Test(enabled = false)
    public void authorityForMoveFile_2() {
//		login("authorityForMoveFile_2_1@shimo.im", "123123");
//		click(desktop);
//
//		login("authorityForMoveFile_2_3@shimo.im", "123123");
//
//		login("authorityForMoveFile_2_1@shimo.im", "123123");

    }

    /**
     * 文件夹A管理者移动文件夹内自己为所有的文件至一个自己有编辑权限的文件夹B，文件继承文件夹B的协作者
     *
     * @throws InterruptedException
     * @author 刘晨
     * @Time 2018-7-24
     */
    @Test(enabled = true)
    public void authorityForMoveFile_3() throws InterruptedException {
        login("authorityForMoveFile_3_1@shimo.im", "123123");
        click(desktop);
        click(desktop1_2_folder);
        click(desktop1_1_folder);
        click(desktop_new);
        click(desktop_newDoc);
        click(b_back);

        contextClick(desktop1_1);
        click(menu_move);
        click(desktop_moveFolder_back_button);
        click(desktop_moveFolder_back_button);
        Thread.sleep(500);
        click(desktop_moveFolder_list_1);
        click(desktop_moveFolder_button);

        click(folder_backToDesktop);
        click(desktop1_1_folder);

        contextClick(desktop1_1);
        moveToElement(menu_cooperation);

        Boolean r1 = getText(addCollaborator_1_list_userName).equals("moveFile... (我)");
        Boolean r2 = getText(addCollaborator_2_list_userName).equals("moveFile_3_3");
        Boolean r3 = getText(b_addCollaborator_1_list).equals("所有者");
        Boolean r4 = getText(b_addCollaborator_2_list).equals("管理者");

        click(Shut_down_sm_modal_close_x);

        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        assertTrue(r1 && r2 && r3 && r4);

    }

}
