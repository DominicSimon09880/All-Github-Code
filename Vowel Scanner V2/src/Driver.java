import java.util.Scanner; 
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Obj=new Scanner(System.in);
		System.out.println("Count the vowels: ");
		int count = 0;
		String str=Obj.nextLine();
	    str = str.toLowerCase();
	    for(int i = 0; i < str.length(); i++)
	    {
	    	char ch = str.charAt(i); 
	    	if(ch == 'a' || ch == 'e' || 
	    			ch == 'i' || ch == 'o' || 
	    			ch == 'u') { count++; }    
	    	
	    System.out.println("Vowels = " + count);
	}
}
	
	}


