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

    @Parameters({"browser", "nodeIp", "local", "testURL"})
    @BeforeClass
    public void firstMethod(String browser, String nodeIp, String local, String testURL) throws MalformedURLException {

        test_url = baseURL.getUrl();
        driver = init.initData(this, browser, nodeIp, local);
        action = new Actions(driver);
        String urlWithCookie;//set cookies
        if(local.equals("true")){
            urlWithCookie = baseURL.getUrlWithCookie();
        }else{
            urlWithCookie = testURL;
        }
        if(!urlWithCookie.isEmpty()){
            jumpToURL(urlWithCookie);
        }
        jumpToURL(test_url + "login");
        checkAlert();//检查异常Alert

//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 6);
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);//设置全局等待元素时间
    }

    @BeforeMethod
    public void setUp() {
        //屏蔽基础版和到期企业版提示付费的弹窗
        Cookie cookie = new Cookie("DEBUG_CLOSE_AUTO_MODAL", "1", "/", null);
        driver.manage().addCookie(cookie);
        //屏蔽表单弹窗
        Cookie cookie_1 = new Cookie("DEBUG_CLOSE_GUIDE_MODAL", "1", "/", null);
        driver.manage().addCookie(cookie_1);
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

        if (!driver.getCurrentUrl().startsWith(test_url + "login")) {
            jumpToURL(test_url + "login");
        }
        wait.until(ExpectedConditions.elementToBeClickable(login_submit));
        userEmail.clear();
        sendKeys(userEmail, user);
        userPwd.clear();
        sendKeys(userPwd, pwd);
        click(login_submit);

        if (driver.getCurrentUrl().startsWith(test_url + "login")) {
            jumpToURL(test_url + "login");
        }

        agreement();

//        wait.until(ExpectedConditions.elementToBeClickable(desktop));
//        Boolean msg = doesWebElementExist(By.xpath("//div[@class='sm-tooltip-inner']"));
//        if(msg){
//            click(desktop_newTemplate);
//            click(Sticker_Face_x);
//        }

//        gooiest();//跳过引导页
//        Sticker_Face();//付费提示框
//        wait.until(ExpectedConditions.elementToBeClickable(desktop_new));
    }

    private void agreement(){
        Boolean r = doesWebElementExist(By.xpath("//div[@id='agreements-button-ok']"));
        if(r){
            driver.findElement(By.xpath("//div[@id='agreements-button-ok']")).click();
        }
    }

    /**
     * 跳过付费提示框
     *
     * @author 刘晨
     * @Time 2017-01-08
     */
    private  void Sticker_Face(){
        try {
            driver.navigate().refresh();// 刷新页面
            wait.until(ExpectedConditions.elementToBeClickable(Sticker_Face_x));
            Sticker_Face_x.click();

        }catch (Exception e){
            return;
        }
    }

    /**
     * 跳过引导页
     *
     * @author 刘晨
     * @Time 2017-01-08
     */
    private void gooiest(){

        try {
            wait.until(ExpectedConditions.elementToBeClickable(b_next));
            b_next.click();
            wait.until(ExpectedConditions.elementToBeClickable(b_finish));
            b_finish.click();

        }catch (Exception e){
            return;
        }

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

        jumpToURL(test_url + "login");
        wait.until(ExpectedConditions.elementToBeClickable(login_submit));
        sendKeys(userEmail, user);
        sendKeys(userPwd, pwd);
        click(login_submit);
    }


    /**
     * 注册
     *
     * @param type 1为手机注册 2为邮箱注册 3为手机成功注册
     * @author 刘晨
     * @Time 2019-3-21
     */
    public void Registered_new(String mobile_verifyCode, String user, String pwd, int type) {
        jumpToURL(test_url + "registType");
        WebElement tab = driver.findElement(By.xpath("//div[contains(text(),'立即注册个人版')]"));
        click(tab);
        if (type == 1) {
            sendKeys(input_registered_mobile, user);
            sendKeys(input_registered_password, pwd);
            if(user.equals("17610101523")){click(b_verifyCode);}
            sendKeys(verifyCode, mobile_verifyCode);
            click(button_registered);
        }else if(type == 2){
            click(link_registered_useEmail);
            sendKeys(input_registered_email, user);
            sendKeys(input_registered_password, pwd);
            click(button_registered);
        }else{
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
            jumpToURL(test_url + "login");
            driver.switchTo().alert().accept();
            action.sendKeys(Keys.ESCAPE);
        } catch (UnhandledAlertException e) {
            // 报错
            driver.switchTo().alert().accept();
            jumpToURL(test_url + "login");
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
        Set<String> winHandles = driver.getWindowHandles();
        List<String> it = new ArrayList<String>(winHandles);
        driver.switchTo().window(it.get(i));
    }

    /**
     * 删除浏览器多余标签页
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    public void pageInit() {
        Set<String> winHandles = driver.getWindowHandles();
        List<String> it = new ArrayList<String>(winHandles);
        int n = it.size();
        for (int i = 0; i < n - 1; i++) {
            driver.switchTo().window(it.get(i));
            driver.close();
        }

        winHandles = driver.getWindowHandles();
        it = new ArrayList<>(winHandles);
        driver.switchTo().window(it.get(0));
    }

    /**
     * Log
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    public void printLog(String className, String userID) {
        System.out.println(className + "[" + userID + "]");

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
     * 获取通讯录信息，注：需要通讯录里所有成员都绑定了邮箱；
     *
     * @author 刘晨
     * @Time 2019-11-27
     */
    public int getMemberList(String email) {
        checkPageIsReady();
        doesWebElementExist(memberList_email_1);
        int i = driver.findElements(By.xpath("//td[@data-test='email-cell']")).size();
        List<String> memberList = new ArrayList<>(); //获取成员列表中所有成员的邮箱地址；
        for(int n = 0; n<i; n++){
            int m = n + 1;
            String memberName = getText((By.xpath("(//td[@data-test='email-cell'])"+ "[" + m + "]")));
            memberList.add(n ,memberName);
        }
        int r = memberList.indexOf(email);//根据邮箱地址，判断当前成员所处于的位置
        if(r == -1){
            System.out.println(email + "该邮箱用户不存在");
            System.out.println("当前列表中用户数"  +  i);
            assertTrue(false);
        }
        return r + 1;
    }

    /**
     * 选中通讯录中的指定成员，注：需要通讯录里所有成员都绑定了邮箱；
     *
     * @author 刘晨
     * @Time 2019-11-27
     */
    public void selectMember(String email) {
        int i = getMemberList(email);
        driver.findElement(By.xpath("(//td[@data-test='select-cell'])"+ "[" + i + "]")).click();
    }

    /**
     * 控制通讯录中的指定成员，注：需要通讯录里所有成员都绑定了邮箱；
     *
     * @author 刘晨
     * @Time 2019-11-27
     */
    public void controlMember(String email) {
        int i = getMemberList(email);
        driver.findElement(By.xpath("(//div[@data-test='action'])"+ "[" + i + "]")).click();

    }

    /**
     * 判断通讯录中是否存在指定成员，注：需要通讯录里所有成员都绑定了邮箱；
     *
     * @author 刘晨
     * @Time 2019-11-27
     */
    public Boolean checkMember(String email) {
        checkPageIsReady();
        doesWebElementExist(memberList_email_1);
        int i = driver.findElements(By.xpath("//td[@data-test='email-cell']")).size();
        List<String> memberList = new ArrayList<>(); //获取成员列表中所有成员的邮箱地址；
        for(int n = 0; n<i; n++){
            int m = n + 1;
            String memberName = getText((By.xpath("(//td[@data-test='email-cell'])"+ "[" + m + "]")));
            memberList.add(n ,memberName);
        }
        Boolean r = memberList.contains(email);//判断通讯录中是否存在指定邮箱地址
        return r;
    }


    /**
     * 判断元素是否存在
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    public boolean doesWebElementExist(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 1);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 右键点击
     *
     * @author 刘晨
     * @Time 2018-03-23
     */
    public void contextClick(WebElement element) {
//        int num = 0;
//        while (num < 2){
            try {
                wait.until(ExpectedConditions.elementToBeClickable(element));
                action.contextClick(element).perform();
//                break;
            } catch (NoSuchElementException e) {
                System.out.println(element + "is missing");
            } catch (StaleElementReferenceException e){

            }
//            num++;
//        }
    }

    /**
     * 添加管理者，通过邮箱/手机号添
     *
     * @param email 添加管理者邮箱地址
     * @param n 打开协作面板的入口类型
     * @author 刘晨
     * @Time 2019-07-25
     */
    public void addAdminByEmail(String email, int n) {
        switch(n){
            case 1 ://桌面菜单添加协作者
                click(menu_cooperation);//点击菜单上的【协作】按钮
                click(b_spacingCollaborator_addAdmin);
                sendKeys(input_add_Collaborator, email);
                for(int i=0; i < 10; i++){
                    Boolean r = getTextWithoutWait(list_collaboratorEmail_1).equals(email);
                    if(r){break;}
                }
                click(b_spacingCollaborator_addAdmin_1);
                click(b_spacingCollaborator_close);
                break;
            default : //可选
                //语句
        }
    }

    /**
     * 添加协作者，通过邮箱/手机号添
     *
     * @param email 添加协作邮箱地址
     * @param n 打开协作面板的入口类型
     * @author 刘晨
     * @Time 2019-07-25
     */
    public void addCollaboratorByEmail(String email, int n) throws InterruptedException {

        switch(n){
            case 1 ://桌面菜单添加协作者
                click(menu_cooperation);//点击菜单上的【协作】按钮
                click(b_add_Collaborator);
                sendKeys(input_add_Collaborator, email);
                Thread.sleep(2000);
                for(int i=0; i < 10; i++){
                    Boolean r = getText(list_collaboratorEmail_1).equals(email);
                    if(r){break;}
                }
                click(b_add_CollaboratorList_1);
                click(cpList_edit);
                click(b_spacingCollaborator_close);
                break;


            case 2 ://文件夹内右侧直接打开协作面板
                sendKeys(input_add_Collaborator, email);
                Thread.sleep(2000);
                for(int i=0; i < 10; i++){
                    Boolean r = getTextWithoutWait(list_collaboratorEmail_1).equals(email);
                    if(r){break;}
                }
                click(b_add_CollaboratorList_1);
                click(cpList_edit);
                click(b_spacingCollaborator_close);
                break; //可选
            case 3 ://mobile添加协作
                sendKeys(input_add_Collaborator, email);
                Thread.sleep(800);
                for(int i=0; i < 10; i++){
                    Boolean r = getTextWithoutWait(list_collaboratorEmail_1).equals(email);
                    if(r){break;}
                }
                click(b_add_CollaboratorList_1);
                click(cpList_edit);
                break; //可选
            default :
                //语句
        }

    }


    /**
     * 移除协作者，通过邮箱/手机号移除
     *
     * @param email
     * @author 刘晨
     * @Time 2019-07-25
     */
    public void removeCollaboratorByEmail(String email) {
        click(menu_cooperation);
        click(b_add_Collaborator);
        sendKeys(input_add_Collaborator, email);
        for(int i=0; i < 5; i++){
            Boolean r = getText(list_collaboratorEmail_1).equals(email);
            if(r){break;}
        }
        wait.until(ExpectedConditions.elementToBeClickable(b_add_CollaboratorList_1));
        b_add_CollaboratorList_1.click();
        click(cpList_remove);
    }

    /**
     * 移除协作者，通过所处协作者列表位置
     *
     * @param i
     * @author 刘晨
     * @Time 2019-07-25
     */
    public void removeCollaboratorByPosition(int i) throws InterruptedException {
        click(menu_cooperation);
        WebElement b_collaboratorPosition = null;
        switch (i){
            case 1:
                b_collaboratorPosition = b_collaboratorsList_1;
                break;
            case 2:
                b_collaboratorPosition = b_collaboratorsList_2;
                break;
            case 3:
                b_collaboratorPosition = b_collaboratorsList_3;
                break;
        }
        click(b_collaboratorPosition);
        click(cpList_remove);
        Thread.sleep(1000);
        if(doesWebElementExist(b_spacingCollaborator_close)){
            b_spacingCollaborator_close.click();
        }

    }

    /**
     * 移除管理者，通过所处协作者列表位置
     *
     * @param i
     * @author 刘晨
     * @Time 2019-07-25
     */
    public void removeAdminByPosition(int i) {
        click(menu_cooperation);
        WebElement b_collaboratorPosition = null;
        switch (i){
            case 1:
                b_collaboratorPosition = b_adminList_1;
                break;
            case 2:
                b_collaboratorPosition = b_adminList_2;
                break;
            case 3:
                b_collaboratorPosition = b_adminList_3;
                break;
        }
        click(b_collaboratorPosition);
        click(b_spacingCollaborator_removeAdmin);
        click(b_spacingCollaborator_removeAdmin_confirm);
        if(doesWebElementExist(b_spacingCollaborator_close)){
            click(b_spacingCollaborator_close);
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
            wait.until(ExpectedConditions.visibilityOf(element));
            action.moveToElement(element).perform();

        } catch (NoSuchElementException e) {
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
//        int num = 0;
//        while(num<3) {
//        num++;
        try {
            if (element.toString().equals(b_back.toString())  || element.toString().equals(Back_to_Desktop.toString())
                    || element.toString().equals(Back_to_Dashboard.toString()) || element.toString().equals(doc_menu_delete_OK.toString())) {
                // 离开文档表格编辑页
                checkPageIsReady();
                wait.until(ExpectedConditions.elementToBeClickable(element));
                wait.until(ExpectedConditions
                        .invisibilityOfElementWithText(By.xpath("//span[@id='save-status']//span[2]"), "正在保存..."));
                element.click();
                driver.switchTo().alert().accept();
            } else if (element.toString().equals(desktop.toString())) {
                // 点击我的桌面
                clickDesktop(element);
            } else if (element.toString().equals(b_addCollaborator_1_add.toString())) {
                // 点击添加协作者
                addCollaborator(element);
            } else if (element.toString().equals(list_addCollaborator_4.toString())) {
                wait.until(ExpectedConditions.elementToBeClickable(list_addCollaborator_4));
                list_addCollaborator_4.click();
                wait.until(ExpectedConditions.elementToBeClickable(list_addCollaborator_4_ok));
                list_addCollaborator_4_ok.click();
            } else if(element.toString().equals(b_add_CollaboratorList_1.toString())|| element.toString().equals(b_department_2.toString())|| element.toString().equals(b_department_1.toString())){
                //协作空间，添加协作者
                space_addCollaborator(element);
            } else if (element.toString().equals(dashboard_activitiesByFile.toString())) {
                clickDashboardActivitiesByFile(dashboard_activitiesByFile);
            }  else if (element.toString().equals(menu_createCopy.toString())) {

                wait.until(ExpectedConditions.elementToBeClickable(menu_createCopy));
                menu_createCopy.click();
                wait.until(ExpectedConditions.visibilityOf(toast_msg));

            }  else if (element.toString().equals(space_listing_1.toString()) || element.toString().equals(space_listing_2.toString()) || element.toString().equals(space_listing_3.toString()) || element.toString().equals(space_listing_4.toString()) || element.toString().equals(space_listing_5.toString()) || element.toString().equals(space_listing_6.toString()) || element.toString().equals(space_listing_7.toString()) || element.toString().equals(space_listing_8.toString()) || element.toString().equals(space_listing_9.toString())) {
                element.click();
                Boolean r = doesWebElementExist(b_space_tooltipConfirm);
                if(r){
                    click(b_space_tooltipConfirm);
                    wait.until(ExpectedConditions.invisibilityOf(b_space_tooltipConfirm));
                }
            } else {
                wait.until(ExpectedConditions.elementToBeClickable(element));
                element.click();
            }
        } catch (NoSuchElementException e) {
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
        } catch(StaleElementReferenceException e){
            System.out.println("element is not attached to the page document;["+element+"]");
        }catch (JavascriptException e) {
            String msg = driver.switchTo().alert().getText();
            System.out.println("Unhandled Alert :" + msg);
            System.out.println("javascript Error:" + e.getMessage());
            assertTrue(false);
        } finally {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            checkPageIsReady();
//            break;
        }
//        }
    }

    /**
     * 桌面添加协作者
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    public void addCollaborator(WebElement element) {
        String msg = getText(element);
        if (msg.equals("添加") || msg.equals("邀请")) {
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
     * 修改协作者权限
     *
     * @author 刘晨
     * @Time 2019-4-2
     * @param permissions read, edit, discuss
     */
    public void modifyPermissions(WebElement element, String permissions){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        switch(permissions){
            case "edit" ://可编辑
                wait.until(ExpectedConditions.elementToBeClickable(cpList_edit));
                cpList_edit.click();
                break;

            case  "read"://只读
                wait.until(ExpectedConditions.elementToBeClickable(cpList_onlyRead));
                cpList_onlyRead.click();
                break;

            case  "discuss"://只评论
                wait.until(ExpectedConditions.elementToBeClickable(cpList_onlyDiscuss));
                cpList_onlyDiscuss.click();
                break;

            default : //可选
                System.out.print("参数错误");
        }

    }



    /**
     * 协作空间添加协作者
     *
     * @author 刘晨
     * @Time 2019-4-2
     */
    public void space_addCollaborator(WebElement element) {
        String msg = getText(element);
        if (msg.equals("添加权限")) {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } else {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            wait.until(ExpectedConditions.elementToBeClickable(cpList_remove));
            click(cpList_remove);
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
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();

            Boolean fileCheck = doesWebElementExist(desktop1_1);
            if(fileCheck){
                Boolean checkFileName = getText(desktop1_1).endsWith("_tmp");
                if(checkFileName){
                    delFile(desktop1_1);
                }
            }
            checkPageIsReady();
    }

    /**
     * 点击切换到我的桌面
     *
     * @author 刘晨
     * @Time 2017-11-21
     */
    public void clickDesktopByDefaultOrder(WebElement element) {
        String msg = "";
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            click(desktop_order);
            Boolean order1 = doesWebElementExist(By.xpath("(//span[@class='check-mark'])[6]/*[name()='svg']"));

            click(desktop_orderByDefault);
            if(order1){
                click(desktop_order);
                click(desktop_orderByFolderUP);
            }

        } finally {
            click(desktop_show_type_grid);

            Boolean fileCheck = doesWebElementExist(desktop1_1);
            if(fileCheck){
                Boolean checkFileName = getText(desktop1_1).endsWith("_tmp");
                if(checkFileName){
                    delFile(desktop1_1);
                }
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
        int num = 0;
        while(num<5){
            try {
                wait.until(ExpectedConditions.visibilityOf(element));
                msg = element.getText();
                break;
            } catch (NoSuchElementException e) {
                System.out.println(element + "is missing");
            } catch (StaleElementReferenceException e){
                System.out.println("element is not attached to the page document;["+element+"]");
            }
            num++;
        }
        return msg;
    }

    /**
     * 删除文件
     *
     * @author 刘晨
     * @Time 2020-08-13
     */
    public void delFile(WebElement element) {

        contextClick(element);
        click(menu_delete);
        click(desktop_newFolder_name_ok);
    }

    /**
     * 获取文本信息
     *
     * @author 刘晨
     * @Time 2018-03-23
     */
    public String getTextWithoutWait(WebElement element) {
        String msg = "";
        int num = 0;
        while(num<10){
            try {
                msg = element.getText();
                break;
            } catch (NoSuchElementException e) {
                System.out.println(element + "is missing");
            } catch (StaleElementReferenceException e){
                System.out.println("element is not attached to the page document;["+element+"]");
            }
            num++;
        }
        return msg;
    }

    public  void  clickDashboardActivitiesByFile(WebElement element){

        Boolean r1 = doesWebElementExist(dashboard_activitiesByMember);
        if(r1){
            wait.until(ExpectedConditions.visibilityOf(dashboard_activitiesByMember));
            dashboard_activitiesByMember.click();
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
        }else{
            return;
        }

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
            System.out.println(element + "is missing");
        }
        return msg;
    }

    /**
     * 获取协作者列表中协作者数量
     *
     * @author 刘晨
     * @Time 2018-03-23
     */
    public int getCollaboratorSize() {
        int count_parent = 0;
        int count_collaborator = 0;
        int count_admin = 0;
        int total = 0;
        Boolean b_parent = doesWebElementExist(b_checkParent);
        if(b_parent){click(b_checkParent);}

        Boolean parent = doesWebElementExist(By.xpath("//div[@data-test='row_superior_permission']"));
        Boolean collaborator = doesWebElementExist(By.xpath("//div[@data-test='row_collab']"));
        Boolean admin = doesWebElementExist(By.xpath("//div[@data-test='row_admin']"));
        if (parent){
            count_parent = driver.findElements(By.xpath("//div[@data-test='row_superior_permission']")).size();
        }
        if(collaborator){
            count_collaborator = driver.findElements(By.xpath("//div[@data-test='row_collab']")).size();
//            if (b_parent){count_collaborator = count_collaborator - 1;}
        }
        if(admin){
            count_admin = driver.findElements(By.xpath("//div[@data-test='row_admin']")).size();
        }
        total = count_parent + count_collaborator + count_admin;
        return total;
    }

    /**
     * 协作空间，协作面板获取协作者列表中协作者数量
     *
     * @author 刘晨
     * @Time 2018-03-23
     */
    public int getSpaceCollaboratorSize() {
        int result = 0;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(@class,'_scroll_list_wrapper_')]")));
            result = driver.findElements(By.xpath("//div[@data-test='row_collab']")).size();
        } catch (NoSuchElementException e) {
            return 0;
        }
        return result;
    }

    /**
     * 输入内容
     *
     * @param
     * @author 刘晨
     * @Time 2018-04-16
     */
    public void sendKeys(WebElement element, String msg) {
        if(element.toString().equals(input_add_Collaborator.toString())){
            //协作空间，协作面板，需要先点击在输入
            click(element);
            wait.until(ExpectedConditions.visibilityOf(input_add_Collaborator_1));
            input_add_Collaborator_1.sendKeys(msg);
        }else{
            wait.until(ExpectedConditions.visibilityOf(element));
            element.sendKeys(msg);
        }
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
     * 跳转到指定链接
     *
     * @param
     * @author 刘晨
     * @Time 2019-7-11
     */
    public void jumpToURL(String url) {
        driver.navigate().to(url);
    }

    /**
     * 获得元素属性值
     *
     * @param
     * @author 刘晨
     * @Time 2019-7-11
     */
    public String getAttribute(WebElement element, String attribute) {
        wait.until(ExpectedConditions.visibilityOf(element));
        String msg = element.getAttribute(attribute);
        return msg;
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

    /**
     * 返回driver
     *
     * @author 刘晨
     * @Time 2018-04-10
     */
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
     * 检测是否存在Alert
     *
     * @author 刘晨
     * @Time 2019-07-15
     */
    public void checkAlert() {
        try {
            driver.switchTo().alert().accept();
        }catch (NoAlertPresentException e){
            return;
        }
    }

    /**
     * Selenium wait
     *
     * @author 刘晨
     * @Time 2020-08-19
     */
    public WebElement expWaitForElement(By locator, int timeout) {
        WebElement element = null;
        try {
            System.out.println(timeout + "秒之后出现");
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println("元素出现了");
        } catch (Exception e) {
            System.out.println("元素不存在");
            e.printStackTrace();
        }
        return element;
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
            e.printStackTrace();
        }
        String className = new Exception().getStackTrace()[1].getMethodName();
        ScreenShot st = new ScreenShot(driver);
        st.takeScreenshot(className);
    }

}
