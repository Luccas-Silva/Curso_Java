import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("	* Exerc�cio 02 *");
		System.out.println("");
		
		double raio, area;
		
		System.out.print("Digite o valor do raio do c�rculo: ");
		raio = sc.nextDouble();
		
		area = 3.14159 * (area = Math.pow(raio, 2.0));
		
		System.out.printf("A �rea deste c�rculo = %.4f %n",area);
		
		sc.close();

	}

}
