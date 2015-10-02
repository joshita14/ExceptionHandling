package com.inteview.prep.exceptionhandling;

/*
 * Decided at runtime, no compilation error when we compile the code as compiler does not check for compilation
 */
    public class UncheckedExceptionHandling {
  
    	static void test() {
//        	try{
    		try {
				Class s = Class.forName("com.interview.Thread.CheckedExceptionHandling");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("joe");
			}
    		finally{
    			System.out.println("Has to be excuted whether we have the block or not");
    		}
        		int number1 = 100;
            	int number2 = 0;
            	
            	int answer = number1/number2;
            	
            	System.out.println(answer);
//        	}catch(ArithmeticException e){
//        		
//        		System.out.println("There is an exception divinding by zero");
//        	}
        	
        	System.out.println("We can continue even now, after the catch block");
    	}
    	
    	
    	public static void main(String args[]) {
     
    		test();
    	
    
    /*
     * 
     * 1. what if we use both , throws and exception ?will that use catch or will that use throw ?
     * 2. 
     */
    
    /**
     * Example arrayindexoutofbounds
     * 
     *  Declare an array
     *  int[] myIntArray = new int[3];
		int[] myIntArray = {1,2,3};
		int[] myIntArray = new int[]{1,2,3};
		For classes, for example String, it's the same:
		
		String[] myStringArray = new String[3];
		String[] myStringArray = {"a","b","c"};
		String[] myStringArray = new String[]{"a","b","c"};
     * 
     */
//   
//    	String [] array  = {"hello","one","two"};
//    	System.out.println(array.length);
//    	
//    	try{
//    	for (int i=0;i<4;i++){
//    		
//    		System.out.println(array[i]);
//    	}
//    	}catch(ArrayIndexOutOfBoundsException e){
//    		
//    		System.out.println("There was an exception in accessing an array");
//    		
//    	}

    	}//main method end
    	
   }//class method end
    
