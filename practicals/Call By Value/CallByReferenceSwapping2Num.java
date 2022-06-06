package corejava;
import java.io.*;

//Swap call by Reference
//Method to Swap numbers


public class CallByReferenceSwapping2Num {
	//method
	static void swapbyReference(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("before swapping x =" + a +" and y= " + b);
		
	}
	 
	 

	public static void main(String[] args) {
		int num1=5;
		int num2=6;
		System.out.println("before swapping x =" + num1 +" and y= " + num2);
		//calling the function to swap
		swapbyReference(num1,num2);
				
				
		
		
	
		
	
		
				
			


	}

}
