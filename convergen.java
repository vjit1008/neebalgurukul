package com.neebalgurul.day1;

import java.util.Scanner;

public class convergen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        System.out.print("enter value");
	        int no= sc.nextInt(); 
	        int digit = no%10;
	       // System.out.println(digit);
	        int secondfirst= no/10%10;
//	        int second=secondfirst/10;
	        //System.out.println(secondfirst);
	        int third = no/100;
	       // System.out.println(third);
	        
	        int sumofdigit = digit+secondfirst+third;
	        int revers = digit*100+secondfirst*10+third;
	        int total =revers+no;
	        System.out.println("sum of digit: "+sumofdigit);
	        System.out.println("revers: " +revers);
	        System.out.println("total: " +total);
	        
	}

}
