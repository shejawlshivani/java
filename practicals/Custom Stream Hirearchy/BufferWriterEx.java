package corejava;

import java.io.BufferedWriter;
import java.io.FileWriter;

 class BufferWriterEx { //main class

	public static void main(String[] args) throws Exception{ //main method
		//Creating File Writer Object
		 FileWriter writer = new FileWriter("D:\\testout.txt"); 
		 
		//to read from the creating file
		 BufferedWriter buffer = new BufferedWriter(writer);
		 
		 buffer.write("Welcome to my world.");
		 
		 //Call close() Method
		    buffer.close();  
			
 System.out.println("Success"); }
	}


