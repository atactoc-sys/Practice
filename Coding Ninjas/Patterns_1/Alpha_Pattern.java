/*
 Code : Alpha Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF

 */

package com.milestone1.Patterns_1;

import java.util.Scanner;

public class Alpha_Pattern 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if ((N >= 0) && (N <= 26)) {

			for (int i = 0; i <= N; i++) {

				for (int j = 0; j < i; j++) {
					char c = (char) ('A' + i - 1);
					System.out.print(c);

				}
				System.out.println();
			}

		}
		sc.close();

	}
}
