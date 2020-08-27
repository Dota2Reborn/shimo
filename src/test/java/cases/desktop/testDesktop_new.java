package cases.desktop;

import base.TestInit;
import elementFile.ByGenerator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class testDesktop_new extends TestInit {

    /**
     * 新建文档
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test
    public void desktop_newDoc() {
        login("autoTest_new@shimo.im", "123123");

        click(desktop);
        click(desktop_new);
        click(desktop_newDoc);

        String time = getDate();
        sendKeys(doc_title_input, time);

        click(b_back);
        String msg = getText(desktop1_1_name);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);

        assertEquals(msg, time);

    }

    /**
     * 新建幻灯片
     *
     * @author 刘晨
     * @Time 2019-11-21
     */
    @Test
    public void desktop_newSlide() {
        login("autoTest_new@shimo.im", "123123");

        click(desktop);
        click(desktop_new);
        click(desktop_newSlides);

        String time = getDate();
        sendKeys(ppt_filename, time);

        click(b_back);
        String msg = getText(desktop1_1_name);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);

        assertEquals(time, msg);

    }

    /**
     * 新建脑图
     *
     * @author 刘晨
     * @Time 2019-11-21
     */
    @Test
    public void desktop_newMindMap() {
        //desktop_newMindMap
        login("autoTest_new@shimo.im", "123123");

        click(desktop);
        click(desktop_new);
        click(desktop_newMindMap);

        String time = getDate();
        sendKeys(ppt_filename, time);

        click(b_back);
        String msg = getText(desktop1_1_name);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);

        assertEquals(time, msg);
    }

    /**
     * 新建白板
     *
     * @author 刘晨
     * @Time 2019-11-21
     */
    @Test
    public void desktop_newFileBoard() {
        //desktop_newMindMap
        login("autoTest_new@shimo.im", "123123");

        click(desktop);
        click(desktop_new);
        click(desktop_newFileBoard);

        String time = getDate();
        sendKeys(ppt_filename, time);
        action.sendKeys(Keys.ENTER).build().perform();

        driver.navigate().back();
        String msg = getText(desktop1_1_name);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);

        assertEquals(time, msg);
    }

    /**
     * 新建表格
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test
    public void desktop_newSheet() {
        login("autoTest_new@shimo.im", "123123");

        click(desktop);
        click(desktop_new);
        click(desktop_newSheet);

        String time = getDate();
        click(ppt_filename);
        sendKeys(ppt_filename, time);

        click(b_back);
        String msg = getText(desktop1_1_name);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);

        assertEquals(msg, time);
    }

    /**
     * 新建表单
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test
    public void desktop_newFileForm() {
        login("autoTest_new@shimo.im", "123123");

        click(desktop);
        click(desktop_new);
        click(desktop_newFileForm);

        String time = getDate();
        click(ppt_filename);
        sendKeys(ppt_filename, time);
        action.sendKeys(Keys.ENTER).build().perform();

        click(b_back);
        String msg = getText(desktop1_1_name);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);

        assertEquals(msg, time);
    }

    /**
     * 新建文件夹
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test
    public void desktop_newFolder() {
        login("autoTest_new@shimo.im", "123123");

        click(desktop);

        String msg = getText(desktop1_1_name);
        click(desktop_new);
        click(desktop_newFolder);

        String time = getDate();

        sendKeys(desktop_newFolder_name, time);
        click(desktop_newFolder_name_ok);
        click(desktop);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);
        driver.navigate().refresh();
        String msg1 = getText(desktop1_1_name);

        assertEquals(msg, msg1);
    }

    /**
     * 导入文档doc
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test(enabled = true)
    public void desktop_import_doc() throws InterruptedException {
        login("autoTest_new@shimo.im", "123123");
        click(desktop);

        click(desktop_new);
        String url = new File(ByGenerator.class.getClassLoader().getResource("file/test_doc.doc").getFile()).getPath();
        System.out.println(url);
        desktop_import.sendKeys(url);

        Thread.sleep(2000);
        click(b_back);

        String msg = getText(desktop1_1_name);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);

        assertEquals(msg, "test_doc");

    }

    /**
     * 导入文档docx
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test(enabled = true)
    public void desktop_import_docx() throws InterruptedException {
        login("autoTest_new@shimo.im", "123123");
        click(desktop);

        WebElement uploadButton = desktop_import;
        String url = new File(ByGenerator.class.getClassLoader().getResource("file/test_docx.docx").getFile()).getPath();
        System.out.println(url);
        uploadButton.sendKeys(url);

//        click(desktop_newFolder_name_cancel);

        Thread.sleep(2000);
        String msg = getText(desktop1_1_name);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);

        assertEquals(msg, "test_docx");

    }

    /**
     * 导入表格
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test(enabled = true)
    public void desktop_import_sheet() {
        login("autoTest_new@shimo.im", "123123");
        click(desktop);

        WebElement uploadButton = desktop_import;
        String url = new File(ByGenerator.class.getClassLoader().getResource("file/test_sheet.xlsx").getFile()).getPath();
        System.out.println(url);
        uploadButton.sendKeys(url);

        click(desktop_newFolder_name_cancel);
        String msg = getText(desktop1_1_name);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);

        assertEquals(msg, "test_sheet");

    }

    /**
     * 导入md
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    @Test(enabled = true)
    public void desktop_import_md() throws InterruptedException {
        login("autoTest_new@shimo.im", "123123");
        click(desktop);

        WebElement uploadButton = desktop_import;

        String url = new File(ByGenerator.class.getClassLoader().getResource("file/test.md").getFile()).getPath();
        System.out.println(url);
        uploadButton.sendKeys(url);

        Thread.sleep(500);
        click(b_back);
        String msg = getText(desktop1_1_name);
//        contextClick(desktop1_1);
//        click(menu_delete);
//        click(desktop_newFolder_name_ok);
        delFile(desktop1_1);

        assertEquals(msg, "test");

    }

}