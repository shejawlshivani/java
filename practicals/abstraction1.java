package corejava;



	class abstraction1 extends abstraction {
		
		public int Multiply(int n1, int n2)
		{
			return n1*n2;
		}
		
			public int Multiplyone(int n1, int n2, int n3)
			{
				return n1*n2*n3;
				}
			public static void main(String[] args) {
				
				//creating object of abstraction class
				abstraction a=new abstraction1();
				
				System.out.println("Multiplication of 2 numbers: " + a.Multiply(10, 50));  
				
			    System.out.println ("Multiplication of 3 numbers: " + a.Multiplyone(5, 8, 10));
				
			
	}

	}


