/*
 Code : Reverse Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321

 */

package com.milestone1.Patterns_1;

import java.util.Scanner;

public class Reverse_Number_Pattern 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if ((N >= 0) && (N <= 50)) 
		{

			for (int i = 0; i <= N; i++) 
			{
				int a = i;

				for (int j = 0; j < i; j++) 
				{
					System.out.print(a);
					a--;
				}
				System.out.println();
			}

		}
		sc.close();

		
	}
}
