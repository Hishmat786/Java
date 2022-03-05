import java.util.*;
class gcdDemo
{
	int a,b;
	int findGCD(int a, int b)
	{
		this.a= a;
		this.b= b;

		if (b!= 0)
            	return findGCD(b, a%b);
        	else
            	return a;		
	}
}
class GCD
{
	public static void main(String[] arg)
	{
		Scanner cin= new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a= cin.nextInt();
		System.out.print("Enter 2nd number: ");
		int b= cin.nextInt();
		gcdDemo obj= new gcdDemo();

		int g=obj.findGCD(a,b);
		System.out.print("GCD of given number is: "+g);	
	}
}