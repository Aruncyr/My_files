package com.test.javaio;
import java.io.*;
public class SequenceInputStreamExample1 {

	public static void main(String[] args) throws Exception {
		 FileInputStream input1=new FileInputStream("D:\\JAVA_PRACTICE\\javadoc\\testin.txt");    
		   FileInputStream input2=new FileInputStream("D:\\JAVA_PRACTICE\\javadoc\\testout.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();    
		  }    
		}   

