package corejava;
//Java program to demonstrate Buffered input stream
import java.io.BufferedInputStream;
import java.io.FileInputStream;

class BufferIPStrm {

	public static void main(String[] args) { // main method
		//write logical part
		try{    
		    FileInputStream fin=new FileInputStream("D:\\testout.txt");    
		    BufferedInputStream bin=new BufferedInputStream(fin);   
		    
		    int i;   
		    //read method by using while loop
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    //close method
		    bin.close();    
		    fin.close();    
		    
		  }
		catch(Exception e){System.out.println(e);}    
		 }    
		

	}


