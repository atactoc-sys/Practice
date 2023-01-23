/*
 Binary to decimal
Send Feedback
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
 */

package com.milestone1.Operators_and_For_Loop;

import java.util.Scanner;

public class Binary_to_decimal 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if ((num >= 0) && (num <= 1000000000)) 
		{

			int dec_value = 0;
			int base = 1;
			int temp = num;

			while (temp > 0) 
			{
				int last_digit = temp % 10;
				temp = temp / 10;
				dec_value += last_digit * base;
				base = base * 2;
			}

			System.out.println(dec_value);
		}

		sc.close();
	}
}
