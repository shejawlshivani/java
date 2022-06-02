package corejava;

//Java program to demonstrate on file output stream
import java.io.FileOutputStream;

public class FileOutputStrm {

	public static void main(String[] args) {
		//used to write logical part
		try {
			FileOutputStream fout=new FileOutputStream("D:\\myFile.txt");    
			 
			fout.write(68); 
		  fout.close();       
			   System.out.println("success...");         
			   }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		}
		
		
		
		
		
		
		