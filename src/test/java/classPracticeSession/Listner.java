package classPracticeSession;

import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Executing before test cases.");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Executing after test cases success.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Executing after test cases failure.");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Executing when test cases skipped.");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Executing before all test cases.");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Executing after all test cases.");
	}
}
