/*
 Number Star Pattern
Send Feedback
Print the following pattern for given number of rows.
Input format :

Line 1 : N (Total number of rows)

Sample Input :
   5
Sample Output :
1234554321
1234**4321
123****321
12******21
1********1
 */

package com.milestone1.Test2;

import java.util.Scanner;

public class Number_Star_Pattern 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		int i, j;
		int space = 0;
		for (i = 0; i < lines; i++) 
		{
			for (j = 1; j <= space; j++) 
			{
				System.out.print(" ");
			}
			for (j = 1; j <= lines; j++) 
			{
				if (j <= (lines - i))
					System.out.print(j);
				else
					System.out.print("*");
			}
			j--;
			while (j > 0) 
			{
				if (j > lines - i)
					System.out.print("*");
				else
					System.out.print(j);
				j--;
			}
			if ((lines - i) > 9)
				space = space + 1;
			System.out.println("");
		}
		scanner.close();
		
	}
}
