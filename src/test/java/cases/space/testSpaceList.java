package cases.space;

import base.TestInit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testSpaceList extends TestInit {

    /**
     * 对应全员协作的协作空间消失bug验证
     * @author  Liu Chen
     * @Time  2020/4/21
     */
    @Test
    public void space_listBug_1() {
        login("amei@qq.com", "123123");
        click(b_newSpace);
        String time = getDate();
        sendKeys(i_newSpace_inputPaceName,time);
        click(b_newSpace_next);
        click(tabs_organization);
        click(b_department_1);
        click(cpList_edit);
        click(b_spacingCollaborator_close);
        click(b_closeSpace);

        click(desktop);

        driver.navigate().refresh();
        String spaceName = getText(space_listName_1);
        assertEquals(time, spaceName);

        driver.navigate().refresh();
        spaceName = getText(space_listName_1);
        assertEquals(time, spaceName);

        logout();
        login("panpan@qq.com", "123123");
        driver.navigate().refresh();
        spaceName = getText(space_listName_1);
        assertEquals(time, spaceName);

        logout();
        login("amei@qq.com", "123123");

        moveToElement(space_listing_1);
        click(b_SpaceSetting1);
        click(b_SpaceSetting_delete);
        click(ppt_delete_sure);
    }
}
