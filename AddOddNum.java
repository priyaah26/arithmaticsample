package org.seleniumbatch4;

public class AddOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* add odd numbers between 0 to 20 
		 * iterate 0 to 20 for loop
		 * condition check num % 2 != 0 
		 * sum the number and sysout*/
		int i, sum = 0;
		for ( i = 0; i<=20 ; i++)
		{
			if (i % 2 != 0)
			{
				sum = sum + i;
			}
		}
		
		System.out.println("sum of the odd numbers between 0 to 20 is: " + sum);

	}

}
