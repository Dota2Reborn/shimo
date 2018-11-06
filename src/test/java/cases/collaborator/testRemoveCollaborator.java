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
    public void Remove_1() {
        login("remove1@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);
        click(addCollaborator_1_add);
        click(b_addCollaborator_ok);
        click(button_addCollaborator_close);

        contextClick(desktop1_1);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);
        click(button_addCollaborator_close);

        contextClick(desktop1_1);
        moveToElement(menu_cooperation);
        Boolean result1 = getText(addCollaborator_total).equals("1 人协作");
        assertTrue(result1);


    }

    /**
     * 所有者在父文件夹下移除协作者（企业与权限相关75）
     *
     * @author 陈清杰
     * @Time 2018-07-17
     */
    @Test
    public void Remove_2() {
        login("remove3@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);
        click(addCollaborator_1_add);
        click(b_addCollaborator_ok);
        click(button_addCollaborator_close);

        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);
        click(button_addCollaborator_close);

        click(desktop1_1_folder);
        contextClick(desktop1_1);
        moveToElement(menu_cooperation);
        Boolean result1 = getText(addCollaborator_total).equals("1 人协作");
        assertTrue(result1);


    }

    /**
     * 管理员在父文件夹下移除协作者（企业与权限相关75）
     *
     * @author 陈清杰
     * @Time 2018-07-17
     */
    @Test
    public void Remove_3() {
        login("remove4@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);
        sendKeys(input_addCollaborator, "remove2@shimo.im");
        click(b_addCollaborator_1_add);
        click(b_addCollaborator_ok);
        click(button_addCollaborator_close);

        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);
        Boolean result1 = getText(addCollaborator_total).equals("2 人协作");
        click(button_addCollaborator_close);


        click(desktop1_1_folder);
        contextClick(desktop1_1);
        moveToElement(menu_cooperation);
        Boolean result2 = getText(addCollaborator_total).equals("2 人协作");
        assertTrue(result1 && result2);

    }
	 
	 /*
		 * 在父文件夹下移除协作者，跳过子文件所有者（企业与权限相关76）
		 * 
		 * @author 陈清杰
		 * @Time 2018-07-18
		 
	 
	 @Test
	 public void  Remove_4() throws InterruptedException{
		 login("remove6@shimo.im", "123123");
		 click(desktop);
		 contextClick(desktop1_1_folder);
		 moveToElement(menu_cooperation);
		 click(button_addCollaborator);
		 click(addCollaborator_1_add);
		 click(b_addCollaborator_ok);
		 click(button_addCollaborator_close);
		 logout();
		 
		 login("remove7@shimo.im","123123");
		 click(desktop);
		 click(desktop1_1_folder);
		 click(desktop_new);
		 click(desktop_newDoc);
		 String time = getDate();
		 sendKeys(doc_title_input, time);
		 logout();
		 
		 login("remove6@shimo.im", "123123");
		 click(desktop);
		 contextClick(desktop1_1_folder);
		 moveToElement(menu_cooperation);
		 click(b_addCollaborator_2_list);
		 click(list_addCollaborator_4);
		 click(list_addCollaborator_4_ok);
		 logout();
		 
		 login("remove7@shimo.im", "123123");
		 click(desktop);
		 
		 
		 }*/

    /**
     * 文件夹可编辑协作者移除协作者，子文件中自己为可编辑权限的可以移除（企业与权限相关78）
     *
     * @author 陈清杰
     * @Time 2018-07-17
     */
    @Test
    public void Remove_5() {
        login("remove9@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(b_addCollaborator_3_list);
        click(list_addCollaborator_4);
        click(button_addCollaborator_close);

        click(desktop1_1_folder);
        contextClick(desktop1_1);
        moveToElement(menu_cooperation);
        Boolean result1 = getText(addCollaborator_total).equals("3 人协作");
        click(button_addCollaborator_close);
        click(desktop);
        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);
        click(addCollaborator_1_add);
        click(b_addCollaborator_ok);
        click(button_addCollaborator_close);
        assertTrue(result1);


    }

//    /**
//     * 文件夹可编辑协作者移除协作者，子文件中自己为所有者的文件跳过（企业与权限相关79）
//     *
//     * @author 陈清杰
//     * @Time 2018-07-17
//     */
//
//
//    @Test
//    public void Remove_6() {
//
//    }

    @Test
    public void Remove_7() {
        login("remove9@shimo.im", "123123");
        click(desktop);
        contextClick(desktop1_2_folder);
        moveToElement(menu_cooperation);
        String t = b_addCollaborator_3_list.getAttribute("disabled");
        assertEquals(t, "true");


    }


}





















