package Star_pattern;

public class ex4 {

	public static void main(String[] args) {
		int a=4;
		int b=2;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print("*");
			}System.out.println();
			b++;
		}
		
		int c=4;
		int d=4;
		for(int i=2;i<=c;i++) {
			for(int j=1;j<=d;j++) {
				System.out.print("*");
			}System.out.println();d--;
		}
		
		int e=6;
		int f=1;
		for(int i=1;i<=e;i++) {
			for(int j=1;j<=f;j++) {
				System.out.print("*");
			}System.out.println();f++;
		}
		
	   int g=6;
	   int h=6;
	   for(int i=1;i<=g;i++) {
		   for(int j=1;j<=h;j++) {
			   System.out.print("*");
		   }System.out.println();h--;
	   }
		
		
		
		
	}
}
