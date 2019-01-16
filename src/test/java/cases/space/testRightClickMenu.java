package cases.space;

import base.TestInit;
import elementFile.ByGenerator;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;

import static org.testng.Assert.*;

public class testRightClickMenu extends TestInit {
    /**
     * 视频预览-----------------------------------------------------------------------------------------------------
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_video_preview() throws InterruptedException {
        login("Space_video@shimo.im", "123123");
        click(space_listing_1);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(1500);
        Boolean element1 = doesWebElementExist(space_Preview_video_music);
        assertTrue(element1);

    }
    /**
     * 右键分享开关
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_video_copy() throws InterruptedException {
        login("Space_video@shimo.im", "123123");
        click(space_listing_2);
        contextClick(space_document_1_1);
        Thread.sleep(200);
        click(space_RightMenu_3);
        String text = setClipbordContents();
        String[] tmp = text.split("/");
        assertEquals(tmp[4], "w9ychrkJtqvHhVPT");
    }
    /**
     * 视频文件创建副本
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_video_copies() throws InterruptedException {
        login("Space_video@shimo.im", "123123");
        click(space_listing_3);
        contextClick(space_document_1_1);
        click(space_RightMenu_5);
        Thread.sleep(500);
        String name = getText(space_document_1_1);
        contextClick(space_document_1_1);
        click(space_RightMenu_10);
        click(desktop_newFolder_name_ok);
        Thread.sleep(500);
        click(trash);
        contextClick(space_document_1_1);
        click(menu_Completely_removed);
        click(desktop_newFolder_name_ok);
        assertEquals(name, "副本 葫芦娃视频.mp4");
    }
    /**
     * 视频文件重命名
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_video_renaming() throws InterruptedException {
        login("Space_video@shimo.im", "123123");
        click(space_listing_4);
        contextClick(space_document_1_1);
        click(space_RightMenu_6);
        Thread.sleep(500);
        String time = getDate();
        sendKeys(desktop_newFolder_name,time);
        time = time+".mp4";
        click(ppt_delete_sure);
        String name = getText(space_document_1_1);
        name=name.replace("\n"+" ","");
        assertEquals(name,time);

    }
    /**
     * 视频文件移动
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_video_move() throws InterruptedException {
        login("Space_video@shimo.im", "123123");
        click(space_listing_5);
        String name="";
        if(doesWebElementExist(space_document_1_1)){
            contextClick(space_document_1_1);
            click(space_RightMenu_7);
            Thread.sleep(500);
            click(space_move_listing8);
            click(desktop_moveFolder_button);
            click(space_listing_8);
            name = getText(space_document_1_1);
            name=name.replace("\n"+" ","");

        }else {
            click(space_listing_8);
            contextClick(space_document_1_1);
            click(space_RightMenu_7);
            Thread.sleep(500);
            click(space_move_listing5);
            click(desktop_moveFolder_button);
            click(space_listing_5);
            name = getText(space_document_1_1);
            name=name.replace("\n"+" ","");
        }
        assertEquals(name,"葫芦娃视频.mp4");
    }
    /**
     * 视频文件删除恢复
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_video_delete() throws InterruptedException {
        login("Space_video@shimo.im", "123123");
        click(space_listing_7);
        contextClick(space_document_1_1);
        click(space_RightMenu_10);
        click(desktop_newFolder_name_ok);
        Thread.sleep(500);
        Boolean element1 = doesWebElementExist(space_document_1_1);
        click(trash);
        contextClick(space_document_1_1);
        click(menu_Recovery);
        click(space_listing_7);
        Thread.sleep(600);
        Boolean element2 = doesWebElementExist(space_document_1_1);
        assertFalse(element1);
        assertTrue(element2);

    }





    /**
     * 音频预览-----------------------------------------------------------------------------------------------------
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_music_preview() throws InterruptedException {
        login("Space_music@shimo.im", "123123");
        click(space_listing_1);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(1500);
        Boolean element1 = doesWebElementExist(space_Preview_video_music);
        assertTrue(element1);

    }
    /**
     * 音频文件创建副本
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_music_copies() throws InterruptedException {
        login("Space_music@shimo.im", "123123");
        click(space_listing_3);
        contextClick(space_document_1_1);
        click(space_RightMenu_5);
        Thread.sleep(500);
        String name = getText(space_document_1_1);
        contextClick(space_document_1_1);
        click(space_RightMenu_10);
        click(desktop_newFolder_name_ok);
        Thread.sleep(500);
        click(trash);
        contextClick(space_document_1_1);
        click(menu_Completely_removed);
        click(desktop_newFolder_name_ok);
        assertEquals(name, "副本 仅仅歌曲.mp3");
    }
    /**
     * 音频文件重命名
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_music_renaming() throws InterruptedException {
        login("Space_music@shimo.im", "123123");
        click(space_listing_4);
        contextClick(space_document_1_1);
        click(space_RightMenu_6);
        Thread.sleep(500);
        String time = getDate();
        sendKeys(desktop_newFolder_name,time);
        time = time+".mp3";
        click(ppt_delete_sure);
        String name = getText(space_document_1_1);
        name=name.replace("\n"+" ","");
        assertEquals(name,time);

    }
    /**
     * 音频文件移动
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_music_move() throws InterruptedException {
        login("Space_music@shimo.im", "123123");
        click(space_listing_5);
        String name="";
        if(doesWebElementExist(space_document_1_1)){
            contextClick(space_document_1_1);
            click(space_RightMenu_7);
            Thread.sleep(500);
            click(space_move_listing8);
            click(desktop_moveFolder_button);
            click(space_listing_8);
            name = getText(space_document_1_1);
            name=name.replace("\n"+" ","");

        }else {
            click(space_listing_8);
            contextClick(space_document_1_1);
            click(space_RightMenu_7);
            Thread.sleep(500);
            click(space_move_listing5);
            click(desktop_moveFolder_button);
            click(space_listing_5);
            name = getText(space_document_1_1);
            name=name.replace("\n"+" ","");
        }
        assertEquals(name,"仅仅歌曲.mp3");
    }
    /**
     * 音频文件删除恢复
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_music_delete() throws InterruptedException {
        login("Space_music@shimo.im", "123123");
        click(space_listing_7);
        contextClick(space_document_1_1);
        click(space_RightMenu_10);
        click(desktop_newFolder_name_ok);
        Thread.sleep(500);
        Boolean element1 = doesWebElementExist(space_document_1_1);
        click(trash);
        contextClick(space_document_1_1);
        click(menu_Recovery);
        Thread.sleep(500);
        click(space_listing_7);
        Boolean element2 = doesWebElementExist(space_document_1_1);
        assertFalse(element1);
        assertTrue(element2);

    }
    /**
     * 图片预览-----------------------------------------------------------------------------------------------------
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_image() throws InterruptedException {
        login("Space_image@shimo.im", "123123");
        click(space_listing_1);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(1500);
        Boolean element1 = doesWebElementExist(space_Preview_image);
        assertTrue(element1);

    }
    /**
     * word预览-----------------------------------------------------------------------------------------------------
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
        Thread.sleep(1500);
        String text = getText(space_Preview_office);
        text=text.replace("\n","");
        text=text.substring(0, 10);
        assertEquals(text, "这是一个word文档");

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
        Thread.sleep(1500);
        String text = getText(space_Preview_office);
        text=text.replace("\n","");
        text=text.substring(0, 2);
        assertEquals(text, "表格");


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
        Thread.sleep(1500);
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
        Thread.sleep(1500);
        String text = getText(space_Preview_txt);
        text=text.replace("\n","");
        assertEquals(text, "我喜欢电影");
    }
    /**
     * word重命名-----------------------------------------------------------------------------------------------------
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_office_wRename() throws InterruptedException {
        login("Space_office1@shimo.im", "123123");
        click(space_listing_1);
        contextClick(space_document_1_1);
        click(space_RightMenu_6);
        Thread.sleep(500);
        String time = getDate();
        sendKeys(desktop_newFolder_name,time);
        time = time+".docx";
        click(ppt_delete_sure);
        String name = getText(space_document_1_1);
        name=name.replace("\n"+" ","");
        assertEquals(name,time);

    }
    /**
     * excel重命名
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_office_eRename() throws InterruptedException {
        login("Space_office1@shimo.im", "123123");
        click(space_listing_2);
        contextClick(space_document_1_1);
        click(space_RightMenu_6);
        Thread.sleep(500);
        String time = getDate();
        sendKeys(desktop_newFolder_name,time);
        time = time+".xlsx";
        click(ppt_delete_sure);
        String name = getText(space_document_1_1);
        name=name.replace("\n"+" ","");
        assertEquals(name,time);


    }
    /**
     * ppt重命名
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_office_pRename() throws InterruptedException {
        login("Space_office1@shimo.im", "123123");
        click(space_listing_3);
        contextClick(space_document_1_1);
        click(space_RightMenu_6);
        Thread.sleep(500);
        String time = getDate();
        sendKeys(desktop_newFolder_name,time);
        time = time+".pptx";
        click(ppt_delete_sure);
        String name = getText(space_document_1_1);
        name=name.replace("\n"+" ","");
        assertEquals(name,time);


    }
    /**
     * 文本重命名
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_office_tRename() throws InterruptedException {
        login("Space_office1@shimo.im", "123123");
        click(space_listing_4);
        contextClick(space_document_1_1);
        click(space_RightMenu_6);
        Thread.sleep(500);
        String time = getDate();
        sendKeys(desktop_newFolder_name,time);
        time = time+".txt";
        click(ppt_delete_sure);
        String name = getText(space_document_1_1);
        name=name.replace("\n"+" ","");
        assertEquals(name,time);
    }

    /**
     * 右键在新标签页中打开word-----------------------------------------------------------------------------------------------------
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_word_tab() throws InterruptedException {
        login("Space_word@shimo.im", "123123");
        click(space_listing_1);
        contextClick(space_document_1_1);
        click(space_RightMenu_1);
        Thread.sleep(800);
        driver.close();
        switchToPage(0);
        String time = doc_title_input.getAttribute("value");
        assertEquals(time, "这是文档");
    }
    /**
     * 右键添加协作者
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_word_collaborate1() throws InterruptedException {
        login("Space_word@shimo.im", "123123");
        click(space_listing_2);
        contextClick(space_document_1_1);
        Thread.sleep(800);
        action.clickAndHold(space_RightMenu_3).perform();
        click(space_RightMenu_3_1);
        Thread.sleep(500);
        Boolean element1 = doesWebElementExist(input_addCollaborator);
        assertTrue(element1);
    }
    /**
     * 右键查看协作者
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_word_collaborate2() throws InterruptedException {
        login("Space_word@shimo.im", "123123");
        click(space_listing_2);
        contextClick(space_document_1_1);
        Thread.sleep(800);
        action.clickAndHold(space_RightMenu_3).perform();
        click(space_RightMenu_3_2);
        Thread.sleep(500);
        String eminl = getText(collaborator_2_list_emailOrMobile);
        assertEquals(eminl,"wangjich***@shimo.im");
    }
    /**
     * 右键分享开关
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_word_collaborate3() throws InterruptedException {
        login("Space_word@shimo.im", "123123");
        click(space_listing_3);
        contextClick(space_document_1_1);
        Thread.sleep(500);
        action.clickAndHold(space_RightMenu_4).perform();
        click(space_RightMenu_4_1);
        String toast1 = getText(toast_msg);
        click(space_RightMenu_4_1);
        String toast2 = getText(toast_msg);
        assertEquals(toast1,"已开启公开分享");


    }
    /**
     * 右键菜单复制分享链接
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_word_collaborate4() throws InterruptedException {
        login("Space_word@shimo.im", "123123");
        click(space_listing_4);
        contextClick(space_document_1_1);
        Thread.sleep(800);
        action.clickAndHold(space_RightMenu_4).perform();
        click(space_RightMenu_4_2);
        String text = setClipbordContents();
        String[] tmp = text.split("/");
        assertEquals(tmp[4], "6rwH3wKv6TGx3qyR");

    }
    /**
     * 右键菜单分享设置
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_word_collaborate5() throws InterruptedException {
        login("Space_word@shimo.im", "123123");
        click(space_listing_3);
        contextClick(space_document_1_1);
        Thread.sleep(500);
        action.clickAndHold(space_RightMenu_4).perform();
        click(space_RightMenu_4_3);
        Thread.sleep(500);
        Boolean element1 = doesWebElementExist(space_cooperation_Popup);
        assertTrue(element1);

    }
    /**
     * 文档重命名
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_word_collaborate6() throws InterruptedException {
        login("Space_word@shimo.im", "123123");
        click(space_listing_5);
        contextClick(space_document_1_1);
        click(space_RightMenu_7);
        Thread.sleep(500);
        String time = getDate();
        sendKeys(desktop_newFolder_name,time);
        click(ppt_delete_sure);
        String name = getText(space_document_1_1);
        name=name.replace("\n"+" ","");
        assertEquals(name,time);

    }
    /**
     * 右键在新标签页中打开-----------------------------------------------------------------------------------------------------
     * 右键在新标签页中打开excel
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
        Thread.sleep(800);
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
        Thread.sleep(800);
        driver.close();
        switchToPage(0);
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
        Thread.sleep(800);
        driver.close();
        switchToPage(0);
        String time = doc_header_title.getAttribute("value");
        assertEquals(time, "这是表单");
    }
    /**
     * 空白处右键菜单上传文件-----------------------------------------------------------------------------------------------------
     *
     * @author 王继程
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Space_margin() throws InterruptedException {
        login("Space_margin@shimo.im", "123123");
        click(space_listing_1);
        contextClick(space_document);
        click(space_RightMenu_1);

        WebElement uploadButton = desktop_import;
        String url = new File(ByGenerator.class.getClassLoader().getResource("file/test.mp3").getFile()).getPath();
        System.out.println(url);
        uploadButton.sendKeys(url);

        Thread.sleep(2000);
        click(b_back);

        String msg = getText(desktop1_1);
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);

        assertEquals(msg, "test_docx");
    }


    /**
     * 读取系统剪贴板-----------------------------------------------------------------------------------------------------
     *
     *
     *
     *
     */
    private String setClipbordContents() {
        String text ="";
        Clipboard sysClip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable clipTf = sysClip.getContents(null);//从系统剪切板中获取数据
        if (clipTf != null){

            if (clipTf.isDataFlavorSupported(DataFlavor.stringFlavor)) {//判断是否为文本类型
                try {
                    text = (String) clipTf.getTransferData(DataFlavor.stringFlavor);//从数据中获取文本值
                } catch (UnsupportedFlavorException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return text;
    }
}
