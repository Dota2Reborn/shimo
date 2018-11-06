package cases.desktop;

import base.TestInit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class testDesktopOrderBy extends TestInit {
    /**
     * 桌面排序as更新时间
     *
     * @author 刘晨
     * @Time 2017-11-28
     */
    @Test(enabled = true)
    public void order_setting_byUpdate() throws InterruptedException {
        login("autoTest02@shimo.im", "123123");

        click(desktop);
        click(desktop_show_type);
        click(desktop_order);
        click(desktop_orderByUpdate);

        Thread.sleep(1000);
        Boolean f1 = desktop_list_1_file.getText().equals("最近更新");
        Boolean f2 = desktop_list_2_file.getText().equals("最新创建");
        Boolean f3 = desktop_list_3_file.getText().equals("111");

        click(desktop_order);
        click(desktop_orderByDefault);
        assertTrue(f1 && f2 && f3);

    }

    /**
     * 桌面排序as创建时间
     *
     * @author 刘晨
     * @Time 2017-11-28
     */
    @Test(enabled = true)
    public void order_setting_byCreate() {
        login("autoTest02@shimo.im", "123123");

        click(desktop);
        click(desktop_show_type);
        click(desktop_order);
        click(desktop_orderByCreate);

        Boolean f1 = desktop_list_1_file.getText().equals("最新创建");
        Boolean f2 = desktop_list_2_file.getText().equals("111");
        Boolean f3 = desktop_list_3_file.getText().equals("最近更新");

        click(desktop_order);
        click(desktop_orderByDefault);
        assertTrue(f1 && f2 && f3);

    }

    /**
     * 桌面排序as文件名
     *
     * @author 刘晨
     * @Time 2017-11-28
     */
    @Test(enabled = true)
    public void order_setting_byFileName() {
        login("autoTest02@shimo.im", "123123");

        click(desktop);
        click(desktop_show_type);
        click(desktop_order);
        click(desktop_orderByFile);

        Boolean f1 = desktop_list_1_file.getText().equals("111");
        Boolean f2 = desktop_list_2_file.getText().equals("表格排序");
        Boolean f3 = desktop_list_3_file.getText().startsWith("所有者排序");

        click(desktop_order);
        click(desktop_orderByDefault);

        assertTrue(f1 && f2 && f3);

    }

    /**
     * 桌面排序as所有者
     *
     * @author 刘晨
     * @Time 2017-11-28
     */
    @Test(enabled = true)
    public void order_setting_byOwner() {
        login("autoTest02@shimo.im", "123123");

        click(desktop);
        click(desktop_show_type);
        click(desktop_order);
        click(desktop_orderByOwner);

        Boolean f1 = desktop_list_1_file.getText().startsWith("所有者排序");
        Boolean f2 = desktop_list_2_file.getText().equals("最新创建");
        Boolean f3 = desktop_list_3_file.getText().equals("111");

        click(desktop_order);
        click(desktop_orderByDefault);
        assertTrue(f1 && f2 && f3);

    }

    /**
     * 桌面排序as文件夹置顶
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    @Test(enabled = true)
    public void order_setting_byFolderUP() {
        login("autoTest02@shimo.im", "123123");

        click(desktop);
        click(desktop_show_type);
        click(desktop_order);
        click(desktop_orderByFolderUP);
        click(desktop_order);
        click(desktop_orderByCreate);

        Boolean f1 = desktop_list_1_file.getText().equals("文件夹排序");
        Boolean f2 = desktop_list_2_file.getText().equals("最新创建");
        Boolean f3 = desktop_list_3_file.getText().equals("111");

        click(desktop_order);
        click(desktop_orderByFolderUP);
        assertTrue(f1 && f2 && f3);

    }

    /**
     * 桌面排序as创建时间,点击表头排序
     *
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test(enabled = true)
    public void order_setting_byCreate_Reverse() {
        login("autoTest02@shimo.im", "123123");

        click(desktop);
        click(desktop_show_type);
        click(desktop_order);
        click(desktop_orderByCreate);
        click(desktop_orderHeader_3);

        Boolean f1 = desktop_list_1_file.getText().equals("文档排序");
        Boolean f2 = desktop_list_2_file.getText().equals("表格排序");
        Boolean f3 = desktop_list_3_file.getText().equals("文件夹排序");

        click(desktop_order);
        click(desktop_orderByDefault);
        assertTrue(f1 && f2 && f3);

    }

    /**
     * 桌面排序as所有者，点击表头排序
     *
     * @author 刘晨
     * @Time 2018-03-19
     */
    @Test(enabled = true)
    public void order_setting_byOwner_Reverse() {
        login("autoTest02@shimo.im", "123123");

        click(desktop);
        click(desktop_show_type);
        click(desktop_order);
        click(desktop_orderByOwner);
        click(desktop_orderHeader_2);

        Boolean f1 = desktop_list_1_file.getText().startsWith("最新创建");
        Boolean f2 = desktop_list_2_file.getText().equals("111");
        Boolean f3 = desktop_list_3_file.getText().equals("最近更新");

        click(desktop_order);
        click(desktop_orderByDefault);
        assertTrue(f1 && f2 && f3);

    }

    /**
     * 桌面排序as文件名
     *
     * @author 刘晨
     * @Time 2017-11-28
     */
    @Test(enabled = true)
    public void order_setting_byFileName_Reverse() {
        login("autoTest02@shimo.im", "123123");

        click(desktop);
        click(desktop_show_type);
        click(desktop_order);

        click(desktop_orderByFile);
        click(desktop_orderHeader_1);

        Boolean f1 = desktop_list_1_file.getText().equals("最新创建");
        Boolean f2 = desktop_list_2_file.getText().equals("最近更新");
        Boolean f3 = desktop_list_3_file.getText().startsWith("文件夹排序");

        click(desktop_order);
        click(desktop_orderByDefault);

        assertTrue(f1 && f2 && f3);

    }
}
