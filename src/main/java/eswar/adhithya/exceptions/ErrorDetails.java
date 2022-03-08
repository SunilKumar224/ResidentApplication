package eswar.adhithya.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ErrorDetails implements Serializable {
	
	private String errorMessage;
	private String errorCode;
	private Date errorDate;
	
	public ErrorDetails(String errorMessage,  Date errorDate) {
		super();
		this.errorMessage = errorMessage;
	//	this.errorCode = errorCode;
		this.errorDate = errorDate;
	}
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/*
	 * public String getErrorCode() { return errorCode; } public void
	 * setErrorCode(String errorCode) { this.errorCode = errorCode; }
	 */
	public Date getErrorDate() {
		return errorDate;
	}
	public void setErrorDate(Date errorDate) {
		this.errorDate = errorDate;
	}
	
	@Override
	public String toString() {
		return "ErrorDetails [errorMessage=" + errorMessage + ", errorCode=" + errorCode + ", errorDate=" + errorDate
				+ "]";
	}


}
