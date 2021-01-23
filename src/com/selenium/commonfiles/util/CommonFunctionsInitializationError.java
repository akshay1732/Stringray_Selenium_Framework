package com.selenium.commonfiles.util;


public class CommonFunctionsInitializationError extends Exception {

	private static final long serialVersionUID = 1L;
	private String message = null;
	public CommonFunctionsInitializationError(){
		
		super();
	}
	
	public CommonFunctionsInitializationError(String message){
		
		super(message);
		this.message = message;
	}
	
	@Override
    public String toString() {
        return message;
    }
 
    @Override
    public String getMessage() {
        return message;
    }
	
	
}

