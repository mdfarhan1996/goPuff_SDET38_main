package com.ecom.goPuff.genericutility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImpClass implements IRetryAnalyzer {

int counter=0;
int retrylimit=4;
public boolean retry(ITestResult resul) {
	if(counter<retrylimit) {
		counter++;
		return true;
	}
return false;	
}
}
