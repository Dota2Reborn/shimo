package cases.space;

import base.TestInit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class testSpaceNewFile extends TestInit {


    /**
     *高级版/企业版查看空间右侧button展示
     * @author  范金叶
     * @Time  2019-01-15
     */
    @Test(enabled = true)
    public void space_right_button(){
        login("spacebuild001@shimo.im", "123123");
        click(space_listing_1);
        String msg = getText(space_upname);
        String msg1 = getText(space_listing_1);
        msg1 = (String) msg1.subSequence(0,3);
        System.out.print(msg);
        System.out.print(msg1);
        assertEquals(msg,"www");
        String msg2 = getText(space_button_import);
        assertEquals(msg2,"上传 / 导入");
        String msg3 = getText(space_button_new);
        assertEquals(msg3,"新建");
    }


    /**
     *基础版查看空间右侧button展示
     * @author  范金叶
     * @Time  2019-01-15
     */
    @Test(enabled = true)
    public void space_right_button1(){
        login("spacebuild@shimo.im", "123123");
        click(space_listing_1);
        String msg = getText(space_upname);
        String msg1 = getText(space_listing_1);
        msg1 = (String) msg1.subSequence(0,10);
        System.out.print(msg);
        System.out.print(msg1);
        assertEquals(msg,"TestTeason");
        String msg2 = getText(space_button_import);
        assertEquals(msg2,"导入");
        String msg3 = getText(space_button_new);
        assertEquals(msg3,"新建");
    }


    /**
     *查看空间右侧新建按钮 hover展示
     * @author  范金叶
     * @Time  2019-01-15
     */
    @Test(enabled = true)
    public void space_hover_new(){
        login("spacebuild001@shimo.im", "123123");
        click(space_listing_1);
        click(desktop_new);
        String msg = getText(desktop_newDoc);
        assertEquals(msg,"文档");
        String msg1 = getText(desktop_newSheet);
        assertEquals(msg1,"表格");
        String msg2 = getText(desktop_newslides);
        assertEquals(msg2,"幻灯片");
        String msg3 = getText(desktop_newmindmap);
        assertEquals(msg3,"思维导图");
        String msg4 = getText(desktop_newFolder);
        assertEquals(msg4,"文件夹");
        String msg5 = getText(desktop_newtemplate);
        assertEquals(msg5,"从模板新建");
    }


    /**
     * 查看空间右侧导入按钮 hover展示
     * @author  范金叶
     * @Time  2019-01-15
     */
    @Test(enabled = true)
    public void space_hover_import(){
        login("spacebuild001@shimo.im", "123123");
        click(space_listing_1);
        click(space_button_import);
        String msg = getText(space_uploadfile);
        assertEquals(msg,"上传文件");
        String msg1 = getText(space_uploadfolder);
        assertEquals(msg1,"上传文件夹");
        String msg6 = getText(space_list_import);
        assertEquals(msg6,"导入");
    }


    /**
     * 空间新建文档
     * @author  范金叶
     * @Time  2019-01-15
     */
    @Test(enabled = true)
    public void space_newdoc(){
        login("spacebuild001@shimo.im", "123123");
        click(space_listing_2);
        String msg = getText(desktop1_1);
        click(desktop_new);
        click(desktop_newDoc);
        click(b_back);
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        driver.navigate().refresh();
        String msg1 = getText(desktop1_1);
        assertEquals(msg, msg1);
    }


    /**
     * 空间新建表格
     * @author  范金叶
     * @Time  2019-01-15
     */
    @Test(enabled = true)
    public void space_newsheets(){
        login("spacebuild001@shimo.im", "123123");
        click(space_listing_2);
        String msg = getText(desktop1_1);
        click(desktop_new);
        click(desktop_newSheet);
        click(b_back);
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        String msg1 = getText(desktop1_1);
        assertEquals(msg, msg1);
    }


    /**
     * 空间新建幻灯片
     * @author  范金叶
     * @Time  2019-01-15
     */
    @Test(enabled = true)
    public void space_newPPT(){
        login("spacebuild001@shimo.im", "123123");
        click(space_listing_2);
        String msg = getText(desktop1_1);
        click(desktop_new);
        click(desktop_newslides);
        click(b_back);
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        String msg1 = getText(desktop1_1);
        assertEquals(msg, msg1);
    }


    /**
     * 空间新建幻灯片
     * @author  范金叶
     * @Time  2019-01-15
     */
    @Test(enabled = true)
    public void space_newMMP(){
        login("spacebuild001@shimo.im", "123123");
        click(space_listing_2);
        String msg = getText(desktop1_1);
        click(desktop_new);
        click(desktop_newmindmap);
        click(b_back);
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        String msg1 = getText(desktop1_1);
        assertEquals(msg, msg1);
    }


    /**
     * 空间新建文件夹
     * @author  范金叶
     * @Time  2019-01-15
     */
    @Test(enabled = true)
    public void space_newfolder(){
        login("spacebuild001@shimo.im", "123123");
        click(space_listing_2);
        String msg = getText(desktop1_1);
        click(desktop_new);
        click(desktop_newFolder);
        String time = getDate();
        sendKeys(desktop_newFolder_name, time);
        click(desktop_newFolder_name_ok);
        driver.navigate().back();
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        String msg1 = getText(desktop1_1);
        assertEquals(msg, msg1);
    }
}