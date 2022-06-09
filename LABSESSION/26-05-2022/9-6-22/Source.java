package corejava;

import java.io.*;
import java.util.Scanner;


//class name should be "source",
//otherwise solution won't be accepted

public class Source {
	static double calculateElectricityBill(int units) {
		
		 //Write method for here
		int u;
		double amt =0,uni;
		uni= units;
		if(units<=0) {
			return units;
		}
		else {
			if(units>30) {
				u=units-30;
				amt=30.0*3.5;
				if(u>30 && u>=70) {
				u=u-70;
				amt=amt+(70*4);
			
				}
				amt=amt+(u*5);
			}
			else {
				amt=uni*3.5;
				
			}
		}
		return amt;
		
	}
	public static void main(String[] args) {
		
//Write code here
		int units;
		double amount ;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value");
		units=sc.nextInt();
		amount = calculateElectricityBill(units);
		if(amount<0) {
			System.out.println("INVALID INPUT");
		}
		else if (amount==0) {
			System.out.println(0.0);
		}
		else {
			System.out.println(amount);
			
		}
	}


	}


