package l1;

public class Application {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = -1;
		
		int D = b * b - 4 * a * c;
		
		if (D == 0) {
			System.out.println("There is only one root.");
		} else if (D > 0) { 
			System.out.println("There are two roots.");
		} else {
			System.out.println("There is no solution.");
		}
	}
}
