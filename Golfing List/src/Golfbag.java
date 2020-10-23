import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;



public class Golfbag {
	
		private ArrayList<Golfbag> theBag;
		
		public Golfbag()
		{
			this.theBag = new ArrayList<Golfbag>();
		}
		
		public Golfbag(String filename)
		{
			this();
			try
			{
				Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/" + filename));
				while(input.hasNext())
				{
					this.theBag.add(new Golfbag(input.nextLine()));
				}
				input.close();
			}
			catch(Exception e) { e.printStackTrace();}
		}

		public void display()
		{
			for(Golfbag b : this.theBag)
			{
				b.display();
			}
		}
			
		}

