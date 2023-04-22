package com.test.Throw.Throws;
//Throwing Checked Exception
import java.io.*;
public class ThrowExample2 {
	@SuppressWarnings("unused")
	public static void method()throws FileNotFoundException {
		 FileReader file = new FileReader("D:\\JAVA_PRACTICE\\javadoc\\abc.txt");  
	        @SuppressWarnings("resource")
			BufferedReader fileInput = new BufferedReader(file);  
	  
	      
	        throw new FileNotFoundException();  
	      
	    }  
	    //main method  
	    public static void main(String args[]){  
	        try  
	        {  
	            method();  
	        }   
	        catch (FileNotFoundException e)   
	        {  
	            e.printStackTrace();  
	        }  
	        System.out.println("rest of the code...");    
	  }    
	}    