package base;

import elementFile.elementFile;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import testNG.TestListener;

import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertTrue;

@Listeners({TestListener.class})
public class TestInit extends elementFile {
    public WebDriver driver = null;
    public WebDriverWait wait = null;
    public Actions action = null;
    String test_url;
    baseFunc init = new baseFunc();
    configurationResource baseURL = new configurationResource();
    public String className;

    public TestInit() {

    }

    @Parameters({"browser", "nodeIp", "local"})
    @BeforeClass
    public void firstMethod(String browser, String nodeIp, String local) throws MalformedURLException {
        test_url = baseURL.getUrl();
        driver = init.initData(this, browser, nodeIp, local);
        action = new Actions(driver);

        String urlWithCookie = baseURL.getUrlWithCookie();
        if(!urlWithCookie.isEmpty()){
            driver.navigate().to(urlWithCookie);
        }
        driver.navigate().to(test_url + "login");
        // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 6);
    }

    @BeforeMethod
    public void setUp() {
//        Cookie cookie1 = new Cookie("lizard-view-enabled", "1", "/", null);
//        driver.manage().addCookie(cookie1);
//        System.out.println(">>>>>>>" + driver.manage().getCookieNamed("lizard-view-enabled").getValue() + "<<<<<<<<<<");
        String url = driver.getCurrentUrl();
        if (!url.equals(test_url + "login")) {
            logout();
        }
    }

    @AfterMethod
    public void tearDown() {
        pageInit();
    }

    @AfterClass
    public void lastMethod() {
        // System.out.println("--------------------------------------------");
        // 关闭浏览器
        // driver.close();
        driver.quit();
    }

    /**
     * 登录
     *
     * @throws InterruptedException
     * @author 刘晨
     * @Time 2017-11-21
     */
    public void login(String user, String pwd) {
        // className = new Exception().getStackTrace()[1].getMethodName();
        // printLog(className, user);

        if (!driver.getCurrentUrl().equals(test_url + "login")) {
            driver.navigate().to(test_url + "login");
        }
        wait.until(ExpectedConditions.elementToBeClickable(login_submit));
        userEmail.clear();
        sendKeys(userEmail, user);
        userPwd.clear();
        sendKeys(userPwd, pwd);
        click(login_submit);
        wait.until(ExpectedConditions.elementToBeClickable(desktop_new));
    }

    /**
     * 登录（登录报错验证）
     *
     * @author 刘晨
     * @Time 2017-01-08
     */
    public void login_error(String user, String pwd) {
        // className = new Exception().getStackTrace()[1].getMethodName();
        // printLog(className, user);

        driver.navigate().to(test_url + "login");
        wait.until(ExpectedConditions.elementToBeClickable(login_submit));
        sendKeys(userEmail, user);
        sendKeys(userPwd, pwd);
        // login_submit.click();
        click(login_submit);
    }

    /**
     * 注册
     *
     * @param type 1为手机注册 2为邮箱注册
     * @author 王继程
     * @Time 2017-11-21
     */
    public void Registered(String name, String user, String pwd, int type, String repwd) {
        if (type == 1) {
            driver.navigate().to(test_url + "register");
            wait.until(ExpectedConditions.elementToBeClickable(personalRegister));
            click(personalRegister);
            click(mobileRegister);
            sendKeys(userName, name);
            sendKeys(userMobile, user);
            sendKeys(Pwd, pwd);
            sendKeys(verifyCode, "2222");
            click(Next);
        } else if (type == 2) {
            driver.navigate().to(test_url + "register");
            wait.until(ExpectedConditions.elementToBeClickable(personalRegister));
            click(personalRegister);
            click(emailRegister);
            sendKeys(userName, name);
            sendKeys(Email, user);
            sendKeys(Pwd, pwd);
            sendKeys(rePwd, repwd);
            click(Next);
        } else {
            return;
        }
    }

    /**
     * 登出
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    public void logout() {
        try {
//            driver.manage().deleteAllCookies();
            driver.manage().deleteCookieNamed("userId");
            driver.manage().deleteCookieNamed("shimo_dev_sid");
            driver.navigate().to(test_url + "login");
//            driver.navigate().to(test_url + "logout");
            driver.switchTo().alert().accept();
            action.sendKeys(Keys.ESCAPE);
        } catch (UnhandledAlertException e) {
            // 报错
            driver.switchTo().alert().accept();
            driver.navigate().to(test_url + "logout");
            System.out.println("Unhandled Alert!!!!");
        } catch (NoAlertPresentException e) {
            // 正常情况
            action.sendKeys(Keys.ESCAPE);
        }
    }

    /**
     * 页签切换
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    public void switchToPage(int i) {
        Set<String> winHandels = driver.getWindowHandles();
        List<String> it = new ArrayList<String>(winHandels);
        driver.switchTo().window(it.get(i));
    }

    /**
     * 删除浏览器多余标签页
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    public void pageInit() {
        Set<String> winHandels = driver.getWindowHandles();
        List<String> it = new ArrayList<String>(winHandels);
        int n = it.size();
        for (int i = 0; i < n - 1; i++) {
            driver.switchTo().window(it.get(i));
            driver.close();
        }

        winHandels = driver.getWindowHandles();
        it = new ArrayList<String>(winHandels);
        driver.switchTo().window(it.get(0));
    }

    /**
     * Log
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    public void printLog(String classname, String userID) {
        System.out.println(classname + "[" + userID + "]");

    }

    /**
     * 删除桌面第一个文件
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    public void deleteFile() {
        click(desktop);
        contextClick(desktop1_1);
        click(menu_delete);
        click(desktop_newFolder_name_ok);

    }

    /**
     * 获取当前时间
     *
     * @author 刘晨
     * @Time 2018-04-19
     */
    public String getDate() {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("HHmm");
        String time = format.format(date);
        return time;
    }

    /**
     * 判断元素是否存在
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    public boolean doesWebElementExist(By selector) {

        try {
            driver.findElement(selector);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /**
     * 判断元素是否存在
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    public boolean doesWebElementExist(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            // TODO
            return false;
        }
    }

    /**
     * 右键点击moveToElement
     *
     * @author 刘晨
     * @Time 2018-03-23
     */
    public void contextClick(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            action.contextClick(element).perform();
        } catch (NoSuchElementException e) {
            // TODO
            System.out.println(element + "is missing");
        }

    }

    /**
     * 鼠标移动到元素
     *
     * @author 刘晨
     * @Time 2018-04-19
     */
    public void moveToElement(WebElement element) {
        try {
            if (element.toString().equals(menu_cooperation.toString())) {
                // 点击添加协作者
                wait.until(ExpectedConditions.visibilityOf(element));
                action.moveToElement(element).perform();
                click(menu_cooperation_2);
            } else {
                wait.until(ExpectedConditions.visibilityOf(element));
                action.moveToElement(element).perform();
            }

        } catch (NoSuchElementException e) {
            // TODO
            System.out.println(element + "is missing");
        }

    }

    /**
     * 左键点击事件
     *
     * @author 刘晨
     * @Time 2018-03-23
     */
    public void click(WebElement element) {
        try {
            if (element.toString().equals(b_back.toString()) || element.toString().equals(Back_to_Table.toString())
                    || element.toString().equals(Back_to_Desktop.toString())
                    || element.toString().equals(doc_menu_delete_OK.toString())) {
                // 离开文档表格编辑页
                wait.until(ExpectedConditions.elementToBeClickable(element));
                checkPageIsReady();
                wait.until(ExpectedConditions
                        .invisibilityOfElementWithText(By.xpath("//span[@id='save-status']//span[2]"), "正在保存..."));
                element.click();
                driver.switchTo().alert().accept();
            } else if (element.toString().equals(desktop.toString())
                    || element.toString().equals(favorites.toString())) {
                // 点击我的桌面，我的收藏
                clickDesktop(element);
            } else if (element.toString().equals(b_addCollaborator_1_add.toString())) {
                // 点击添加协作者
                addCollaborator(element);
            } else if (element.toString().equals(list_addCollaborator_4.toString())) {
                wait.until(ExpectedConditions.elementToBeClickable(list_addCollaborator_4));
                list_addCollaborator_4.click();
                wait.until(ExpectedConditions.elementToBeClickable(list_addCollaborator_4_ok));
                list_addCollaborator_4_ok.click();
            } else {
                wait.until(ExpectedConditions.elementToBeClickable(element));
                element.click();
            }
        } catch (NoSuchElementException e) {
            // TODO
            System.out.println(element + "is missing");
            assertTrue(false);
        } catch (ElementClickInterceptedException e) {
            // 被遮挡
            System.out.println(element + "is obscuring");
            assertTrue(false);
        } catch (ElementNotVisibleException e) {
            // 不可见
            System.out.println(element + "is not visible");
            assertTrue(false);
        } catch (UnhandledAlertException e) {
            // 报错
            driver.switchTo().alert().accept();
            System.out.println("Unhandled Alert!!!!");
            assertTrue(false);
        } catch (TimeoutException e) {
            // 超时
            System.out.println("time out ->" + element);
            assertTrue(false);
        } catch (NoAlertPresentException e) {
            // 正常情况
        } catch (JavascriptException e) {
            String msg = driver.switchTo().alert().getText();
            System.out.println("Unhandled Alert :" + msg);
            System.out.println("javascript Error:" + e.getMessage());
            assertTrue(false);
        } finally {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            checkPageIsReady();
        }
    }

    public void addCollaborator(WebElement element) {
        String msg = getText(element);
        if (msg.equals("添加")) {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } else {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            wait.until(ExpectedConditions.elementToBeClickable(list_addCollaborator_4));
            click(list_addCollaborator_4);
            assertTrue(false);
        }
    }

    /**
     * 点击切换到我的桌面
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    public void clickDesktop(WebElement element) {
        String msg = "";
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            msg = desktop_order.getText();
            if (msg.equals("更新时间")) {
                desktop_order.click();
                wait.until(ExpectedConditions.elementToBeClickable(desktop_orderByFolderUP));
                desktop_orderByFolderUP.click();

                desktop_order.click();
                wait.until(ExpectedConditions.elementToBeClickable(desktop_orderByDefault));
                desktop_orderByDefault.click();
            }
        } finally {
            msg = desktop_show_type.getText();
            if (msg.equals("平铺")) {
                desktop_show_type.click();
            }
            checkPageIsReady();
        }

    }

    /**
     * 获取文本信息
     *
     * @author 刘晨
     * @Time 2018-03-23
     */
    public String getText(WebElement element) {
        String msg = "";
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            msg = element.getText();
        } catch (NoSuchElementException e) {
            // TODO
            System.out.println(element + "is missing");
        }
        return msg;
    }

    /**
     * 获取文本信息
     *
     * @author 刘晨
     * @Time 2018-03-23
     */
    public String getText(By element) {
        String msg = "";
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            msg = driver.findElement(element).getText();
        } catch (NoSuchElementException e) {
            // TODO
            System.out.println(element + "is missing");
        }
        return msg;
    }

    /**
     * 输入内容
     *
     * @param
     * @author 刘晨
     * @Time 2018-04-16
     */
    public void sendKeys(WebElement element, String msg) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(msg);
    }

    /**
     * 获取URL
     *
     * @param
     * @author 刘晨
     * @Time 2018-10-09
     */
    public String getURL() {
        return test_url;
    }

    /**
     * 通过JS判断页面是否加载完毕
     *
     * @author 刘晨
     * @Time 2018-04-10
     */
    public void checkPageIsReady() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            if ("complete".equals(js.executeScript("return document.readyState").toString())) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    /**
     * 等待元素加载
     *
     * @author 刘晨
     * @Time 2018-01-25
     */
    public void waitFor() {

    }

    /**
     * UI像素比对截图
     *
     * @author 刘晨
     * @Time 2018-05-23
     */
    public void screenShot() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String className = new Exception().getStackTrace()[1].getMethodName();
        ScreenShot st = new ScreenShot(driver);
        st.takeScreenshot(className);
    }
    
    /**
	 * 元素透明度和X，Y坐标
	 * 
	 * @author 张家晶
	 * @Time 2018-10-09
	 * ele1 输入框，ele2上箭头， ele3下箭头
	 */
	public void opacityAndCoord(WebElement ele1, WebElement ele2, WebElement ele3) {
		if(ele1.isDisplayed() && ele2.isDisplayed() && ele3.isDisplayed()) {
			action.click(ele1).sendKeys(Keys.chord(Keys.CONTROL, "a"))
			.sendKeys(Keys.NUMPAD7).sendKeys(Keys.NUMPAD0).build().perform();
			for (int i = 1; i < 11; i++) {//上箭头
				click(ele2);
			}
			for (int j = 1; j < 6; j++) {//下箭头
				click(ele3);
			}
		}
	}

}
