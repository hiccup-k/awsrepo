import java.util.*;
import java.util.Arrays;

public class Lab2 {
	
	public static int getSecondSmallest(int[] a){  
		int temp;  
		for (int i=0; i<a.length; i++) {  
		            for (int j=i+1; j<a.length; j++)   
		            {  
		                if (a[i]>a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
		}  
	public static void sortStringArray(String[] a) {
		for(int i=0; i<a.length; i++)   
		{  
            for (int j = i+1; j<a.length; j++)  
            {  
                
               if(a[i].compareTo(a[j])>0)   
               {  
                    
                   String temp = a[i];  
                   a[i] = a[j];  
                   a[j] = temp;  
                }  
             }  
          }  
		int mid=(a.length)/2;
		for(int i=0; i<a.length; i++) {
			
			if(i<=mid) {
				a[i]=a[i].toUpperCase();
			}
			else {
				a[i]=a[i].toLowerCase();
			}
		}
		
          System.out.println(Arrays.toString(a));  
		
	}
	
	public static void reverseAndSort(int[] a){  
		
		int i, k,reversed = 0;
		int n=a.length;
        for (i=0; i<n/2; i++) {
        	while(a[i] != 0) {
        	
        	      int digit = a[i] % 10;
        	      reversed = reversed * 10 + digit;

        	      a[i] /= 10;
        	    }
        }
        Arrays.sort(a);
        for (k = 0; k < n; k++) {
            System.out.print(a[k]+" ");
        }
       

		
	}
	

	   public static void main(String args[]){
		   
		   Scanner in = new Scanner(System.in);
		   
		   int[] arr= new int[3];
		   String[] chararr = new String[3];
		   int[] revarr= new int[3];
		   
		   //Question 1
		   
		   System.out.println("Enter the numbers array");
		   for(int i=0;i<arr.length;i++) {
			   arr[i]=in.nextInt();
		   }
		   
		   System.out.println("Second smallest: "+getSecondSmallest(arr));
		   
		   //Question 2
		   
		   System.out.println("Enter the string of array array");
		   for(int i=0;i<chararr.length;i++) {
			   chararr[i]=in.next();
		   }
		   sortStringArray(chararr);
		   
		   //Question 3
		   
		   System.out.println("Enter the numbers array");
		   for(int i=0;i<revarr.length;i++) {
			   revarr[i]=in.nextInt();
		   }
		   
		   reverseAndSort(revarr);
		   
		   
		   
		   
		   
		   
	   }
}
