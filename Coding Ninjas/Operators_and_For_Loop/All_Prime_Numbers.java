/*
 All Prime Numbers
Send Feedback
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
 */

package com.milestone1.Operators_and_For_Loop;

import java.util.Scanner;

public class All_Prime_Numbers 
{
	public static void main(String[] args) 
	{

		int i, number, count;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ((n >= 1) && (n <= 100)) 
		{

			for (number = 1; number <= n; number++) 
			{
				count = 0;
				for (i = 2; i <= number / 2; i++) 
				{
					if (number % i == 0) 
					{
						count++;
						break;
					}
				}
				if (count == 0 && number != 1) 
				{
					System.out.print(number + "\n");
				}
			}

		}

		sc.close();

	}
}
