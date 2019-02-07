package mypackage;

public class Twodmnarry {

	public static void main(String[] args) {
		int [][]td=new int[4][4];
		int temp=10;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				td[i][j]=temp;
				temp+=10;
				System.out.print(td[i][j] +" "); 
				
			}
			System.out.println();
		}

	}

}
