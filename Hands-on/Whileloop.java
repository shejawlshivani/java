package corejava;
import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

        //input number from user
		
        System.out.println("Enter number");
        int num=sc.nextInt();
        int i=1;
        
        while( i<=10){
        System.out.println(num+"x"+i+"="+num*i);
         i++;
	}

}
}