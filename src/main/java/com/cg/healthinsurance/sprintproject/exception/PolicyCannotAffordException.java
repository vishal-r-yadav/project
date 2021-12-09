package com.cg.healthinsurance.sprintproject.exception;

public class PolicyCannotAffordException extends RuntimeException {
	public PolicyCannotAffordException(String str){
		super(str);	
	}
}
