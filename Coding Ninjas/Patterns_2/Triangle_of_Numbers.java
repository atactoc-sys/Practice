/*
 Code : Triangle of Numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
       1
      232
     34543
    4567654
   567898765
Sample Input 2:
4
Sample Output 2:
        1
       232
      34543
     4567654
 */

package com.milestone1.Patterns_2;

import java.util.Scanner;

public class Triangle_of_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
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
				j = 1;
				int k = i;
				while (j <= i) 
				{
					System.out.print(k);
					k++;
					j++;
				}
				k = k - 2;
				int l = 1;
				while (l <= i - 1) 
				{
					System.out.print(k);
					k--;
					l++;
				}

				System.out.println();
				i++;

			}
		}

		sc.close();

	}
}
