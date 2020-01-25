package com.cts.training.client;

import com.cts.training.lib.Theater;

public class Myapp {
public static void main(String[]args)
{
	@SuppressWarnings("unused")
	Theater tr=Theater.GOLD;
	System.out.println("Rate on gold:"+Theater.GOLD.getRate());
}
}
