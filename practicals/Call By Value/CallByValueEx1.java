package corejava;

//java program show casing uses of call by value in this example

//importin java input output classes
import java.io.*;

//class

 class CallByValueEx1 {
	 
	 //Method to Swap numbers
	 static void swap (int a, int b)
	 {
		 
		 //Creating a temporary variable in stack memory
		 //and updating values in it.
		 
		 //Step 1
		 int temp = a;
		 
		 //Step 2
		 a=b;
		 
		 //Step 3
		 b = temp;
		 System.out.println("values after swapping x="+a+" y="+b);
		 
		 // this variable vanishes as scope is over
	 }
	 
	 //main driver method
	public static void main(String[] args) {
		
		//Customs inputs/number to be Swapped
		
		int x =5;
		int y=7;
		
		//Display message before Swapping numbers
		System.out.println("before swapping x =" + x +" and y= " + y);
		
		
		//Calling swap  method
		swap(x, y);
		
		

	
	
		

	}
 }


