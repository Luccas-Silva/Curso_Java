import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int IouP;
		
		System.out.println("		* Exerc�cio 02 *");
		System.out.println("");
		
		
		System.out.print("	Digite um numero: ");
		IouP = sc.nextInt();
		
		System.out.println("");
		if (IouP % 2 == 0 ) {
			System.out.println("	* " +IouP+ " � um n�mero par *");
		}
		else {
			System.out.println("	* " +IouP+ " � um n�mero �mpar *");
		}
		
		sc.close();

	}

}
