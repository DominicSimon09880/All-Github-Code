import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		//try (Scanner scanner = new Scanner(System.in)) {
			//System.out.println("Enter a key word: ");
			//scanner.nextLine();
		//}

		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/data.dat"));
		ArrayList<String> books = new ArrayList<String>();
		while(input.hasNext())
		{
			books.add(input.nextLine());
		}
		input.close();
		
		for(int i = 0; i < books.size(); i++)
		{
			System.out.println(books.get(i));
		}
		
		
		
	}	
	}
	
	