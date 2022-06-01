package corejava;

import java.io.*;


 class ByteArrayOPStream {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout1=new FileOutputStream("D:\\MyFile");    
	      FileOutputStream fout2=new FileOutputStream("D:\\CopyofMyFile");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      System.out.println("Success...");    
	     }    
	    


		

	}


