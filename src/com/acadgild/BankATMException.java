package com.acadgild;

/**
 * 
 * Custom Exception class
 *
 */
@SuppressWarnings("serial")
public class BankATMException extends Exception {
	public BankATMException(String s) {
		super(s);
	}
}
