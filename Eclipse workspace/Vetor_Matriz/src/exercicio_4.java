import java.util.Scanner;

public class IV {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N;
		double [] vet;
		double media;
		
		media = 0;
		
		System.out.println("	M�dia Real");
		System.out.println("");
		System.out.print(" Digite o n�mero de repeti�oeis: ");
		N = sc.nextInt();
		
		vet = new double [N];
		
		System.out.println("");
		for (int I = 0; I < N; I++) {
			System.out.print("  Digite um n�mero real: ");
			vet[I] = sc.nextDouble();
			
			media = media + vet[I];
		}
		
		media = media / N;
		
		System.out.println("");
		System.out.printf(" M�dia dos n�meros digitados: %.2f %n", media);
		System.out.println("");
		System.out.println(" N�meros digitados abaixo da m�dia: ");
		
		for(int I = 0; I < N; I++) {
			if (vet[I] < media) {
				System.out.print("  " +vet[I]);
			}
		}
		
		
		
		sc.close();

	}

}
