package cases.space;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class testSpacePermissions  extends TestInit {
    /**
     * 空间创建者对于空间的操作  编号72、80、76
     * 为空间添加席位成员/为空间移除席位成员/修改权限
     * @author 陈清杰
     * @Time 2019-01-04
     *
     */

    @Test
    public  void testSpacePermission_0() throws InterruptedException {

        login("qq0@qq.qqqq", "123123");
        moveToElement(space_listing_2);
        click(b_SpaceSetting2);
        click(b_SpaceSetting_collaboration);

        sendKeys(input_add_Collaborator,"qq2@qq.qqq");
        Thread.sleep(500);

        click(b_add_CollaboratorList_1);
        click(cpList_edit);

        String msg = getText(toast_addCollaborator);
        assertEquals(msg ,"qq2 的权限已修改为「可以编辑」");

        click(b_collaborator_Back);
        click(b_collaboratorsList_1);
        click(cpList_onlyDiscuss);
        Thread.sleep(500);


        String msg1 = getText(b_add_CollaboratorList_1);
        assertEquals(msg1 ,"只能评论");

        click(b_collaboratorsList_1);
        click(cpList_remove);

        String msg2 = getText(toast_addCollaborator);
        assertEquals(msg2 ,"qq2 的权限已移除");

    }


    /**
     * 空间创建者对于空间的操作  编号74、82、78
     * 为空间添加外部协作者/为空间移除外部协作者/修改权限
     * @author 陈清杰
     * @Time 2019-01-08
     *
     */
    @Test
    public  void  testSpacePermission_2() throws InterruptedException {
        login("qq0@qq.qqqq", "123123");
        moveToElement(space_listing_4);
        click(b_SpaceSetting4);
        click(b_SpaceSetting_collaboration);

        sendKeys(input_add_Collaborator,"qq4@qq.qqq");
        Thread.sleep(800);

        click(b_add_CollaboratorList_1);
        click(cpList_edit);

        String msg = getText(toast_addCollaborator);
        assertEquals(msg ,"qq4 的权限已修改为「可以编辑」");

        click(b_collaborator_Back);
        click(b_collaboratorsList_1);
        click(cpList_onlyDiscuss);

        Thread.sleep(500);

        String msg1 = getText(b_add_CollaboratorList_1);
        assertEquals(msg1 ,"只能评论");

        click(b_collaboratorsList_1);
        click(cpList_remove);

        String msg2 = getText(toast_addCollaborator);
        assertEquals(msg2 ,"qq4 的权限已移除");
    }


    /**
     * 空间创建者对于空间的操作  编号75、83、79
     * 为空间添加部门「研发」/为空间移除部门「研发」/修改权限
     * @author 陈清杰
     * @Time 2019-01-08
     *
     */
    @Test
    public  void  testSpacePermission_3() throws InterruptedException {
        login("qq0@qq.qqqq","123123");
        moveToElement(space_listing_5);
        click(b_SpaceSetting5);
        click(b_SpaceSetting_collaboration);


        click(b_add_Collaborator);
        click(tabs_organization);
        click(b_department_2);
        click(cpList_edit);
        click(b_spacingCollaborator_removeAdmin_confirm);

        String msg = getText(toast_addCollaborator);
        assertEquals(msg ,"研发 的权限已修改为「可以编辑」");

        click(b_collaborator_Back);
//        click(tabs_collaborator);
        click(b_collaboratorsList_1);
        click(cpList_onlyDiscuss);

        Thread.sleep(500);
        String msg1 = getText(b_add_CollaboratorList_1);
        assertEquals(msg1 ,"只能评论");

        click(b_collaboratorsList_1);
        click(cpList_remove);

        String msg2 = getText(toast_addCollaborator);
        assertEquals(msg2 ,"研发 的权限已移除");

    }


    /**
     * 空间创建者对于空间的操作  编号85
     * 创建者/管理员修改空间名
     * @author 陈清杰
     * @Time 2019-01-08
     *
     */
    @Test(enabled = true)
    public  void  testSpacePermission_5() {
        login("qq6@qq.qqq","123123");
        moveToElement(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_setting);

//        click(spacingSetting_spaceName);
        Actions action = new Actions(driver);
        action.doubleClick(spacingSetting_spaceName).perform();
//        sendKeys(spacingSetting_spaceName,Keys.chord(Keys.CONTROL, "a"));
//        sendKeys(spacingSetting_spaceName,Keys.chord(Keys.DELETE));

        String time = getDate();
        sendKeys(spacingSetting_spaceName,time);
        click(b_spacingSetting_confirm);

        String msg = getText(space_listing_1).trim();
        assertEquals(msg, time);
    }


    /**
     * 空间创建者对于空间的操作  编号86
     * 创建者/管理员，删除空间后空间进入回收站
     * @author 陈清杰
     * @Time 2019-01-09
     *
     */
    @Test
    public  void  testSpacePermission_7() throws InterruptedException {

        login("qq7@qq.qqq","123123");
        click(b_newSpace);
        String time = getDate();
        sendKeys(i_newSpace_inputPaceName,time);
        click(b_newSpace_next);
        Thread.sleep(500);
        click(b_spacingCollaborator_close);
        click(b_closeSpace);
        moveToElement(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_delete);
        click(message_ok);//删除确认弹窗中"确认删除"button

        click(trash);
        String msg = getText(desktop1_1);
        click(desktop1_1);
        click(menu_Completely_removed);

        assertEquals(time, msg);

    }
    /**
     * 空间可编辑协作者对空间的操作  编号88、90、92
     * 空间可编辑协作者添加/移除协作者/修改协作者权限
     * @author 陈清杰
     * @Time 2019-01-10
     *
     */
    @Test
    public void  testSpacePermission_8() throws InterruptedException {
        login("qq9@qq.qqq","123123");
        moveToElement(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_collaboration);

        sendKeys(input_add_Collaborator,"qq10@qq.qqq");
        Thread.sleep(2000);
//
//        click(b_add_CollaboratorList_1);
//        click(cpList_edit);
        modifyPermissions(b_add_CollaboratorList_1, "edit");


        String msg = getText(toast_addCollaborator);
        assertEquals(msg ,"qq10 的权限已修改为「可以编辑」");

        click(b_collaborator_Back);
//        click(b_collaboratorsList_2);
////        click(cpList_onlyDiscuss);

        modifyPermissions(b_collaboratorsList_2, "discuss");

        Thread.sleep(500);
        String msg1 = getText(b_add_CollaboratorList_2);
        assertEquals(msg1 ,"只能评论");

        click(b_collaboratorsList_2);
        click(cpList_remove);

        String msg2 = getText(toast_addCollaborator);
        assertEquals(msg2 ,"qq10 的权限已移除");



    }
    /**
     * 空间创可编辑协作者对空间的操作  编号89、91、93
     * 空间可编辑协作者添加部门/移除部门/修改部门协作权限
     * @author 陈清杰
     * @Time 2019-01-10
     *
     */
    @Test
    public  void  testSpacePermission_9() throws InterruptedException {
        login("qq9@qq.qqq","123123");
        moveToElement(space_listing_2);
        click(b_SpaceSetting2);
        click(b_SpaceSetting_collaboration);

        click(b_add_Collaborator);
        click(tabs_organization);
        click(b_department_2);
        click(cpList_edit);
//        modifyPermissions(b_department_2, "edit");


        click(b_spacingCollaborator_removeAdmin_confirm);
        String msg = getText(toast_addCollaborator);
        assertEquals(msg ,"研发 的权限已修改为「可以编辑」");

        click(b_collaborator_Back);
//        click(tabs_collaborator);
        click(b_collaboratorsList_1);
        click(cpList_onlyDiscuss);
        Thread.sleep(500);

        String msg1 = getText(b_add_CollaboratorList_1);
        assertEquals(msg1 ,"只能评论");

        click(b_collaboratorsList_1);
        click(cpList_remove);

        String msg2 = getText(toast_addCollaborator);
        assertEquals(msg2 ,"研发 的权限已移除");
    }


    /**
     * 空间可编辑协作者对于空间的操作  编号95
     * 可编辑协作者修改空间名称（预期：无权限）
     * @author 陈清杰
     * @Time 2019-01-11
     *
     */

    @Test
    public  void  testSpacePermission_11() {
        login("qq9@qq.qqq", "123123");
        moveToElement(space_listing_3);
        click(b_SpaceSetting3);
        click(b_SpaceSetting_setting);

        String t = spacingSetting_spaceName.getAttribute("disabled");
        Boolean result = t.equals("true");
        assertTrue(result);
    }


    /**
     * 空间可编辑协作者对于空间的操作  编号97
     * 可编辑协作者退出空间（预期：删除即退出）
     * @author 陈清杰
     * @Time 2019-01-15
     *
     */
    @Test
    public void testSpacePermission_13() throws InterruptedException {
        login("qq8@qq.qqq","123123");
        moveToElement(space_listing_4);
        click(b_SpaceSetting4);

        click(b_SpaceSetting_collaboration);
        sendKeys(input_add_Collaborator,"qq11@qq.qqq");
        Thread.sleep(500);
        click(b_add_CollaboratorList_1);
        click(cpList_edit);

        Thread.sleep(500);
        logout();

        login("qq11@qq.qqq","123123");
        moveToElement(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_delete);
        click(message_ok);//删除确认弹窗中"确认删除"button
        Thread.sleep(500);

        logout();
        login("qq8@qq.qqq","123123");
        moveToElement(space_listing_4);
        click(b_SpaceSetting4);
        click(b_SpaceSetting_collaboration);
//        click(tabs_collaborator);

        int size = getSpaceCollaboratorSize();
        assertEquals(size, 0);
    }
    /**
     * 空间只评论/只读协作者对于空间的操作  编号98、99
     * 只读协作者添加协作者或部门（预期：无权限）
     * @author 陈清杰
     * @Time 2019-01-15
     *
     */
    @Test
    public void  testSpacePermission_14(){
        login("qq14@qq.qqq","123123");
        moveToElement(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_collaboration);
//        Boolean r = doesWebElementExist(b_add_Collaborator);
        Boolean r = getAttribute(b_add_Collaborator, "data-disabled").equals("false");

        assertFalse(r);
    }
    /**
     * 空间只评论/只读协作者对于空间的操作  编号100
     * 只读协作者修改/移除其他协作者（预期：无权限）
     * @author 陈清杰
     * @Time 2019-01-15
     *
     */
    @Test
    public void testSpacePermission_15() {
        login("qq14@qq.qqq","123123");
        moveToElement(space_listing_2);
        click(b_SpaceSetting2);
        click(b_SpaceSetting_collaboration);
        Boolean r = getAttribute(b_add_Collaborator, "data-disabled").equals("false");

        assertFalse(r);

    }
    /**
     * 空间只评论/只读协作者对于空间的操作  编号101
     * 只读协作者修改/移除协作部门（预期：无权限）
     * @author 陈清杰
     * @Time 2019-01-15
     *
     */
    @Test
    public void testSpacePermission_16() {
        login("qq14@qq.qqq","123123");
        moveToElement(space_listing_3);
        click(b_SpaceSetting3);
        click(b_SpaceSetting_collaboration);

        String r = getAttribute(b_collaboratorsList_1, "data-disabled");

        assertEquals(r, "true");
    }

    /**
     * 协作空间添加/删除管理员
     * 添加管理员，删除管理员，管理员变为普通协作者，删除协作者
     * @author 刘晨
     * @Time 2019-04-16
     *
     */
    @Test
    public void testSpacePermission_17() {
        login("testSpace01@qq.com","123123");
        moveToElement(space_listing_1);
        click(b_SpaceSetting1);


        addAdminByEmail("testSpace02@qq.com", 1);
        String msg = getText(toast_addCollaborator);
        assertEquals(msg ,"ApexLegends 的权限已设置为管理者");

        moveToElement(space_listing_1);
        click(b_SpaceSetting1);
        removeAdminByPosition(2);

        String msg2 = getText(toast_addCollaborator);
        assertEquals(msg2 ,"ApexLegends 的权限已移除");

    }

    /**
     * 协作空间协作者，查看管理员列表，没有添加管理员按钮
     *
     * @author 刘晨
     * @Time 2019-04-16
     *
     */
    @Test
    public void testSpacePermission_18() {
        login("testSpace03@qq.com", "123123");
        moveToElement(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_collaboration);

//        click(tabs_management);
        Boolean result = doesWebElementExist(b_spacingCollaborator_addAdmin);
        assertFalse(result);
    }

}
