package cases.collaborator;


import base.TestInit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class testTransferOwner extends TestInit {

    /**
     * 管理员转移所有权（企业与权限相关88）
     *
     * @author 陈清杰
     * @Time 2018-07-20
     */
    @Test
    public void Transfer_1() throws InterruptedException {
        login("transfer1@shimo.im", "123123");
        click(desktop_new);
        click(desktop_newDoc);
        String time = getDate();
        sendKeys(doc_title_input, time);
        sendKeys(doc_edit, "c");
        click(b_back);
        click(desktop);
        contextClick(desktop1_1);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);
        click(addCollaborator_1_add);
        click(addCollaborator_2_add);
        click(b_addCollaborator_ok);
        click(button_addCollaborator_close);
        logout();

        login("transfer2@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);
        Thread.sleep(300);
        Boolean result1 = getText(addCollaborator_1_list_userName).equals("transfer2 (我)");
        click(Shut_down_sm_modal_close_x);
        deleteFile();
        assertTrue(result1);

    }

    @Test
    public void Transfer_2() throws InterruptedException {
        login("transfer4@shimo.im", "123123");
        click(desktop_new);
        click(desktop_newFolder);
        String time = getDate();
        sendKeys(desktop_newFolder_name, time);
        click(desktop_newFolder_name_ok);
        click(desktop);
        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);
        click(addCollaborator_company_list);
        driver.findElement(By.xpath("//div[@class='sm-tab-content']//div[2]//div//div//div[1]//div//div")).click();
        click(addCollaborator_companyList_2_add);
        click(b_addCollaborator_ok);
        click(button_addCollaborator_close);
        logout();

        login("transfer6@shimo.im", "123123");
        click(desktop);
        click(desktop1_1_folder);
        click(desktop_new);
        click(desktop_newDoc);
        String time1 = getDate();
        sendKeys(doc_title_input, time1);
        sendKeys(doc_edit, "c");
        click(b_back);
        logout();

        login("transfer4@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);
        Thread.sleep(300);
        click(button_addCollaborator_close);
        click(desktop1_1_folder);
        contextClick(desktop1_1);
        moveToElement(menu_cooperation);
        Boolean result = getText(b_addCollaborator_3_list).equals("管理者");
        click(Shut_down_sm_modal_close_x);
        deleteFile();

        assertTrue(result);
    }

}
