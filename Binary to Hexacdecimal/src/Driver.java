public class Driver
{
   // String binary = "101110101101";
	//String decimal= "";
	//String hex="";
	// int bin= Integer.parseInt (binary);
	
	//binary to decimal
	public  int BinarytoDecimal(int bin)
	{
		bin=101110101101;
		int decimal = 0;  
	    int n = 0;  
	    while(true){  
	      if(bin == 0){  
	    	System.out.println("bad");
	        break;  
	      } else {  
	          int temp = bin%10;  
	          decimal += temp*Math.pow(2, n);  
	          bin = bin/10;  
	          n++;  
	          System.out.println(bin);
	       }  
	      System.out.println(bin);
	    }
	    return decimal;
	    
	}
	//decimal to hexadecimal
	public  String decimalToHex(int decimal)
	{
		String answer = "";
		String map = "0123456789ABCDEF";
		while(decimal != 0)
		{
			int temp = (decimal % 16);
			answer = map.charAt(temp) + answer;
			decimal = decimal / 16;
		}
		return answer;
	}
	public static void main(String[] args)
	{
		Driver m=new Driver();
		m.decimalToHex(0);
	}
	
}
