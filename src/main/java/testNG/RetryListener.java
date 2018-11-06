package testNG;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListener implements IAnnotationTransformer {
	public void transform(ITestAnnotation annotation, @SuppressWarnings("rawtypes") Class testClass,
                          @SuppressWarnings("rawtypes") Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer retry = annotation.getRetryAnalyzer();
		if (retry == null) {
			annotation.setRetryAnalyzer(Retry.class);
		}
	}
}
