package com.p1;
import java.io.*;
import java.util.Scanner;
public class FileWriteDemo {
	File f;
	FileWriter fw;
	public FileWriteDemo() throws IOException{
		System.out.println("constr called");
		// TODO Auto-generated constructor stub
		f=new File("Day2.txt");
		fw=new FileWriter(f,true);
	}
	void writeData () throws IOException
	{
		String line;
		Scanner sr=new Scanner(System.in);
		System.out.println("enter your data ");
		line=sr.nextLine();
		fw.write(line+"\n");
	}

	public static void main(String[] args) throws IOException {
		FileWriteDemo d=null;
		System.out.println("Main started ");
		try
		{
		d=new FileWriteDemo();
		d.writeData();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			d.fw.close();
			
		}

	}

}
