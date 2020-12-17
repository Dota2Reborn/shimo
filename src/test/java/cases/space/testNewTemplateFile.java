package cases.space;

import base.TestInit;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class testNewTemplateFile extends TestInit {


    /**
     * 空间  新建文档模板
     *
     * @author 刘晨
     * @Time 2020-12-17
     */
    @Test(enabled = true)
    public void space_newTemplate_doc() {
        login("spacebuild@shimo.im", "123123");
        click(space_listing_3);
        click(desktop_newTemplate);
        switchToPage(1);
        click(templates_tab_doc);
        click(templates_template_1);
        click(templates_create_button);
        click(doc_menu);
        click(doc_menu_delete);
        click(doc_menu_delete_OK);
    }


    /**
     * 空间  新建表格模板
     *
     * @author 刘晨
     * @Time 2020-12-17
     */
    @Test(enabled = true)
    public void space_newTemplate_sheet() {
        login("spacebuild@shimo.im", "123123");
        click(space_listing_3);
        click(desktop_newTemplate);
        switchToPage(1);
        click(templates_tab_sheet);
        click(templates_template_1);
        click(templates_create_button);
        click(doc_menu);
        click(doc_menu_delete);
        click(doc_menu_delete_OK);
    }


    /**
     * 空间  我的模板
     *
     * @author 刘晨
     * @Time 2020-12-17
     */
    @Test(enabled = true)
    public void space_newTemplate_mine(){
        login("spacebuild@shimo.im", "123123");
        click(space_listing_3);
        click(desktop_newTemplate);
        switchToPage(1);
        click(templates_tab_mine);
        click(templates_mineTemplate_1);
        click(doc_menu);
        click(doc_menu_delete);
        click(doc_menu_delete_OK);
    }

    /**
     * 桌面文件移动到协作空间
     *
     * @author
     * @Time
     */
    @Test
    public void desktopFile_moveToSpace() {
        login("desktopFile_moveToSpace@shimo.im", "123123");
        click(desktop);
        click(desktop_new);
        click(desktop_newDoc);
        click(b_back);
        contextClick(desktop1_1);
        click(menu_move);
        click(desktop_moveToSpace_space_1);
        click(desktop_moveFolder_button);
        click(desktop_moveToSpace_confirm);
        assertEquals("1 个文件已移动至 测试协作空间", getText(toast_msg));
        click(space_listing_1);
        delFile(desktop1_1);
    }

    /**
     * 模板库删除个人模板
     *
     * @author 刘晨
     * @Time 2020-12-17
     */
    @Test(enabled = true)
    public void del_template(){
        login("testDocHeader@shimo.im", "123123");
        click(desktop_newTemplate);
        switchToPage(1);
        click(templates_tab_mine);
        contextClick(templates_mineTemplate_1);
        click(templates_delete_button);
        click(desktop_newFolder_name_ok);
        String msg = getText(toast_msg);
        assertEquals("删除成功",msg);
    }

    /**
     * 模板库，模板重命名
     *
     * @author 刘晨
     * @Time 2020-12-17
     */
    @Test(enabled = true)
    public void rename_template() {
        login("testDocHeader@shimo.im", "123123");
        click(desktop_newTemplate);
        switchToPage(1);
        click(templates_tab_mine);
        contextClick(templates_mineTemplate_1);
        click(templates_rename_button);
        sendKeys(desktop_newFolder_name, getDate());
        click(desktop_newFolder_name_ok);
        String msg = getText(toast_msg);
        assertEquals("修改成功",msg);

    }

}
