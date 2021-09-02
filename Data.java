Package Group25

import java.io.*;
import java.util.Scanner;

public class Data
{
	public static void DataLoad(String Keyword)
	{	
		String line;
		int row = 0;
		int i = 0, j = 0;
		String path = ""; //Put the location of covid-data.csv//
		String[] index = new String[110000];
		try
		{
			BufferedReader read = new BufferedReader(new FileReader(path));
			while((line = read.readLine()) != null)
			{
				index[row] = line;
				if(index[row].contains(Keyword))
				{
					System.out.println(index[row]);
				}
				row++;
			}
			read.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Type a keyword you would like to search.");
		Scanner sc = new Scanner(System.in);
		String Keyword = sc.next();
		sc.close();
		DataLoad(Keyword);
	}
}
