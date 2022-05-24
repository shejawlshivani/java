package corejava;
//Java program to sort an array of strings 
//in ascending and descending alphabetical order
//Using Arrays.sort()


import java. util.*;
public class ArrayReverse {

	  
		 //Main driver method
		public static void main(String[] args)
		{ 
			// Custom input string
			String arr[] = { "shivani", "dipali", "sakshi" };
			
			// Sorts arr[] in ascending order
			Arrays.sort(arr); System.out.printf("In Ascending Order Modified arr[] : \n%s\n\n",Arrays.toString(arr));
			
			// Sorts arr[] in descending order
			Arrays.sort(arr, Collections.reverseOrder());
			
			// Lastly printing the above array 
			System.out.println("In descending Order Modified arr[] : \n%s\n\n"+Arrays.toString(arr)); } 

	}


