package Star_pattern;

public class ex7d {
	public static void main(String[] args) {
		int a=10; int b=9; int c=1;
		for(int i=1; i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=c;j++) {
				System.out.print("*");
			}System.out.println();b--;c++;
		}
		
		int d=10;int e=0; int f=10;
		for(int i=1;i<=d;i++) {
			for(int j=1;j<=e;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=f;j++) {
				System.out.print("*");
			}
			System.out.println();e++;f--;
		}
		
	}
	
}
