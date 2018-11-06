package cases.docSheet;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class testMenu_Doc_Sheet extends TestInit {
    /**
     * 文档编辑页菜单，点击文档信息
     *
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test(enabled = true)
    public void doc_msg() {
        login("autoTest15@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        moveToElement(file_menu_help);
        click(file_menu_msg);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn confirm-btn btn-ok']")));
        Boolean R1 = driver.findElement(By.xpath("//div[@class='confirm-dialog dialog ']")).isDisplayed();
        assertTrue(R1);

    }

    /**
     * 表格编辑页菜单，点击文档信息
     *
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test(enabled = true)
    public void sheet_msg() {
        login("autoTest16@shimo.im", "123123");

        click(desktop);
        click(desktop1_1);
        click(doc_menu);
        moveToElement(file_menu_help);
        click(file_menu_msg);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn confirm-btn btn-ok']")));
        Boolean R1 = driver.findElement(By.xpath("//div[@class='confirm-dialog dialog ']")).isDisplayed();
        assertTrue(R1);

    }
}
