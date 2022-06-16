//Java program to display the toys with price
package corejava;
import java.util.Scanner;
public class ToyExample {
	
//Creating multidimensional Array
	 String[][] toys = new String [6][6];
	 
	//constructor
	    ToyExample()
	    {
        toys [0][0]="1";
	    toys[0][1]="bhim";

	    toys [1][0]="2";
	    toys [1][1] ="Doremon";

	    toys [2][0]="1";
	    toys [2][1]="Chutki";

	    toys [3][0]="3";
	    toys [3][1]="Rubber ducky";

	    toys [4][0]="2";
	    toys[4][1]="teddy bear";

	    }
	    
	  //static get toy method
	    public static String getToy(int price)
	    {
	    	
	  	//Price of toy in case value
	    String nameString;
	    switch(price)
	    
	      {
	    
	    case 450: 
	    nameString = "bhim";
	    return nameString;
	            
	    case 650:
	    nameString = "Doremon";
	    return nameString;
	                
	    case 300:
	    nameString = "Chutki";
	    return nameString;
	                
	    case 250:
	    nameString = "Rubber ducky";
	    return nameString;
	                
	    case 750:
	    nameString = "teddy bear";
	    return nameString;
	                
	    default:
	    nameString = "No Toys Available in this Range";
	    return nameString;
	        }
	    }

	    public static void main(String[] args) {
	    //Creating object of scanner class
         int price;
         
	     Scanner sc = new Scanner (System.in); 
         price = sc.nextInt ();
	       
         System.out.println(getToy(price));
         sc.close();
	    }
    }
	


