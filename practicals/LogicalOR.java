package corejava;

public class LogicalOR {

	public static void main(String[] args) {
		
		//initializing variable
				int  a=10, b=1, c=10, d=30;
				//a,b,c,d displaying
				
				System.out.println("value of a :" +a);
				System.out.println("value of b: " +b);
			    System.out.println("value of c: " +c);
			    System.out.println("value of d: " +d);
			    
			    //using logical or to verify two constraints
			    
		if ((a>b) && (c==d))  
		{
	System.out.println("One or both" + "the condition are true");
		}
		else
			System.out.println("Both the " + "condition are false");
			    
		}

	}


