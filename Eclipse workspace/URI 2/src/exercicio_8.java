import java.util.Scanner;

public class VIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		
		System.out.println("  * Contador de N�meros �mpares *");
		System.out.println("");
		System.out.print("  Digite um numero: ");
		n = sc.nextInt();
		System.out.println("");
		System.out.println("  Numeros �mpares:");
		
		for (int I = 0; I <= n; I++) {
			if (I % 2 == 1) {
				System.out.println("   " +I);
			}
			
		}
		
		sc.close();
	}

}
