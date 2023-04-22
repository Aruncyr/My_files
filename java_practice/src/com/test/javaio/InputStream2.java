package com.test.javaio;
//sequence input steam that reads data using enumeration
import java.io.*;
import java.util.*;
public class InputStream2 {
	@SuppressWarnings("unchecked")
	public static void main(String args[])throws IOException{    
		//creating the FileInputStream objects for all the files    
		FileInputStream fin=new FileInputStream("D:\\JAVA_PRACTICE\\javadoc\\a.txt");    
		FileInputStream fin2=new FileInputStream("D:\\JAVA_PRACTICE\\javadoc\\b.txt");    
		FileInputStream fin3=new FileInputStream("D:\\JAVA_PRACTICE\\javadoc\\c.txt");    
		FileInputStream fin4=new FileInputStream("D:\\JAVA_PRACTICE\\javadoc\\d.txt");    
		//creating Vector object to all the stream    
		@SuppressWarnings("rawtypes")
		Vector v=new Vector();    
		v.add(fin);    
		v.add(fin2);    
		v.add(fin3);    
		v.add(fin4);              
		//creating enumeration object by calling the elements method    
		@SuppressWarnings("rawtypes")
		Enumeration e=v.elements();      
		//passing the enumeration object in the constructor    
		SequenceInputStream bin=new SequenceInputStream(e);    
		int i=0;      
		while((i=bin.read())!=-1){    
		System.out.print((char)i);    
		}     
		bin.close();    
		fin.close();    
		fin2.close();    
		}    
		} 
