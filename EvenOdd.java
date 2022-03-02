import java.util.Scanner;

class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner num= new Scanner(System.in);
		System.out.print("Enter any number: ");
		int a= num.nextInt();

		if(a%2==0)
		{
			System.out.print(a+" Number is Even.");
		}
		else
		{
			System.out.print(a+" Number is Odd.");
		}



	}
}