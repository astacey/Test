package Application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHelper 
{

	public static void writeFile(String fileName, String contents)
	{
		PrintWriter writer;
		try {
			writer = new PrintWriter(fileName);
			writer.write(contents);
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getStringFromFile(String file)
	{
		StringBuilder sb = new StringBuilder();

		try
		{
			Scanner sc = new Scanner(new FileInputStream(file));
			try
			{
				while(sc.hasNextLine())
				{
					sb.append(sc.nextLine() +"\r\n");
				}
			}
			finally{ sc.close();}
		}
		catch(IOException e)
		{
			System.out.print(e.getMessage());
		}
		return sb.toString();
	}
}
