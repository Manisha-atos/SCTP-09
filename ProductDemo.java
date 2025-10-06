package com.p3;

import java.util.*;

public class ProductDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Set <String>s =new HashSet<String>();
		System.out.println("List of Existing Product");
		System.out.println("---------------------");
		s.add("Laptop");
		s.add("Bottle");
		String prd;
		for(String x:s)
			System.out.println(x);
		System.out.println("Start Shopping");
		System.out.println("---------------");
		System.out.println("1--Add product");
		System.out.println("2.Display Products");
		System.out.println("3.Search product");
		System.out.println("4. delete a product");
		
		System.out.println("Select your choice [1-4]");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Add product to the list");
			System.out.println("Enter product name");
			prd=sc.next();
			s.add(prd);
			System.out.println(s);
			break;
		case 2:
			System.out.println("Display all Products");
			for (String x:s)
				System.out.println(x);
			break;
		case 3:
			System.out.println("Enter product name to be searched");
			String x;
			x=sc.next();
			if (s.contains(x))
				System.out.println("Product is available");
			else
				System.out.println("Product is out of stock");
			
			break;
		case 4:
			System.out.println("Enter product to delete ");
			x=sc.next();
			if (s.remove(x))
				System.out.println("Produt is removed");
			
			
			break;
		default:
			System.out.println("Invalid choice");
			
			
			
	
		}
		
		
		

	}

}
