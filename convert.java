package com.neebalgurul.day1;

import java.util.Scanner;

public class convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("enter converter value");
        double km= sc.nextDouble();
        double m = km* 1000;
        double in = m*100;
        double cm = in*2.54;
        double mm =cm*10;
        
        System.out.println("meter" +m);
        System.out.println("inc" +in);
        System.out.println("cm" +cm);
        System.out.println("mm" +mm);
        
	}
}
