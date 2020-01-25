package com.cts.training.lib;

public  enum Theater {
	PLATINUM,
	SILVER,
	GOLD;

public int Rate;
private Theater()
{
this.Rate=20;
}
public int getRate()
{
	if(this==PLATINUM || this==SILVER || this==GOLD)
		return this.Rate-8;
	return this.Rate;
}
}

	

