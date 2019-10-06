package retrylogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

	int counter =0;
	int retrycount = 4;
	
	public boolean retry(ITestResult result) {
		
		if(counter<retrycount)
		{
			counter++;
			return true;
		}
		
		return false;
	}

}
