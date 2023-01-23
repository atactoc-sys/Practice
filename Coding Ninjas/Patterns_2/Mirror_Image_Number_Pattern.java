/*
 Code : Mirror Image Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4




The dots represent spaces.


Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
    1 
   12
  123
Sample Input 2:
4
Sample Output 2:
   1 
  12
 123
1234
 */

package com.milestone1.Patterns_2;

import java.util.Scanner;

public class Mirror_Image_Number_Pattern 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if ((N >= 0) && (N <= 50)) {

			for (int i = 1; i <= N; i++) {

				for (int space = 0; space < N - i; space++) {
					System.out.print(" ");
				}

				for (int number = 1; number <= i; number++) {
					System.out.print(number);
				}

				System.out.println();

			}

		}

		sc.close();

	}
}
