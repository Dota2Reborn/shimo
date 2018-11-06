package cases.dashboard;

import base.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class dashboard_shared extends TestInit {


    /**
     * 共享给我
     * 卡片样式
     *
     * @author 陈清杰
     * @Time2018-03-21 账号状态：gx1有，gx2没有
     */
    @Test
    public void shared1() throws InterruptedException {
        login("gx1@shimo.im", "123123");
        click(dashboard_3);
        contextClick(dashboard_update_name);
        Thread.sleep(1000);
        moveToElement(menu_cooperation);
        click(button_addCollaborator);
        sendKeys(input_addCollaborator, "gx2@shimo.im");
        Thread.sleep(500);
        click(b_addCollaborator_1_add);
        click(b_addCollaborator_ok);
        logout();
        login("gx2@shimo.im", "123123");
        click(dashboard_4);
        wait.until(ExpectedConditions.elementToBeClickable(menu_Point_Menu));
        boolean b = driver.findElement(By.xpath("//div[@class='card-icon']//div")).isDisplayed();//卡片图标
        boolean c = driver.findElement(By.xpath("//div[@class='card-icon']//span")).isDisplayed();//卡片图标
        boolean text = driver.findElement(By.xpath("//div[@class='card-content-title']//div[1]")).getText().equals("无标题");
//        boolean text1 = getText(dashboard_update_time).equals("2人共享 · 刚刚 共享 共享");
        boolean text1 = getText(dashboard_update_time).equals("刚刚 共享 共享");
        WebElement card = driver.findElement(By.xpath("//div[@class='category-card-container']"));
        moveToElement(card);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='category-card-container']//div//a//div[1]//div[2]//div//div[2]")));
        boolean d = driver.findElement(By.xpath("//div[@class='category-card-container']//div//a//div[1]//div[2]//div//div[2]")).isDisplayed();
        boolean e = driver.findElement(By.xpath("//div[@class='file-options-icon']")).isDisplayed();
        assertTrue(b && c && text && text1 && d && e);
        Thread.sleep(200);
        contextClick(dashboard_update_name);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
    }

    /**
     * 共享给我
     * hover收藏
     *
     * @author 陈清杰
     * @Time2018-03-22 账号状态：gx4有gx3共享的文件
     */
    @Test
    public void shared2() {
        login("gx4@shimo.im", "123123");
        click(dashboard_4);
        moveToElement(dashboard_share_file_1);
        click(dashboard_share_file_favorites);
        click(favorites);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tile-inner']//div//a//div[2]")));
        String text = driver.findElement(By.xpath("//div[@class='tile-inner']//div//a//div[2]")).getText();
        assertEquals(text, "共享");


        click(dashboard);
        click(dashboard_4);
        moveToElement(dashboard_share_file_1);
        click(dashboard_share_file_favorites);
        click(favorites);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='none-file']//span")));
        String text2 = driver.findElement(By.xpath("//div[@class='none-file']//span")).getText();
        assertEquals(text2, "没有文件");


    }

    /**
     * 共享给我
     * 卡片点点点选项验证（正常）
     *
     * @author 陈清杰
     * @Time2018-03-22 账号状态:gx5@shimo.im有固定文件；gx6@shimo.im有5共享的固定文件
     */
    @Test
    public void shared3() {


        login("gx6@shimo.im", "123123");
        click(dashboard_4);
        click(menu_Point_Menu);
        boolean text1 = getText(menu_newPage).equals("在新标签页中打开");
        boolean text2 = getText(menu_mute).equals("消息免打扰");
        boolean text3 = getText(menu_shortcut).equals("添加到快捷方式");
        boolean text4 = getText(menu_collection).equals("收藏");
        boolean text6 = getText(menu_cooperation).equals("2 人协作");
        boolean text7 = getText(menu_move).equals("移动");
        boolean text9 = getText(menu_moveToFolder).equals("定位到所在文件夹");
        boolean text10 = getText(menu_rename).equals("重命名");
        boolean text11 = getText(menu_creatCopy).equals("创建副本");
        boolean text13 = getText(menu_delete).equals("删除");
        assertTrue(text1 && text2 && text3 && text4 && text6 && text7 && text9 && text10 && text11 && text13);


    }
    /**
     *共享给我
     *先共享文件，再共享包含该文件的文件夹，生成两个卡片
     * @author 陈清杰
     * @Time2018-03-23
     * */
	/*@Test
	public void shared4()throws InterruptedException{
		login("gx7@shimo.im", "123123");
		wait.until(ExpectedConditions.elementToBeClickable(desktop));
		desktop.click();
		wait.until(ExpectedConditions.elementToBeClickable(desktop1_1_folder));
		desktop1_1_folder.click();
		wait.until(ExpectedConditions.elementToBeClickable(desktop1_1));
		action.moveToElement(desktop1_1).perform();
	    wait.until(ExpectedConditions.elementToBeClickable(desktop_setting));
	    desktop_setting.click();
	    wait.until(ExpectedConditions.elementToBeClickable(menu_cooperation));
	    menu_cooperation.click();
		wait.until(ExpectedConditions.elementToBeClickable(input_addCollaborator));
		input_addCollaborator.sendKeys("gx8@shimo.im");
		wait.until(ExpectedConditions.elementToBeClickable(b_addCollaborator_1_add));
	    b_addCollaborator_1_add.click();
	    wait.until(ExpectedConditions.elementToBeClickable(Shut_down_sm_modal_close_x));
        Shut_down_sm_modal_close_x.click();
	    logout();
	    
	    login("gx8@shimo.im", "123123");
	    wait.until(ExpectedConditions.elementToBeClickable(dashboard_4));
	    dashboard_4.click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='file-options-icon']")));
	    String text = driver.findElement(By.xpath("//div[@class='card-content-title']//div[1]")).getText();
	    assertEquals(text, "我是文件");
	    driver.findElement(By.xpath("//div[@class='card-content-update']")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(b_back));
	    click(b_back);
	    
	    
	    logout();
	    login("gx7@shimo.im", "123123");
	    wait.until(ExpectedConditions.elementToBeClickable(desktop));
	    desktop.click();
	    wait.until(ExpectedConditions.elementToBeClickable(desktop1_1_folder));
	    action.moveToElement(desktop1_1_folder).perform();
	    wait.until(ExpectedConditions.elementToBeClickable(desktop_setting));
	    desktop_setting.click();
	    wait.until(ExpectedConditions.elementToBeClickable(menu_cooperation));
	    menu_cooperation.click();
		wait.until(ExpectedConditions.elementToBeClickable(input_addCollaborator));
		Thread.sleep(300);
		input_addCollaborator.sendKeys("gx8@shimo.im");
		wait.until(ExpectedConditions.elementToBeClickable(b_addCollaborator_1_add));
	    b_addCollaborator_1_add.click();
	    wait.until(ExpectedConditions.elementToBeClickable(Shut_down_sm_modal_close_x));
        Shut_down_sm_modal_close_x.click();
        
        logout();
        login("gx8@shimo.im", "123123");
        wait.until(ExpectedConditions.elementToBeClickable(dashboard_4));
        dashboard_4.click();
        
        
	    
	    
	    
	    
	}*/


}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





