package cases.collection;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testCollection extends TestInit {

    /**
     * 新建文档收藏
     *
     * @author 王继程
     * @Time 2018-03-12
     */
    @Test(enabled = true)
    public void New_Document() {
        login("New_collection@shimo.im", "123123");
        click(dashboard);
        click(favorites);
        click(desktop_new);
        click(desktop_newDoc);
        click(Collection_OK);
        click(b_back);

        click(dashboard);
        click(favorites);
        Sort();
        String name = getText(desktop1_1_name);
        // contextClick(desktop1_1);
        moveToElement(desktop1_1);
        click(desktop_setting);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
//        Thread.sleep(500);
        assertEquals(name, "无标题");
    }

    /**
     * 新建表格收藏
     *
     * @author 王继程
     * @Time 2018-03-12
     */
    @Test(enabled = true)
    public void Create_Table() {
        login("New_collection@shimo.im", "123123");
        click(dashboard);
        click(favorites);
        click(desktop_new);
        click(desktop_newSheet);
        click(Collection_OK);
        click(b_back);

        click(dashboard);
        click(favorites);
        Sort();
        String name = getText(desktop1_1_name);
        // contextClick(desktop1_1);
        moveToElement(desktop1_1);
        click(desktop_setting);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
//        Thread.sleep(500);
        assertEquals(name, "无标题");

    }

    /**
     * 我的收藏-列表/平铺 模式切换
     *
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test
    public void desktop_show_type() {

        login("Collection@shimo.im", "123123");
        click(dashboard);
        click(favorites);
        Sort();
        click(desktop_show_type_list);

        Boolean result = false;
        Boolean exist1 = doesWebElementExist(desktop_orderHeader_1);

        click(desktop_show_type_grid);

        Boolean exist2 = doesWebElementExist(desktop_orderHeader_1);

        if (exist1 == true && exist2 == false) {
            result = true;
        }
        // driver.manage().deleteAllCookies();
        assertTrue(result);

    }

    /**
     * 收藏页面按创建时间排序，并且定位第一个文件夹所在位置
     *
     * @author 王继程
     * @Time 2018-03-19
     */
    @Test(enabled = true)
    public void Collection_Sort_1() {
        login("Collection@shimo.im", "123123");
        click(dashboard);
        click(favorites);
        wait.until(ExpectedConditions.elementToBeClickable(desktop_show_type_grid));
        Sort();
        click(desktop_order);
        click(desktop_orderByCreate);
        String name = getText(desktop1_1_name);
        assertEquals(name, "第四个创建的");
        contextClick(desktop1_1);
        click(menu_moveToFolder);
        String Folder_name = getText(space_title);
        assertEquals(Folder_name, "第三个创建的");

    }

    /**
     * 收藏页面按文件名排序，并且定位第一个文件夹所在位置
     *
     * @author 王继程
     * @Time 2018-03-19
     */
    @Test(enabled = true)
    public void Collection_Sort_2() {
        login("Collection@shimo.im", "123123");
        click(dashboard);
        click(favorites);
        wait.until(ExpectedConditions.elementToBeClickable(desktop_show_type_grid));
        Sort();
        click(desktop_order);
        click(desktop_orderByFile);
//        driver.navigate().refresh();
        String name1 = getText(desktop1_1_name);
        assertEquals(name1, "第一个创建的");
        click(desktop_order);
        click(desktop_orderByFile);
        String name2 = getText(desktop1_1_name);
        assertEquals(name2, "第四个创建的");

    }

    /**
     * 文件夹下文件在收藏页面创建副本 文件夹下是第四个创建的文件
     *
     * @author 王继程
     * @Time 2018-03-20
     */
    @Test(enabled = true)
    public void Collection_Sort_3() {
        login("Collection@shimo.im", "123123");
        click(dashboard);
        click(favorites);
        wait.until(ExpectedConditions.elementToBeClickable(desktop_show_type_grid));
        Sort();
        click(desktop_order);
        click(desktop_orderByCreate);
        // 刷新
//        driver.navigate().refresh();
        String name1 = getText(desktop1_1_name);
        contextClick(desktop1_1);
        click(menu_createCopy);
//        driver.navigate().refresh();
        contextClick(desktop1_1);
        click(menu_moveToFolder);

        driver.navigate().refresh();
        String name = getText(desktop1_1_name);
        if (name1 != name) {
            contextClick(desktop1_1);
            click(menu_delete);
            click(desktop_newFolder_name_ok);

        }

        String msg = "副本" + " " + "第四个创建的";
        assertEquals(msg, name);
    }

    // 验证排序是否初始化
    private void Sort() {
        wait.until(ExpectedConditions.elementToBeClickable(desktop_order));
        click(desktop_show_type_grid);
        click(desktop_order);
        Boolean order1 = doesWebElementExist(By.xpath("(//span[@class='check-mark'])[6]/*[name()='svg']"));

        click(desktop_orderByDefault);
        if(order1){
            click(desktop_order);
            click(desktop_orderByFolderUP);
        }
    }
}
