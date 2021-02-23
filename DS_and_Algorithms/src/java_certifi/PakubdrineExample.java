package java_certifi;

import java.util.Scanner;

public class PakubdrineExample {

	public static void main(String[] args) {
		
//		int r,sum=0,temp;
//		int n =454;
//		
//		temp = n ;
//		while(n > 0) {
//			r = n%10;
//			sum = (sum*10)+r;
//			n = n/10;
//		}
//		
//		if(temp == sum){
//			System.out.println("palindrome number");
//		}else
//			System.out.println("Not plaindorme");
		
//***********************************************************************
//		String original, reverse = ""; // Objects of String class  
//	      Scanner in = new Scanner(System.in);   
//	      System.out.println("Enter a string/number to check if it is a palindrome");  
//	      original = in.nextLine();   
//	      int length = original.length();   
//	      for ( int i = length - 1; i >= 0; i-- )  
//	         reverse = reverse + original.charAt(i);  
//	      if (original.equals(reverse))  
//	         System.out.println("Entered string/number is a palindrome.");  
//	      else  
//	         System.out.println("Entered string/number isn't a palindrome.");   
	      
	      StringBuilder original1 = new StringBuilder();
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter a string/number to check if it is a palindrome");
	      String temp = in.nextLine();
	      String result = original1.append(temp).reverse().toString();
	      if (result.equals(temp))  
		         System.out.println("Entered string/number is a palindrome.");  
		      else  
		         System.out.println("Entered string/number isn't a palindrome.");  
	      
	   }  

}
