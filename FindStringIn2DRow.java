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
					System.out.print(arrayOfAlphaber[i][j]);
				}
				System.out.println();
			}
		}
		boolean checkCharacter(String c){
			boolean find=false;
			String[] word= new String[row];
			for(int i=0; i<row; i++){
				for(int j=0; j<columns;j++){
					word[i]+= arrayOfAlphaber[i][j];
				}
			}
			try{
				for(int i=0;i<row;i++){
					if(word[i].contains(c)){
						find=true;
					}
				}
			}catch(ArrayIndexOutOfBoundsException e){
				
			}
			return find;
		}
}
public class FindStringIn2DRow{
	public static void main(String[] arg){
		Scanner cin= new Scanner(System.in);
		Random random= new Random();
		
		System.out.print("Enter number of Rows:");
		int r=cin.nextInt();
		System.out.print("Enter number of Columns:");
		int c=cin.nextInt();
		
		Show obj= new Show();
		obj.showAlphaberIn2D(r,c);
		
		System.out.print("Enter String to find:");
		String sFind = cin.next();
		
		System.out.print(obj.checkCharacter(sFind));
		
	}
}