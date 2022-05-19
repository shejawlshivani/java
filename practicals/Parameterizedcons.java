package corejava;

 class Parameterizedcons {
	//Default constructor
	    Parameterizedcons(){
	          System.out.println("Default constructor");
	       }
	       /* Parameterized constructor with 
	        * two integer arguments
	        */
	    Parameterizedcons(int i, int j){
	          System.out.println("constructor with Two parameters");
	       }
	       /* Parameterized constructor with 
	        * three integer arguments
	        */
	    Parameterizedcons(int i, int j, int k){
	          System.out.println("constructor with Three parameters");          
	       }
	           
	       /* Parameterized constructor with 
	        * two arguments, int and String
	        */
	    Parameterizedcons(int i, String name){
	          System.out.println("constructor with int and String param");
	       }
	       public static void main(String args[]){
	          //This will invoke default constructor
	           Parameterizedcons obj = new Parameterizedcons();
	          /* This will invoke the constructor 
	           * with two int parameters
	           */
	           Parameterizedcons obj2 = new Parameterizedcons(12, 12);
	          /* This will invoke the constructor 
	           * with three int parameters
	           */
	           Parameterizedcons obj3 = new Parameterizedcons(1, 2, 13);
	        
	          /* This will invoke the constructor 
	           * with int and String parameters
	           */
	           Parameterizedcons obj4 = new Parameterizedcons(1,"java");
	       }

	 

	}
		
	
		
