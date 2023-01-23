/*
 Code : Square Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
7
Sample Output 1:
7777777
7777777
7777777
7777777
7777777
7777777
7777777
Sample Input 1:
6
Sample Output 1:
666666
666666
666666
666666
666666
666666
 */

package com.milestone1.Patterns_1;

import java.util.Scanner;

public class Square_Pattern 
{
	public static void main(String[] args) 
	{

		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if((N >= 0)&&(N <= 50))
		{

			for (int i = 0; i < N; i++) 
			{
				for (int j = 0; j < N; j++) 
				{
					System.out.print(N);
				}
				System.out.println();
			}

		}

		sc.close();

	}
}
