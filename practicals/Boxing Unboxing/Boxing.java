package corejava;

public class Boxing {

	public static void main(String[] args) {
		//Assigning primitive long value to wrapper long variable x. Compiler performs auto boxing
		Long x = 430L;
		//Assigning primitive char value to wrapper character variable y.compiler performs auto boxing
	Character y= 'a';
	int a =50;
	Integer a2 = new Integer(a); //Boxing
	
	Integer a3 = 5; //Boxing
	System.out.println(a2 + "\n" +a3);
	System.out.println(x);
	System.out.println(y);
			
	
		

	}

}
