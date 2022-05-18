package corejava;
public class LogicalOperator {

	public static void main(String[] args) {
		

		//initializing variable
		int  a=10, b=20, c=20, d=0;
		System.out.println("value of a :" +a);
		System.out.println("value of b: " +b);
	    System.out.println("value of c: " +c);
	    
	    //using logical and to verify two constraints
if ((a<b) && (b==c))  {
	d=a+b+c;
	System.out.println("sum is" +d);
}
else
	System.out.println("False Condition");
	    
}

	}
	


