package reverse_the_string;

import java.util.Scanner;

/*
 	Simple Reverse
	Given a string A, you are asked to reverse the string and return the reversed string.

	Input 1:
	
	A = "scaler"
	
	Input 2:
	A = "academy"
	

	
	Output 1:
	
	"relacs"
	
	Output 2:
	"ymedaca"

*/


public class Reverse_The_String {
	
	private static String reverse_the_String(String s) {
		// TODO Auto-generated method stub
		String reverse_String="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse_String=reverse_String+s.charAt(i);
		}
		return reverse_String;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		System.out.println(reverse_the_String(s));

	}

	

}
