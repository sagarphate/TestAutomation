package com.mphasis.testngproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {

	public static void main(String[] args) {
		
		int i=5 , j=0, k;  
		// this is Un check Exception
		try 
		{
			k=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("i am in catch");
		}
		
		System.out.println("i am out side the catch");
		//System.out.println("Value of k" +k);
	}
	
	// check Exception handle compile time
	public void Method4() throws FileNotFoundException
	{
		FileInputStream obj = new FileInputStream("abcd");
	}
	
	public void Method3()
	{
		try {
			Method4();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Method2()
	{
		Method3();
	}
}
