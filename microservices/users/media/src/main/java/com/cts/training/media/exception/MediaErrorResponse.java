package com.cts.training.media.exception;

public class MediaErrorResponse {

	private String message;
	private Integer errorCode;
	private Long timeStamp;
	
	public MediaErrorResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public MediaErrorResponse(String message, Integer errorCode, Long timeStamp) {
		
		this.message = message;
		this.errorCode = errorCode;
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
}
