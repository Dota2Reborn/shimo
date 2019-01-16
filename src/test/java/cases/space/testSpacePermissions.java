package cases.space;

import base.TestInit;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import javax.print.DocFlavor;

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
    public  void testSpacePermissions_0() throws InterruptedException {

          login("qq0@qq.qqqq", "123123");
          click(space_listing_2);
          click(b_SpaceSetting2);
          click(b_SpaceSetting_collaboration);
          click(b_SpaceSetting_collaboration_add);
          sendKeys(input_addCollaborator,"qq2@qq.qqq");
          click(b_addCollaborator_1_add);
          click(b_addCollaborator_ok);
          Thread.sleep(100);
          Boolean result1 = getText(addCollaborator_total).equals("2 人协作");
          assertTrue(result1);

          click(b_addCollaborator_2_list);
          click(can_only_comment_2);
          Thread.sleep(500);
          Boolean result2 = getText(b_addCollaborator_2_list).equals("只能评论");
          assertTrue(result2);

          click(b_addCollaborator_2_list);
          click(list_addCollaborator_4);
          Thread.sleep(100);
          Boolean result3 = getText(addCollaborator_total).equals("1 人协作");
          assertTrue(result3);

    }
    /**
     * 空间创建者对于空间的操作  编号73、81、77
     * 为空间添加非席位成员/为空间移除非席位成员/修改权限
     * @author 陈清杰
     * @Time 2019-01-08
     *
     */
    @Test
    public  void  testSpacePermissions_1() throws InterruptedException {
        login("qq0@qq.qqqq", "123123");
        click(space_listing_3);
        click(b_SpaceSetting3);
        click(b_SpaceSetting_collaboration);
        click(b_SpaceSetting_collaboration_add);
        sendKeys(input_addCollaborator,"qq3@qq.qqq");
        click(b_addCollaborator_1_add);
        click(b_addCollaborator_ok);
        Thread.sleep(100);
        Boolean result1 = getText(addCollaborator_total).equals("2 人协作");
        assertTrue(result1);

        click(b_addCollaborator_2_list);
        click(can_only_comment_2);
        Thread.sleep(300);
        Boolean result2 = getText(b_addCollaborator_2_list).equals("只能评论");
        assertTrue(result2);


        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);
        Thread.sleep(100);
        Boolean result3 = getText(addCollaborator_total).equals("1 人协作");
        assertTrue(result3);
    }
    /**
     * 空间创建者对于空间的操作  编号74、82、78
     * 为空间添加外部协作者/为空间移除外部协作者/修改权限
     * @author 陈清杰
     * @Time 2019-01-08
     *
     */
    @Test
    public  void  testSpacePermissions_2() throws InterruptedException {
        login("qq0@qq.qqqq", "123123");
        click(space_listing_4);
        click(b_SpaceSetting4);
        click(b_SpaceSetting_collaboration);
        click(b_SpaceSetting_collaboration_add);
        sendKeys(input_addCollaborator,"qq4@qq.qqq");
        click(b_addCollaborator_1_add);
        click(b_addCollaborator_ok);
        Thread.sleep(300);
        Boolean result1 = getText(addCollaborator_total).equals("2 人协作");
        assertTrue(result1);

        click(b_addCollaborator_2_list);
        click(can_only_comment_2);
        Thread.sleep(300);
        Boolean result2 = getText(b_addCollaborator_2_list).equals("只能评论");
        assertTrue(result2);

        click(b_addCollaborator_2_list);
        click(list_addCollaborator_4);
        Thread.sleep(300);
        Boolean result3 = getText(addCollaborator_total).equals("1 人协作");
        assertTrue(result3);
    }
    /**
     * 空间创建者对于空间的操作  编号75、83、79
     * 为空间添加部门「研发」/为空间移除部门「研发」/修改权限
     * @author 陈清杰
     * @Time 2019-01-08
     *
     */
    @Test
    public  void  testSpacePermissions_3() throws InterruptedException {
        login("qq0@qq.qqqq","123123");
        click(space_listing_5);
        click(b_SpaceSetting5);
        click(b_SpaceSetting_collaboration);
        click(b_SpaceSetting_collaboration_add);
        click(b_SpaceSetting_collaboration_department);
        click(b_SpaceSetting_collaboration_department2_1);
        click(b_addCollaborator_ok);
        Thread.sleep(100);
        Boolean result1 = getText(addCollaborator_total).equals("1 部门、1 人协作");
        assertTrue(result1);

        click(b_addCollaborator_1_list);
        click(can_only_comment_2);
        Thread.sleep(100);
        Boolean result2 = getText(b_addCollaborator_1_list).equals("只能评论");
        assertTrue(result2);

        click(b_addCollaborator_1_list);
        click(list_addCollaborator_4);
        Thread.sleep(100);
        Boolean result3 = getText(addCollaborator_total).equals("1 人协作");
        assertTrue(result3);


    }
    /**
     * 空间创建者对于空间的操作  编号84
     * 移交所有权并移回自己
     * @author 陈清杰
     * @Time 2019-01-08
     *
     */
    @Test
    public  void  testSpacePermission_4() {
        login("qq0@qq.qqqq","123123");
        click(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_collaboration);
        click(b_SpaceSetting_collaboration_view);
        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);
        Boolean result1 = getText(addCollaborator_1_list_userName).equals("qq5");
        assertTrue(result1);

        click(b_addCollaborator_1_list);
        click(list_addCollaborator_1);
        click(list_addCollaborator_changeOwner_1);
        click(b_addCollaborator_confirm);
        Boolean result2 = getText(addCollaborator_1_list_userName).equals("qq0");
        assertTrue(result2);

    }

    /**
     * 空间创建者对于空间的操作  编号85
     * 创建者/管理员修改空间名
     * @author 陈清杰
     * @Time 2019-01-08
     *
     */
    @Test
    public  void  testSpacePermission_5() {
        login("qq6@qq.qqq","123123");
        click(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_setting);
        click(b_SpaceSetting_setting_ChangeName);
        click(b_SpaceSetting_setting_InputName);
        b_SpaceSetting_setting_InputName.clear();

        String time = getDate();
        sendKeys(b_SpaceSetting_setting_InputName,time);
        click(b_SpaceSetting_setting_ok);

    }
    /**
     * 空间创建者对于空间的操作  编号86
     * 创建者/管理员修改全员权限
     * @author 陈清杰
     * @Time 2019-01-08
     *
     */

    @Test
    public void testSpacePermission_6() {
        login("qq6@qq.qqq","123123");
        click(space_listing_2);
        click(b_SpaceSetting2);
        click(b_SpaceSetting_setting);
        click(b_SpaceSetting_setting_ChangePermission);
        click(b_SpaceSetting_setting_ChangePermission_edit);
        click(b_SpaceSetting_setting_ok);

        click(space_listing_2);
        click(b_SpaceSetting2);
        click(b_SpaceSetting_setting);
        Boolean result1 = getText(b_SpaceSetting_setting_ChangePermission_now).equals("可编辑");
        assertTrue(result1);

        click(b_SpaceSetting_setting_ChangePermission);
        click(b_SpaceSetting_setting_ChangePermission_comment);


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
        click(button_addCollaborator_close);
        click(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_delete);
        click(ppt_delete_sure);//删除确认弹窗中"确认删除"button

        click(trash);
        click(desktop1_1);
        click(menu_Completely_removed);

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
        click(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_collaboration);
        click(b_SpaceSetting_collaboration_add);
        sendKeys(input_addCollaborator,"qq10@qq.qqq");
        click(b_addCollaborator_1_add);
        click(b_addCollaborator_ok);
        Thread.sleep(500);
        Boolean result1 = getText(addCollaborator_total).equals("3 人协作");
        assertTrue(result1);

        click(b_addCollaborator_3_list);
        click(can_only_comment_2);
        Thread.sleep(500);
        Boolean result2 = getText(b_addCollaborator_3_list).equals("只能评论");
        assertTrue(result2);

        click(b_addCollaborator_3_list);
        click(list_addCollaborator_4);
        Boolean result3 = getText(addCollaborator_total).equals("2 人协作");
        assertTrue(result3);



    }
    /**
     * 空间创可编辑协作者对空间的操作  编号89、91、93
     * 空间可编辑协作者添加部门/移除部门/修改部门协作权限
     * @author 陈清杰
     * @Time 2019-01-10
     *
     */
    @Test
    public  void  testPermission_9() throws InterruptedException {
        login("qq9@qq.qqq","123123");
        click(space_listing_2);
        click(b_SpaceSetting2);
        click(b_SpaceSetting_collaboration);
        click(b_SpaceSetting_collaboration_add);
        click(b_SpaceSetting_collaboration_department);
        click(b_SpaceSetting_collaboration_department2_1);
        click(b_addCollaborator_ok);
        Thread.sleep(100);
        Boolean result1 = getText(addCollaborator_total).equals("1 部门、2 人协作");
        assertTrue(result1);

        click(b_addCollaborator_1_list);
        click(can_only_comment_2);
        Thread.sleep(500);
        Boolean result2 = getText(b_addCollaborator_1_list).equals("只能评论");
        assertTrue(result2);

        click(b_addCollaborator_1_list);
        click(list_addCollaborator_4);
        Thread.sleep(100);
        Boolean result3 = getText(addCollaborator_total).equals("2 人协作");
        assertTrue(result3);
    }
    /**
     * 空间可编辑协作者对于空间的操作  编号94
     * 可编辑协作者转让所有权（预期：无权限）
     * @author 陈清杰
     * @Time 2019-01-10
     *
     */
    @Test(enabled = true)
    public  void  testSpacePermission_10() throws InterruptedException {
        login("qq9@qq.qqq", "123123");
        click(space_listing_3);
        click(b_SpaceSetting3);
        click(b_SpaceSetting_collaboration);
        click(b_SpaceSetting_collaboration_view);

        String b = b_addCollaborator_1_list_disable.getAttribute("disabled");
        assertEquals(b,"true");


    }
    /**
     * 空间可编辑协作者对于空间的操作  编号95
     * 可编辑协作者修改空间名称（预期：有权限）
     * @author 陈清杰
     * @Time 2019-01-11
     *
     */

    @Test
    public  void  testSpacePermission_11() {
        login("qq9@qq.qqq", "123123");
        click(space_listing_3);
        click(b_SpaceSetting3);
        click(b_SpaceSetting_setting);
        click(b_SpaceSetting_setting_ChangeName);
        click(b_SpaceSetting_setting_InputName);
        b_SpaceSetting_setting_InputName.clear();

        String time = getDate();
        sendKeys(b_SpaceSetting_setting_InputName, time);
        click(b_SpaceSetting_setting_ok);
    }
    /**
     * 空间可编辑协作者对于空间的操作  编号96
     * 可编辑协作者修改全员权限（预期：无权限）
     * @author 陈清杰
     * @Time 2019-01-11
     *
     */

    @Test
    public void testSpacePermission_12() {
        login("qq9@qq.qqq","123123");
        click(space_listing_3);
        click(b_SpaceSetting3);
        click(b_SpaceSetting_setting);

        Boolean b = doesWebElementExist(b_SpaceSetting_setting_ChangePermission);
        assertFalse(b);


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
        login("qq11@qq.qqq","123123");
        click(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_delete);
        click(ppt_delete_sure);//删除确认弹窗中"确认删除"button
        Thread.sleep(500);
        logout();

        login("qq8@qq.qqq","123123");
        click(space_listing_4);
        click(b_SpaceSetting4);
        click(b_SpaceSetting_collaboration);
        click(b_SpaceSetting_collaboration_view);
        Boolean result = getText(addCollaborator_total).equals("1 人协作");
        assertTrue(result);


        sendKeys(input_addCollaborator,"qq11@qq.qqq");
        click(b_addCollaborator_1_add);
        Thread.sleep(500);
        Boolean result1 = getText(addCollaborator_total).equals("2 人协作");
        assertTrue(result1);



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
        click(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_collaboration);
        click(b_SpaceSetting_collaboration_view);

        String r = button_addCollaborator.getAttribute("disabled");
        assertEquals(r,"true");

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
        click(space_listing_2);
        click(b_SpaceSetting2);
        click(b_SpaceSetting_collaboration);
        click(b_SpaceSetting_collaboration_view);

        String r =b_addCollaborator_3_list_disable.getAttribute("disabled");
        assertEquals(r,"true");

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
        click(space_listing_3);
        click(b_SpaceSetting3);
        click(b_SpaceSetting_collaboration);
        click(b_SpaceSetting_collaboration_view);

        String r = b_addCollaborator_1_list_disable.getAttribute("disabled");
        assertEquals(r,"true");

    }
















}
