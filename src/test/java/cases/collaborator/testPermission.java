package cases.collaborator;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testPermission extends TestInit {
    /**
     * 文件夹添加只评论协作者
     *
     * @author 王继程
     * @Time 2018-03-06
     */
    @Test(enabled = true)
    public void Add_to1() {
        login("testing_1@test.im", "123123");
        click(desktop);
        // 右键第一个文件
        contextClick(desktop1_1_folder);
        click(menu_cooperation);

        sendKeys(input_addCollaborator, "testing_6@test.im");
        click(b_addCollaborator_1_add);

        Modify(2, 2);
        click(Shut_down_sm_modal_close_x);
        logout();
        login("testing_6@test.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        click(desktop1_1);
        click(doc_edit);
        click(ql_comment_Comments);
        String M = getAttribute(doc_discuss_input,"contenteditable");
        assertEquals(M, "true");
        click(quick_access_point);
        click(Back_to_Dashboard);
        contextClick(desktop1_1_folder);
        click(menu_delete);
        click(Exit_share_OK);
    }

    /**
     * 文件夹添加只读协作者
     *
     * @author 王继程
     * @Time 2018-03-06
     */
    @Test(enabled = true)
    public void Add_to2() {
        login("testing_3@test.im", "123123");
        click(desktop);
        // 右键第一个文件
        contextClick(desktop1_1_folder);
        click(menu_cooperation);
        sendKeys(input_addCollaborator, "testing_5@test.im");
        click(b_addCollaborator_1_add);
        Modify(3, 2);
        click(Shut_down_sm_modal_close_x);
        logout();
        login("testing_5@test.im", "123123");
        click(desktop);
        click(desktop1_1_folder);

//        wait.until(ExpectedConditions.elementToBeClickable(addCollaborator_folder_add));
        click(desktop_new);
//        wait.until(ExpectedConditions.attributeContains(desktop_newDoc,"aria-disabled","true"));
        String t = getAttribute(desktop_newDoc,"aria-disabled");
        assertEquals(t, "true");

        click(desktop);
        contextClick(desktop1_1_folder);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
    }


    // 选择权限
    public void Modify(int Permissions, int Several) {
        wait.until(ExpectedConditions.elementToBeClickable(b_addCollaborator));
        if (Permissions == 1) {// 可写
            driver.findElement(
                    By.xpath("//div[@class='sm-modal-body']//div[3]//div[1]//div[" + Several + "]//div[1]//div[1]"))
                    .click();
            click(Can_edit_1);

        } else if (Permissions == 2) {// 只评论
            driver.findElement(
                    By.xpath("//div[@class='sm-modal-body']//div[3]//div[1]//div[" + Several + "]//div[1]//div[1]"))
                    .click();
            click(can_only_comment_2);
        } else if (Permissions == 3) {// 只读
            driver.findElement(
                    By.xpath("//div[@class='sm-modal-body']//div[3]//div[1]//div[" + Several + "]//div[1]//div[1]"))
                    .click();
            click(can_only_read_3);
        }

    }


}
