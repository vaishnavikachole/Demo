package com.test;

public class Test {
	public static void main(String[] args)
	{
		System.out.println("START");
		int a = 10;
		show();
		a = a++ + ++a - ++a + a++;// 10 + 12 - 13 + 13//22
		if(a > 55)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		System.out.println("Done");
	}
	
	public static void show()
	{
		System.out.println("from show method");
		int k = 8;
		k = k-- + ++k + k++;// 8 + 8 + 8 // 24
		System.out.println("Data is "+k);
		System.out.println("About to exist");
		
	}

}
