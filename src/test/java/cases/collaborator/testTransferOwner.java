package cases.collaborator;


import base.TestInit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
//----------------case作废，新的逻辑中没有转让所有者-------------
public class testTransferOwner extends TestInit {

    /**
     * 管理员转移所有权（企业与权限相关88）
     *
     * 此case作废，新需求不允许管理员有转移所有权的能力，2019/9/20
     * @author 陈清杰
     * @Time 2018-07-20
     */
    @Test(enabled = false)
    public void Transfer_1() {
//        login("transfer1@shimo.im", "123123");
//        click(desktop_new);
//        click(desktop_newDoc);
//        String time = getDate();
//        sendKeys(doc_title_input, time);
//        sendKeys(doc_edit, "c");
//        click(b_back);
//        click(desktop);
//        contextClick(desktop1_1);
//        click(menu_cooperation);
//        click(b_addCollaborator);
//        click(addCollaborator_1_add);
//        click(addCollaborator_2_add);
//        click(b_addCollaborator_ok);
//        click(button_addCollaborator_close);
//        logout();
//
//        login("transfer2@shimo.im", "123123");
//        click(desktop);
//        contextClick(desktop1_1);
//        click(menu_cooperation);
//        click(b_addCollaborator_1_list);
//        click(list_addCollaborator_1);
//        click(list_addCollaborator_changeOwner_1);
//        click(b_addCollaborator_confirm);
//        Boolean result1 = getText(addCollaborator_1_list_userName).equals("(我) transfer2");
//        click(Shut_down_sm_modal_close_x);
//        deleteFile();
//        assertTrue(result1);

    }

    @Test
    public void Transfer_2() {
//        login("transfer4@shimo.im", "123123");
//        click(desktop_new);
//        click(desktop_newFolder);
//        String time = getDate();
//        sendKeys(desktop_newFolder_name, time);
//        click(desktop_newFolder_name_ok);
//        click(desktop);
//        contextClick(desktop1_1_folder);
//        click(menu_cooperation);
//        click(b_addCollaborator);
//        click(addCollaborator_company_list);
//        click(addCollaborator_companyList_1_add);
//        click(addCollaborator_companyList_2_add);
//        click(b_addCollaborator_ok);
//        click(button_addCollaborator_close);
//        logout();
//
//        login("transfer6@shimo.im", "123123");
//        click(desktop);
//        click(desktop1_1_folder);
//        click(desktop_new);
//        click(desktop_newDoc);
//        String time1 = getDate();
//        sendKeys(doc_title_input, time1);
//        sendKeys(doc_edit, "c");
//        click(b_back);
//        logout();
//
//        login("transfer4@shimo.im", "123123");
//        click(desktop);
//        contextClick(desktop1_1_folder);
//        click(menu_cooperation);
//        click(b_addCollaborator_1_list);
//        click(list_addCollaborator_1);
//        click(list_addCollaborator_changeOwner_1);
//        click(b_addCollaborator_confirm);
//        click(button_addCollaborator_close);
//        click(desktop1_1_folder);
//        contextClick(desktop1_1);
//        click(menu_cooperation);
//        Boolean result = getText(b_addCollaborator_2_list).equals("管理者");
//        click(Shut_down_sm_modal_close_x);
//        deleteFile();
//
//        assertTrue(result);
    }

}
