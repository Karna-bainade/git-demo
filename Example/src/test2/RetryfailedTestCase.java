package test2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryfailedTestCase implements IRetryAnalyzer{

	private int retryCnt=0;
	private int maxRetrycnt=2;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if (retryCnt<maxRetrycnt) {
			
			System.out.println("Retrying"+result.getName()+ " again and count is"+ (retryCnt+1));
			retryCnt++;
			return true;
		}	
		return false;
	}

}
