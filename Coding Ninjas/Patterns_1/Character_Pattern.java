/*
 Code : Character Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 13
Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI
Sample Input 2:
6
Sample Output 2:
A
BC
CDE
DEFG
EFGHI
FGHIJK

 */

package com.milestone1.Patterns_1;

import java.util.Scanner;

public class Character_Pattern 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if ((N >= 0) && (N <= 13)) 
		{

			for (int i = 1; i <= N; i++) 
			{

				char c = (char) ('A' + i - 1);
				for (int j = 0; j < i; j++) 
				{

					System.out.print(c);
					c = (char) (c + 1);

				}
				System.out.println();
			}

		}
		sc.close();

	}
}