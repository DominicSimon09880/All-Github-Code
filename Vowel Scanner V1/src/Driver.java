
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mark";
		int count = 0;
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


