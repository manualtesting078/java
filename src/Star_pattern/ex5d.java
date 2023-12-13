package Star_pattern;

public class ex5d {

	public static void main(String[] args) {
//	int a=6;   int b=5;  int c=1;
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=b;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=c;j++) {
//				System.out.print("*");
//			}
//			System.out.println();b--;c++;
//		}
//		int x=6;  int y=1;   int z=5;
//		for(int i=1;i<=x;i++) {
//			for(int j=1; j<=y;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=z;j++) {
//				System.out.print("*");
//			}
//			System.out.println();y++;z--;
//		}

		int m = 6;
		int n = 5;
		int o = 1;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= o; j++) {
				System.out.print("*");
			}
			System.out.println();
			n--;
			o++;
		}

		int r = 6;
		int t = 0;
		int y = 6;
		for (int i = 1; i <= r; i++) 
		{
			for (int j = 1; j <= t; j++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= y; j++) {
				System.out.print("*");
			}
			System.out.println();
			t++;
			y--;
		}
		

	}
}
