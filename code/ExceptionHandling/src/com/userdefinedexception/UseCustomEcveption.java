package com.userdefinedexception;

class WorstException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str;
	
	WorstException(String str){
		this.str = str;
	}
	
	public String toString() {
		return ("WorstException occured" + str);
	}
}

public class UseCustomEcveption {
	public static void main(String args[]) {
		try {
			System.out.println("here starts try block");
			
			throw new WorstException(" Here WorstException fired");
		}catch(WorstException e) {
			System.out.println(e);
		}
	}
}
