package cases.recycle;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testRecycleBin extends TestInit {
    /**
     * 删除文件后恢复
     *
     * @author 王继程
     * @Time 2018-03-12
     */
    @Test(enabled = true)
    public void testRecycleBin_1() throws InterruptedException {
        login("RecycleBin@shimo.im", "123123");
        click(desktop);
//        Sort();
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
        Thread.sleep(1000);
        click(trash);
        wait.until(ExpectedConditions.elementToBeClickable(desktop1_1));
        String name = getText(desktop1_1_name);
        assertEquals(name, "删除恢复测试");
        contextClick(desktop1_1);
        click(menu_Recovery);
        click(desktop);
        wait.until(ExpectedConditions.elementToBeClickable(desktop1_1));
        String name1 = getText(desktop1_1_name);
        assertEquals(name1, "删除恢复测试");
    }

    /**
     * 删除文件后彻底删除
     *
     * @author 王继程
     * @Time 2018-03-12
     */
    @Test(enabled = true)
    public void Completely_removed() throws InterruptedException {
        login("Completely@shimo.im", "123123");

        click(desktop);
//        Sort();
        click(desktop_new);
        click(desktop_newDoc);
//        wait.until(ExpectedConditions.elementToBeClickable(doc_edit));
        sendKeys(doc_edit,"文档内输入内容，可进入回收站" + Keys.ENTER);
        //点点点
        click(doc_menu);
        //删除按钮
        click(file_menu_delete);
        //删除文档，确认删除
        click(doc_menu_delete_OK);
        click(trash);
        String name = getText(desktop1_1);
        assertEquals(name, "无标题");
        contextClick(desktop1_1);
        click(menu_Completely_removed);
        click(desktop_newFolder_name_ok);
        Thread.sleep(500);
        boolean bl = doesWebElementExist(By.className("none-file"));
        assertEquals(bl, true);

    }

    //排序初始化
    //验证排序是否初始化
//    public void Sort() {
//        wait.until(ExpectedConditions.elementToBeClickable(desktop_order));
//        String msg = desktop_show_type.getText();
//        if (msg.equals("平铺")) {
//            desktop_show_type.click();
//        }
//        msg = desktop_order.getText();
//        if (msg.equals("排序")) {
//            desktop_order.click();
//            wait.until(ExpectedConditions.elementToBeClickable(desktop_orderByDefault));
//            Boolean exist = doesWebElementExist(By.xpath("//span[@data-test='change-table-sort-folder-priority']/following-sibling::span[1]"));
//            desktop_orderByDefault.click();
//            if (exist == true) {
//                desktop_order.click();
//                wait.until(ExpectedConditions.elementToBeClickable(desktop_orderByFolderUP));
//                desktop_orderByFolderUP.click();
//            }
//        } else {
//            desktop_order.click();
//            wait.until(ExpectedConditions.elementToBeClickable(desktop_orderByFolderUP));
//            Boolean exist = doesWebElementExist(By.xpath("//span[@data-test='change-table-sort-folder-priority']/following-sibling::span[1]"));
//            if (exist == true) {
//                desktop_orderByFolderUP.click();
//            } else {
//                desktop_orderByDefault.click();
//            }
//        }
//
//    }
}
