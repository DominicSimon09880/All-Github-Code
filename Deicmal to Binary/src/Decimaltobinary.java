import java.util.Scanner; 
public class Decimaltobinary {
	
	 static void dectoBin(int dec){
int binary[] = new int[10];int index = 0;while(dec > 0){    
	       binary[index++] = dec%2;    
	       dec = dec/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }   
	}
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a decimal: ");
		Scanner scanner=new Scanner(System.in);
		 String input = scanner.nextLine();
	
		 
		 int main = 90;
		 dectoBin(main);
	}

}
