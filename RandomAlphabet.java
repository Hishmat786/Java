import java.util.*;
class Show{
	int row, columns;
	char[][] arrayOfAlphaber;
	Random random= new Random();
		void showAlphaberIn2D(int r,int c){
			row=r;
			columns=c;
			arrayOfAlphaber= new char[row][columns];
			for(int i=0; i<row; i++){
				for(int j=0; j<columns;j++){
					char ch= (char)(random.nextInt(26)+'a');
					arrayOfAlphaber[i][j]=ch;
				}
			}
			for(int i=0; i<row; i++){
				for(int j=0; j<columns;j++){
					System.out.print(arrayOfAlphaber[i][j]+" ");
				}
				System.out.println();
			}
		}
		boolean checkCharacter(char c){
			boolean find=false;
			for(int i=0; i<row; i++){
				for(int j=0; j<columns;j++){
					if(c == arrayOfAlphaber[i][j]){
						find=true;
					}
				}
			}
			return find;
		}
}
public class RandomAlphabet{
	public static void main(String[] arg){
		Scanner cin= new Scanner(System.in);
		Random random= new Random();
		
		System.out.print("Enter number of Rows:");
		int r=cin.nextInt();
		System.out.print("Enter number of Columns:");
		int c=cin.nextInt();
		
		Show obj= new Show();
		obj.showAlphaberIn2D(r,c);
		
		System.out.print("Enter charcter to find:");
		char cFind=cin.next().charAt(0);
		
		System.out.print(obj.checkCharacter(cFind));
		
	}
}