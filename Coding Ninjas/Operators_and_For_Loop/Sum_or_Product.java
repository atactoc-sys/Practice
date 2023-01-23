/*
 Sum or Product
Send Feedback
Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
Input format :
Line 1 : Integer N
Line 2 : Choice C
Output Format :
 Sum or product according to user's choice
Constraints :
1 <= N <= 12
Sample Input 1 :
10
1
Sample Output 1 :
55
Sample Input 2 :
10
2
Sample Output 2 :
3628800
Sample Input 3 :
10
4
Sample Output 3 :
-1
 */

package com.milestone1.Operators_and_For_Loop;

import java.util.Scanner;

public class Sum_or_Product 
{
	public static void doStuff() 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if ((N >= 1) && (N <= 12)) 
		{
			int C = sc.nextInt();
			int i, sum = 0, pro = 1;

			switch (C) 
			{
				case 1:
					for (i = 0; i <= N; i++) 
					{
						sum = sum + i;
					}
					System.out.println(sum);
					break;

				case 2:
					for (i = 1; i <= N; i++) 
					{
						pro = pro * i;
					}
					System.out.println(pro);
					break;

				default:
					System.out.println(-1);
					break;
			}
		}
		sc.close();

	}

	public static void main(String[] args) 
	{

		doStuff();

	}
}
