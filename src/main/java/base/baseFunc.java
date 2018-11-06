package base;

import com.google.common.base.Preconditions;
import elementFile.CustomFieldDecorator;
import elementFile.MyElementLocatorFactory;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import java.net.MalformedURLException;
import java.net.URL;

public class baseFunc {
    public WebDriver driver;
    String os;// 系统信息

    public baseFunc() {

    }

    /**
     * 加载json
     *
     * @throws MalformedURLException
     * @author 刘晨
     * @Time 2017-11-20
     */
    public WebDriver initData(Object xx, String browser, String nodeIp, String local) throws MalformedURLException {
        if (local.equals("true")) {
            os = System.getProperties().getProperty("os.name");
            Preconditions.checkArgument(StringUtils.isNotEmpty(os), "OS info is missing.");
            if (os.startsWith("Windows") && browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver",
                        "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");

                ChromeOptions option = new ChromeOptions();
                option.addArguments("disable-infobars");
//				option.addArguments("--headless");
                driver = new ChromeDriver(option);
            } else if (os.startsWith("Windows") && browser.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver",
                        "D:\\软件\\Mozilla Firefox\\geckodriver.exe");
                FirefoxOptions option = new FirefoxOptions();
                option.addArguments("disable-infobars");
                option.addPreference("browser.startup.page", 1);
                option.addPreference("browser.startup.homepage", "about:blank");
//				option.setHeadless(true);
                ProfilesIni pi = new ProfilesIni();
//				File profile_directory = new File("C:\\Users\\LiuC\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\95djexwa.default");
//				FirefoxProfile profile = new FirefoxProfile(profile_directory);
                FirefoxProfile profile = pi.getProfile("default");
                option.setProfile(profile);
                option.setLogLevel(FirefoxDriverLogLevel.ERROR);
                option.setBinary("D:\\软件\\Mozilla Firefox\\firefox.exe");
                driver = new FirefoxDriver(option);
            } else {
                ChromeOptions option = new ChromeOptions();
                option.addArguments("disable-infobars");
                driver = new ChromeDriver(option);
            }
        } else {
            os = System.getProperties().getProperty("os.name");
            if (browser.equals("ie")) {
                InternetExplorerOptions option = new InternetExplorerOptions();
                option.setCapability("browserName", "IE");
                option.setCapability("version", "11");
                option.setCapability("plaform", "WINDOWS");
                URL remoteAddress = new URL(nodeIp + "/wd/hub");
                driver = new RemoteWebDriver(remoteAddress, option);
            } else if (browser.equals("safari")) {
                SafariOptions option = new SafariOptions();
                option.setCapability("browserName", "safari");
                option.setCapability("version", "11");
                option.setCapability("plaform", "MAC");
                option.setCapability("javascriptEnabled", true);
                option.useCleanSession(true);
                URL remoteAddress = new URL(nodeIp + "/wd/hub");
                driver = new RemoteWebDriver(remoteAddress, option);
            } else if (browser.equals("firefox")) {
                FirefoxOptions option = new FirefoxOptions();
                option.addArguments("disable-infobars");
                option.setCapability("browserName", "firefox");
                option.setCapability("version", "60");
                option.setCapability("plaform", "ANY");
                URL remoteAddress = new URL(nodeIp + "/wd/hub");
                driver = new RemoteWebDriver(remoteAddress, option);
            } else {
                ChromeOptions option = new ChromeOptions();
                option.addArguments("disable-infobars");
//				option.addArguments("--headless");
                // option.addArguments("--kiosk");
                option.setCapability("browserName", "chrome");
                option.setCapability("version", "70");
                option.setCapability("plaform", "ANY");
                URL remoteAddress = new URL(nodeIp + "/wd/hub");
                driver = new RemoteWebDriver(remoteAddress, option);
            }
            // option.setCapability("chrome_binary", "C:\\Program Files
            // (x86)\\Google\\Chrome\\Application\\");
        }

//        driver.manage().window().maximize();
        ElementLocatorFactory locatorFactory = new MyElementLocatorFactory(driver);
        FieldDecorator customFieldDecorator = new CustomFieldDecorator(locatorFactory);
        PageFactory.initElements(customFieldDecorator, xx);
        return driver;

    }

}
