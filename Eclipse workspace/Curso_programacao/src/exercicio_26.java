import java.util.Scanner;

public class XXVI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N; 
			System.out.println("");
			System.out.print(" Digite o n�mero de vezes que voc� quer digitar: ");
			N = sc.nextInt();
			
		double[] Vet = new double[N];
		
		for (int I = 0; I < N; I++) {
			System.out.print(" Digite um n�mero: ");
			Vet[I] = sc.nextDouble();
		}
		
		System.out.println("");
		System.out.println(" N�meros digitados");
		
		for (int I = 0; I < N; I++) {
			System.out.println(" "+Vet[I]);
		}
		
		
		sc.close();

	}

}
