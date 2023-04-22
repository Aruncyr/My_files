package com.test.javaio;
//file input stream example:  read single character
import java.io.FileInputStream;
public class DataStreamExample1 {
	public static void main(String[] args) {
		try{    
            FileInputStream fin=new FileInputStream("D:\\JAVA_PRACTICE\\javadoc\\testout.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  

