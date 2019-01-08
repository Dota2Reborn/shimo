package cases.space;

import base.TestInit;
import org.testng.annotations.Test;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testRightClickMenu extends TestInit {
    /**
     * 视频预览
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_video() throws InterruptedException {
        //login("Space_video@shimo.im", "123123");
        login("ppt1@shimo.im", "123123");
        click(space_listing_3);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Boolean element1 = doesWebElementExist(space_Preview_video_music);
        assertTrue(element1);

    }
    /**
     * 音频预览
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_music() throws InterruptedException {
        //login("Space_music@shimo.im", "123123");
        login("ppt1@shimo.im", "123123");
        click(space_listing_2);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Boolean element1 = doesWebElementExist(space_Preview_video_music);
        assertTrue(element1);

    }
    /**
     * 图片预览
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_image() throws InterruptedException {
        //login("Space_image@shimo.im", "123123");
        login("ppt1@shimo.im", "123123");
        click(space_listing_1);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(1000);
        Boolean element1 = doesWebElementExist(space_Preview_image);
        assertTrue(element1);

    }
    /**
     * word预览
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_office_W() throws InterruptedException {
        login("Space_office@shimo.im", "123123");
        click(space_listing_1);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(1000);
        String text = getText(space_Preview_office);
        text=text.replace("\n","");
        assertEquals(text, "这是一个word文档这是一个word文档这是一个word文档");

    }
    /**
     * excel预览
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_office_E() throws InterruptedException {
        login("Space_office@shimo.im", "123123");
        click(space_listing_2);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(1000);
        String text = getText(space_Preview_office);
        text=text.replace("\n","");
        assertEquals(text, "表格表格表格");


    }
    /**
     * ppt预览
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_office_P() throws InterruptedException {
        login("Space_office@shimo.im", "123123");
        click(space_listing_3);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(1000);
        String text = getText(space_Preview_office);
        text=text.replace("\n","");
        assertEquals(text, "这是一个幻灯片");


    }
    /**
     * 文本预览
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_office_t() throws InterruptedException {
        login("Space_office@shimo.im", "123123");
        click(space_listing_4);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(1000);
        String text = getText(space_Preview_txt);
        text=text.replace("\n","");
        assertEquals(text, "我喜欢电影");
    }
    /**
     * 右键在新标签页中打开word
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_word_tab() throws InterruptedException {
        login("Space_tab@shimo.im", "123123");
        click(space_listing_1);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(500);
        driver.close();
        switchToPage(0);
        String time = doc_title_input.getAttribute("value");
        assertEquals(time, "这是文档");
    }
    /**
     * 右键在新标签页中打开excel
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_excel_tab() throws InterruptedException {
        login("Space_tab@shimo.im", "123123");
        click(space_listing_2);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(1000);
        driver.close();
        switchToPage(0);
//        click(ppt_filename);
        String time = ppt_filename.getAttribute("value");
        assertEquals(time, "这是表格");
    }
    /**
     * 右键在新标签页中打开ppt
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_ppt_tab() throws InterruptedException {
        login("Space_tab@shimo.im", "123123");
        click(space_listing_3);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(1000);
        driver.close();
        switchToPage(0);
//        click(ppt_filename);
        String time = ppt_filename.getAttribute("value");
        assertEquals(time, "这是ppt");
    }
    /**
     * 右键在新标签页中打开表单
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_from_tab() throws InterruptedException {
        login("Space_tab@shimo.im", "123123");
        click(space_listing_4);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(1000);
        driver.close();
        switchToPage(0);
//        click(ppt_filename);
        String time = ppt_filename.getAttribute("value");
        assertEquals(time, "这是表单");
    }
}
