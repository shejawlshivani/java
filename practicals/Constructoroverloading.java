package corejava;

 class Constructoroverloading {
	 String name;
		double gpa;
		
		Constructoroverloading(String name, double gpa) {
			
			this.name = name;
			this.gpa = gpa;
		}
		
	 Constructoroverloading(String name) {
		this.name = name;
			
		}

	public static void main(String[] args) {
		
		Constructoroverloading obj=new Constructoroverloading("shivani",9.8);
		Constructoroverloading abc=new Constructoroverloading("shivani");
		
     System.out.println(obj.name+obj.gpa);
     System.out.println(abc.name);
	}
	
	}

 
