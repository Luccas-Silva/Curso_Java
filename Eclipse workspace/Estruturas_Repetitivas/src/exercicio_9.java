import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("		* Exerc�cio 09 *");
		System.out.println("");
		System.out.println("Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo\r\n"
				+ "segundo. Se o denominador for igual a zero, mostrar a mensagem \"divisao impossivel\".");
		System.out.println("");
		
		int numR;
		double X, Y, Z=0;
		
		System.out.print("Digite o n�mero de repeti��es: ");
		numR = sc.nextInt();
		
		System.out.println("");
		for (int i=0; i<numR; i++) {
			
			System.out.print("Digite 1� n�mero: ");
			X = sc.nextInt();
			System.out.print("Digite 2� n�mero: ");
			Y = sc.nextInt();
			
			if (Y == 0) {
				System.out.println("* Divisao impossivel *");
				System.out.println("");
			}
			else {
				Z = X / Y;
				System.out.print(" "+X+ " / " +Y+ " = ");
				System.out.printf("%.2f %n",Z);
				System.out.println("");
			}
		}
		
		
		sc.close();

	}

}
