package Star_pattern;

public class ex6d {
	public static void main(String[] args) {
		int a = 10;
		int b = 9;
		int c = 1;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= c; j++) {
				System.out.print("*");
			}
			System.out.println();
			b--;
			c++;
		}

		int x=10;int y = 0; int z=10;
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= z; j++) {
				System.out.print("*");
			}
			System.out.println();
			y++;
			z--;
		}

	}

}
