package corejava;
//Java program to demonstrate file input stream

import java.io.FileInputStream;

public class FileInputStreamex1 {

	public static void main(String[] args) {
		//Use to read logical part
		 try
		 {
			//Creating FileInputStream object
			 
			 FileInputStream fin=new FileInputStream("D:\\testout.txt"); 
		 int i=0;
		 
		//Call Read() Method By Using While Loop
		 while((i=fin.read())!=-1){
			 System.out.print((char)i);
			 } 
		 fin.close(); 
		 }
		 catch(Exception e)
		 {System.out.println(e);} }

	




	}


