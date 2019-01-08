package cases.ppt;

import base.TestInit;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.assertTrue;

public class testTextboxStyleSet extends TestInit {//文本设置样式

    /**
     * 设置文本有序无序列表
     *
     * @author 王继程
     * @throws AWTException
     * @Time 2018-07-24
     *
     */
    @Test(enabled = true)
    public void Text_Editing5() throws InterruptedException, AWTException {
        login("textstyle5@shimo.im", "123123");
        click(desktop_new);
        click(desktop_newslides);
        click(ppt_page_1);
        click(page_elements_1);
        action.sendKeys("第一行"+ Keys.ENTER+"第二行").build().perform();
        click(smslide_frame_anchor_1);
        click(ppt_animation);
        click(ppt_right_order);
        Boolean element1 = doesWebElementExist(smslide_ordered_2);
        click(ppt_right_disorder);
        Boolean element2 = doesWebElementExist(smslide_unordered_2);
        click(ppt_dotdotdot);
        click(ppt_delete);
        click(desktop_newFolder_name_ok);
        assertTrue(element1 && element2);

    }
    String a=page_elements_1.getCssValue("font-family");//取得字躰
}
