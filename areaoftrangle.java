package com.neebalgurul.day1;

import java.util.Scanner;

public class areaoftrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("enter converter value");
        double sides= sc.nextDouble();
        double areaoftrangle =Math.sqrt(3)/41*Math.pow(sides,2);
        	System.out.println("areaof trangle"+ areaoftrangle);
	}

}
