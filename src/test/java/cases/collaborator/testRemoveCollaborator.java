package cases.collaborator;

import base.TestInit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class testRemoveCollaborator extends TestInit {

    /**
     * 在文件中移除协作者（企业与权限相关74）
     *
     * @author 陈清杰
     * @Time 2018-07-16
     */

    @Test
    public void Remove_1() throws InterruptedException {
        login("remove1@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1);
        addCollaboratorByEmail("remove2@shimo.im", 1);

        contextClick(desktop1_1);
        removeCollaboratorByPosition(1);

        contextClick(desktop1_1);
        click(menu_cooperation);
        int count = getCollaboratorSize();
        assertTrue(count == 1);
    }

    /**
     * 所有者在父文件夹下移除协作者（企业与权限相关75）
     *
     * @author 陈清杰
     * @Time 2018-07-17
     */
    @Test
    public void Remove_2() throws InterruptedException {
        login("remove3@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);

        addCollaboratorByEmail("remove2@shimo.im", 1);

        contextClick(desktop1_1_folder);
        removeCollaboratorByPosition(1);

        click(desktop1_1_folder);
        contextClick(desktop1_1);
        click(menu_cooperation);
        int count = getCollaboratorSize();
        assertTrue(count == 1);
    }

    /**
     * 管理员在父文件夹下移除协作者（企业与权限相关75）
     *
     * @author 陈清杰
     * @Time 2018-07-17
     */
    @Test
    public void Remove_3() throws InterruptedException {
        login("remove4@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        addCollaboratorByEmail("remove2@shimo.im", 1);

        contextClick(desktop1_1_folder);
        removeCollaboratorByPosition(1);

        contextClick(desktop1_1_folder);
        click(menu_cooperation);
        int count1 = getCollaboratorSize();
        click(b_spacingCollaborator_close);

        click(desktop1_1_folder);
        contextClick(desktop1_1);
        click(menu_cooperation);
        int count2 = getCollaboratorSize();
        assertEquals(count1,count2);

    }


    /**
     * 文件夹可编辑协作者移除协作者，子文件中自己为任何权限的都可以移除（企业与权限相关78）
     *
     * @author 陈清杰
     * @Time 2018-07-17
     */
    @Test
    public void Remove_5() throws InterruptedException {
        login("remove9@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        removeCollaboratorByPosition(2);

        click(desktop1_1_folder);
        contextClick(desktop1_1);
        click(menu_cooperation);
        int count = getCollaboratorSize();
        click(b_spacingCollaborator_close);
        click(desktop);
        contextClick(desktop1_1_folder);
        addCollaboratorByEmail("remove10@shimo.im", 1);
        assertEquals(count, 2);
    }

    @Test
    public void Remove_7() {
        login("remove9@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_2_folder);
        click(menu_cooperation);
        String t = getAttribute(b_collaboratorsList_1,"data-disabled");
        assertEquals(t, "true");
    }
}