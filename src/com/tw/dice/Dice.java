package com.tw.dice;

import java.util.Random;

public class Dice {
	private static int counter=0;

	private static int [] diceOuputArry= {4,4,4,6,7,
									8,5,11,10,12,
									2,3,5,6,7,
									8,5,11,10,12,
									2,3,5,6,7,
									8,5,11,10,12};
	
	public static int getRandomNumber()
	{
		if(counter>=diceOuputArry.length)
			return -1;
			
		int dicevalue = diceOuputArry[counter];
		counter++;
		return dicevalue;
		
	}
	
	public static void main(String a[])
	{
		for(int i=0;i<diceOuputArry.length;i++)
		System.out.print(getRandomNumber());
	}
}
