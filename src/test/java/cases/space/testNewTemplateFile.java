package cases.space;

import base.TestInit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import static org.testng.Assert.assertEquals;

public class testNewTemplateFile extends TestInit {


    /**
     * 空间  新建文档模板
     * @author
     * @Time
     */
    //todo 补充脚本库用例
    @Test(enabled = false)
    public void space_newTemplate_doc() throws InterruptedException {
        login("spacebuild@shimo.im", "123123");
        click(space_listing_3);
        String msg = getText(desktop1_1_name);
        click(desktop_newTemplate);
//        click(doc_template);
        click(template_1_1);
        click(button_template_confirm);

        Thread.sleep(2000);
        switchToPage(1);
        click(b_back);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);
        String msg1 = getText(desktop1_1_name);
        assertEquals(msg, msg1);
    }


    /**
     * 空间  新建表格模板
     * @author
     * @Time
     */
    @Test(enabled = false)
    public void space_newTemplate_sheet() throws InterruptedException {
        login("spacebuild@shimo.im", "123123");
        click(space_listing_3);
        String msg = getText(desktop1_1_name);
//        click(desktop_new);
        click(desktop_newTemplate);
//        wait.until(ExpectedConditions.elementToBeClickable(sheet_template));
        click(template_type_2);
        click(template_2_1);
        click(button_template_confirm);
        Thread.sleep(2000);

        switchToPage(1);
        click(b_back);
//        click(space_listing_3);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);
        String msg1 = getText(desktop1_1_name);
        assertEquals(msg, msg1);
    }


    /**
     * 空间  我的模板
     * @author
     * @Time
     */
    @Test(enabled = false)
    public void space_newTemplate_mine(){
        login("spacebuild001@shimo.im", "123123");
        click(space_listing_3);
        String msg = getText(desktop1_1_name);
        click(desktop_new);
        click(desktop_newTemplate);
        click(my_template);
        click(my_template02);

        switchToPage(1);
        click(b_back);
//        click(space_listing_3);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);
        String msg1 = getText(desktop1_1_name);
        assertEquals(msg, msg1);
    }

    /**
     * 桌面文件移动到协作空间
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
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);
    }
}
