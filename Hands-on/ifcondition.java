package corejava;

import java.util.Scanner;
public class ifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);

        //input age from user
        System.out.println("Enter your age");
        int age=sc.nextInt();
        
        //if condition
        if(age > 18){
            System.out.println("Eligible to vote");
          }
        else{
            System.out.println("Not eligible to vote your age is less than 18");
          }
	}

}
