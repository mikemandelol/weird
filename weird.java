import cs1.Keyboard;
import java.util.Scanner;

public class weird
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int num1;
		int num2;
		int sum;
		int dif;
		int prod;
		double av;
		int max;
		int min;

		System.out.println("Enter an integer: ");
		num1 = input.nextInt();

		System.out.println("Enter an integer: ");
		num2 = input.nextInt();

		sum = num1 + num2;
		dif = num1 - num2;
		prod = num1 * num2;
		av = (double)(sum) / 2;
		if(num1 > num2)
		{
			max=num1;
		}
		else
		{
			max=num2;
		}
		if(num1<num2)
		{
			min=num1;
		}
		else
		{
			min=num2;
		}



		System.out.printf("Sum :	    %12d \n",+(sum));
		System.out.printf("Difference: %12d \n",+(dif));
		System.out.printf("Product:    %12d \n",+(prod));
		System.out.printf("Average	   %16.2f \n",+(av));
		System.out.printf("Distance:   %12d \n",+Math.abs(dif));
		System.out.printf("Maximum:	   %5d \n",+(max));
		System.out.printf("Minimum     %12d \n",+(min));
	}
}
