
package com.hcl.MortageLoan.Exception;

public class LoanDetailsNotFoundException extends RuntimeException{

private String errorMsg;
	
	public LoanDetailsNotFoundException(String errorMsg,Throwable errorMessage) {
		super(errorMsg);
		this.setErrorMsg(errorMsg);
	}
	
	public LoanDetailsNotFoundException(String errorMsg) {
		super(errorMsg);
		this.setErrorMsg(errorMsg);
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}

