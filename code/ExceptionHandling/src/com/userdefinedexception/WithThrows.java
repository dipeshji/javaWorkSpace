package com.userdefinedexception;

class InvalidBoxException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidBoxException(String str){
		super(str);
	}
}

public class WithThrows {
	
	void checkBox(int corners) throws InvalidBoxException{
		if(corners!=4) {
			throw new InvalidBoxException("box must have 4 corners");
		}
	}
	
	public static void main(String args[]) {
		
		WithThrows wt = new WithThrows();
		
		try {
			wt.checkBox(3);
		}catch(InvalidBoxException e) {
			System.out.println(e.getMessage());
		}
	}
}
