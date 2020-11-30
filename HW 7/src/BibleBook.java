public class BibleBook extends Object
{
	private String name;
	private int number_of_chapters;
	private String summary;
	public BibleBook(String s)
	{
		String[] parts = s.split(":");
		this.name = parts[0];
		this.number_of_chapters = Integer.parseInt(parts[1]);
		this.summary = parts[2];
	}
	public BibleBook(String name, int number_of_chapters, String summary)
	{
		this.name = name;
		this.number_of_chapters = number_of_chapters;
		this.summary = summary;
	}
	
	
	
	
	
	public boolean searchSummary(String searchTerm)
	{
		return this.summary.toLowerCase().indexOf(searchTerm.toLowerCase()) != -1;
	}
	public void display()
	{
		System.out.println("Book Name: " + this.name + 
				"(" + this.number_of_chapters + " chapters) - " + this.summary);
	}
}