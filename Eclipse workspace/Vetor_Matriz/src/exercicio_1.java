import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N, maior, posi;
		int [] vet;
		
		maior = 0;
		posi = 0;
		
		System.out.println("");
		System.out.print("	Digite o n�mero de repeti��es: ");
		N = sc.nextInt();
		
		vet = new int [N];
		
		System.out.println("");
		for (int I = 0; I < N; I++) {
			System.out.print("	Digite um n�mero: ");
			vet [I] = sc.nextInt();
		}
		
		for (int I = 0; I < N; I++) {
			if ( vet [I] > maior) {
				maior = vet [I];
				posi = I + 1;
			}
		}
		
		System.out.println("");
		System.out.println("	Maior numero: " +maior);
		System.out.println("	Posi��o do numero: " +posi);
		
		sc.close();

	}

}
