import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int min;
		double tarifa = 50.00;
		
		System.out.println("		* Exerc�cio 08 *");
		System.out.println("");
		System.out.println("   Uma operadora de telefonia cobra R$ 50.00 por um plano b�sico que\r\n"
				+ "d� direito a 100 minutos de telefone. Cada minuto que exceder a\r\n"
				+ "franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a\r\n"
				+ "quantidade de minutos que uma pessoa consumiu, da� mostrar o valor\r\n"
				+ "a ser pago.");
		System.out.println("");
		
		System.out.print("Digite o n�meros de minutos utilizados: ");
		min = sc.nextInt();
		
		if (min > 100) {
			tarifa += 2 * (min - 100);
			System.out.printf("	Valor a pagar: %.2f %n" ,tarifa);
		}
		else {
			System.out.printf("	Valor a pagar: %.2f %n" ,tarifa);
		}
		
		sc.close();

	}

}
