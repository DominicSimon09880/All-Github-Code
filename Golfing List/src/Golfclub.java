
public class Golfclub extends Object
{
	private String name;
	private int distance;
	
	
	public Golfclub(String name, int distance)
	{
		this.name = name;
		this.distance = distance;
		
	}
	public void display()
	{
		System.out.println(this.name + this.distance);
	}
}