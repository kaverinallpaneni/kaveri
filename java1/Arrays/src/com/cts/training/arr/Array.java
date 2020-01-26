package com.cts.training.arr;

public class Array {
public static void main(String[]args)
{
	int[] arr= {2,10,5,1,14};
	int max=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		max=arr[i];
	}
	System.out.println("the max value:"+max);
}
}


