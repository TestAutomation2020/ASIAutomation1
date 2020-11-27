package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStatistics implements ITestListener {

    private static final List<ITestNGMethod> passedTests = new ArrayList<ITestNGMethod>();
    private static final List<ITestNGMethod> failedTests = new ArrayList<ITestNGMethod>();
    private static final List<ITestNGMethod> skippedTests = new ArrayList<ITestNGMethod>();
    private static final Map<String, Integer> result = new HashMap<>();

    public static List<ITestNGMethod> getPassedTests() {
        return passedTests;
    }

    public static List<ITestNGMethod> getFailedTests() {
        return failedTests;
    }

    public static List<ITestNGMethod> getSkippedTests() {
        return skippedTests;
    }

    public static Map<String, Integer> getCount() {

        result.put("Skipped ", skippedTests.size());
        result.put("Failed ", failedTests.size());
        result.put("Passed ", passedTests.size());
        result.put("Total ",passedTests.size()+failedTests.size()+skippedTests.size());
        return result;
    }

    @Override
    public void onTestStart(ITestResult result) {
        result.getStartMillis();
    }

    @Override
    //This method will automatically be called if a test runs successfully
    public void onTestSuccess(ITestResult result) {
        //add the passed tests to the passed list
        passedTests.add(result.getMethod());

    }

    @Override
    //This method will automatically be called if a test fails
    public void onTestFailure(ITestResult result) {
        //add the failed tests to the failed list
        failedTests.add(result.getMethod());
    }

    @Override

    //This method will automatically be called if a test is skipped
    public void onTestSkipped(ITestResult result) {
        //add the skipped tests to the skipped list
        skippedTests.add(result.getMethod());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        result.getTestClass();
    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
