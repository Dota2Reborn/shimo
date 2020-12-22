package cases.collaborator;

import base.TestInit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testPermission extends TestInit {
    /**
     * 文件夹添加只评论协作者
     *
     * @author 王继程
     * @Time 2018-03-06
     */
    @Test(enabled = true)
    public void Add_to1() throws InterruptedException {
        login("testing_1@test.im", "123123");
        click(desktop);
        // 右键第一个文件
        contextClick(desktop1_1_folder);

        addCollaboratorByEmail("testing_6@test.im",1);

        contextClick(desktop1_1_folder);
        click(menu_cooperation);
        modifyPermissions(b_add_CollaboratorList_1,"discuss");

        logout();
        login("testing_6@test.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        click(desktop1_1);
        Thread.sleep(1000);
        doc_ui_close();

        click(doc_edit);
        click(ql_comment_Comments);
        String M = getAttribute(doc_discuss_input,"contenteditable");
        assertEquals(M, "true");
        click(quick_access_point);
        click(Back_to_Desktop);

        contextClick(desktop1_1_folder);

        removeCollaboratorByPosition(1);
    }

    /**
     * 文件夹添加只读协作者
     *
     * @author 王继程
     * @Time 2018-03-06
     */
    @Test(enabled = true)
    public void Add_to2() throws InterruptedException {
        login("testing_3@test.im", "123123");
        click(desktop);
        // 右键第一个文件
        contextClick(desktop1_1_folder);
        addCollaboratorByEmail("testing_5@test.im",1);

        contextClick(desktop1_1_folder);
        click(menu_cooperation);
        modifyPermissions(b_add_CollaboratorList_1,"read");

        logout();
        login("testing_5@test.im", "123123");

        click(desktop);
        click(desktop1_1_folder);

        click(desktop_new);
        Boolean r1 = driver.findElement(By.xpath("//p[contains(text(),'抱歉，只有权限为“可以编辑”的协作者能新建文件')]")).isDisplayed();

        click(desktop);
        contextClick(desktop1_1_folder);
        removeCollaboratorByPosition(1);
        assertTrue(r1);

    }

}
