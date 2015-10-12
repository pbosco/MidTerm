package com.cisc181.core;

public class PersonException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		
		public PersonException(){
			super("The person can't be over 100");
			
		}
		
		public PersonException(String message){
			super(message);
		}
		
		
		
		

	}
	
	

