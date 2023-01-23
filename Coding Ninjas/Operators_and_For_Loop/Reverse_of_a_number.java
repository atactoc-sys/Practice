/*
 Reverse of a number
Send Feedback
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.


Input format :
Integer N
Output format :
Corresponding reverse number
Constraints:
0 <= N < 10^8
Sample Input 1 :
1234
Sample Output 1 :
4321
Sample Input 2 :
1980
Sample Output 2 :
891
 */

package com.milestone1.Operators_and_For_Loop;

import java.util.Scanner;

public class Reverse_of_a_number 
{
	public static void main(String[] args) 
	{

		int d, number, temp, revnum = 0;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		temp = number;
		if ((number >= 1) && (number <= 100000000)) 
		{
			while (temp > 0) 
			{
				d = temp % 10;
				revnum = (revnum * 10) + d;
				temp = temp / 10;
			}

			System.out.println(revnum);

		}

		sc.close();
	}
}
