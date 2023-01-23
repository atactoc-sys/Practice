/*
 Palindrome number
Send Feedback
Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
Sample Input 1 :
121
Sample Output 1 :
true
Sample Input 2 :
1032
Sample Output 2 :
false
 */

package com.milestone1.Test1;

import java.util.Scanner;

public class Palindrome_number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n= sc.nextInt();
		int reverse = 0;
		int ren, temp;
		temp = n;
		while(temp != 0)
		{
			ren = temp % 10;
			reverse = reverse *10 +ren;
			temp /= 10;
		} 	
		if (n == reverse)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		sc.close();
	}
}
