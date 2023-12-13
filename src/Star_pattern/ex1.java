package Star_pattern;

public class ex1 {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		for (int i = 1; i <= a; i++) // for rows
		{
			for (int j = 1; j <= b; j++) // for column
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");

		for (int c = 1; c <= 3; c++) {
			for (int d = 1; d <= 8; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");

		for (int e = 1; e <= 5; e++) 
		{
			for (int f = 1; f <= 4; f++) {
				System.out.print("* ");
			}
			System.out.println();
		}System.out.println("----");
		
		for(int h=1;h<=3;h++) {
			for(int k=1;k<=3;k++) {
				System.out.print("*");
			}System.out.println();
		}
		
		

	}
}
