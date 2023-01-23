/*
 Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
 */

package com.milestone1.Patterns_2;

import java.util.Scanner;

public class Star_Pattern 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i = 1;
		if ((n >= 0) && (n <= 50)) 
		{
			while (i <= n) 
			{

				int j = 1;
				while (j <= n - i) 
				{
					System.out.print(" ");
					j++;
				}
				int k = 1;
				while (k <= i) 
				{
					System.out.print("*");
					k++;
				}
				int l = 1;
				while (l <= i - 1) 
				{
					System.out.print("*");
					l++;
				}
				System.out.println();
				i++;

			}
		}

		input.close();

		
	}
}
