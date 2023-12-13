package Star_pattern;

public class ex2 {

	public static void main(String[] args) {
		for(int a=1;a<=3;a++) {
			for(int b=1;b<=3;b++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println("----");
	
	for(int c=1;c<=6;c++) {
		for(int d=1;d<=6;d++) {
			System.out.print("*");
		}System.out.println();
	}System.out.println("---------");
	
	for(int e=1;e<=9;e++) {
		for(int f=1;f<=9;f++) {
			System.out.print("*");
		}System.out.println();
	}
	System.out.println("-----------");

	int r=6; int t=0;  int y=6;
	for(int i=1;i<=r;i++) {
		for(int j=1;j<=t;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=y;j++) {
			System.out.print("*");
		}
	}System.out.println();t++;y--;
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
