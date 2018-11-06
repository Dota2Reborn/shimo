package cases.collaborator;

import base.TestInit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class testCollaboratorUI extends TestInit {

    /**
     * 如果用户有绑定手机没绑定邮箱，协作者列表中显示手机号,且外部协作者邮箱被部分隐藏
     *
     * @author 刘晨
     * @Time 2018-8-29
     */
    @Test(enabled = true)
    public void collaboratorUI_1() {
        login("13911658584", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        wait.until(ExpectedConditions.elementToBeClickable(b_addCollaborator_2_list));
        Boolean r1 = getText(collaborator_1_list_emailOrMobile).equals("+8613911658584");
        Boolean r2 = getText(collaborator_2_list_emailOrMobile).equals("0813@shimo.im");
        Boolean r3 = getText(collaborator_3_list_emailOrMobile).equals("pan***@qq.com");

        assertTrue(r1 && r2 && r3);

    }

    /**
     * 如果用户有绑定手机没绑定邮箱，外部协作者打开协作者列表，看到被部分隐藏的手机号
     *
     * @author 刘晨
     * @Time 2018-8-29
     */
    @Test(enabled = true)
    public void collaboratorUI_2() {
        login("panpan@panpan.com", "123123");
        click(desktop);

        contextClick(desktop1_1_folder);
        moveToElement(menu_cooperation);
        wait.until(ExpectedConditions.elementToBeClickable(b_addCollaborator_2_list));
        Boolean r1 = getText(collaborator_1_list_emailOrMobile).equals("panpan@panpan.com");
        Boolean r2 = getText(collaborator_2_list_emailOrMobile).equals("pan***@qq.com");
        Boolean r3 = getText(collaborator_3_list_emailOrMobile).equals("+86139****8584");

        assertTrue(r1 && r2 && r3);

    }
}
