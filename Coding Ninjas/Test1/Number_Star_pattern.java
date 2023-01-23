/*
 Number Star pattern 1
Send Feedback
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
 */

package com.milestone1.Test1;

import java.util.Scanner;

public class Number_Star_pattern 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int i,j;
		int lines = scanner.nextInt();
		for(i=1;i<=lines;i++)
		{
			for(j=lines;j>=1;j--)
			{
				if(j!=i)  
					System.out.print(j);  
				else  
					System.out.print("*");  
			}   
			System.out.println("");  
		}
		scanner.close();
	}
}
