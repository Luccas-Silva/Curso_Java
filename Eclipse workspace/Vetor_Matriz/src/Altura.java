import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("	Altura M�dia");
		System.out.println();
		
		int Num;
		double Med = 0.0;
		
		System.out.print("Digite o n�mero de pessoas: ");
		Num = sc.nextInt();
		
		double [] Vet = new double [Num];
		
		System.out.println();
		for (int i=0; i<Num; i++) {
			System.out.print("Digite a altura da " +(i+1)+ "� pessoas: ");
			Vet [i] = sc.nextDouble();
			Med += Vet [i];
		}
		
		Med = Med / Num;
		System.out.println();
		System.out.printf("Altura M�dia das pessoas: %.2f %n", Med);
		
		sc.close();

	}

}
