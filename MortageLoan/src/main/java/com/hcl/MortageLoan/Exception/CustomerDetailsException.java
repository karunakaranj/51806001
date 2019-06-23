package com.hcl.MortageLoan.Exception;

public class CustomerDetailsException extends RuntimeException{

private String errorMsg;
	
	public CustomerDetailsException(String errorMsg,Throwable errorMessage) {
		super(errorMsg);
		this.setErrorMsg(errorMsg);
	}
	
	public CustomerDetailsException(String errorMsg) {
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
