package com.inteview.prep.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * Checked exceptions are checked by the compiler at compile time, it is necessary to throw them or handle them in the class
 * 
 *  Examples checked exception 
 *  SQLException
	IOException
	DataAccessException
	ClassNotFoundException
	InvocationTargetException
 */
public class CheckedExceptionHandling {
	
	void readFromFile() throws ClassNotFoundException{
		
		Class s = Class.forName("com.inteview.prep.exceptionhandling.CheckedExceptionHandling");
		String name = s.getName();
		System.out.println(name);
		File f = new File("/Users/joshita/Documents/workspace/SPRING/springappl/pom.xml");
		
		try{
		InputStream input = new  FileInputStream(f);
		byte arr[] = new byte[100];
		input.read(arr);
		input.close();
		
		throw new IOException();
		
		}catch(IOException e){
			
			System.out.println("File does not exists");
			
		}finally{
			
			System.out.println("This is executed regardless of exception is thrown or not");
			
		}
		
		System.out.println("After we handled the exception");
	}
	
	void anoherMethod() throws ClassNotFoundException,IOException{
		readFromFile();
	}
	
	public static void main(String args[]) throws ClassNotFoundException,IOException{
		
		CheckedExceptionHandling c = new CheckedExceptionHandling();
		c.readFromFile();
		c.anoherMethod();
	}

}
