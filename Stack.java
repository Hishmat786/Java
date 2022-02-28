class demo
{
	int[] arr= new int[10];
	int t=-1;
	void push(int i)
	{
		if(t== arr.length)
		System.out.print("Stack is full");
		else
		arr[++t]=i;
	}
	int pop()
	{
		if(t<0)
		return 0;
		else
		return arr[t--];
	}
	
}
public class Stack
{
	public static void main(String[] arg)
	{
		demo obj= new demo();
		for(int i=0; i<10; i++){
			obj.push(i);
			System.out.print(i+" ");
		}
			System.out.println("\nAfter push");
		for(int i=0;i<10;i++)
		System.out.println(obj.pop()+" ");
	}

}