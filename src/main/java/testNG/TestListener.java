package testNG;

import base.ScreenShot;
import base.TestInit;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.util.Iterator;

public class TestListener implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
		Iterator<ITestResult> listOfFailedTests = context.getFailedTests().getAllResults().iterator();
		while (listOfFailedTests.hasNext()) {
			ITestResult failedTest = listOfFailedTests.next();
			ITestNGMethod method = failedTest.getMethod();
			if (context.getFailedTests().getResults(method).size() > 1) {
				listOfFailedTests.remove();
			} else {
				if (context.getPassedTests().getResults(method).size() > 0) {
					listOfFailedTests.remove();
				}
			}
		}
	}

	// Following are all the method stubs that you do not have to implement

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String className = result.getMethod().getRealClass().toString();
		if(!className.startsWith("class ui.test")) {
			TestInit tb = (TestInit) result.getInstance();
			WebDriver driver = tb.getDriver();
			ScreenShot st = new ScreenShot(driver);
			st.removePic(result.getMethod().getMethodName());
		}
	}

	public void onTestFailure(ITestResult result) {
		TestInit tb = (TestInit) result.getInstance();
		WebDriver driver = tb.getDriver();
		ScreenShot st = new ScreenShot(driver);
		st.takeScreenshot(result.getMethod().getMethodName());
		System.out.println(result.getMethod().getMethodName() + " failed, the screenshot saved in "
				+ ScreenShot.getScreenShotPath() + " screenshot name : " + result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}
} // ends the class
