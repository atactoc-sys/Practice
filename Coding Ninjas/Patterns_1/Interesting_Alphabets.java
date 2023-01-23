/*
 Code : Interesting Alphabets
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG

 */

package com.milestone1.Patterns_1;

import java.util.Scanner;

public class Interesting_Alphabets 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int num = N;
		if ((N >= 0) && (N <= 26)) 
		{

			for (int i = 1; i <= N; i++) 
			{
				int Start = 'A' + num - 1;

				for (int j = 0; j < i; j++) 
				{

					System.out.print((char) (Start));
					Start++;

				}
				System.out.println();
				num--;
			}

		}

		sc.close();
	}
}
