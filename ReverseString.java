import java.util.Scanner;
class Reverse
{
	String rev="",str;
    public void reverseWord(String string)
    {
		str= string;
		int i= str.length();
		while( i>=0){
			System.out.print(str.charAt(i-1));
			i--;
			if(i==0)
				break;
        }
    }
}
public class ReverseString{
	public static void main(String[] arg){
		Scanner cin= new Scanner(System.in);
		System.out.print("Enter String: ");
		String s= cin.next();
		
		Reverse obj= new Reverse();
		obj.reverseWord(s);
	}
}