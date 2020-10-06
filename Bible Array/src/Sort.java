public class Sort {
	  
	    public static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	    }  
	       
	    public static void main(String a[]){  
	        int[] array = {3,5,6,33,22,77,33,11,2};  
	        }  
	        System.out.println(); 
	        selectionSort(array)
	        System.out.println("After Selection Sort");  
	        for(int i:array){  
	            System.out.print(i+" ");  
	        }  
	    }  
	}  
