
public class BibleBook 
{
	public BibleBook(String name, int number, String summary) {
		// TODO Auto-generated constructor stub
		System.out.println("Name:" + name ); System.out.println("Chapters:"+ number); System.out.println("About:" +summary);
	}
	public static void main(String[] args) 
	{
		BibleBook book1 = new BibleBook ("Mark", 16, "Jesus overcoming evil.");
		System.out.println("");
		BibleBook book2 = new BibleBook ("Luke", 24, "The longest book that tells of how Jesus came to be.");
		System.out.println("");
		BibleBook book3 = new BibleBook ("John", 21, "Jesus is the son of God.");
		System.out.println("");
	}

}
