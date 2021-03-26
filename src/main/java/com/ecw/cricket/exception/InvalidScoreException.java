package com.ecw.cricket.exception;

public class InvalidScoreException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidScoreException(String message){
		super(message);
	}
	

}
