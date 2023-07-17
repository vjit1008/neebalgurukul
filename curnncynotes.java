package com.neebalgurul.day1;

import java.util.Scanner;

public class curnncynotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("enter a amount");
        int amount= sc.nextInt(); 
        int firstno=amount/2000;
//        System.out.println(firstno);
         amount = amount%2000;
        amount=amount/500;
//        System.out.println(secondam);
        amount =amount%500;
//        System.out.println(third);
        amount =amount/200;
//        amount =amount%200;
        amount=amount/100;
        System.out.println(amount);
        int seventh =amount%100;
//        int eight=amount
	}

}