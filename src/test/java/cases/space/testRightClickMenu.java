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
        Thread.sleep(500);
        Boolean element1 = doesWebElementExist(space_Preview_image);
        System.out.println(element1);
        assertTrue(element1);

    }

}
