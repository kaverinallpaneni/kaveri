package com.cts.training.lib;

import java.util.Scanner;
public class Graduation {
public static void main(String[] args)
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name:");
	String name=sc.nextLine();
	System.out.println("enter year of graduation");
	int graduation=sc.nextInt();
	System.out.println("my name is" +name+ "i'll graduate in"+graduation);
	
}

}
