package corejava;
import java.io.*;
 import java.io.FileOutputStream;
public class DataOutputStrm {

	 


	    public static void main(String[] args) throws IOException {  
	    	
	    	//Creating FileOutputStream object
	        FileOutputStream file = new FileOutputStream("D:\\myFile.txt");  
	        
	      //To read from the created file
	        DataOutputStream data = new DataOutputStream(file);  
	        
	        data.writeInt(65); 
	        
	      //For Display Immediately
	        data.flush();  
	        data.close();  
	        System.out.println("Succcess...");  
	    }  
	}  