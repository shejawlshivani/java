package corejava;

import java.io.FileOutputStream;

public class FileOPStrm {

	public static void main(String[] args) {
		 //used to write logical part
			try {
				FileOutputStream fout=new FileOutputStream("D:\\myFile.txt");    
				//with integer data type  
				fout.write(65); 
				//with string data type
				  //String s = "Good Morning";
				  //byte b[]=s.getBytes();
				  //fout.write(b);
				  
				   fout.close();       
				   System.out.println("success...");         
				   }
			catch(Exception e)
			{System.out.println(e);}        }   
			

	

	}

