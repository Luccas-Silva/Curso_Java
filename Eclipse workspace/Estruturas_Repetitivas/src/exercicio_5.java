import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num, rep, soma = 0;
		
		System.out.println("	* Exerc�cio 05 *");
		System.out.println("");
		
		System.out.print("Digite o n�mero de repeti��es:� ");
		rep = sc.nextInt();
		
		for (int i=0; i<rep; i++) {
			System.out.print("Digite um n�mero: ");
			num = sc.nextInt();
			soma = soma + num; 
		}
		
		System.out.print("Soma dos n�meros digitados: " +soma);
		
		sc.close();

	}

}
