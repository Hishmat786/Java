import java.util.Random;
class BoundryNumber {
	public static void main( String args[] ) {
	Random a = new Random();
	
	int[][] r= new int[6][6];     
	for(int i=0; i<6;i++)
	{
		for(int j=0;j<6;j++)
		{
			r[i][j] = a.nextInt(10); 
		}
		
	}

	for(int i=0; i<6;i++)
	{
		for(int j=0;j<6;j++)
		{
			System.out.print(r[i][j]+" "); 
		}
		System.out.println();
	}
	
	System.out.println("these are corner number\n");
	for(int i=0; i<6;i++)
	{
		for(int j=0;j<6;j++)
		{
			if (i==0 || j==0 || i==5 || j==5 )
				System.out.print(r[i][j]+" ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
     	System.out.println("these are Digonal number\n");

	for(int i=0; i<6;i++)
	{
		for(int j=0;j<6;j++)
		{
			if (i==j || ((i==i) && (j==5-i)))
				System.out.print(r[i][j]+" ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
    }
}