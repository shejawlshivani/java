package corejava;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterIPStream {

		
		 public static void main(String[] args) throws IOException {  
		    	
		    	//Creating File object
		        File data = new File("D:\\myFile.txt");  
		        
		        //To read from the created data
		        FileInputStream  file = new FileInputStream(data);  
		        
		        //To read from the created file
		        FilterInputStream filter = new BufferedInputStream(file);  
		        int k =0;  
		        
		      //Call Read() Method By Using While Loop
		        while((k=filter.read())!=-1){  
		        	
		            System.out.print((char)k);  
		        }  
		        file.close();  
		        filter.close();  
		    }  
	

	}


