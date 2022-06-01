package corejava;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

 class DataIPStrm {

	public static void main(String[] args) throws IOException {
		//Creating InputStream object
		
		InputStream input = new FileInputStream("D:\\MyFile.txt"); 
		
		 //To read from the created file
	    DataInputStream inst = new DataInputStream(input);  
	    
	    int count = input.available();  
	    byte[] ary = new byte[count]; 
	    
	    inst.read(ary);  
	    
	    //Conversion of a byte into character
	    for (byte bt : ary) {  
	      char k = (char) bt;  
	      System.out.print(k+"-");  
	    }  
	  }  
	 



	}


