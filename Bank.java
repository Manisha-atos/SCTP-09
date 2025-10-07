package com.p4;

import java.util.Scanner;
class insufficientBalance extends Exception /**
	 * 
	 */
{
	//private static final long serialVersionUID = 1L;
//unchecked
	public insufficientBalance() {
		// TODO Auto-generated constructor stub
	}
	insufficientBalance(String s)
	{
		super(s);
	}
}
public class Bank {
	double bal,wamt,damt;
	Scanner sr=new Scanner(System.in);
	Bank()
	{
		bal=5000;
	}
	void deposit()
	{
		System.out.println("Enter amt to deposit ");
		damt=sr.nextDouble();
		bal=bal+damt;
		System.out.println("your current acc balance is ="+bal);
	}
	void withdraw(double b) throws insufficientBalance
	{
		System.out.println("Enter amt to withdraw ");
		wamt=sr.nextDouble();
		if(wamt>bal)
			throw new insufficientBalance("Balance is low ");//raise exception 
		bal=bal-wamt;
		System.out.println("your current acc balance is ="+bal);
	}

	public static void main(String[] args) {
		Bank b=new Bank();
		//b.deposit();
		try
		{
		b.withdraw(b.bal);
		}
		catch(insufficientBalance e)
		{
			System.out.println(e);
		}

	}

}
