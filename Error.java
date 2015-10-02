package com.inteview.prep.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Error {

	
	static String s = "qwe";
	/*
	 * Error in java is sublcass of Throwable
	 */
	static {
		File f = new File("/Users/joshita/Documents/workspace/SPRING/springappl/src/main/java/com/spring/app/");
	    boolean  s1 = f.isFile();
//	    System.out.println(s.charAt(9));
//	    
	    
	    try {
			InputStream in =new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}

	}

	public static void main(String args[]) {
        Class d = s.getClass();
        System.out.println(d.getName());
	}
	

}
