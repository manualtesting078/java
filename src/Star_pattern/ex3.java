package Star_pattern;

public class ex3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		for (int i = 1; i <= a; i++) 			// for total no of rows
		{
			for (int j = 1; j <= b; j++)        //for colum where startin star printing
			{
				System.out.print("*");			//print *
			}
			System.out.println();
			b++;								//column increas by 1
		}

		System.out.println("---------------");
		
		int c=6;
		int d=3;
		for(int i=1;i<=c;i++)
		{
			for(int j=1;j<=d;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			d--;
		}
		System.out.println("----------");
		
		int e=7;
		int f=1;
		for(int i=1;i<=e;i++) {
			for(int j=1;j<=f;j++) {
				System.out.print("*");
			}
			System.out.println();
			f++;
		}
		
		
		
		
	}
}
