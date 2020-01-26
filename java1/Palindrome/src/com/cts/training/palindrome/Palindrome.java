package com.cts.training.palindrome;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[]args)
	{
		String reverse="";
		System.out.println("enter the input:");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		}
		if(name.equals(reverse))
		{
		System.out.println("given input is palindrome");
	}else {
		System.out.println("given input is not palindrome");
	}
		
	}
	}
