/*
 Multiplication Table
Send Feedback
Write a program to print multiplication table of n
Input Format :
A single integer, n
Output Format :
First 10 multiples of n each printed in new line
Constraints :
0 <= n <= 10,000
Sample Input 1 :
2
Sample Output 1 :
2
4
6
8
10
12
14
16
18
20
Sample Input 2 :
5
Sample Output 2 :
5
10
15
20
25
30
35
40
45
50
 */

package com.milestone1.Conditionals_and_Loops;

import java.util.Scanner;

public class Multiplication_Table 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // CREATING SCANNER CLASS FORINPUT FROM USER
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++)// LOOP
		{
			if ((n >= 0) && (n <= 10000)) 
			{
				System.out.println(n * i);
			}
		}
		sc.close();
	}
}
