package com.test.javaio;
//file input stream example: read all characters
import java.io.FileInputStream;
public class DataStreamExample2 {

	public static void main(String[] args) {
		try{    
            FileInputStream fin=new FileInputStream("D:\\JAVA_PRACTICE\\javadoc\\testout.txt");    
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  

