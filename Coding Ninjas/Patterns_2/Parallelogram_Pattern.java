/*
 Parallelogram Pattern
Send Feedback
Write a program to print parallelogram pattern for the given N number of rows.
For N = 4



The dots represent spaces.
Input Format :
 A single integer : N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
***
 ***
  ***
Sample Input 2 :
5
Sample Output 2 :
*****
 *****
  *****
   *****
    *****
 */

package com.milestone1.Patterns_2;

import java.util.Scanner;

public class Parallelogram_Pattern 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if ((n >= 0) && (n <= 50)) 
		{
			for (int i = 1; i <= n; i++) 
			{
				for (int j = 2; j <= i; j++) 
				{
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}

		sc.close();

	}
}
