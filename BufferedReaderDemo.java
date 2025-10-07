package com.p1;
import java.io.*;
public class BuffereReaderDemo {
	File f;
	FileReader fr;
	BufferedReader br;
	public BuffereReaderDemo() throws FileNotFoundException {
f=new File("Day3.txt");
fr=new FileReader(f);
br=new BufferedReader(fr);
	}
	void readData() throws IOException
	{
		String line;
		line=br.readLine();
		//System.out.println(line);
		while(line!=null)
		{
			
			System.out.println(line);
			line=br.readLine();
		}
		
	}

	public static void main(String[] args) {
		BuffereReaderDemo obj;
		try
		{
			obj=new BuffereReaderDemo();
			obj.readData();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File your are trying to read doen't exist");
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
