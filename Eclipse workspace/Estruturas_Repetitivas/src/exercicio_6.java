import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int X;
		
		System.out.println("		* Exerc�cio 06 *");
		System.out.println("");
		
		do {
			System.out.println("Leia um valor inteiro X (1 <= X <= 1000). "
					+ "Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o\r\n"
					+ "X, se for o caso.");
			System.out.println("");
			System.out.print("Digite um n�mero: ");
			X = sc.nextInt();
		} while (X <= 1 && X >=1000);
		
		for (int i=0; i<=X ;i++) {
			if(i % 2 != 0) {
				System.out.print(" "+i);
			}
			
		}
		
		sc.close();

	}

}
